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


(defn cfn-connector-builder
  "The cfn-connector-builder function buildes out new instances of 
CfnConnector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProvisioningConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-provisioning-config` |
| `connectorProvisioningType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-provisioning-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnConnector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connector-label)]
      (. builder connectorLabel data))
    (when-let [data (lookup-entry config id :connector-provisioning-config)]
      (. builder connectorProvisioningConfig data))
    (when-let [data (lookup-entry config id :connector-provisioning-type)]
      (. builder connectorProvisioningType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-connector-connector-provisioning-config-property-builder
  "The cfn-connector-connector-provisioning-config-property-builder function buildes out new instances of 
CfnConnector$ConnectorProvisioningConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambda` | software.amazon.awscdk.services.appflow.CfnConnector$LambdaConnectorProvisioningConfigProperty | [[cdk.support/lookup-entry]] | `:lambda` |"
  [stack id config]
  (let [builder (CfnConnector$ConnectorProvisioningConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda)]
      (. builder lambda data))
    (.build builder)))


(defn cfn-connector-lambda-connector-provisioning-config-property-builder
  "The cfn-connector-lambda-connector-provisioning-config-property-builder function buildes out new instances of 
CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |"
  [stack id config]
  (let [builder (CfnConnector$LambdaConnectorProvisioningConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-arn)]
      (. builder lambdaArn data))
    (.build builder)))


(defn cfn-connector-profile-amplitude-connector-profile-credentials-property-builder
  "The cfn-connector-profile-amplitude-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$AmplitudeConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :secret-key)]
      (. builder secretKey data))
    (.build builder)))


(defn cfn-connector-profile-api-key-credentials-property-builder
  "The cfn-connector-profile-api-key-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$ApiKeyCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `apiSecretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-secret-key` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ApiKeyCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :api-secret-key)]
      (. builder apiSecretKey data))
    (.build builder)))


(defn cfn-connector-profile-basic-auth-credentials-property-builder
  "The cfn-connector-profile-basic-auth-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$BasicAuthCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$BasicAuthCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-connector-profile-builder
  "The cfn-connector-profile-builder function buildes out new instances of 
CfnConnectorProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-mode` |
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProfileConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-profile-config` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-mode)]
      (. builder connectionMode data))
    (when-let [data (lookup-entry config id :connector-label)]
      (. builder connectorLabel data))
    (when-let [data (lookup-entry config id :connector-profile-config)]
      (. builder connectorProfileConfig data))
    (when-let [data (lookup-entry config id :connector-profile-name)]
      (. builder connectorProfileName data))
    (when-let [data (lookup-entry config id :connector-type)]
      (. builder connectorType data))
    (when-let [data (lookup-entry config id :kms-arn)]
      (. builder kmsArn data))
    (.build builder)))


(defn cfn-connector-profile-connector-o-auth-request-property-builder
  "The cfn-connector-profile-connector-o-auth-request-property-builder function buildes out new instances of 
CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-code` |
| `redirectUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:redirect-uri` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ConnectorOAuthRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth-code)]
      (. builder authCode data))
    (when-let [data (lookup-entry config id :redirect-uri)]
      (. builder redirectUri data))
    (.build builder)))


(defn cfn-connector-profile-connector-profile-config-property-builder
  "The cfn-connector-profile-connector-profile-config-property-builder function buildes out new instances of 
CfnConnectorProfile$ConnectorProfileConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorProfileCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-profile-credentials` |
| `connectorProfileProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-profile-properties` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ConnectorProfileConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-profile-credentials)]
      (. builder connectorProfileCredentials data))
    (when-let [data (lookup-entry config id :connector-profile-properties)]
      (. builder connectorProfileProperties data))
    (.build builder)))


(defn cfn-connector-profile-connector-profile-credentials-property-builder
  "The cfn-connector-profile-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `zendesk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zendesk` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :amplitude)]
      (. builder amplitude data))
    (when-let [data (lookup-entry config id :custom-connector)]
      (. builder customConnector data))
    (when-let [data (lookup-entry config id :datadog)]
      (. builder datadog data))
    (when-let [data (lookup-entry config id :dynatrace)]
      (. builder dynatrace data))
    (when-let [data (lookup-entry config id :google-analytics)]
      (. builder googleAnalytics data))
    (when-let [data (lookup-entry config id :infor-nexus)]
      (. builder inforNexus data))
    (when-let [data (lookup-entry config id :marketo)]
      (. builder marketo data))
    (when-let [data (lookup-entry config id :pardot)]
      (. builder pardot data))
    (when-let [data (lookup-entry config id :redshift)]
      (. builder redshift data))
    (when-let [data (lookup-entry config id :salesforce)]
      (. builder salesforce data))
    (when-let [data (lookup-entry config id :sapo-data)]
      (. builder sapoData data))
    (when-let [data (lookup-entry config id :service-now)]
      (. builder serviceNow data))
    (when-let [data (lookup-entry config id :singular)]
      (. builder singular data))
    (when-let [data (lookup-entry config id :slack)]
      (. builder slack data))
    (when-let [data (lookup-entry config id :snowflake)]
      (. builder snowflake data))
    (when-let [data (lookup-entry config id :trendmicro)]
      (. builder trendmicro data))
    (when-let [data (lookup-entry config id :veeva)]
      (. builder veeva data))
    (when-let [data (lookup-entry config id :zendesk)]
      (. builder zendesk data))
    (.build builder)))


(defn cfn-connector-profile-connector-profile-properties-property-builder
  "The cfn-connector-profile-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `zendesk` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty | [[cdk.support/lookup-entry]] | `:zendesk` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-connector)]
      (. builder customConnector data))
    (when-let [data (lookup-entry config id :datadog)]
      (. builder datadog data))
    (when-let [data (lookup-entry config id :dynatrace)]
      (. builder dynatrace data))
    (when-let [data (lookup-entry config id :infor-nexus)]
      (. builder inforNexus data))
    (when-let [data (lookup-entry config id :marketo)]
      (. builder marketo data))
    (when-let [data (lookup-entry config id :pardot)]
      (. builder pardot data))
    (when-let [data (lookup-entry config id :redshift)]
      (. builder redshift data))
    (when-let [data (lookup-entry config id :salesforce)]
      (. builder salesforce data))
    (when-let [data (lookup-entry config id :sapo-data)]
      (. builder sapoData data))
    (when-let [data (lookup-entry config id :service-now)]
      (. builder serviceNow data))
    (when-let [data (lookup-entry config id :slack)]
      (. builder slack data))
    (when-let [data (lookup-entry config id :snowflake)]
      (. builder snowflake data))
    (when-let [data (lookup-entry config id :veeva)]
      (. builder veeva data))
    (when-let [data (lookup-entry config id :zendesk)]
      (. builder zendesk data))
    (.build builder)))


(defn cfn-connector-profile-custom-auth-credentials-property-builder
  "The cfn-connector-profile-custom-auth-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$CustomAuthCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:credentials-map` |
| `customAuthenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-authentication-type` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$CustomAuthCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :credentials-map)]
      (. builder credentialsMap data))
    (when-let [data (lookup-entry config id :custom-authentication-type)]
      (. builder customAuthenticationType data))
    (.build builder)))


