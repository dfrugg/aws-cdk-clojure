(ns cdk.api.services.appflow
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appflow package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.appflow CfnConnector$Builder
                                                    CfnConnector$ConnectorProvisioningConfigProperty$Builder
                                                    CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder
                                                    CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$ApiKeyCredentialsProperty$Builder
                                                    CfnConnectorProfile$BasicAuthCredentialsProperty$Builder
                                                    CfnConnectorProfile$Builder
                                                    CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder
                                                    CfnConnectorProfile$ConnectorProfileConfigProperty$Builder
                                                    CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$CustomAuthCredentialsProperty$Builder
                                                    CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$OAuth2CredentialsProperty$Builder
                                                    CfnConnectorProfile$OAuth2PropertiesProperty$Builder
                                                    CfnConnectorProfile$OAuthCredentialsProperty$Builder
                                                    CfnConnectorProfile$OAuthPropertiesProperty$Builder
                                                    CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder
                                                    CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder
                                                    CfnConnectorProfileProps$Builder
                                                    CfnConnectorProps$Builder
                                                    CfnFlow$AggregationConfigProperty$Builder
                                                    CfnFlow$AmplitudeSourcePropertiesProperty$Builder
                                                    CfnFlow$Builder
                                                    CfnFlow$ConnectorOperatorProperty$Builder
                                                    CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder
                                                    CfnFlow$CustomConnectorSourcePropertiesProperty$Builder
                                                    CfnFlow$DataTransferApiProperty$Builder
                                                    CfnFlow$DatadogSourcePropertiesProperty$Builder
                                                    CfnFlow$DestinationConnectorPropertiesProperty$Builder
                                                    CfnFlow$DestinationFlowConfigProperty$Builder
                                                    CfnFlow$DynatraceSourcePropertiesProperty$Builder
                                                    CfnFlow$ErrorHandlingConfigProperty$Builder
                                                    CfnFlow$EventBridgeDestinationPropertiesProperty$Builder
                                                    CfnFlow$GlueDataCatalogProperty$Builder
                                                    CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder
                                                    CfnFlow$IncrementalPullConfigProperty$Builder
                                                    CfnFlow$InforNexusSourcePropertiesProperty$Builder
                                                    CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder
                                                    CfnFlow$MarketoDestinationPropertiesProperty$Builder
                                                    CfnFlow$MarketoSourcePropertiesProperty$Builder
                                                    CfnFlow$MetadataCatalogConfigProperty$Builder
                                                    CfnFlow$PardotSourcePropertiesProperty$Builder
                                                    CfnFlow$PrefixConfigProperty$Builder
                                                    CfnFlow$RedshiftDestinationPropertiesProperty$Builder
                                                    CfnFlow$S3DestinationPropertiesProperty$Builder
                                                    CfnFlow$S3InputFormatConfigProperty$Builder
                                                    CfnFlow$S3OutputFormatConfigProperty$Builder
                                                    CfnFlow$S3SourcePropertiesProperty$Builder
                                                    CfnFlow$SAPODataDestinationPropertiesProperty$Builder
                                                    CfnFlow$SAPODataPaginationConfigProperty$Builder
                                                    CfnFlow$SAPODataParallelismConfigProperty$Builder
                                                    CfnFlow$SAPODataSourcePropertiesProperty$Builder
                                                    CfnFlow$SalesforceDestinationPropertiesProperty$Builder
                                                    CfnFlow$SalesforceSourcePropertiesProperty$Builder
                                                    CfnFlow$ScheduledTriggerPropertiesProperty$Builder
                                                    CfnFlow$ServiceNowSourcePropertiesProperty$Builder
                                                    CfnFlow$SingularSourcePropertiesProperty$Builder
                                                    CfnFlow$SlackSourcePropertiesProperty$Builder
                                                    CfnFlow$SnowflakeDestinationPropertiesProperty$Builder
                                                    CfnFlow$SourceConnectorPropertiesProperty$Builder
                                                    CfnFlow$SourceFlowConfigProperty$Builder
                                                    CfnFlow$SuccessResponseHandlingConfigProperty$Builder
                                                    CfnFlow$TaskPropertiesObjectProperty$Builder
                                                    CfnFlow$TaskProperty$Builder
                                                    CfnFlow$TrendmicroSourcePropertiesProperty$Builder
                                                    CfnFlow$TriggerConfigProperty$Builder
                                                    CfnFlow$UpsolverDestinationPropertiesProperty$Builder
                                                    CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder
                                                    CfnFlow$VeevaSourcePropertiesProperty$Builder
                                                    CfnFlow$ZendeskDestinationPropertiesProperty$Builder
                                                    CfnFlow$ZendeskSourcePropertiesProperty$Builder
                                                    CfnFlowProps$Builder]))


(defn cfn-connector-builder>
  "The cfn-connector-builder> function updates a CfnConnector$Builder instance using the provided configuration.
  The function takes the CfnConnector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProvisioningConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-provisioning-config` |
| `connectorProvisioningType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-provisioning-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnConnector$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-label)]
    (. builder connectorLabel data))
  (when-some [data (lookup-entry config id :connector-provisioning-config)]
    (. builder connectorProvisioningConfig data))
  (when-some [data (lookup-entry config id :connector-provisioning-type)]
    (. builder connectorProvisioningType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-connector-builder
  "Creates a  `CfnConnector$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-connector-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-connector-builder> (CfnConnector$Builder/create scope (name id)) id config))


(defn cfn-connector-connector-provisioning-config-property-builder>
  "The cfn-connector-connector-provisioning-config-property-builder> function updates a CfnConnector$ConnectorProvisioningConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$ConnectorProvisioningConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambda` | software.amazon.awscdk.services.appflow.CfnConnector$LambdaConnectorProvisioningConfigProperty | [[cdk.support/lookup-entry]] | `:lambda` |
"
  [^CfnConnector$ConnectorProvisioningConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (.build builder))


(defn cfn-connector-connector-provisioning-config-property-builder
  "Creates a  `CfnConnector$ConnectorProvisioningConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-connector-provisioning-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-connector-provisioning-config-property-builder> (new CfnConnector$ConnectorProvisioningConfigProperty$Builder) id config))


(defn cfn-connector-lambda-connector-provisioning-config-property-builder>
  "The cfn-connector-lambda-connector-provisioning-config-property-builder> function updates a CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
"
  [^CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (.build builder))


(defn cfn-connector-lambda-connector-provisioning-config-property-builder
  "Creates a  `CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-lambda-connector-provisioning-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-lambda-connector-provisioning-config-property-builder> (new CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder) id config))


(defn cfn-connector-profile-amplitude-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-amplitude-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |
"
  [^CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-key)]
    (. builder apiKey data))
  (when-some [data (lookup-entry config id :secret-key)]
    (. builder secretKey data))
  (.build builder))


(defn cfn-connector-profile-amplitude-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-amplitude-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-amplitude-connector-profile-credentials-property-builder> (new CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-api-key-credentials-property-builder>
  "The cfn-connector-profile-api-key-credentials-property-builder> function updates a CfnConnectorProfile$ApiKeyCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ApiKeyCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `apiSecretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-secret-key` |
"
  [^CfnConnectorProfile$ApiKeyCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-key)]
    (. builder apiKey data))
  (when-some [data (lookup-entry config id :api-secret-key)]
    (. builder apiSecretKey data))
  (.build builder))


(defn cfn-connector-profile-api-key-credentials-property-builder
  "Creates a  `CfnConnectorProfile$ApiKeyCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-api-key-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-api-key-credentials-property-builder> (new CfnConnectorProfile$ApiKeyCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-basic-auth-credentials-property-builder>
  "The cfn-connector-profile-basic-auth-credentials-property-builder> function updates a CfnConnectorProfile$BasicAuthCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$BasicAuthCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnConnectorProfile$BasicAuthCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-connector-profile-basic-auth-credentials-property-builder
  "Creates a  `CfnConnectorProfile$BasicAuthCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-basic-auth-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-basic-auth-credentials-property-builder> (new CfnConnectorProfile$BasicAuthCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-builder>
  "The cfn-connector-profile-builder> function updates a CfnConnectorProfile$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-mode` |
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProfileConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-profile-config` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
"
  [^CfnConnectorProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-mode)]
    (. builder connectionMode data))
  (when-some [data (lookup-entry config id :connector-label)]
    (. builder connectorLabel data))
  (when-some [data (lookup-entry config id :connector-profile-config)]
    (. builder connectorProfileConfig data))
  (when-some [data (lookup-entry config id :connector-profile-name)]
    (. builder connectorProfileName data))
  (when-some [data (lookup-entry config id :connector-type)]
    (. builder connectorType data))
  (when-some [data (lookup-entry config id :kms-arn)]
    (. builder kmsArn data))
  (.build builder))


(defn cfn-connector-profile-builder
  "Creates a  `CfnConnectorProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-connector-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-connector-profile-builder> (CfnConnectorProfile$Builder/create scope (name id)) id config))


(defn cfn-connector-profile-connector-o-auth-request-property-builder>
  "The cfn-connector-profile-connector-o-auth-request-property-builder> function updates a CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-code` |
| `redirectUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:redirect-uri` |
"
  [^CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-code)]
    (. builder authCode data))
  (when-some [data (lookup-entry config id :redirect-uri)]
    (. builder redirectUri data))
  (.build builder))


