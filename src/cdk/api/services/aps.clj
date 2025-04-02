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


(defn cfn-rule-groups-namespace-builder>
  "The cfn-rule-groups-namespace-builder> function updates a CfnRuleGroupsNamespace$Builder instance using the provided configuration.
  The function takes the CfnRuleGroupsNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workspace` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace` |
"
  [^CfnRuleGroupsNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workspace)]
    (. builder workspace data))
  (.build builder))


(defn cfn-rule-groups-namespace-builder
  "Creates a  `CfnRuleGroupsNamespace$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-rule-groups-namespace-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-rule-groups-namespace-builder> (CfnRuleGroupsNamespace$Builder/create scope (name id)) id config))


(defn cfn-rule-groups-namespace-props-builder>
  "The cfn-rule-groups-namespace-props-builder> function updates a CfnRuleGroupsNamespaceProps$Builder instance using the provided configuration.
  The function takes the CfnRuleGroupsNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workspace` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace` |
"
  [^CfnRuleGroupsNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workspace)]
    (. builder workspace data))
  (.build builder))


(defn cfn-rule-groups-namespace-props-builder
  "Creates a  `CfnRuleGroupsNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-rule-groups-namespace-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-rule-groups-namespace-props-builder> (new CfnRuleGroupsNamespaceProps$Builder) id config))


(defn cfn-scraper-amp-configuration-property-builder>
  "The cfn-scraper-amp-configuration-property-builder> function updates a CfnScraper$AmpConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScraper$AmpConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workspaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-arn` |
"
  [^CfnScraper$AmpConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :workspace-arn)]
    (. builder workspaceArn data))
  (.build builder))


(defn cfn-scraper-amp-configuration-property-builder
  "Creates a  `CfnScraper$AmpConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scraper-amp-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scraper-amp-configuration-property-builder> (new CfnScraper$AmpConfigurationProperty$Builder) id config))


(defn cfn-scraper-builder>
  "The cfn-scraper-builder> function updates a CfnScraper$Builder instance using the provided configuration.
  The function takes the CfnScraper$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `scrapeConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$ScrapeConfigurationProperty | [[cdk.support/lookup-entry]] | `:scrape-configuration` |
| `source` | software.amazon.awscdk.services.aps.CfnScraper$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnScraper$Builder builder id config]
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :scrape-configuration)]
    (. builder scrapeConfiguration data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-scraper-builder
  "Creates a  `CfnScraper$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-scraper-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-scraper-builder> (CfnScraper$Builder/create scope (name id)) id config))


(defn cfn-scraper-destination-property-builder>
  "The cfn-scraper-destination-property-builder> function updates a CfnScraper$DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnScraper$DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ampConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$AmpConfigurationProperty | [[cdk.support/lookup-entry]] | `:amp-configuration` |
"
  [^CfnScraper$DestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amp-configuration)]
    (. builder ampConfiguration data))
  (.build builder))


(defn cfn-scraper-destination-property-builder
  "Creates a  `CfnScraper$DestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scraper-destination-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scraper-destination-property-builder> (new CfnScraper$DestinationProperty$Builder) id config))


(defn cfn-scraper-eks-configuration-property-builder>
  "The cfn-scraper-eks-configuration-property-builder> function updates a CfnScraper$EksConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScraper$EksConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnScraper$EksConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-scraper-eks-configuration-property-builder
  "Creates a  `CfnScraper$EksConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scraper-eks-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scraper-eks-configuration-property-builder> (new CfnScraper$EksConfigurationProperty$Builder) id config))


(defn cfn-scraper-props-builder>
  "The cfn-scraper-props-builder> function updates a CfnScraperProps$Builder instance using the provided configuration.
  The function takes the CfnScraperProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `destination` | software.amazon.awscdk.services.aps.CfnScraper$DestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `scrapeConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$ScrapeConfigurationProperty | [[cdk.support/lookup-entry]] | `:scrape-configuration` |
| `source` | software.amazon.awscdk.services.aps.CfnScraper$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnScraperProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :scrape-configuration)]
    (. builder scrapeConfiguration data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-scraper-props-builder
  "Creates a  `CfnScraperProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scraper-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scraper-props-builder> (new CfnScraperProps$Builder) id config))


(defn cfn-scraper-scrape-configuration-property-builder>
  "The cfn-scraper-scrape-configuration-property-builder> function updates a CfnScraper$ScrapeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScraper$ScrapeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationBlob` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-blob` |
"
  [^CfnScraper$ScrapeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-blob)]
    (. builder configurationBlob data))
  (.build builder))


(defn cfn-scraper-scrape-configuration-property-builder
  "Creates a  `CfnScraper$ScrapeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scraper-scrape-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scraper-scrape-configuration-property-builder> (new CfnScraper$ScrapeConfigurationProperty$Builder) id config))


(defn cfn-scraper-source-property-builder>
  "The cfn-scraper-source-property-builder> function updates a CfnScraper$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnScraper$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksConfiguration` | software.amazon.awscdk.services.aps.CfnScraper$EksConfigurationProperty | [[cdk.support/lookup-entry]] | `:eks-configuration` |
"
  [^CfnScraper$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :eks-configuration)]
    (. builder eksConfiguration data))
  (.build builder))


(defn cfn-scraper-source-property-builder
  "Creates a  `CfnScraper$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scraper-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scraper-source-property-builder> (new CfnScraper$SourceProperty$Builder) id config))


(defn cfn-workspace-builder>
  "The cfn-workspace-builder> function updates a CfnWorkspace$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alertManagerDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-manager-definition` |
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `loggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkspace$Builder builder id config]
  (when-some [data (lookup-entry config id :alert-manager-definition)]
    (. builder alertManagerDefinition data))
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workspace-builder
  "Creates a  `CfnWorkspace$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-workspace-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-workspace-builder> (CfnWorkspace$Builder/create scope (name id)) id config))


(defn cfn-workspace-logging-configuration-property-builder>
  "The cfn-workspace-logging-configuration-property-builder> function updates a CfnWorkspace$LoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$LoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
"
  [^CfnWorkspace$LoggingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-arn)]
    (. builder logGroupArn data))
  (.build builder))


(defn cfn-workspace-logging-configuration-property-builder
  "Creates a  `CfnWorkspace$LoggingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workspace-logging-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workspace-logging-configuration-property-builder> (new CfnWorkspace$LoggingConfigurationProperty$Builder) id config))


(defn cfn-workspace-props-builder>
  "The cfn-workspace-props-builder> function updates a CfnWorkspaceProps$Builder instance using the provided configuration.
  The function takes the CfnWorkspaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alertManagerDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-manager-definition` |
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `loggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkspaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alert-manager-definition)]
    (. builder alertManagerDefinition data))
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workspace-props-builder
  "Creates a  `CfnWorkspaceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workspace-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workspace-props-builder> (new CfnWorkspaceProps$Builder) id config))