(defn cfn-connector-profile-custom-connector-profile-credentials-property-builder
  "The cfn-connector-profile-custom-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `basic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic` |
| `custom` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$CustomAuthCredentialsProperty | [[cdk.support/lookup-entry]] | `:custom` |
| `oauth2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oauth2` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$CustomConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :basic)]
      (. builder basic data))
    (when-let [data (lookup-entry config id :custom)]
      (. builder custom data))
    (when-let [data (lookup-entry config id :oauth2)]
      (. builder oauth2 data))
    (.build builder)))


(defn cfn-connector-profile-custom-connector-profile-properties-property-builder
  "The cfn-connector-profile-custom-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oAuth2Properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth2-properties` |
| `profileProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:profile-properties` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$CustomConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :o-auth2-properties)]
      (. builder oAuth2Properties data))
    (when-let [data (lookup-entry config id :profile-properties)]
      (. builder profileProperties data))
    (.build builder)))


(defn cfn-connector-profile-datadog-connector-profile-credentials-property-builder
  "The cfn-connector-profile-datadog-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-key` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$DatadogConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :application-key)]
      (. builder applicationKey data))
    (.build builder)))


(defn cfn-connector-profile-datadog-connector-profile-properties-property-builder
  "The cfn-connector-profile-datadog-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$DatadogConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-profile-dynatrace-connector-profile-credentials-property-builder
  "The cfn-connector-profile-dynatrace-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-token` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$DynatraceConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-token)]
      (. builder apiToken data))
    (.build builder)))


(defn cfn-connector-profile-dynatrace-connector-profile-properties-property-builder
  "The cfn-connector-profile-dynatrace-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$DynatraceConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-profile-google-analytics-connector-profile-credentials-property-builder
  "The cfn-connector-profile-google-analytics-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorOAuthRequestProperty | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$GoogleAnalyticsConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :connector-o-auth-request)]
      (. builder connectorOAuthRequest data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (.build builder)))


(defn cfn-connector-profile-infor-nexus-connector-profile-credentials-property-builder
  "The cfn-connector-profile-infor-nexus-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-key-id` |
| `datakey` | java.lang.String | [[cdk.support/lookup-entry]] | `:datakey` |
| `secretAccessKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-access-key` |
| `userId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-id` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$InforNexusConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-key-id)]
      (. builder accessKeyId data))
    (when-let [data (lookup-entry config id :datakey)]
      (. builder datakey data))
    (when-let [data (lookup-entry config id :secret-access-key)]
      (. builder secretAccessKey data))
    (when-let [data (lookup-entry config id :user-id)]
      (. builder userId data))
    (.build builder)))


(defn cfn-connector-profile-infor-nexus-connector-profile-properties-property-builder
  "The cfn-connector-profile-infor-nexus-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$InforNexusConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-profile-marketo-connector-profile-credentials-property-builder
  "The cfn-connector-profile-marketo-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$MarketoConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :connector-o-auth-request)]
      (. builder connectorOAuthRequest data))
    (.build builder)))


(defn cfn-connector-profile-marketo-connector-profile-properties-property-builder
  "The cfn-connector-profile-marketo-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$MarketoConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-profile-o-auth-credentials-property-builder
  "The cfn-connector-profile-o-auth-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$OAuthCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorOAuthRequestProperty | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$OAuthCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :connector-o-auth-request)]
      (. builder connectorOAuthRequest data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (.build builder)))


(defn cfn-connector-profile-o-auth-properties-property-builder
  "The cfn-connector-profile-o-auth-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$OAuthPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authCodeUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-code-url` |
| `oAuthScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:o-auth-scopes` |
| `tokenUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$OAuthPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth-code-url)]
      (. builder authCodeUrl data))
    (when-let [data (lookup-entry config id :o-auth-scopes)]
      (. builder oAuthScopes data))
    (when-let [data (lookup-entry config id :token-url)]
      (. builder tokenUrl data))
    (.build builder)))


(defn cfn-connector-profile-o-auth2-credentials-property-builder
  "The cfn-connector-profile-o-auth2-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$OAuth2CredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `oAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$OAuth2CredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :o-auth-request)]
      (. builder oAuthRequest data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (.build builder)))


(defn cfn-connector-profile-o-auth2-properties-property-builder
  "The cfn-connector-profile-o-auth2-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$OAuth2PropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oAuth2GrantType` | java.lang.String | [[cdk.support/lookup-entry]] | `:o-auth2-grant-type` |
| `tokenUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-url` |
| `tokenUrlCustomProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:token-url-custom-properties` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$OAuth2PropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :o-auth2-grant-type)]
      (. builder oAuth2GrantType data))
    (when-let [data (lookup-entry config id :token-url)]
      (. builder tokenUrl data))
    (when-let [data (lookup-entry config id :token-url-custom-properties)]
      (. builder tokenUrlCustomProperties data))
    (.build builder)))