(defn cfn-connector-profile-connector-o-auth-request-property-builder
  "Creates a  `CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-connector-o-auth-request-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-connector-o-auth-request-property-builder> (new CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder) id config))


(defn cfn-connector-profile-connector-profile-config-property-builder>
  "The cfn-connector-profile-connector-profile-config-property-builder> function updates a CfnConnectorProfile$ConnectorProfileConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ConnectorProfileConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorProfileCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-profile-credentials` |
| `connectorProfileProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-profile-properties` |
"
  [^CfnConnectorProfile$ConnectorProfileConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-profile-credentials)]
    (. builder connectorProfileCredentials data))
  (when-some [data (lookup-entry config id :connector-profile-properties)]
    (. builder connectorProfileProperties data))
  (.build builder))


(defn cfn-connector-profile-connector-profile-config-property-builder
  "Creates a  `CfnConnectorProfile$ConnectorProfileConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-connector-profile-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-connector-profile-config-property-builder> (new CfnConnectorProfile$ConnectorProfileConfigProperty$Builder) id config))


(defn cfn-connector-profile-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amplitude` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:amplitude` |
| `customConnector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-connector` |
| `datadog` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:datadog` |
| `dynatrace` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynatrace` |
| `googleAnalytics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:google-analytics` |
| `inforNexus` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:infor-nexus` |
| `marketo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:marketo` |
| `pardot` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$PardotConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:pardot` |
| `redshift` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:redshift` |
| `salesforce` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:salesforce` |
| `sapoData` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:sapo-data` |
| `serviceNow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-now` |
| `singular` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:singular` |
| `slack` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:slack` |
| `snowflake` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:snowflake` |
| `trendmicro` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty | [[cdk.support/lookup-entry]] | `:trendmicro` |
| `veeva` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:veeva` |
| `zendesk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zendesk` |
"
  [^CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amplitude)]
    (. builder amplitude data))
  (when-some [data (lookup-entry config id :custom-connector)]
    (. builder customConnector data))
  (when-some [data (lookup-entry config id :datadog)]
    (. builder datadog data))
  (when-some [data (lookup-entry config id :dynatrace)]
    (. builder dynatrace data))
  (when-some [data (lookup-entry config id :google-analytics)]
    (. builder googleAnalytics data))
  (when-some [data (lookup-entry config id :infor-nexus)]
    (. builder inforNexus data))
  (when-some [data (lookup-entry config id :marketo)]
    (. builder marketo data))
  (when-some [data (lookup-entry config id :pardot)]
    (. builder pardot data))
  (when-some [data (lookup-entry config id :redshift)]
    (. builder redshift data))
  (when-some [data (lookup-entry config id :salesforce)]
    (. builder salesforce data))
  (when-some [data (lookup-entry config id :sapo-data)]
    (. builder sapoData data))
  (when-some [data (lookup-entry config id :service-now)]
    (. builder serviceNow data))
  (when-some [data (lookup-entry config id :singular)]
    (. builder singular data))
  (when-some [data (lookup-entry config id :slack)]
    (. builder slack data))
  (when-some [data (lookup-entry config id :snowflake)]
    (. builder snowflake data))
  (when-some [data (lookup-entry config id :trendmicro)]
    (. builder trendmicro data))
  (when-some [data (lookup-entry config id :veeva)]
    (. builder veeva data))
  (when-some [data (lookup-entry config id :zendesk)]
    (. builder zendesk data))
  (.build builder))


(defn cfn-connector-profile-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-connector-profile-credentials-property-builder> (new CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-connector-profile-properties-property-builder>
  "The cfn-connector-profile-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customConnector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-connector` |
| `datadog` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datadog` |
| `dynatrace` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynatrace` |
| `inforNexus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:infor-nexus` |
| `marketo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:marketo` |
| `pardot` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$PardotConnectorProfilePropertiesProperty | [[cdk.support/lookup-entry]] | `:pardot` |
| `redshift` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty | [[cdk.support/lookup-entry]] | `:redshift` |
| `salesforce` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:salesforce` |
| `sapoData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sapo-data` |
| `serviceNow` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty | [[cdk.support/lookup-entry]] | `:service-now` |
| `slack` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$SlackConnectorProfilePropertiesProperty | [[cdk.support/lookup-entry]] | `:slack` |
| `snowflake` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snowflake` |
| `veeva` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:veeva` |
| `zendesk` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty | [[cdk.support/lookup-entry]] | `:zendesk` |
"
  [^CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-connector)]
    (. builder customConnector data))
  (when-some [data (lookup-entry config id :datadog)]
    (. builder datadog data))
  (when-some [data (lookup-entry config id :dynatrace)]
    (. builder dynatrace data))
  (when-some [data (lookup-entry config id :infor-nexus)]
    (. builder inforNexus data))
  (when-some [data (lookup-entry config id :marketo)]
    (. builder marketo data))
  (when-some [data (lookup-entry config id :pardot)]
    (. builder pardot data))
  (when-some [data (lookup-entry config id :redshift)]
    (. builder redshift data))
  (when-some [data (lookup-entry config id :salesforce)]
    (. builder salesforce data))
  (when-some [data (lookup-entry config id :sapo-data)]
    (. builder sapoData data))
  (when-some [data (lookup-entry config id :service-now)]
    (. builder serviceNow data))
  (when-some [data (lookup-entry config id :slack)]
    (. builder slack data))
  (when-some [data (lookup-entry config id :snowflake)]
    (. builder snowflake data))
  (when-some [data (lookup-entry config id :veeva)]
    (. builder veeva data))
  (when-some [data (lookup-entry config id :zendesk)]
    (. builder zendesk data))
  (.build builder))


(defn cfn-connector-profile-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-connector-profile-properties-property-builder> (new CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-custom-auth-credentials-property-builder>
  "The cfn-connector-profile-custom-auth-credentials-property-builder> function updates a CfnConnectorProfile$CustomAuthCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$CustomAuthCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:credentials-map` |
| `customAuthenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-authentication-type` |
"
  [^CfnConnectorProfile$CustomAuthCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :credentials-map)]
    (. builder credentialsMap data))
  (when-some [data (lookup-entry config id :custom-authentication-type)]
    (. builder customAuthenticationType data))
  (.build builder))


(defn cfn-connector-profile-custom-auth-credentials-property-builder
  "Creates a  `CfnConnectorProfile$CustomAuthCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-custom-auth-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-custom-auth-credentials-property-builder> (new CfnConnectorProfile$CustomAuthCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-custom-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-custom-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `basic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic` |
| `custom` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$CustomAuthCredentialsProperty | [[cdk.support/lookup-entry]] | `:custom` |
| `oauth2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oauth2` |
"
  [^CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-key)]
    (. builder apiKey data))
  (when-some [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (when-some [data (lookup-entry config id :basic)]
    (. builder basic data))
  (when-some [data (lookup-entry config id :custom)]
    (. builder custom data))
  (when-some [data (lookup-entry config id :oauth2)]
    (. builder oauth2 data))
  (.build builder))


(defn cfn-connector-profile-custom-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-custom-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-custom-connector-profile-credentials-property-builder> (new CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-custom-connector-profile-properties-property-builder>
  "The cfn-connector-profile-custom-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oAuth2Properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth2-properties` |
| `profileProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:profile-properties` |
"
  [^CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :o-auth2-properties)]
    (. builder oAuth2Properties data))
  (when-some [data (lookup-entry config id :profile-properties)]
    (. builder profileProperties data))
  (.build builder))


(defn cfn-connector-profile-custom-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-custom-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-custom-connector-profile-properties-property-builder> (new CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-datadog-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-datadog-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-key` |
"
  [^CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-key)]
    (. builder apiKey data))
  (when-some [data (lookup-entry config id :application-key)]
    (. builder applicationKey data))
  (.build builder))


(defn cfn-connector-profile-datadog-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-datadog-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-datadog-connector-profile-credentials-property-builder> (new CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-datadog-connector-profile-properties-property-builder>
  "The cfn-connector-profile-datadog-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-datadog-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-datadog-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-datadog-connector-profile-properties-property-builder> (new CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-dynatrace-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-dynatrace-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-token` |
"
  [^CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-token)]
    (. builder apiToken data))
  (.build builder))


