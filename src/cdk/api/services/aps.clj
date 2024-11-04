(ns cdk.api.services.aps
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.aps package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.aps CfnRuleGroupsNamespace$Builder
                                                CfnRuleGroupsNamespaceProps$Builder
                                                CfnScraper$AmpConfigurationProperty$Builder
                                                CfnScraper$Builder
                                                CfnScraper$DestinationProperty$Builder
                                                CfnScraper$EksConfigurationProperty$Builder
                                                CfnScraper$ScrapeConfigurationProperty$Builder
                                                CfnScraper$SourceProperty$Builder
                                                CfnScraperProps$Builder
                                                CfnWorkspace$Builder
                                                CfnWorkspace$LoggingConfigurationProperty$Builder
                                                CfnWorkspaceProps$Builder]))


(defn cfn-rule-groups-namespace-builder
  "The cfn-rule-groups-namespace-builder function buildes out new instances of 
CfnRuleGroupsNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workspace` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace` |"
  [stack id config]
  (let [builder (CfnRuleGroupsNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workspace)]
      (. builder workspace data))
    (.build builder)))


(defn cfn-rule-groups-namespace-props-builder
  "The cfn-rule-groups-namespace-props-builder function buildes out new instances of 
CfnRuleGroupsNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workspace` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace` |"
  [stack id config]
  (let [builder (CfnRuleGroupsNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workspace)]
      (. builder workspace data))
    (.build builder)))


(defn cfn-scraper-amp-configuration-property-builder
  "The cfn-scraper-amp-configuration-property-builder function buildes out new instances of 
CfnScraper$AmpConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workspaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-arn` |"
  [stack id config]
  (let [builder (CfnScraper$AmpConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :workspace-arn)]
      (. builder workspaceArn data))
    (.build builder)))


(defn cfn-scraper-builder
  "The cfn-scraper-builder function buildes out new instances of 
CfnScraper$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `scrapeConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$ScrapeConfigurationProperty | [[cdk.support/lookup-entry]] | `:scrape-configuration` |
| `source` | software.amazon.awscdk.services.aps.CfnScraper$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnScraper$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :scrape-configuration)]
      (. builder scrapeConfiguration data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-scraper-destination-property-builder
  "The cfn-scraper-destination-property-builder function buildes out new instances of 
CfnScraper$DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ampConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$AmpConfigurationProperty | [[cdk.support/lookup-entry]] | `:amp-configuration` |"
  [stack id config]
  (let [builder (CfnScraper$DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :amp-configuration)]
      (. builder ampConfiguration data))
    (.build builder)))


(defn cfn-scraper-eks-configuration-property-builder
  "The cfn-scraper-eks-configuration-property-builder function buildes out new instances of 
CfnScraper$EksConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnScraper$EksConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-scraper-props-builder
  "The cfn-scraper-props-builder function buildes out new instances of 
CfnScraperProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `destination` | software.amazon.awscdk.services.aps.CfnScraper$DestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `scrapeConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$ScrapeConfigurationProperty | [[cdk.support/lookup-entry]] | `:scrape-configuration` |
| `source` | software.amazon.awscdk.services.aps.CfnScraper$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnScraperProps$Builder.)]
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :scrape-configuration)]
      (. builder scrapeConfiguration data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-scraper-scrape-configuration-property-builder
  "The cfn-scraper-scrape-configuration-property-builder function buildes out new instances of 
CfnScraper$ScrapeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationBlob` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-blob` |"
  [stack id config]
  (let [builder (CfnScraper$ScrapeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :configuration-blob)]
      (. builder configurationBlob data))
    (.build builder)))


(defn cfn-scraper-source-property-builder
  "The cfn-scraper-source-property-builder function buildes out new instances of 
CfnScraper$SourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$EksConfigurationProperty | [[cdk.support/lookup-entry]] | `:eks-configuration` |"
  [stack id config]
  (let [builder (CfnScraper$SourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :eks-configuration)]
      (. builder eksConfiguration data))
    (.build builder)))


(defn cfn-workspace-builder
  "The cfn-workspace-builder function buildes out new instances of 
CfnWorkspace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alertManagerDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-manager-definition` |
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `loggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkspace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alert-manager-definition)]
      (. builder alertManagerDefinition data))
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :logging-configuration)]
      (. builder loggingConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workspace-logging-configuration-property-builder
  "The cfn-workspace-logging-configuration-property-builder function buildes out new instances of 
CfnWorkspace$LoggingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |"
  [stack id config]
  (let [builder (CfnWorkspace$LoggingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-arn)]
      (. builder logGroupArn data))
    (.build builder)))


(defn cfn-workspace-props-builder
  "The cfn-workspace-props-builder function buildes out new instances of 
CfnWorkspaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alertManagerDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-manager-definition` |
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `loggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkspaceProps$Builder.)]
    (when-let [data (lookup-entry config id :alert-manager-definition)]
      (. builder alertManagerDefinition data))
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :logging-configuration)]
      (. builder loggingConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))