(defn cfn-connector-profile-pardot-connector-profile-credentials-property-builder
  "The cfn-connector-profile-pardot-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientCredentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-credentials-arn` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$PardotConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-credentials-arn)]
      (. builder clientCredentialsArn data))
    (when-let [data (lookup-entry config id :connector-o-auth-request)]
      (. builder connectorOAuthRequest data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (.build builder)))


(defn cfn-connector-profile-pardot-connector-profile-properties-property-builder
  "The cfn-connector-profile-pardot-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessUnitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-unit-id` |
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
| `isSandboxEnvironment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-sandbox-environment` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$PardotConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :business-unit-id)]
      (. builder businessUnitId data))
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (when-let [data (lookup-entry config id :is-sandbox-environment)]
      (. builder isSandboxEnvironment data))
    (.build builder)))


(defn cfn-connector-profile-props-builder
  "The cfn-connector-profile-props-builder function buildes out new instances of 
CfnConnectorProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-mode` |
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProfileConfig` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorProfileConfigProperty | [[cdk.support/lookup-entry]] | `:connector-profile-config` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |"
  [stack id config]
  (let [builder (CfnConnectorProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-mode)]
      (. builder connectionMode data))
    (when-let [data (lookup-entry config id :connector-label)]
      (. builder connectorLabel data))
    (when-let [data (lookup-entry config id :connector-profile-config)]
      (. builder connectorProfileConfig data))
    (when-let [data (lookup-entry config id :connector-profile-name)]
      (. builder connectorProfileName data))
    (when-let [data (lookup-entry config id :connector-type)]
      (. builder connectorType data))
    (when-let [data (lookup-entry config id :kms-arn)]
      (. builder kmsArn data))
    (.build builder)))


(defn cfn-connector-profile-redshift-connector-profile-credentials-property-builder
  "The cfn-connector-profile-redshift-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$RedshiftConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-connector-profile-redshift-connector-profile-properties-property-builder
  "The cfn-connector-profile-redshift-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$RedshiftConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :data-api-role-arn)]
      (. builder dataApiRoleArn data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :database-url)]
      (. builder databaseUrl data))
    (when-let [data (lookup-entry config id :is-redshift-serverless)]
      (. builder isRedshiftServerless data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :workgroup-name)]
      (. builder workgroupName data))
    (.build builder)))


(defn cfn-connector-profile-salesforce-connector-profile-credentials-property-builder
  "The cfn-connector-profile-salesforce-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientCredentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-credentials-arn` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |
| `jwtToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:jwt-token` |
| `oAuth2GrantType` | java.lang.String | [[cdk.support/lookup-entry]] | `:o-auth2-grant-type` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SalesforceConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-credentials-arn)]
      (. builder clientCredentialsArn data))
    (when-let [data (lookup-entry config id :connector-o-auth-request)]
      (. builder connectorOAuthRequest data))
    (when-let [data (lookup-entry config id :jwt-token)]
      (. builder jwtToken data))
    (when-let [data (lookup-entry config id :o-auth2-grant-type)]
      (. builder oAuth2GrantType data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (.build builder)))


(defn cfn-connector-profile-salesforce-connector-profile-properties-property-builder
  "The cfn-connector-profile-salesforce-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |
| `isSandboxEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-sandbox-environment` |
| `usePrivateLinkForMetadataAndAuthorization` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-private-link-for-metadata-and-authorization` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SalesforceConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (when-let [data (lookup-entry config id :is-sandbox-environment)]
      (. builder isSandboxEnvironment data))
    (when-let [data (lookup-entry config id :use-private-link-for-metadata-and-authorization)]
      (. builder usePrivateLinkForMetadataAndAuthorization data))
    (.build builder)))


(defn cfn-connector-profile-sapo-data-connector-profile-credentials-property-builder
  "The cfn-connector-profile-sapo-data-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuthCredentials` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$BasicAuthCredentialsProperty | [[cdk.support/lookup-entry]] | `:basic-auth-credentials` |
| `oAuthCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth-credentials` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SAPODataConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :basic-auth-credentials)]
      (. builder basicAuthCredentials data))
    (when-let [data (lookup-entry config id :o-auth-credentials)]
      (. builder oAuthCredentials data))
    (.build builder)))


(defn cfn-connector-profile-sapo-data-connector-profile-properties-property-builder
  "The cfn-connector-profile-sapo-data-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationHostUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-host-url` |
| `applicationServicePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-service-path` |
| `clientNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-number` |
| `disableSso` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-sso` |
| `logonLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:logon-language` |
| `oAuthProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:o-auth-properties` |
| `portNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port-number` |
| `privateLinkServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-link-service-name` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SAPODataConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-host-url)]
      (. builder applicationHostUrl data))
    (when-let [data (lookup-entry config id :application-service-path)]
      (. builder applicationServicePath data))
    (when-let [data (lookup-entry config id :client-number)]
      (. builder clientNumber data))
    (when-let [data (lookup-entry config id :disable-sso)]
      (. builder disableSso data))
    (when-let [data (lookup-entry config id :logon-language)]
      (. builder logonLanguage data))
    (when-let [data (lookup-entry config id :o-auth-properties)]
      (. builder oAuthProperties data))
    (when-let [data (lookup-entry config id :port-number)]
      (. builder portNumber data))
    (when-let [data (lookup-entry config id :private-link-service-name)]
      (. builder privateLinkServiceName data))
    (.build builder)))


(defn cfn-connector-profile-service-now-connector-profile-credentials-property-builder
  "The cfn-connector-profile-service-now-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oAuth2Credentials` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$OAuth2CredentialsProperty | [[cdk.support/lookup-entry]] | `:o-auth2-credentials` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ServiceNowConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :o-auth2-credentials)]
      (. builder oAuth2Credentials data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-connector-profile-service-now-connector-profile-properties-property-builder
  "The cfn-connector-profile-service-now-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ServiceNowConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-profile-singular-connector-profile-credentials-property-builder
  "The cfn-connector-profile-singular-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SingularConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (.build builder)))


(defn cfn-connector-profile-slack-connector-profile-credentials-property-builder
  "The cfn-connector-profile-slack-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SlackConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :connector-o-auth-request)]
      (. builder connectorOAuthRequest data))
    (.build builder)))