(defn cfn-connector-profile-dynatrace-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-dynatrace-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-dynatrace-connector-profile-credentials-property-builder> (new CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-dynatrace-connector-profile-properties-property-builder>
  "The cfn-connector-profile-dynatrace-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-dynatrace-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-dynatrace-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-dynatrace-connector-profile-properties-property-builder> (new CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-google-analytics-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-google-analytics-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorOAuthRequestProperty | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |
"
  [^CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :connector-o-auth-request)]
    (. builder connectorOAuthRequest data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn cfn-connector-profile-google-analytics-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-google-analytics-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-google-analytics-connector-profile-credentials-property-builder> (new CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-infor-nexus-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-infor-nexus-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-key-id` |
| `datakey` | java.lang.String | [[cdk.support/lookup-entry]] | `:datakey` |
| `secretAccessKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-access-key` |
| `userId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-id` |
"
  [^CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-key-id)]
    (. builder accessKeyId data))
  (when-some [data (lookup-entry config id :datakey)]
    (. builder datakey data))
  (when-some [data (lookup-entry config id :secret-access-key)]
    (. builder secretAccessKey data))
  (when-some [data (lookup-entry config id :user-id)]
    (. builder userId data))
  (.build builder))


(defn cfn-connector-profile-infor-nexus-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-infor-nexus-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-infor-nexus-connector-profile-credentials-property-builder> (new CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-infor-nexus-connector-profile-properties-property-builder>
  "The cfn-connector-profile-infor-nexus-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-infor-nexus-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-infor-nexus-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-infor-nexus-connector-profile-properties-property-builder> (new CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-marketo-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-marketo-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
"
  [^CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :connector-o-auth-request)]
    (. builder connectorOAuthRequest data))
  (.build builder))


(defn cfn-connector-profile-marketo-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-marketo-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-marketo-connector-profile-credentials-property-builder> (new CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-marketo-connector-profile-properties-property-builder>
  "The cfn-connector-profile-marketo-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-marketo-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-marketo-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-marketo-connector-profile-properties-property-builder> (new CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-o-auth-credentials-property-builder>
  "The cfn-connector-profile-o-auth-credentials-property-builder> function updates a CfnConnectorProfile$OAuthCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$OAuthCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorOAuthRequestProperty | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |
"
  [^CfnConnectorProfile$OAuthCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :connector-o-auth-request)]
    (. builder connectorOAuthRequest data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn cfn-connector-profile-o-auth-credentials-property-builder
  "Creates a  `CfnConnectorProfile$OAuthCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-o-auth-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-o-auth-credentials-property-builder> (new CfnConnectorProfile$OAuthCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-o-auth-properties-property-builder>
  "The cfn-connector-profile-o-auth-properties-property-builder> function updates a CfnConnectorProfile$OAuthPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$OAuthPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authCodeUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-code-url` |
| `oAuthScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:o-auth-scopes` |
| `tokenUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-url` |
"
  [^CfnConnectorProfile$OAuthPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-code-url)]
    (. builder authCodeUrl data))
  (when-some [data (lookup-entry config id :o-auth-scopes)]
    (. builder oAuthScopes data))
  (when-some [data (lookup-entry config id :token-url)]
    (. builder tokenUrl data))
  (.build builder))


(defn cfn-connector-profile-o-auth-properties-property-builder
  "Creates a  `CfnConnectorProfile$OAuthPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-o-auth-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-o-auth-properties-property-builder> (new CfnConnectorProfile$OAuthPropertiesProperty$Builder) id config))


(defn cfn-connector-profile-o-auth2-credentials-property-builder>
  "The cfn-connector-profile-o-auth2-credentials-property-builder> function updates a CfnConnectorProfile$OAuth2CredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$OAuth2CredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `oAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |
"
  [^CfnConnectorProfile$OAuth2CredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :o-auth-request)]
    (. builder oAuthRequest data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn cfn-connector-profile-o-auth2-credentials-property-builder
  "Creates a  `CfnConnectorProfile$OAuth2CredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-o-auth2-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-o-auth2-credentials-property-builder> (new CfnConnectorProfile$OAuth2CredentialsProperty$Builder) id config))


(defn cfn-connector-profile-o-auth2-properties-property-builder>
  "The cfn-connector-profile-o-auth2-properties-property-builder> function updates a CfnConnectorProfile$OAuth2PropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$OAuth2PropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oAuth2GrantType` | java.lang.String | [[cdk.support/lookup-entry]] | `:o-auth2-grant-type` |
| `tokenUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-url` |
| `tokenUrlCustomProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:token-url-custom-properties` |
"
  [^CfnConnectorProfile$OAuth2PropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :o-auth2-grant-type)]
    (. builder oAuth2GrantType data))
  (when-some [data (lookup-entry config id :token-url)]
    (. builder tokenUrl data))
  (when-some [data (lookup-entry config id :token-url-custom-properties)]
    (. builder tokenUrlCustomProperties data))
  (.build builder))


(defn cfn-connector-profile-o-auth2-properties-property-builder
  "Creates a  `CfnConnectorProfile$OAuth2PropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-o-auth2-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-o-auth2-properties-property-builder> (new CfnConnectorProfile$OAuth2PropertiesProperty$Builder) id config))


(defn cfn-connector-profile-pardot-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-pardot-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientCredentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-credentials-arn` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |
"
  [^CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-credentials-arn)]
    (. builder clientCredentialsArn data))
  (when-some [data (lookup-entry config id :connector-o-auth-request)]
    (. builder connectorOAuthRequest data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn cfn-connector-profile-pardot-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-pardot-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-pardot-connector-profile-credentials-property-builder> (new CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-pardot-connector-profile-properties-property-builder>
  "The cfn-connector-profile-pardot-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessUnitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-unit-id` |
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
| `isSandboxEnvironment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-sandbox-environment` |
"
  [^CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :business-unit-id)]
    (. builder businessUnitId data))
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (when-some [data (lookup-entry config id :is-sandbox-environment)]
    (. builder isSandboxEnvironment data))
  (.build builder))


(defn cfn-connector-profile-pardot-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-pardot-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-pardot-connector-profile-properties-property-builder> (new CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-props-builder>
  "The cfn-connector-profile-props-builder> function updates a CfnConnectorProfileProps$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-mode` |
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProfileConfig` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorProfileConfigProperty | [[cdk.support/lookup-entry]] | `:connector-profile-config` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
"
  [^CfnConnectorProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-mode)]
    (. builder connectionMode data))
  (when-some [data (lookup-entry config id :connector-label)]
    (. builder connectorLabel data))
  (when-some [data (lookup-entry config id :connector-profile-config)]
    (. builder connectorProfileConfig data))
  (when-some [data (lookup-entry config id :connector-profile-name)]
    (. builder connectorProfileName data))
  (when-some [data (lookup-entry config id :connector-type)]
    (. builder connectorType data))
  (when-some [data (lookup-entry config id :kms-arn)]
    (. builder kmsArn data))
  (.build builder))


(defn cfn-connector-profile-props-builder
  "Creates a  `CfnConnectorProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-props-builder> (new CfnConnectorProfileProps$Builder) id config))


(defn cfn-connector-profile-redshift-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-redshift-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-connector-profile-redshift-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-redshift-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-redshift-connector-profile-credentials-property-builder> (new CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-redshift-connector-profile-properties-property-builder>
  "The cfn-connector-profile-redshift-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `dataApiRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-api-role-arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databaseUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-url` |
| `isRedshiftServerless` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-redshift-serverless` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |
"
  [^CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :data-api-role-arn)]
    (. builder dataApiRoleArn data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :database-url)]
    (. builder databaseUrl data))
  (when-some [data (lookup-entry config id :is-redshift-serverless)]
    (. builder isRedshiftServerless data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :workgroup-name)]
    (. builder workgroupName data))
  (.build builder))


(defn cfn-connector-profile-redshift-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-redshift-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-redshift-connector-profile-properties-property-builder> (new CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-salesforce-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-salesforce-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientCredentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-credentials-arn` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `jwtToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:jwt-token` |
| `oAuth2GrantType` | java.lang.String | [[cdk.support/lookup-entry]] | `:o-auth2-grant-type` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |
"
  [^CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-credentials-arn)]
    (. builder clientCredentialsArn data))
  (when-some [data (lookup-entry config id :connector-o-auth-request)]
    (. builder connectorOAuthRequest data))
  (when-some [data (lookup-entry config id :jwt-token)]
    (. builder jwtToken data))
  (when-some [data (lookup-entry config id :o-auth2-grant-type)]
    (. builder oAuth2GrantType data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn cfn-connector-profile-salesforce-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-salesforce-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-salesforce-connector-profile-credentials-property-builder> (new CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-salesforce-connector-profile-properties-property-builder>
  "The cfn-connector-profile-salesforce-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
| `isSandboxEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-sandbox-environment` |
| `usePrivateLinkForMetadataAndAuthorization` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-private-link-for-metadata-and-authorization` |
"
  [^CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (when-some [data (lookup-entry config id :is-sandbox-environment)]
    (. builder isSandboxEnvironment data))
  (when-some [data (lookup-entry config id :use-private-link-for-metadata-and-authorization)]
    (. builder usePrivateLinkForMetadataAndAuthorization data))
  (.build builder))


(defn cfn-connector-profile-salesforce-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-salesforce-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-salesforce-connector-profile-properties-property-builder> (new CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-sapo-data-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-sapo-data-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuthCredentials` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$BasicAuthCredentialsProperty | [[cdk.support/lookup-entry]] | `:basic-auth-credentials` |
| `oAuthCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth-credentials` |
"
  [^CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :basic-auth-credentials)]
    (. builder basicAuthCredentials data))
  (when-some [data (lookup-entry config id :o-auth-credentials)]
    (. builder oAuthCredentials data))
  (.build builder))