(defn cfn-connector-profile-slack-connector-profile-properties-property-builder
  "The cfn-connector-profile-slack-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SlackConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-profile-snowflake-connector-profile-credentials-property-builder
  "The cfn-connector-profile-snowflake-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SnowflakeConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-connector-profile-snowflake-connector-profile-properties-property-builder
  "The cfn-connector-profile-snowflake-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `privateLinkServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-link-service-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
| `warehouse` | java.lang.String | [[cdk.support/lookup-entry]] | `:warehouse` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$SnowflakeConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-name)]
      (. builder accountName data))
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :private-link-service-name)]
      (. builder privateLinkServiceName data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (when-let [data (lookup-entry config id :warehouse)]
      (. builder warehouse data))
    (.build builder)))


(defn cfn-connector-profile-trendmicro-connector-profile-credentials-property-builder
  "The cfn-connector-profile-trendmicro-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiSecretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-secret-key` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$TrendmicroConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-secret-key)]
      (. builder apiSecretKey data))
    (.build builder)))


(defn cfn-connector-profile-veeva-connector-profile-credentials-property-builder
  "The cfn-connector-profile-veeva-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$VeevaConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-connector-profile-veeva-connector-profile-properties-property-builder
  "The cfn-connector-profile-veeva-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$VeevaConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-profile-zendesk-connector-profile-credentials-property-builder
  "The cfn-connector-profile-zendesk-connector-profile-credentials-property-builder function buildes out new instances of 
CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `connectorOAuthRequest` | software.amazon.awscdk.services.appflow.CfnConnectorProfile$ConnectorOAuthRequestProperty | [[cdk.support/lookup-entry]] | `:connector-o-auth-request` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ZendeskConnectorProfileCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :connector-o-auth-request)]
      (. builder connectorOAuthRequest data))
    (.build builder)))


(defn cfn-connector-profile-zendesk-connector-profile-properties-property-builder
  "The cfn-connector-profile-zendesk-connector-profile-properties-property-builder function buildes out new instances of 
CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-url` |"
  [stack id config]
  (let [builder (CfnConnectorProfile$ZendeskConnectorProfilePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-url)]
      (. builder instanceUrl data))
    (.build builder)))


(defn cfn-connector-props-builder
  "The cfn-connector-props-builder function buildes out new instances of 
CfnConnectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-label` |
| `connectorProvisioningConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-provisioning-config` |
| `connectorProvisioningType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-provisioning-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnConnectorProps$Builder.)]
    (when-let [data (lookup-entry config id :connector-label)]
      (. builder connectorLabel data))
    (when-let [data (lookup-entry config id :connector-provisioning-config)]
      (. builder connectorProvisioningConfig data))
    (when-let [data (lookup-entry config id :connector-provisioning-type)]
      (. builder connectorProvisioningType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-flow-aggregation-config-property-builder
  "The cfn-flow-aggregation-config-property-builder function buildes out new instances of 
CfnFlow$AggregationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation-type` |
| `targetFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-file-size` |"
  [stack id config]
  (let [builder (CfnFlow$AggregationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregation-type)]
      (. builder aggregationType data))
    (when-let [data (lookup-entry config id :target-file-size)]
      (. builder targetFileSize data))
    (.build builder)))


(defn cfn-flow-amplitude-source-properties-property-builder
  "The cfn-flow-amplitude-source-properties-property-builder function buildes out new instances of 
CfnFlow$AmplitudeSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$AmplitudeSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-builder
  "The cfn-flow-builder function buildes out new instances of 
CfnFlow$Builder using the provided configuration.  Each field is set as follows:

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
| `triggerConfig` | software.amazon.awscdk.services.appflow.CfnFlow$TriggerConfigProperty | [[cdk.support/lookup-entry]] | `:trigger-config` |"
  [stack id config]
  (let [builder (CfnFlow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-flow-config-list)]
      (. builder destinationFlowConfigList data))
    (when-let [data (lookup-entry config id :flow-name)]
      (. builder flowName data))
    (when-let [data (lookup-entry config id :flow-status)]
      (. builder flowStatus data))
    (when-let [data (lookup-entry config id :kms-arn)]
      (. builder kmsArn data))
    (when-let [data (lookup-entry config id :metadata-catalog-config)]
      (. builder metadataCatalogConfig data))
    (when-let [data (lookup-entry config id :source-flow-config)]
      (. builder sourceFlowConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tasks)]
      (. builder tasks data))
    (when-let [data (lookup-entry config id :trigger-config)]
      (. builder triggerConfig data))
    (.build builder)))


(defn cfn-flow-connector-operator-property-builder
  "The cfn-flow-connector-operator-property-builder function buildes out new instances of 
CfnFlow$ConnectorOperatorProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `zendesk` | java.lang.String | [[cdk.support/lookup-entry]] | `:zendesk` |"
  [stack id config]
  (let [builder (CfnFlow$ConnectorOperatorProperty$Builder.)]
    (when-let [data (lookup-entry config id :amplitude)]
      (. builder amplitude data))
    (when-let [data (lookup-entry config id :custom-connector)]
      (. builder customConnector data))
    (when-let [data (lookup-entry config id :datadog)]
      (. builder datadog data))
    (when-let [data (lookup-entry config id :dynatrace)]
      (. builder dynatrace data))
    (when-let [data (lookup-entry config id :google-analytics)]
      (. builder googleAnalytics data))
    (when-let [data (lookup-entry config id :infor-nexus)]
      (. builder inforNexus data))
    (when-let [data (lookup-entry config id :marketo)]
      (. builder marketo data))
    (when-let [data (lookup-entry config id :pardot)]
      (. builder pardot data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (when-let [data (lookup-entry config id :salesforce)]
      (. builder salesforce data))
    (when-let [data (lookup-entry config id :sapo-data)]
      (. builder sapoData data))
    (when-let [data (lookup-entry config id :service-now)]
      (. builder serviceNow data))
    (when-let [data (lookup-entry config id :singular)]
      (. builder singular data))
    (when-let [data (lookup-entry config id :slack)]
      (. builder slack data))
    (when-let [data (lookup-entry config id :trendmicro)]
      (. builder trendmicro data))
    (when-let [data (lookup-entry config id :veeva)]
      (. builder veeva data))
    (when-let [data (lookup-entry config id :zendesk)]
      (. builder zendesk data))
    (.build builder)))


(defn cfn-flow-custom-connector-destination-properties-property-builder
  "The cfn-flow-custom-connector-destination-properties-property-builder function buildes out new instances of 
CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-properties` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |
| `errorHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$ErrorHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |"
  [stack id config]
  (let [builder (CfnFlow$CustomConnectorDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-properties)]
      (. builder customProperties data))
    (when-let [data (lookup-entry config id :entity-name)]
      (. builder entityName data))
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :id-field-names)]
      (. builder idFieldNames data))
    (when-let [data (lookup-entry config id :write-operation-type)]
      (. builder writeOperationType data))
    (.build builder)))