(defn cfn-connector-profile-sapo-data-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-sapo-data-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-sapo-data-connector-profile-credentials-property-builder> (new CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-sapo-data-connector-profile-properties-property-builder>
  "The cfn-connector-profile-sapo-data-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationHostUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-host-url` |
| `applicationServicePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-service-path` |
| `clientNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-number` |
| `disableSso` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-sso` |
| `logonLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:logon-language` |
| `oAuthProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth-properties` |
| `portNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port-number` |
| `privateLinkServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-link-service-name` |
"
  [^CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-host-url)]
    (. builder applicationHostUrl data))
  (when-some [data (lookup-entry config id :application-service-path)]
    (. builder applicationServicePath data))
  (when-some [data (lookup-entry config id :client-number)]
    (. builder clientNumber data))
  (when-some [data (lookup-entry config id :disable-sso)]
    (. builder disableSso data))
  (when-some [data (lookup-entry config id :logon-language)]
    (. builder logonLanguage data))
  (when-some [data (lookup-entry config id :o-auth-properties)]
    (. builder oAuthProperties data))
  (when-some [data (lookup-entry config id :port-number)]
    (. builder portNumber data))
  (when-some [data (lookup-entry config id :private-link-service-name)]
    (. builder privateLinkServiceName data))
  (.build builder))


(defn cfn-connector-profile-sapo-data-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-sapo-data-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-sapo-data-connector-profile-properties-property-builder> (new CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-service-now-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-service-now-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oAuth2Credentials` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$OAuth2CredentialsProperty | [[cdk.support/lookup-entry]] | `:o-auth2-credentials` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :o-auth2-credentials)]
    (. builder oAuth2Credentials data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-connector-profile-service-now-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-service-now-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-service-now-connector-profile-credentials-property-builder> (new CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-service-now-connector-profile-properties-property-builder>
  "The cfn-connector-profile-service-now-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-service-now-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-service-now-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-service-now-connector-profile-properties-property-builder> (new CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-singular-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-singular-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
"
  [^CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-key)]
    (. builder apiKey data))
  (.build builder))


(defn cfn-connector-profile-singular-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-singular-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-singular-connector-profile-credentials-property-builder> (new CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-slack-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-slack-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
"
  [^CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :connector-o-auth-request)]
    (. builder connectorOAuthRequest data))
  (.build builder))


(defn cfn-connector-profile-slack-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-slack-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-slack-connector-profile-credentials-property-builder> (new CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-slack-connector-profile-properties-property-builder>
  "The cfn-connector-profile-slack-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-slack-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-slack-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-slack-connector-profile-properties-property-builder> (new CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-snowflake-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-snowflake-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-connector-profile-snowflake-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-snowflake-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-snowflake-connector-profile-credentials-property-builder> (new CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-snowflake-connector-profile-properties-property-builder>
  "The cfn-connector-profile-snowflake-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `privateLinkServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-link-service-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
| `warehouse` | java.lang.String | [[cdk.support/lookup-entry]] | `:warehouse` |
"
  [^CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-name)]
    (. builder accountName data))
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :private-link-service-name)]
    (. builder privateLinkServiceName data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :stage)]
    (. builder stage data))
  (when-some [data (lookup-entry config id :warehouse)]
    (. builder warehouse data))
  (.build builder))


(defn cfn-connector-profile-snowflake-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-snowflake-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-snowflake-connector-profile-properties-property-builder> (new CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-trendmicro-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-trendmicro-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiSecretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-secret-key` |
"
  [^CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-secret-key)]
    (. builder apiSecretKey data))
  (.build builder))


(defn cfn-connector-profile-trendmicro-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-trendmicro-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-trendmicro-connector-profile-credentials-property-builder> (new CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-veeva-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-veeva-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-connector-profile-veeva-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-veeva-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-veeva-connector-profile-credentials-property-builder> (new CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-veeva-connector-profile-properties-property-builder>
  "The cfn-connector-profile-veeva-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-veeva-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-veeva-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-veeva-connector-profile-properties-property-builder> (new CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-profile-zendesk-connector-profile-credentials-property-builder>
  "The cfn-connector-profile-zendesk-connector-profile-credentials-property-builder> function updates a CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorOAuthRequestProperty | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
"
  [^CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :connector-o-auth-request)]
    (. builder connectorOAuthRequest data))
  (.build builder))


(defn cfn-connector-profile-zendesk-connector-profile-credentials-property-builder
  "Creates a  `CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-zendesk-connector-profile-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-zendesk-connector-profile-credentials-property-builder> (new CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder) id config))


(defn cfn-connector-profile-zendesk-connector-profile-properties-property-builder>
  "The cfn-connector-profile-zendesk-connector-profile-properties-property-builder> function updates a CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
"
  [^CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-url)]
    (. builder instanceUrl data))
  (.build builder))


(defn cfn-connector-profile-zendesk-connector-profile-properties-property-builder
  "Creates a  `CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-profile-zendesk-connector-profile-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-profile-zendesk-connector-profile-properties-property-builder> (new CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder) id config))


(defn cfn-connector-props-builder>
  "The cfn-connector-props-builder> function updates a CfnConnectorProps$Builder instance using the provided configuration.
  The function takes the CfnConnectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProvisioningConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-provisioning-config` |
| `connectorProvisioningType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-provisioning-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnConnectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-label)]
    (. builder connectorLabel data))
  (when-some [data (lookup-entry config id :connector-provisioning-config)]
    (. builder connectorProvisioningConfig data))
  (when-some [data (lookup-entry config id :connector-provisioning-type)]
    (. builder connectorProvisioningType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-connector-props-builder
  "Creates a  `CfnConnectorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-props-builder> (new CfnConnectorProps$Builder) id config))


(defn cfn-flow-aggregation-config-property-builder>
  "The cfn-flow-aggregation-config-property-builder> function updates a CfnFlow$AggregationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$AggregationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation-type` |
| `targetFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-file-size` |
"
  [^CfnFlow$AggregationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation-type)]
    (. builder aggregationType data))
  (when-some [data (lookup-entry config id :target-file-size)]
    (. builder targetFileSize data))
  (.build builder))


(defn cfn-flow-aggregation-config-property-builder
  "Creates a  `CfnFlow$AggregationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-aggregation-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-aggregation-config-property-builder> (new CfnFlow$AggregationConfigProperty$Builder) id config))


(defn cfn-flow-amplitude-source-properties-property-builder>
  "The cfn-flow-amplitude-source-properties-property-builder> function updates a CfnFlow$AmplitudeSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$AmplitudeSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$AmplitudeSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-amplitude-source-properties-property-builder
  "Creates a  `CfnFlow$AmplitudeSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-amplitude-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-amplitude-source-properties-property-builder> (new CfnFlow$AmplitudeSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-builder>
  "The cfn-flow-builder> function updates a CfnFlow$Builder instance using the provided configuration.
  The function takes the CfnFlow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationFlowConfigList` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-flow-config-list` |
| `flowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-name` |
| `flowStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-status` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `metadataCatalogConfig` | software.amazon.awscdk.services.appflow.CfnFlow$MetadataCatalogConfigProperty | [[cdk.support/lookup-entry]] | `:metadata-catalog-config` |
| `sourceFlowConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-flow-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tasks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tasks` |
| `triggerConfig` | software.amazon.awscdk.services.appflow.CfnFlow$TriggerConfigProperty | [[cdk.support/lookup-entry]] | `:trigger-config` |
"
  [^CfnFlow$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination-flow-config-list)]
    (. builder destinationFlowConfigList data))
  (when-some [data (lookup-entry config id :flow-name)]
    (. builder flowName data))
  (when-some [data (lookup-entry config id :flow-status)]
    (. builder flowStatus data))
  (when-some [data (lookup-entry config id :kms-arn)]
    (. builder kmsArn data))
  (when-some [data (lookup-entry config id :metadata-catalog-config)]
    (. builder metadataCatalogConfig data))
  (when-some [data (lookup-entry config id :source-flow-config)]
    (. builder sourceFlowConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tasks)]
    (. builder tasks data))
  (when-some [data (lookup-entry config id :trigger-config)]
    (. builder triggerConfig data))
  (.build builder))


(defn cfn-flow-builder
  "Creates a  `CfnFlow$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-flow-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-flow-builder> (CfnFlow$Builder/create scope (name id)) id config))


(defn cfn-flow-connector-operator-property-builder>
  "The cfn-flow-connector-operator-property-builder> function updates a CfnFlow$ConnectorOperatorProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$ConnectorOperatorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amplitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:amplitude` |
| `customConnector` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-connector` |
| `datadog` | java.lang.String | [[cdk.support/lookup-entry]] | `:datadog` |
| `dynatrace` | java.lang.String | [[cdk.support/lookup-entry]] | `:dynatrace` |
| `googleAnalytics` | java.lang.String | [[cdk.support/lookup-entry]] | `:google-analytics` |
| `inforNexus` | java.lang.String | [[cdk.support/lookup-entry]] | `:infor-nexus` |
| `marketo` | java.lang.String | [[cdk.support/lookup-entry]] | `:marketo` |
| `pardot` | java.lang.String | [[cdk.support/lookup-entry]] | `:pardot` |
| `s3` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3` |
| `salesforce` | java.lang.String | [[cdk.support/lookup-entry]] | `:salesforce` |
| `sapoData` | java.lang.String | [[cdk.support/lookup-entry]] | `:sapo-data` |
| `serviceNow` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-now` |
| `singular` | java.lang.String | [[cdk.support/lookup-entry]] | `:singular` |
| `slack` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack` |
| `trendmicro` | java.lang.String | [[cdk.support/lookup-entry]] | `:trendmicro` |
| `veeva` | java.lang.String | [[cdk.support/lookup-entry]] | `:veeva` |
| `zendesk` | java.lang.String | [[cdk.support/lookup-entry]] | `:zendesk` |
"
  [^CfnFlow$ConnectorOperatorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amplitude)]
    (. builder amplitude data))
  (when-some [data (lookup-entry config id :custom-connector)]
    (. builder customConnector data))
  (when-some [data (lookup-entry config id :datadog)]
    (. builder datadog data))
  (when-some [data (lookup-entry config id :dynatrace)]
    (. builder dynatrace data))
  (when-some [data (lookup-entry config id :google-analytics)]
    (. builder googleAnalytics data))
  (when-some [data (lookup-entry config id :infor-nexus)]
    (. builder inforNexus data))
  (when-some [data (lookup-entry config id :marketo)]
    (. builder marketo data))
  (when-some [data (lookup-entry config id :pardot)]
    (. builder pardot data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :salesforce)]
    (. builder salesforce data))
  (when-some [data (lookup-entry config id :sapo-data)]
    (. builder sapoData data))
  (when-some [data (lookup-entry config id :service-now)]
    (. builder serviceNow data))
  (when-some [data (lookup-entry config id :singular)]
    (. builder singular data))
  (when-some [data (lookup-entry config id :slack)]
    (. builder slack data))
  (when-some [data (lookup-entry config id :trendmicro)]
    (. builder trendmicro data))
  (when-some [data (lookup-entry config id :veeva)]
    (. builder veeva data))
  (when-some [data (lookup-entry config id :zendesk)]
    (. builder zendesk data))
  (.build builder))


(defn cfn-flow-connector-operator-property-builder
  "Creates a  `CfnFlow$ConnectorOperatorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-connector-operator-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-connector-operator-property-builder> (new CfnFlow$ConnectorOperatorProperty$Builder) id config))


(defn cfn-flow-custom-connector-destination-properties-property-builder>
  "The cfn-flow-custom-connector-destination-properties-property-builder> function updates a CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-properties` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |
| `errorHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$ErrorHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |
"
  [^CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-properties)]
    (. builder customProperties data))
  (when-some [data (lookup-entry config id :entity-name)]
    (. builder entityName data))
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :id-field-names)]
    (. builder idFieldNames data))
  (when-some [data (lookup-entry config id :write-operation-type)]
    (. builder writeOperationType data))
  (.build builder))


(defn cfn-flow-custom-connector-destination-properties-property-builder
  "Creates a  `CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-custom-connector-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-custom-connector-destination-properties-property-builder> (new CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-custom-connector-source-properties-property-builder>
  "The cfn-flow-custom-connector-source-properties-property-builder> function updates a CfnFlow$CustomConnectorSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$CustomConnectorSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-properties` |
| `dataTransferApi` | software.amazon.awscdk.services.appflow.CfnFlow$DataTransferApiProperty | [[cdk.support/lookup-entry]] | `:data-transfer-api` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |
"
  [^CfnFlow$CustomConnectorSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-properties)]
    (. builder customProperties data))
  (when-some [data (lookup-entry config id :data-transfer-api)]
    (. builder dataTransferApi data))
  (when-some [data (lookup-entry config id :entity-name)]
    (. builder entityName data))
  (.build builder))


(defn cfn-flow-custom-connector-source-properties-property-builder
  "Creates a  `CfnFlow$CustomConnectorSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-custom-connector-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-custom-connector-source-properties-property-builder> (new CfnFlow$CustomConnectorSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-data-transfer-api-property-builder>
  "The cfn-flow-data-transfer-api-property-builder> function updates a CfnFlow$DataTransferApiProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$DataTransferApiProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFlow$DataTransferApiProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-flow-data-transfer-api-property-builder
  "Creates a  `CfnFlow$DataTransferApiProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-data-transfer-api-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-data-transfer-api-property-builder> (new CfnFlow$DataTransferApiProperty$Builder) id config))


(defn cfn-flow-datadog-source-properties-property-builder>
  "The cfn-flow-datadog-source-properties-property-builder> function updates a CfnFlow$DatadogSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$DatadogSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$DatadogSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-datadog-source-properties-property-builder
  "Creates a  `CfnFlow$DatadogSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-datadog-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-datadog-source-properties-property-builder> (new CfnFlow$DatadogSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-destination-connector-properties-property-builder>
  "The cfn-flow-destination-connector-properties-property-builder> function updates a CfnFlow$DestinationConnectorPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$DestinationConnectorPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customConnector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-connector` |
| `eventBridge` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge` |
| `lookoutMetrics` | software.amazon.awscdk.services.appflow.CfnFlow$LookoutMetricsDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:lookout-metrics` |
| `marketo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:marketo` |
| `redshift` | software.amazon.awscdk.services.appflow.CfnFlow$RedshiftDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:redshift` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
| `salesforce` | software.amazon.awscdk.services.appflow.CfnFlow$SalesforceDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:salesforce` |
| `sapoData` | software.amazon.awscdk.services.appflow.CfnFlow$SAPODataDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:sapo-data` |
| `snowflake` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snowflake` |
| `upsolver` | software.amazon.awscdk.services.appflow.CfnFlow$UpsolverDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:upsolver` |
| `zendesk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zendesk` |
"
  [^CfnFlow$DestinationConnectorPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-connector)]
    (. builder customConnector data))
  (when-some [data (lookup-entry config id :event-bridge)]
    (. builder eventBridge data))
  (when-some [data (lookup-entry config id :lookout-metrics)]
    (. builder lookoutMetrics data))
  (when-some [data (lookup-entry config id :marketo)]
    (. builder marketo data))
  (when-some [data (lookup-entry config id :redshift)]
    (. builder redshift data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :salesforce)]
    (. builder salesforce data))
  (when-some [data (lookup-entry config id :sapo-data)]
    (. builder sapoData data))
  (when-some [data (lookup-entry config id :snowflake)]
    (. builder snowflake data))
  (when-some [data (lookup-entry config id :upsolver)]
    (. builder upsolver data))
  (when-some [data (lookup-entry config id :zendesk)]
    (. builder zendesk data))
  (.build builder))


(defn cfn-flow-destination-connector-properties-property-builder
  "Creates a  `CfnFlow$DestinationConnectorPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-destination-connector-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-destination-connector-properties-property-builder> (new CfnFlow$DestinationConnectorPropertiesProperty$Builder) id config))


(defn cfn-flow-destination-flow-config-property-builder>
  "The cfn-flow-destination-flow-config-property-builder> function updates a CfnFlow$DestinationFlowConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$DestinationFlowConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `destinationConnectorProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-connector-properties` |
"
  [^CfnFlow$DestinationFlowConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-some [data (lookup-entry config id :connector-profile-name)]
    (. builder connectorProfileName data))
  (when-some [data (lookup-entry config id :connector-type)]
    (. builder connectorType data))
  (when-some [data (lookup-entry config id :destination-connector-properties)]
    (. builder destinationConnectorProperties data))
  (.build builder))


(defn cfn-flow-destination-flow-config-property-builder
  "Creates a  `CfnFlow$DestinationFlowConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-destination-flow-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-destination-flow-config-property-builder> (new CfnFlow$DestinationFlowConfigProperty$Builder) id config))


(defn cfn-flow-dynatrace-source-properties-property-builder>
  "The cfn-flow-dynatrace-source-properties-property-builder> function updates a CfnFlow$DynatraceSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$DynatraceSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$DynatraceSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-dynatrace-source-properties-property-builder
  "Creates a  `CfnFlow$DynatraceSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-dynatrace-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-dynatrace-source-properties-property-builder> (new CfnFlow$DynatraceSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-error-handling-config-property-builder>
  "The cfn-flow-error-handling-config-property-builder> function updates a CfnFlow$ErrorHandlingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$ErrorHandlingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `failOnFirstError` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fail-on-first-error` |
"
  [^CfnFlow$ErrorHandlingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :fail-on-first-error)]
    (. builder failOnFirstError data))
  (.build builder))


(defn cfn-flow-error-handling-config-property-builder
  "Creates a  `CfnFlow$ErrorHandlingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-error-handling-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-error-handling-config-property-builder> (new CfnFlow$ErrorHandlingConfigProperty$Builder) id config))


(defn cfn-flow-event-bridge-destination-properties-property-builder>
  "The cfn-flow-event-bridge-destination-properties-property-builder> function updates a CfnFlow$EventBridgeDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$EventBridgeDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$EventBridgeDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-event-bridge-destination-properties-property-builder
  "Creates a  `CfnFlow$EventBridgeDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-event-bridge-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-event-bridge-destination-properties-property-builder> (new CfnFlow$EventBridgeDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-glue-data-catalog-property-builder>
  "The cfn-flow-glue-data-catalog-property-builder> function updates a CfnFlow$GlueDataCatalogProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$GlueDataCatalogProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tablePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-prefix` |
"
  [^CfnFlow$GlueDataCatalogProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :table-prefix)]
    (. builder tablePrefix data))
  (.build builder))


(defn cfn-flow-glue-data-catalog-property-builder
  "Creates a  `CfnFlow$GlueDataCatalogProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-glue-data-catalog-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-glue-data-catalog-property-builder> (new CfnFlow$GlueDataCatalogProperty$Builder) id config))


(defn cfn-flow-google-analytics-source-properties-property-builder>
  "The cfn-flow-google-analytics-source-properties-property-builder> function updates a CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-google-analytics-source-properties-property-builder
  "Creates a  `CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-google-analytics-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-google-analytics-source-properties-property-builder> (new CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-incremental-pull-config-property-builder>
  "The cfn-flow-incremental-pull-config-property-builder> function updates a CfnFlow$IncrementalPullConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$IncrementalPullConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeTypeFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-type-field-name` |
"
  [^CfnFlow$IncrementalPullConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :datetime-type-field-name)]
    (. builder datetimeTypeFieldName data))
  (.build builder))