(defn cfn-flow-custom-connector-source-properties-property-builder
  "The cfn-flow-custom-connector-source-properties-property-builder function buildes out new instances of 
CfnFlow$CustomConnectorSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-properties` |
| `dataTransferApi` | software.amazon.awscdk.services.appflow.CfnFlow$DataTransferApiProperty | [[cdk.support/lookup-entry]] | `:data-transfer-api` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |"
  [stack id config]
  (let [builder (CfnFlow$CustomConnectorSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-properties)]
      (. builder customProperties data))
    (when-let [data (lookup-entry config id :data-transfer-api)]
      (. builder dataTransferApi data))
    (when-let [data (lookup-entry config id :entity-name)]
      (. builder entityName data))
    (.build builder)))


(defn cfn-flow-data-transfer-api-property-builder
  "The cfn-flow-data-transfer-api-property-builder function buildes out new instances of 
CfnFlow$DataTransferApiProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFlow$DataTransferApiProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-flow-datadog-source-properties-property-builder
  "The cfn-flow-datadog-source-properties-property-builder function buildes out new instances of 
CfnFlow$DatadogSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$DatadogSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-destination-connector-properties-property-builder
  "The cfn-flow-destination-connector-properties-property-builder function buildes out new instances of 
CfnFlow$DestinationConnectorPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `zendesk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zendesk` |"
  [stack id config]
  (let [builder (CfnFlow$DestinationConnectorPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-connector)]
      (. builder customConnector data))
    (when-let [data (lookup-entry config id :event-bridge)]
      (. builder eventBridge data))
    (when-let [data (lookup-entry config id :lookout-metrics)]
      (. builder lookoutMetrics data))
    (when-let [data (lookup-entry config id :marketo)]
      (. builder marketo data))
    (when-let [data (lookup-entry config id :redshift)]
      (. builder redshift data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (when-let [data (lookup-entry config id :salesforce)]
      (. builder salesforce data))
    (when-let [data (lookup-entry config id :sapo-data)]
      (. builder sapoData data))
    (when-let [data (lookup-entry config id :snowflake)]
      (. builder snowflake data))
    (when-let [data (lookup-entry config id :upsolver)]
      (. builder upsolver data))
    (when-let [data (lookup-entry config id :zendesk)]
      (. builder zendesk data))
    (.build builder)))


(defn cfn-flow-destination-flow-config-property-builder
  "The cfn-flow-destination-flow-config-property-builder function buildes out new instances of 
CfnFlow$DestinationFlowConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `destinationConnectorProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-connector-properties` |"
  [stack id config]
  (let [builder (CfnFlow$DestinationFlowConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-version)]
      (. builder apiVersion data))
    (when-let [data (lookup-entry config id :connector-profile-name)]
      (. builder connectorProfileName data))
    (when-let [data (lookup-entry config id :connector-type)]
      (. builder connectorType data))
    (when-let [data (lookup-entry config id :destination-connector-properties)]
      (. builder destinationConnectorProperties data))
    (.build builder)))


(defn cfn-flow-dynatrace-source-properties-property-builder
  "The cfn-flow-dynatrace-source-properties-property-builder function buildes out new instances of 
CfnFlow$DynatraceSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$DynatraceSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-error-handling-config-property-builder
  "The cfn-flow-error-handling-config-property-builder function buildes out new instances of 
CfnFlow$ErrorHandlingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `failOnFirstError` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fail-on-first-error` |"
  [stack id config]
  (let [builder (CfnFlow$ErrorHandlingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :fail-on-first-error)]
      (. builder failOnFirstError data))
    (.build builder)))


(defn cfn-flow-event-bridge-destination-properties-property-builder
  "The cfn-flow-event-bridge-destination-properties-property-builder function buildes out new instances of 
CfnFlow$EventBridgeDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$EventBridgeDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-glue-data-catalog-property-builder
  "The cfn-flow-glue-data-catalog-property-builder function buildes out new instances of 
CfnFlow$GlueDataCatalogProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tablePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-prefix` |"
  [stack id config]
  (let [builder (CfnFlow$GlueDataCatalogProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :table-prefix)]
      (. builder tablePrefix data))
    (.build builder)))


(defn cfn-flow-google-analytics-source-properties-property-builder
  "The cfn-flow-google-analytics-source-properties-property-builder function buildes out new instances of 
CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$GoogleAnalyticsSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-incremental-pull-config-property-builder
  "The cfn-flow-incremental-pull-config-property-builder function buildes out new instances of 
CfnFlow$IncrementalPullConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeTypeFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-type-field-name` |"
  [stack id config]
  (let [builder (CfnFlow$IncrementalPullConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :datetime-type-field-name)]
      (. builder datetimeTypeFieldName data))
    (.build builder)))