(defn cfn-flow-incremental-pull-config-property-builder
  "Creates a  `CfnFlow$IncrementalPullConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-incremental-pull-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-incremental-pull-config-property-builder> (new CfnFlow$IncrementalPullConfigProperty$Builder) id config))


(defn cfn-flow-infor-nexus-source-properties-property-builder>
  "The cfn-flow-infor-nexus-source-properties-property-builder> function updates a CfnFlow$InforNexusSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$InforNexusSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$InforNexusSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-infor-nexus-source-properties-property-builder
  "Creates a  `CfnFlow$InforNexusSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-infor-nexus-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-infor-nexus-source-properties-property-builder> (new CfnFlow$InforNexusSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-lookout-metrics-destination-properties-property-builder>
  "The cfn-flow-lookout-metrics-destination-properties-property-builder> function updates a CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-lookout-metrics-destination-properties-property-builder
  "Creates a  `CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-lookout-metrics-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-lookout-metrics-destination-properties-property-builder> (new CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-marketo-destination-properties-property-builder>
  "The cfn-flow-marketo-destination-properties-property-builder> function updates a CfnFlow$MarketoDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$MarketoDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$MarketoDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-marketo-destination-properties-property-builder
  "Creates a  `CfnFlow$MarketoDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-marketo-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-marketo-destination-properties-property-builder> (new CfnFlow$MarketoDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-marketo-source-properties-property-builder>
  "The cfn-flow-marketo-source-properties-property-builder> function updates a CfnFlow$MarketoSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$MarketoSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$MarketoSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-marketo-source-properties-property-builder
  "Creates a  `CfnFlow$MarketoSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-marketo-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-marketo-source-properties-property-builder> (new CfnFlow$MarketoSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-metadata-catalog-config-property-builder>
  "The cfn-flow-metadata-catalog-config-property-builder> function updates a CfnFlow$MetadataCatalogConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$MetadataCatalogConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueDataCatalog` | software.amazon.awscdk.services.appflow.CfnFlow$GlueDataCatalogProperty | [[cdk.support/lookup-entry]] | `:glue-data-catalog` |
"
  [^CfnFlow$MetadataCatalogConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :glue-data-catalog)]
    (. builder glueDataCatalog data))
  (.build builder))


(defn cfn-flow-metadata-catalog-config-property-builder
  "Creates a  `CfnFlow$MetadataCatalogConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-metadata-catalog-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-metadata-catalog-config-property-builder> (new CfnFlow$MetadataCatalogConfigProperty$Builder) id config))


(defn cfn-flow-pardot-source-properties-property-builder>
  "The cfn-flow-pardot-source-properties-property-builder> function updates a CfnFlow$PardotSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$PardotSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$PardotSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-pardot-source-properties-property-builder
  "Creates a  `CfnFlow$PardotSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-pardot-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-pardot-source-properties-property-builder> (new CfnFlow$PardotSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-prefix-config-property-builder>
  "The cfn-flow-prefix-config-property-builder> function updates a CfnFlow$PrefixConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$PrefixConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pathPrefixHierarchy` | java.util.List | [[cdk.support/lookup-entry]] | `:path-prefix-hierarchy` |
| `prefixFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-format` |
| `prefixType` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-type` |
"
  [^CfnFlow$PrefixConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :path-prefix-hierarchy)]
    (. builder pathPrefixHierarchy data))
  (when-some [data (lookup-entry config id :prefix-format)]
    (. builder prefixFormat data))
  (when-some [data (lookup-entry config id :prefix-type)]
    (. builder prefixType data))
  (.build builder))


(defn cfn-flow-prefix-config-property-builder
  "Creates a  `CfnFlow$PrefixConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-prefix-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-prefix-config-property-builder> (new CfnFlow$PrefixConfigProperty$Builder) id config))


(defn cfn-flow-props-builder>
  "The cfn-flow-props-builder> function updates a CfnFlowProps$Builder instance using the provided configuration.
  The function takes the CfnFlowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationFlowConfigList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-flow-config-list` |
| `flowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-name` |
| `flowStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-status` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `metadataCatalogConfig` | software.amazon.awscdk.services.appflow.CfnFlow$MetadataCatalogConfigProperty | [[cdk.support/lookup-entry]] | `:metadata-catalog-config` |
| `sourceFlowConfig` | software.amazon.awscdk.services.appflow.CfnFlow$SourceFlowConfigProperty | [[cdk.support/lookup-entry]] | `:source-flow-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tasks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tasks` |
| `triggerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-config` |
"
  [^CfnFlowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination-flow-config-list)]
    (. builder destinationFlowConfigList data))
  (when-some [data (lookup-entry config id :flow-name)]
    (. builder flowName data))
  (when-some [data (lookup-entry config id :flow-status)]
    (. builder flowStatus data))
  (when-some [data (lookup-entry config id :kms-arn)]
    (. builder kmsArn data))
  (when-some [data (lookup-entry config id :metadata-catalog-config)]
    (. builder metadataCatalogConfig data))
  (when-some [data (lookup-entry config id :source-flow-config)]
    (. builder sourceFlowConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tasks)]
    (. builder tasks data))
  (when-some [data (lookup-entry config id :trigger-config)]
    (. builder triggerConfig data))
  (.build builder))


(defn cfn-flow-props-builder
  "Creates a  `CfnFlowProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-props-builder> (new CfnFlowProps$Builder) id config))


(defn cfn-flow-redshift-destination-properties-property-builder>
  "The cfn-flow-redshift-destination-properties-property-builder> function updates a CfnFlow$RedshiftDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$RedshiftDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `intermediateBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-bucket-name` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$RedshiftDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :intermediate-bucket-name)]
    (. builder intermediateBucketName data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-redshift-destination-properties-property-builder
  "Creates a  `CfnFlow$RedshiftDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-redshift-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-redshift-destination-properties-property-builder> (new CfnFlow$RedshiftDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-s3-destination-properties-property-builder>
  "The cfn-flow-s3-destination-properties-property-builder> function updates a CfnFlow$S3DestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$S3DestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `s3OutputFormatConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output-format-config` |
"
  [^CfnFlow$S3DestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :s3-output-format-config)]
    (. builder s3OutputFormatConfig data))
  (.build builder))


(defn cfn-flow-s3-destination-properties-property-builder
  "Creates a  `CfnFlow$S3DestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-s3-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-s3-destination-properties-property-builder> (new CfnFlow$S3DestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-s3-input-format-config-property-builder>
  "The cfn-flow-s3-input-format-config-property-builder> function updates a CfnFlow$S3InputFormatConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$S3InputFormatConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3InputFileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-file-type` |
"
  [^CfnFlow$S3InputFormatConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-input-file-type)]
    (. builder s3InputFileType data))
  (.build builder))


(defn cfn-flow-s3-input-format-config-property-builder
  "Creates a  `CfnFlow$S3InputFormatConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-s3-input-format-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-s3-input-format-config-property-builder> (new CfnFlow$S3InputFormatConfigProperty$Builder) id config))


(defn cfn-flow-s3-output-format-config-property-builder>
  "The cfn-flow-s3-output-format-config-property-builder> function updates a CfnFlow$S3OutputFormatConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$S3OutputFormatConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationConfig` | software.amazon.awscdk.services.appflow.CfnFlow$AggregationConfigProperty | [[cdk.support/lookup-entry]] | `:aggregation-config` |
| `fileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-type` |
| `prefixConfig` | software.amazon.awscdk.services.appflow.CfnFlow$PrefixConfigProperty | [[cdk.support/lookup-entry]] | `:prefix-config` |
| `preserveSourceDataTyping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preserve-source-data-typing` |
"
  [^CfnFlow$S3OutputFormatConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation-config)]
    (. builder aggregationConfig data))
  (when-some [data (lookup-entry config id :file-type)]
    (. builder fileType data))
  (when-some [data (lookup-entry config id :prefix-config)]
    (. builder prefixConfig data))
  (when-some [data (lookup-entry config id :preserve-source-data-typing)]
    (. builder preserveSourceDataTyping data))
  (.build builder))


(defn cfn-flow-s3-output-format-config-property-builder
  "Creates a  `CfnFlow$S3OutputFormatConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-s3-output-format-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-s3-output-format-config-property-builder> (new CfnFlow$S3OutputFormatConfigProperty$Builder) id config))


(defn cfn-flow-s3-source-properties-property-builder>
  "The cfn-flow-s3-source-properties-property-builder> function updates a CfnFlow$S3SourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$S3SourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `s3InputFormatConfig` | software.amazon.awscdk.services.appflow.CfnFlow$S3InputFormatConfigProperty | [[cdk.support/lookup-entry]] | `:s3-input-format-config` |
"
  [^CfnFlow$S3SourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :s3-input-format-config)]
    (. builder s3InputFormatConfig data))
  (.build builder))