(defn cfn-flow-infor-nexus-source-properties-property-builder
  "The cfn-flow-infor-nexus-source-properties-property-builder function buildes out new instances of 
CfnFlow$InforNexusSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$InforNexusSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-lookout-metrics-destination-properties-property-builder
  "The cfn-flow-lookout-metrics-destination-properties-property-builder function buildes out new instances of 
CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$LookoutMetricsDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-marketo-destination-properties-property-builder
  "The cfn-flow-marketo-destination-properties-property-builder function buildes out new instances of 
CfnFlow$MarketoDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$MarketoDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-marketo-source-properties-property-builder
  "The cfn-flow-marketo-source-properties-property-builder function buildes out new instances of 
CfnFlow$MarketoSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$MarketoSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-metadata-catalog-config-property-builder
  "The cfn-flow-metadata-catalog-config-property-builder function buildes out new instances of 
CfnFlow$MetadataCatalogConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueDataCatalog` | software.amazon.awscdk.services.appflow.CfnFlow$GlueDataCatalogProperty | [[cdk.support/lookup-entry]] | `:glue-data-catalog` |"
  [stack id config]
  (let [builder (CfnFlow$MetadataCatalogConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :glue-data-catalog)]
      (. builder glueDataCatalog data))
    (.build builder)))


(defn cfn-flow-pardot-source-properties-property-builder
  "The cfn-flow-pardot-source-properties-property-builder function buildes out new instances of 
CfnFlow$PardotSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$PardotSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-prefix-config-property-builder
  "The cfn-flow-prefix-config-property-builder function buildes out new instances of 
CfnFlow$PrefixConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pathPrefixHierarchy` | java.util.List | [[cdk.support/lookup-entry]] | `:path-prefix-hierarchy` |
| `prefixFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-format` |
| `prefixType` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-type` |"
  [stack id config]
  (let [builder (CfnFlow$PrefixConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :path-prefix-hierarchy)]
      (. builder pathPrefixHierarchy data))
    (when-let [data (lookup-entry config id :prefix-format)]
      (. builder prefixFormat data))
    (when-let [data (lookup-entry config id :prefix-type)]
      (. builder prefixType data))
    (.build builder)))


(defn cfn-flow-props-builder
  "The cfn-flow-props-builder function buildes out new instances of 
CfnFlowProps$Builder using the provided configuration.  Each field is set as follows:

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
| `triggerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-config` |"
  [stack id config]
  (let [builder (CfnFlowProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-flow-config-list)]
      (. builder destinationFlowConfigList data))
    (when-let [data (lookup-entry config id :flow-name)]
      (. builder flowName data))
    (when-let [data (lookup-entry config id :flow-status)]
      (. builder flowStatus data))
    (when-let [data (lookup-entry config id :kms-arn)]
      (. builder kmsArn data))
    (when-let [data (lookup-entry config id :metadata-catalog-config)]
      (. builder metadataCatalogConfig data))
    (when-let [data (lookup-entry config id :source-flow-config)]
      (. builder sourceFlowConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tasks)]
      (. builder tasks data))
    (when-let [data (lookup-entry config id :trigger-config)]
      (. builder triggerConfig data))
    (.build builder)))


(defn cfn-flow-redshift-destination-properties-property-builder
  "The cfn-flow-redshift-destination-properties-property-builder function buildes out new instances of 
CfnFlow$RedshiftDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `intermediateBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-bucket-name` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$RedshiftDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :intermediate-bucket-name)]
      (. builder intermediateBucketName data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-s3-destination-properties-property-builder
  "The cfn-flow-s3-destination-properties-property-builder function buildes out new instances of 
CfnFlow$S3DestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `s3OutputFormatConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output-format-config` |"
  [stack id config]
  (let [builder (CfnFlow$S3DestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :s3-output-format-config)]
      (. builder s3OutputFormatConfig data))
    (.build builder)))


(defn cfn-flow-s3-input-format-config-property-builder
  "The cfn-flow-s3-input-format-config-property-builder function buildes out new instances of 
CfnFlow$S3InputFormatConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3InputFileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-file-type` |"
  [stack id config]
  (let [builder (CfnFlow$S3InputFormatConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-input-file-type)]
      (. builder s3InputFileType data))
    (.build builder)))


(defn cfn-flow-s3-output-format-config-property-builder
  "The cfn-flow-s3-output-format-config-property-builder function buildes out new instances of 
CfnFlow$S3OutputFormatConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationConfig` | software.amazon.awscdk.services.appflow.CfnFlow$AggregationConfigProperty | [[cdk.support/lookup-entry]] | `:aggregation-config` |
| `fileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-type` |
| `prefixConfig` | software.amazon.awscdk.services.appflow.CfnFlow$PrefixConfigProperty | [[cdk.support/lookup-entry]] | `:prefix-config` |
| `preserveSourceDataTyping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preserve-source-data-typing` |"
  [stack id config]
  (let [builder (CfnFlow$S3OutputFormatConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregation-config)]
      (. builder aggregationConfig data))
    (when-let [data (lookup-entry config id :file-type)]
      (. builder fileType data))
    (when-let [data (lookup-entry config id :prefix-config)]
      (. builder prefixConfig data))
    (when-let [data (lookup-entry config id :preserve-source-data-typing)]
      (. builder preserveSourceDataTyping data))
    (.build builder)))


(defn cfn-flow-s3-source-properties-property-builder
  "The cfn-flow-s3-source-properties-property-builder function buildes out new instances of 
CfnFlow$S3SourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `s3InputFormatConfig` | software.amazon.awscdk.services.appflow.CfnFlow$S3InputFormatConfigProperty | [[cdk.support/lookup-entry]] | `:s3-input-format-config` |"
  [stack id config]
  (let [builder (CfnFlow$S3SourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :s3-input-format-config)]
      (. builder s3InputFormatConfig data))
    (.build builder)))


(defn cfn-flow-salesforce-destination-properties-property-builder
  "The cfn-flow-salesforce-destination-properties-property-builder function buildes out new instances of 
CfnFlow$SalesforceDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferApi` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-transfer-api` |
| `errorHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$ErrorHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |"
  [stack id config]
  (let [builder (CfnFlow$SalesforceDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-transfer-api)]
      (. builder dataTransferApi data))
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :id-field-names)]
      (. builder idFieldNames data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (when-let [data (lookup-entry config id :write-operation-type)]
      (. builder writeOperationType data))
    (.build builder)))


(defn cfn-flow-salesforce-source-properties-property-builder
  "The cfn-flow-salesforce-source-properties-property-builder function buildes out new instances of 
CfnFlow$SalesforceSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferApi` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-transfer-api` |
| `enableDynamicFieldUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-dynamic-field-update` |
| `includeDeletedRecords` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-deleted-records` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$SalesforceSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-transfer-api)]
      (. builder dataTransferApi data))
    (when-let [data (lookup-entry config id :enable-dynamic-field-update)]
      (. builder enableDynamicFieldUpdate data))
    (when-let [data (lookup-entry config id :include-deleted-records)]
      (. builder includeDeletedRecords data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-sapo-data-destination-properties-property-builder
  "The cfn-flow-sapo-data-destination-properties-property-builder function buildes out new instances of 
CfnFlow$SAPODataDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `objectPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-path` |
| `successResponseHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$SuccessResponseHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:success-response-handling-config` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |"
  [stack id config]
  (let [builder (CfnFlow$SAPODataDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :id-field-names)]
      (. builder idFieldNames data))
    (when-let [data (lookup-entry config id :object-path)]
      (. builder objectPath data))
    (when-let [data (lookup-entry config id :success-response-handling-config)]
      (. builder successResponseHandlingConfig data))
    (when-let [data (lookup-entry config id :write-operation-type)]
      (. builder writeOperationType data))
    (.build builder)))


(defn cfn-flow-sapo-data-pagination-config-property-builder
  "The cfn-flow-sapo-data-pagination-config-property-builder function buildes out new instances of 
CfnFlow$SAPODataPaginationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxPageSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-page-size` |"
  [stack id config]
  (let [builder (CfnFlow$SAPODataPaginationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-page-size)]
      (. builder maxPageSize data))
    (.build builder)))


(defn cfn-flow-sapo-data-parallelism-config-property-builder
  "The cfn-flow-sapo-data-parallelism-config-property-builder function buildes out new instances of 
CfnFlow$SAPODataParallelismConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxParallelism` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-parallelism` |"
  [stack id config]
  (let [builder (CfnFlow$SAPODataParallelismConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-parallelism)]
      (. builder maxParallelism data))
    (.build builder)))