(defn cfn-flow-s3-source-properties-property-builder
  "Creates a  `CfnFlow$S3SourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-s3-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-s3-source-properties-property-builder> (new CfnFlow$S3SourcePropertiesProperty$Builder) id config))


(defn cfn-flow-salesforce-destination-properties-property-builder>
  "The cfn-flow-salesforce-destination-properties-property-builder> function updates a CfnFlow$SalesforceDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SalesforceDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferApi` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-transfer-api` |
| `errorHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$ErrorHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |
"
  [^CfnFlow$SalesforceDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-transfer-api)]
    (. builder dataTransferApi data))
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :id-field-names)]
    (. builder idFieldNames data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (when-some [data (lookup-entry config id :write-operation-type)]
    (. builder writeOperationType data))
  (.build builder))


(defn cfn-flow-salesforce-destination-properties-property-builder
  "Creates a  `CfnFlow$SalesforceDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-salesforce-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-salesforce-destination-properties-property-builder> (new CfnFlow$SalesforceDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-salesforce-source-properties-property-builder>
  "The cfn-flow-salesforce-source-properties-property-builder> function updates a CfnFlow$SalesforceSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SalesforceSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferApi` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-transfer-api` |
| `enableDynamicFieldUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-dynamic-field-update` |
| `includeDeletedRecords` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-deleted-records` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$SalesforceSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-transfer-api)]
    (. builder dataTransferApi data))
  (when-some [data (lookup-entry config id :enable-dynamic-field-update)]
    (. builder enableDynamicFieldUpdate data))
  (when-some [data (lookup-entry config id :include-deleted-records)]
    (. builder includeDeletedRecords data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-salesforce-source-properties-property-builder
  "Creates a  `CfnFlow$SalesforceSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-salesforce-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-salesforce-source-properties-property-builder> (new CfnFlow$SalesforceSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-sapo-data-destination-properties-property-builder>
  "The cfn-flow-sapo-data-destination-properties-property-builder> function updates a CfnFlow$SAPODataDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SAPODataDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `objectPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-path` |
| `successResponseHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$SuccessResponseHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:success-response-handling-config` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |
"
  [^CfnFlow$SAPODataDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :id-field-names)]
    (. builder idFieldNames data))
  (when-some [data (lookup-entry config id :object-path)]
    (. builder objectPath data))
  (when-some [data (lookup-entry config id :success-response-handling-config)]
    (. builder successResponseHandlingConfig data))
  (when-some [data (lookup-entry config id :write-operation-type)]
    (. builder writeOperationType data))
  (.build builder))


(defn cfn-flow-sapo-data-destination-properties-property-builder
  "Creates a  `CfnFlow$SAPODataDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-sapo-data-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-sapo-data-destination-properties-property-builder> (new CfnFlow$SAPODataDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-sapo-data-pagination-config-property-builder>
  "The cfn-flow-sapo-data-pagination-config-property-builder> function updates a CfnFlow$SAPODataPaginationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SAPODataPaginationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxPageSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-page-size` |
"
  [^CfnFlow$SAPODataPaginationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-page-size)]
    (. builder maxPageSize data))
  (.build builder))


(defn cfn-flow-sapo-data-pagination-config-property-builder
  "Creates a  `CfnFlow$SAPODataPaginationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-sapo-data-pagination-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-sapo-data-pagination-config-property-builder> (new CfnFlow$SAPODataPaginationConfigProperty$Builder) id config))


(defn cfn-flow-sapo-data-parallelism-config-property-builder>
  "The cfn-flow-sapo-data-parallelism-config-property-builder> function updates a CfnFlow$SAPODataParallelismConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SAPODataParallelismConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxParallelism` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-parallelism` |
"
  [^CfnFlow$SAPODataParallelismConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-parallelism)]
    (. builder maxParallelism data))
  (.build builder))


(defn cfn-flow-sapo-data-parallelism-config-property-builder
  "Creates a  `CfnFlow$SAPODataParallelismConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-sapo-data-parallelism-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-sapo-data-parallelism-config-property-builder> (new CfnFlow$SAPODataParallelismConfigProperty$Builder) id config))


(defn cfn-flow-sapo-data-source-properties-property-builder>
  "The cfn-flow-sapo-data-source-properties-property-builder> function updates a CfnFlow$SAPODataSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SAPODataSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-path` |
| `paginationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pagination-config` |
| `parallelismConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parallelism-config` |
"
  [^CfnFlow$SAPODataSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object-path)]
    (. builder objectPath data))
  (when-some [data (lookup-entry config id :pagination-config)]
    (. builder paginationConfig data))
  (when-some [data (lookup-entry config id :parallelism-config)]
    (. builder parallelismConfig data))
  (.build builder))


(defn cfn-flow-sapo-data-source-properties-property-builder
  "Creates a  `CfnFlow$SAPODataSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-sapo-data-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-sapo-data-source-properties-property-builder> (new CfnFlow$SAPODataSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-scheduled-trigger-properties-property-builder>
  "The cfn-flow-scheduled-trigger-properties-property-builder> function updates a CfnFlow$ScheduledTriggerPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$ScheduledTriggerPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataPullMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-pull-mode` |
| `firstExecutionFrom` | java.lang.Number | [[cdk.support/lookup-entry]] | `:first-execution-from` |
| `flowErrorDeactivationThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:flow-error-deactivation-threshold` |
| `scheduleEndTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-end-time` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `scheduleStartTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |
"
  [^CfnFlow$ScheduledTriggerPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-pull-mode)]
    (. builder dataPullMode data))
  (when-some [data (lookup-entry config id :first-execution-from)]
    (. builder firstExecutionFrom data))
  (when-some [data (lookup-entry config id :flow-error-deactivation-threshold)]
    (. builder flowErrorDeactivationThreshold data))
  (when-some [data (lookup-entry config id :schedule-end-time)]
    (. builder scheduleEndTime data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :schedule-offset)]
    (. builder scheduleOffset data))
  (when-some [data (lookup-entry config id :schedule-start-time)]
    (. builder scheduleStartTime data))
  (when-some [data (lookup-entry config id :time-zone)]
    (. builder timeZone data))
  (.build builder))


(defn cfn-flow-scheduled-trigger-properties-property-builder
  "Creates a  `CfnFlow$ScheduledTriggerPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-scheduled-trigger-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-scheduled-trigger-properties-property-builder> (new CfnFlow$ScheduledTriggerPropertiesProperty$Builder) id config))


(defn cfn-flow-service-now-source-properties-property-builder>
  "The cfn-flow-service-now-source-properties-property-builder> function updates a CfnFlow$ServiceNowSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$ServiceNowSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$ServiceNowSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-service-now-source-properties-property-builder
  "Creates a  `CfnFlow$ServiceNowSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-service-now-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-service-now-source-properties-property-builder> (new CfnFlow$ServiceNowSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-singular-source-properties-property-builder>
  "The cfn-flow-singular-source-properties-property-builder> function updates a CfnFlow$SingularSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SingularSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$SingularSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-singular-source-properties-property-builder
  "Creates a  `CfnFlow$SingularSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-singular-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-singular-source-properties-property-builder> (new CfnFlow$SingularSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-slack-source-properties-property-builder>
  "The cfn-flow-slack-source-properties-property-builder> function updates a CfnFlow$SlackSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SlackSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$SlackSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-slack-source-properties-property-builder
  "Creates a  `CfnFlow$SlackSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-slack-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-slack-source-properties-property-builder> (new CfnFlow$SlackSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-snowflake-destination-properties-property-builder>
  "The cfn-flow-snowflake-destination-properties-property-builder> function updates a CfnFlow$SnowflakeDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SnowflakeDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `errorHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$ErrorHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `intermediateBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-bucket-name` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$SnowflakeDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :intermediate-bucket-name)]
    (. builder intermediateBucketName data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-snowflake-destination-properties-property-builder
  "Creates a  `CfnFlow$SnowflakeDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-snowflake-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-snowflake-destination-properties-property-builder> (new CfnFlow$SnowflakeDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-source-connector-properties-property-builder>
  "The cfn-flow-source-connector-properties-property-builder> function updates a CfnFlow$SourceConnectorPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SourceConnectorPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amplitude` | software.amazon.awscdk.services.appflow.CfnFlow$AmplitudeSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:amplitude` |
| `customConnector` | software.amazon.awscdk.services.appflow.CfnFlow$CustomConnectorSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:custom-connector` |
| `datadog` | software.amazon.awscdk.services.appflow.CfnFlow$DatadogSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:datadog` |
| `dynatrace` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynatrace` |
| `googleAnalytics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:google-analytics` |
| `inforNexus` | software.amazon.awscdk.services.appflow.CfnFlow$InforNexusSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:infor-nexus` |
| `marketo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:marketo` |
| `pardot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pardot` |
| `s3` | software.amazon.awscdk.services.appflow.CfnFlow$S3SourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:s3` |
| `salesforce` | software.amazon.awscdk.services.appflow.CfnFlow$SalesforceSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:salesforce` |
| `sapoData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sapo-data` |
| `serviceNow` | software.amazon.awscdk.services.appflow.CfnFlow$ServiceNowSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:service-now` |
| `singular` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:singular` |
| `slack` | software.amazon.awscdk.services.appflow.CfnFlow$SlackSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:slack` |
| `trendmicro` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trendmicro` |
| `veeva` | software.amazon.awscdk.services.appflow.CfnFlow$VeevaSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:veeva` |
| `zendesk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zendesk` |
"
  [^CfnFlow$SourceConnectorPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amplitude)]
    (. builder amplitude data))
  (when-some [data (lookup-entry config id :custom-connector)]
    (. builder customConnector data))
  (when-some [data (lookup-entry config id :datadog)]
    (. builder datadog data))
  (when-some [data (lookup-entry config id :dynatrace)]
    (. builder dynatrace data))
  (when-some [data (lookup-entry config id :google-analytics)]
    (. builder googleAnalytics data))
  (when-some [data (lookup-entry config id :infor-nexus)]
    (. builder inforNexus data))
  (when-some [data (lookup-entry config id :marketo)]
    (. builder marketo data))
  (when-some [data (lookup-entry config id :pardot)]
    (. builder pardot data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :salesforce)]
    (. builder salesforce data))
  (when-some [data (lookup-entry config id :sapo-data)]
    (. builder sapoData data))
  (when-some [data (lookup-entry config id :service-now)]
    (. builder serviceNow data))
  (when-some [data (lookup-entry config id :singular)]
    (. builder singular data))
  (when-some [data (lookup-entry config id :slack)]
    (. builder slack data))
  (when-some [data (lookup-entry config id :trendmicro)]
    (. builder trendmicro data))
  (when-some [data (lookup-entry config id :veeva)]
    (. builder veeva data))
  (when-some [data (lookup-entry config id :zendesk)]
    (. builder zendesk data))
  (.build builder))


(defn cfn-flow-source-connector-properties-property-builder
  "Creates a  `CfnFlow$SourceConnectorPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-connector-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-connector-properties-property-builder> (new CfnFlow$SourceConnectorPropertiesProperty$Builder) id config))