(defn cfn-flow-sapo-data-source-properties-property-builder
  "The cfn-flow-sapo-data-source-properties-property-builder function buildes out new instances of 
CfnFlow$SAPODataSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-path` |
| `paginationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pagination-config` |
| `parallelismConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parallelism-config` |"
  [stack id config]
  (let [builder (CfnFlow$SAPODataSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object-path)]
      (. builder objectPath data))
    (when-let [data (lookup-entry config id :pagination-config)]
      (. builder paginationConfig data))
    (when-let [data (lookup-entry config id :parallelism-config)]
      (. builder parallelismConfig data))
    (.build builder)))


(defn cfn-flow-scheduled-trigger-properties-property-builder
  "The cfn-flow-scheduled-trigger-properties-property-builder function buildes out new instances of 
CfnFlow$ScheduledTriggerPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataPullMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-pull-mode` |
| `firstExecutionFrom` | java.lang.Number | [[cdk.support/lookup-entry]] | `:first-execution-from` |
| `flowErrorDeactivationThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:flow-error-deactivation-threshold` |
| `scheduleEndTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-end-time` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `scheduleStartTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnFlow$ScheduledTriggerPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-pull-mode)]
      (. builder dataPullMode data))
    (when-let [data (lookup-entry config id :first-execution-from)]
      (. builder firstExecutionFrom data))
    (when-let [data (lookup-entry config id :flow-error-deactivation-threshold)]
      (. builder flowErrorDeactivationThreshold data))
    (when-let [data (lookup-entry config id :schedule-end-time)]
      (. builder scheduleEndTime data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :schedule-offset)]
      (. builder scheduleOffset data))
    (when-let [data (lookup-entry config id :schedule-start-time)]
      (. builder scheduleStartTime data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-flow-service-now-source-properties-property-builder
  "The cfn-flow-service-now-source-properties-property-builder function buildes out new instances of 
CfnFlow$ServiceNowSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$ServiceNowSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-singular-source-properties-property-builder
  "The cfn-flow-singular-source-properties-property-builder function buildes out new instances of 
CfnFlow$SingularSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$SingularSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-slack-source-properties-property-builder
  "The cfn-flow-slack-source-properties-property-builder function buildes out new instances of 
CfnFlow$SlackSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$SlackSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-snowflake-destination-properties-property-builder
  "The cfn-flow-snowflake-destination-properties-property-builder function buildes out new instances of 
CfnFlow$SnowflakeDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `errorHandlingConfig` | software.amazon.awscdk.services.appflow.CfnFlow$ErrorHandlingConfigProperty | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `intermediateBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-bucket-name` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$SnowflakeDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :intermediate-bucket-name)]
      (. builder intermediateBucketName data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-source-connector-properties-property-builder
  "The cfn-flow-source-connector-properties-property-builder function buildes out new instances of 
CfnFlow$SourceConnectorPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `zendesk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zendesk` |"
  [stack id config]
  (let [builder (CfnFlow$SourceConnectorPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :amplitude)]
      (. builder amplitude data))
    (when-let [data (lookup-entry config id :custom-connector)]
      (. builder customConnector data))
    (when-let [data (lookup-entry config id :datadog)]
      (. builder datadog data))
    (when-let [data (lookup-entry config id :dynatrace)]
      (. builder dynatrace data))
    (when-let [data (lookup-entry config id :google-analytics)]
      (. builder googleAnalytics data))
    (when-let [data (lookup-entry config id :infor-nexus)]
      (. builder inforNexus data))
    (when-let [data (lookup-entry config id :marketo)]
      (. builder marketo data))
    (when-let [data (lookup-entry config id :pardot)]
      (. builder pardot data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (when-let [data (lookup-entry config id :salesforce)]
      (. builder salesforce data))
    (when-let [data (lookup-entry config id :sapo-data)]
      (. builder sapoData data))
    (when-let [data (lookup-entry config id :service-now)]
      (. builder serviceNow data))
    (when-let [data (lookup-entry config id :singular)]
      (. builder singular data))
    (when-let [data (lookup-entry config id :slack)]
      (. builder slack data))
    (when-let [data (lookup-entry config id :trendmicro)]
      (. builder trendmicro data))
    (when-let [data (lookup-entry config id :veeva)]
      (. builder veeva data))
    (when-let [data (lookup-entry config id :zendesk)]
      (. builder zendesk data))
    (.build builder)))


(defn cfn-flow-source-flow-config-property-builder
  "The cfn-flow-source-flow-config-property-builder function buildes out new instances of 
CfnFlow$SourceFlowConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `incrementalPullConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:incremental-pull-config` |
| `sourceConnectorProperties` | software.amazon.awscdk.services.appflow.CfnFlow$SourceConnectorPropertiesProperty | [[cdk.support/lookup-entry]] | `:source-connector-properties` |"
  [stack id config]
  (let [builder (CfnFlow$SourceFlowConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-version)]
      (. builder apiVersion data))
    (when-let [data (lookup-entry config id :connector-profile-name)]
      (. builder connectorProfileName data))
    (when-let [data (lookup-entry config id :connector-type)]
      (. builder connectorType data))
    (when-let [data (lookup-entry config id :incremental-pull-config)]
      (. builder incrementalPullConfig data))
    (when-let [data (lookup-entry config id :source-connector-properties)]
      (. builder sourceConnectorProperties data))
    (.build builder)))


(defn cfn-flow-success-response-handling-config-property-builder
  "The cfn-flow-success-response-handling-config-property-builder function buildes out new instances of 
CfnFlow$SuccessResponseHandlingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |"
  [stack id config]
  (let [builder (CfnFlow$SuccessResponseHandlingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (.build builder)))


(defn cfn-flow-task-properties-object-property-builder
  "The cfn-flow-task-properties-object-property-builder function buildes out new instances of 
CfnFlow$TaskPropertiesObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnFlow$TaskPropertiesObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-flow-task-property-builder
  "The cfn-flow-task-property-builder function buildes out new instances of 
CfnFlow$TaskProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorOperator` | software.amazon.awscdk.services.appflow.CfnFlow$ConnectorOperatorProperty | [[cdk.support/lookup-entry]] | `:connector-operator` |
| `destinationField` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-field` |
| `sourceFields` | java.util.List | [[cdk.support/lookup-entry]] | `:source-fields` |
| `taskProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:task-properties` |
| `taskType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-type` |"
  [stack id config]
  (let [builder (CfnFlow$TaskProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-operator)]
      (. builder connectorOperator data))
    (when-let [data (lookup-entry config id :destination-field)]
      (. builder destinationField data))
    (when-let [data (lookup-entry config id :source-fields)]
      (. builder sourceFields data))
    (when-let [data (lookup-entry config id :task-properties)]
      (. builder taskProperties data))
    (when-let [data (lookup-entry config id :task-type)]
      (. builder taskType data))
    (.build builder)))


(defn cfn-flow-trendmicro-source-properties-property-builder
  "The cfn-flow-trendmicro-source-properties-property-builder function buildes out new instances of 
CfnFlow$TrendmicroSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$TrendmicroSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-trigger-config-property-builder
  "The cfn-flow-trigger-config-property-builder function buildes out new instances of 
CfnFlow$TriggerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `triggerProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-properties` |
| `triggerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-type` |"
  [stack id config]
  (let [builder (CfnFlow$TriggerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :trigger-properties)]
      (. builder triggerProperties data))
    (when-let [data (lookup-entry config id :trigger-type)]
      (. builder triggerType data))
    (.build builder)))


(defn cfn-flow-upsolver-destination-properties-property-builder
  "The cfn-flow-upsolver-destination-properties-property-builder function buildes out new instances of 
CfnFlow$UpsolverDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `s3OutputFormatConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output-format-config` |"
  [stack id config]
  (let [builder (CfnFlow$UpsolverDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :s3-output-format-config)]
      (. builder s3OutputFormatConfig data))
    (.build builder)))


(defn cfn-flow-upsolver-s3-output-format-config-property-builder
  "The cfn-flow-upsolver-s3-output-format-config-property-builder function buildes out new instances of 
CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aggregation-config` |
| `fileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-type` |
| `prefixConfig` | software.amazon.awscdk.services.appflow.CfnFlow$PrefixConfigProperty | [[cdk.support/lookup-entry]] | `:prefix-config` |"
  [stack id config]
  (let [builder (CfnFlow$UpsolverS3OutputFormatConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregation-config)]
      (. builder aggregationConfig data))
    (when-let [data (lookup-entry config id :file-type)]
      (. builder fileType data))
    (when-let [data (lookup-entry config id :prefix-config)]
      (. builder prefixConfig data))
    (.build builder)))


(defn cfn-flow-veeva-source-properties-property-builder
  "The cfn-flow-veeva-source-properties-property-builder function buildes out new instances of 
CfnFlow$VeevaSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-type` |
| `includeAllVersions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-all-versions` |
| `includeRenditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-renditions` |
| `includeSourceFiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-source-files` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$VeevaSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-type)]
      (. builder documentType data))
    (when-let [data (lookup-entry config id :include-all-versions)]
      (. builder includeAllVersions data))
    (when-let [data (lookup-entry config id :include-renditions)]
      (. builder includeRenditions data))
    (when-let [data (lookup-entry config id :include-source-files)]
      (. builder includeSourceFiles data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-flow-zendesk-destination-properties-property-builder
  "The cfn-flow-zendesk-destination-properties-property-builder function buildes out new instances of 
CfnFlow$ZendeskDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorHandlingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-handling-config` |
| `idFieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:id-field-names` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
| `writeOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:write-operation-type` |"
  [stack id config]
  (let [builder (CfnFlow$ZendeskDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-handling-config)]
      (. builder errorHandlingConfig data))
    (when-let [data (lookup-entry config id :id-field-names)]
      (. builder idFieldNames data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (when-let [data (lookup-entry config id :write-operation-type)]
      (. builder writeOperationType data))
    (.build builder)))


(defn cfn-flow-zendesk-source-properties-property-builder
  "The cfn-flow-zendesk-source-properties-property-builder function buildes out new instances of 
CfnFlow$ZendeskSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnFlow$ZendeskSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))