(defn cfn-flow-source-flow-config-property-builder>
  "The cfn-flow-source-flow-config-property-builder> function updates a CfnFlow$SourceFlowConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SourceFlowConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `incrementalPullConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:incremental-pull-config` |
| `sourceConnectorProperties` | software.amazon.awscdk.services.appflow.CfnFlow$SourceConnectorPropertiesProperty | [[cdk.support/lookup-entry]] | `:source-connector-properties` |
"
  [^CfnFlow$SourceFlowConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-some [data (lookup-entry config id :connector-profile-name)]
    (. builder connectorProfileName data))
  (when-some [data (lookup-entry config id :connector-type)]
    (. builder connectorType data))
  (when-some [data (lookup-entry config id :incremental-pull-config)]
    (. builder incrementalPullConfig data))
  (when-some [data (lookup-entry config id :source-connector-properties)]
    (. builder sourceConnectorProperties data))
  (.build builder))


(defn cfn-flow-source-flow-config-property-builder
  "Creates a  `CfnFlow$SourceFlowConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-flow-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-flow-config-property-builder> (new CfnFlow$SourceFlowConfigProperty$Builder) id config))


(defn cfn-flow-success-response-handling-config-property-builder>
  "The cfn-flow-success-response-handling-config-property-builder> function updates a CfnFlow$SuccessResponseHandlingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SuccessResponseHandlingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
"
  [^CfnFlow$SuccessResponseHandlingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (.build builder))


(defn cfn-flow-success-response-handling-config-property-builder
  "Creates a  `CfnFlow$SuccessResponseHandlingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-success-response-handling-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-success-response-handling-config-property-builder> (new CfnFlow$SuccessResponseHandlingConfigProperty$Builder) id config))


(defn cfn-flow-task-properties-object-property-builder>
  "The cfn-flow-task-properties-object-property-builder> function updates a CfnFlow$TaskPropertiesObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$TaskPropertiesObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFlow$TaskPropertiesObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-flow-task-properties-object-property-builder
  "Creates a  `CfnFlow$TaskPropertiesObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-task-properties-object-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-task-properties-object-property-builder> (new CfnFlow$TaskPropertiesObjectProperty$Builder) id config))


(defn cfn-flow-task-property-builder>
  "The cfn-flow-task-property-builder> function updates a CfnFlow$TaskProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$TaskProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorOperator` | software.amazon.awscdk.services.appflow.CfnFlow$ConnectorOperatorProperty | [[cdk.support/lookup-entry]] | `:connector-operator` |
| `destinationField` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-field` |
| `sourceFields` | java.util.List | [[cdk.support/lookup-entry]] | `:source-fields` |
| `taskProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:task-properties` |
| `taskType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-type` |
"
  [^CfnFlow$TaskProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-operator)]
    (. builder connectorOperator data))
  (when-some [data (lookup-entry config id :destination-field)]
    (. builder destinationField data))
  (when-some [data (lookup-entry config id :source-fields)]
    (. builder sourceFields data))
  (when-some [data (lookup-entry config id :task-properties)]
    (. builder taskProperties data))
  (when-some [data (lookup-entry config id :task-type)]
    (. builder taskType data))
  (.build builder))


(defn cfn-flow-task-property-builder
  "Creates a  `CfnFlow$TaskProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-task-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-task-property-builder> (new CfnFlow$TaskProperty$Builder) id config))


(defn cfn-flow-trendmicro-source-properties-property-builder>
  "The cfn-flow-trendmicro-source-properties-property-builder> function updates a CfnFlow$TrendmicroSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$TrendmicroSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$TrendmicroSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-trendmicro-source-properties-property-builder
  "Creates a  `CfnFlow$TrendmicroSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-trendmicro-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-trendmicro-source-properties-property-builder> (new CfnFlow$TrendmicroSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-trigger-config-property-builder>
  "The cfn-flow-trigger-config-property-builder> function updates a CfnFlow$TriggerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$TriggerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `triggerProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-properties` |
| `triggerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-type` |
"
  [^CfnFlow$TriggerConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :trigger-properties)]
    (. builder triggerProperties data))
  (when-some [data (lookup-entry config id :trigger-type)]
    (. builder triggerType data))
  (.build builder))


(defn cfn-flow-trigger-config-property-builder
  "Creates a  `CfnFlow$TriggerConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-trigger-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-trigger-config-property-builder> (new CfnFlow$TriggerConfigProperty$Builder) id config))


(defn cfn-flow-upsolver-destination-properties-property-builder>
  "The cfn-flow-upsolver-destination-properties-property-builder> function updates a CfnFlow$UpsolverDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$UpsolverDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `s3OutputFormatConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output-format-config` |
"
  [^CfnFlow$UpsolverDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :s3-output-format-config)]
    (. builder s3OutputFormatConfig data))
  (.build builder))


(defn cfn-flow-upsolver-destination-properties-property-builder
  "Creates a  `CfnFlow$UpsolverDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-upsolver-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-upsolver-destination-properties-property-builder> (new CfnFlow$UpsolverDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-upsolver-s3-output-format-config-property-builder>
  "The cfn-flow-upsolver-s3-output-format-config-property-builder> function updates a CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aggregation-config` |
| `fileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-type` |
| `prefixConfig` | software.amazon.awscdk.services.appflow.CfnFlow$PrefixConfigProperty | [[cdk.support/lookup-entry]] | `:prefix-config` |
"
  [^CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation-config)]
    (. builder aggregationConfig data))
  (when-some [data (lookup-entry config id :file-type)]
    (. builder fileType data))
  (when-some [data (lookup-entry config id :prefix-config)]
    (. builder prefixConfig data))
  (.build builder))


(defn cfn-flow-upsolver-s3-output-format-config-property-builder
  "Creates a  `CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-upsolver-s3-output-format-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-upsolver-s3-output-format-config-property-builder> (new CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder) id config))


(defn cfn-flow-veeva-source-properties-property-builder>
  "The cfn-flow-veeva-source-properties-property-builder> function updates a CfnFlow$VeevaSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$VeevaSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-type` |
| `includeAllVersions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-all-versions` |
| `includeRenditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-renditions` |
| `includeSourceFiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-source-files` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$VeevaSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :document-type)]
    (. builder documentType data))
  (when-some [data (lookup-entry config id :include-all-versions)]
    (. builder includeAllVersions data))
  (when-some [data (lookup-entry config id :include-renditions)]
    (. builder includeRenditions data))
  (when-some [data (lookup-entry config id :include-source-files)]
    (. builder includeSourceFiles data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-veeva-source-properties-property-builder
  "Creates a  `CfnFlow$VeevaSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-veeva-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-veeva-source-properties-property-builder> (new CfnFlow$VeevaSourcePropertiesProperty$Builder) id config))


(defn cfn-flow-zendesk-destination-properties-property-builder>
  "The cfn-flow-zendesk-destination-properties-property-builder> function updates a CfnFlow$ZendeskDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$ZendeskDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |
"
  [^CfnFlow$ZendeskDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :error-handling-config)]
    (. builder errorHandlingConfig data))
  (when-some [data (lookup-entry config id :id-field-names)]
    (. builder idFieldNames data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (when-some [data (lookup-entry config id :write-operation-type)]
    (. builder writeOperationType data))
  (.build builder))


(defn cfn-flow-zendesk-destination-properties-property-builder
  "Creates a  `CfnFlow$ZendeskDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-zendesk-destination-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-zendesk-destination-properties-property-builder> (new CfnFlow$ZendeskDestinationPropertiesProperty$Builder) id config))


(defn cfn-flow-zendesk-source-properties-property-builder>
  "The cfn-flow-zendesk-source-properties-property-builder> function updates a CfnFlow$ZendeskSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$ZendeskSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnFlow$ZendeskSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-flow-zendesk-source-properties-property-builder
  "Creates a  `CfnFlow$ZendeskSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-zendesk-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-zendesk-source-properties-property-builder> (new CfnFlow$ZendeskSourcePropertiesProperty$Builder) id config))