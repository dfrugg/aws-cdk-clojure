(ns cdk.api.services.guardduty
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.guardduty package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.guardduty CfnDetector$Builder
                                                      CfnDetector$CFNDataSourceConfigurationsProperty$Builder
                                                      CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder
                                                      CfnDetector$CFNFeatureConfigurationProperty$Builder
                                                      CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder
                                                      CfnDetector$CFNKubernetesConfigurationProperty$Builder
                                                      CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder
                                                      CfnDetector$CFNS3LogsConfigurationProperty$Builder
                                                      CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder
                                                      CfnDetector$TagItemProperty$Builder
                                                      CfnDetectorProps$Builder
                                                      CfnFilter$Builder
                                                      CfnFilter$ConditionProperty$Builder
                                                      CfnFilter$FindingCriteriaProperty$Builder
                                                      CfnFilterProps$Builder
                                                      CfnIPSet$Builder
                                                      CfnIPSetProps$Builder
                                                      CfnMaster$Builder
                                                      CfnMasterProps$Builder
                                                      CfnMember$Builder
                                                      CfnMemberProps$Builder
                                                      CfnThreatIntelSet$Builder
                                                      CfnThreatIntelSetProps$Builder]))


(defn cfn-detector-builder>
  "The cfn-detector-builder> function updates a CfnDetector$Builder instance using the provided configuration.
  The function takes the CfnDetector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSources` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNDataSourceConfigurationsProperty | [[cdk.support/lookup-entry]] | `:data-sources` |
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
| `features` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:features` |
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetector$Builder builder id config]
  (when-some [data (lookup-entry config id :data-sources)]
    (. builder dataSources data))
  (when-some [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-some [data (lookup-entry config id :features)]
    (. builder features data))
  (when-some [data (lookup-entry config id :finding-publishing-frequency)]
    (. builder findingPublishingFrequency data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-builder
  "Creates a  `CfnDetector$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-detector-builder> (CfnDetector$Builder/create scope (name id)) id config))


(defn cfn-detector-cfn-data-source-configurations-property-builder>
  "The cfn-detector-cfn-data-source-configurations-property-builder> function updates a CfnDetector$CFNDataSourceConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNDataSourceConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kubernetes` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNKubernetesConfigurationProperty | [[cdk.support/lookup-entry]] | `:kubernetes` |
| `malwareProtection` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNMalwareProtectionConfigurationProperty | [[cdk.support/lookup-entry]] | `:malware-protection` |
| `s3Logs` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNS3LogsConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-logs` |
"
  [^CfnDetector$CFNDataSourceConfigurationsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kubernetes)]
    (. builder kubernetes data))
  (when-some [data (lookup-entry config id :malware-protection)]
    (. builder malwareProtection data))
  (when-some [data (lookup-entry config id :s3-logs)]
    (. builder s3Logs data))
  (.build builder))


(defn cfn-detector-cfn-data-source-configurations-property-builder
  "Creates a  `CfnDetector$CFNDataSourceConfigurationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfn-data-source-configurations-property-builder> (new CfnDetector$CFNDataSourceConfigurationsProperty$Builder) id config))


(defn cfn-detector-cfn-feature-additional-configuration-property-builder>
  "The cfn-detector-cfn-feature-additional-configuration-property-builder> function updates a CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-detector-cfn-feature-additional-configuration-property-builder
  "Creates a  `CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfn-feature-additional-configuration-property-builder> (new CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder) id config))


(defn cfn-detector-cfn-feature-configuration-property-builder>
  "The cfn-detector-cfn-feature-configuration-property-builder> function updates a CfnDetector$CFNFeatureConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNFeatureConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnDetector$CFNFeatureConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-configuration)]
    (. builder additionalConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-detector-cfn-feature-configuration-property-builder
  "Creates a  `CfnDetector$CFNFeatureConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfn-feature-configuration-property-builder> (new CfnDetector$CFNFeatureConfigurationProperty$Builder) id config))


(defn cfn-detector-cfn-kubernetes-audit-logs-configuration-property-builder>
  "The cfn-detector-cfn-kubernetes-audit-logs-configuration-property-builder> function updates a CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
"
  [^CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enable)]
    (. builder enable data))
  (.build builder))


(defn cfn-detector-cfn-kubernetes-audit-logs-configuration-property-builder
  "Creates a  `CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfn-kubernetes-audit-logs-configuration-property-builder> (new CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder) id config))


(defn cfn-detector-cfn-kubernetes-configuration-property-builder>
  "The cfn-detector-cfn-kubernetes-configuration-property-builder> function updates a CfnDetector$CFNKubernetesConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNKubernetesConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auditLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit-logs` |
"
  [^CfnDetector$CFNKubernetesConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :audit-logs)]
    (. builder auditLogs data))
  (.build builder))


(defn cfn-detector-cfn-kubernetes-configuration-property-builder
  "Creates a  `CfnDetector$CFNKubernetesConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfn-kubernetes-configuration-property-builder> (new CfnDetector$CFNKubernetesConfigurationProperty$Builder) id config))


(defn cfn-detector-cfn-malware-protection-configuration-property-builder>
  "The cfn-detector-cfn-malware-protection-configuration-property-builder> function updates a CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanEc2InstanceWithFindings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scan-ec2-instance-with-findings` |
"
  [^CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :scan-ec2-instance-with-findings)]
    (. builder scanEc2InstanceWithFindings data))
  (.build builder))


(defn cfn-detector-cfn-malware-protection-configuration-property-builder
  "Creates a  `CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfn-malware-protection-configuration-property-builder> (new CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder) id config))


(defn cfn-detector-cfn-scan-ec2-instance-with-findings-configuration-property-builder>
  "The cfn-detector-cfn-scan-ec2-instance-with-findings-configuration-property-builder> function updates a CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsVolumes` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-volumes` |
"
  [^CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ebs-volumes)]
    (. builder ebsVolumes data))
  (.build builder))


(defn cfn-detector-cfn-scan-ec2-instance-with-findings-configuration-property-builder
  "Creates a  `CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfn-scan-ec2-instance-with-findings-configuration-property-builder> (new CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder) id config))


(defn cfn-detector-cfns3-logs-configuration-property-builder>
  "The cfn-detector-cfns3-logs-configuration-property-builder> function updates a CfnDetector$CFNS3LogsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$CFNS3LogsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
"
  [^CfnDetector$CFNS3LogsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enable)]
    (. builder enable data))
  (.build builder))


(defn cfn-detector-cfns3-logs-configuration-property-builder
  "Creates a  `CfnDetector$CFNS3LogsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-cfns3-logs-configuration-property-builder> (new CfnDetector$CFNS3LogsConfigurationProperty$Builder) id config))


(defn cfn-detector-props-builder>
  "The cfn-detector-props-builder> function updates a CfnDetectorProps$Builder instance using the provided configuration.
  The function takes the CfnDetectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSources` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNDataSourceConfigurationsProperty | [[cdk.support/lookup-entry]] | `:data-sources` |
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
| `features` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:features` |
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-sources)]
    (. builder dataSources data))
  (when-some [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-some [data (lookup-entry config id :features)]
    (. builder features data))
  (when-some [data (lookup-entry config id :finding-publishing-frequency)]
    (. builder findingPublishingFrequency data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-props-builder
  "Creates a  `CfnDetectorProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-props-builder> (new CfnDetectorProps$Builder) id config))


(defn cfn-detector-tag-item-property-builder>
  "The cfn-detector-tag-item-property-builder> function updates a CfnDetector$TagItemProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$TagItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDetector$TagItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-detector-tag-item-property-builder
  "Creates a  `CfnDetector$TagItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-detector-tag-item-property-builder> (new CfnDetector$TagItemProperty$Builder) id config))


(defn cfn-filter-builder>
  "The cfn-filter-builder> function updates a CfnFilter$Builder instance using the provided configuration.
  The function takes the CfnFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `findingCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rank` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rank` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFilter$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :finding-criteria)]
    (. builder findingCriteria data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rank)]
    (. builder rank data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-filter-builder
  "Creates a  `CfnFilter$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-filter-builder> (CfnFilter$Builder/create scope (name id)) id config))


(defn cfn-filter-condition-property-builder>
  "The cfn-filter-condition-property-builder> function updates a CfnFilter$ConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$ConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eq` | java.util.List | [[cdk.support/lookup-entry]] | `:eq` |
| `equalTo` | java.util.List | [[cdk.support/lookup-entry]] | `:equal-to` |
| `greaterThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:greater-than` |
| `greaterThanOrEqual` | java.lang.Number | [[cdk.support/lookup-entry]] | `:greater-than-or-equal` |
| `gt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gt` |
| `gte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gte` |
| `lessThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:less-than` |
| `lessThanOrEqual` | java.lang.Number | [[cdk.support/lookup-entry]] | `:less-than-or-equal` |
| `lt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lt` |
| `lte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lte` |
| `neq` | java.util.List | [[cdk.support/lookup-entry]] | `:neq` |
| `notEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-equals` |
"
  [^CfnFilter$ConditionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :eq)]
    (. builder eq data))
  (when-some [data (lookup-entry config id :equal-to)]
    (. builder equalTo data))
  (when-some [data (lookup-entry config id :greater-than)]
    (. builder greaterThan data))
  (when-some [data (lookup-entry config id :greater-than-or-equal)]
    (. builder greaterThanOrEqual data))
  (when-some [data (lookup-entry config id :gt)]
    (. builder gt data))
  (when-some [data (lookup-entry config id :gte)]
    (. builder gte data))
  (when-some [data (lookup-entry config id :less-than)]
    (. builder lessThan data))
  (when-some [data (lookup-entry config id :less-than-or-equal)]
    (. builder lessThanOrEqual data))
  (when-some [data (lookup-entry config id :lt)]
    (. builder lt data))
  (when-some [data (lookup-entry config id :lte)]
    (. builder lte data))
  (when-some [data (lookup-entry config id :neq)]
    (. builder neq data))
  (when-some [data (lookup-entry config id :not-equals)]
    (. builder notEquals data))
  (.build builder))


(defn cfn-filter-condition-property-builder
  "Creates a  `CfnFilter$ConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-filter-condition-property-builder> (new CfnFilter$ConditionProperty$Builder) id config))


(defn cfn-filter-finding-criteria-property-builder>
  "The cfn-filter-finding-criteria-property-builder> function updates a CfnFilter$FindingCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$FindingCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criterion` | java.lang.Object | [[cdk.support/lookup-entry]] | `:criterion` |
| `itemType` | software.amazon.awscdk.services.guardduty.CfnFilter$ConditionProperty | [[cdk.support/lookup-entry]] | `:item-type` |
"
  [^CfnFilter$FindingCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :criterion)]
    (. builder criterion data))
  (when-some [data (lookup-entry config id :item-type)]
    (. builder itemType data))
  (.build builder))


(defn cfn-filter-finding-criteria-property-builder
  "Creates a  `CfnFilter$FindingCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-filter-finding-criteria-property-builder> (new CfnFilter$FindingCriteriaProperty$Builder) id config))


(defn cfn-filter-props-builder>
  "The cfn-filter-props-builder> function updates a CfnFilterProps$Builder instance using the provided configuration.
  The function takes the CfnFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `findingCriteria` | software.amazon.awscdk.services.guardduty.CfnFilter$FindingCriteriaProperty | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rank` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rank` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFilterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :finding-criteria)]
    (. builder findingCriteria data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rank)]
    (. builder rank data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-filter-props-builder
  "Creates a  `CfnFilterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-filter-props-builder> (new CfnFilterProps$Builder) id config))


(defn cfn-ip-set-builder>
  "The cfn-ip-set-builder> function updates a CfnIPSet$Builder instance using the provided configuration.
  The function takes the CfnIPSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIPSet$Builder builder id config]
  (when-some [data (lookup-entry config id :activate)]
    (. builder activate data))
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-ip-set-builder
  "Creates a  `CfnIPSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-ip-set-builder> (CfnIPSet$Builder/create scope (name id)) id config))


(defn cfn-ip-set-props-builder>
  "The cfn-ip-set-props-builder> function updates a CfnIPSetProps$Builder instance using the provided configuration.
  The function takes the CfnIPSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIPSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :activate)]
    (. builder activate data))
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-ip-set-props-builder
  "Creates a  `CfnIPSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ip-set-props-builder> (new CfnIPSetProps$Builder) id config))


(defn cfn-master-builder>
  "The cfn-master-builder> function updates a CfnMaster$Builder instance using the provided configuration.
  The function takes the CfnMaster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `masterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-id` |
"
  [^CfnMaster$Builder builder id config]
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :invitation-id)]
    (. builder invitationId data))
  (when-some [data (lookup-entry config id :master-id)]
    (. builder masterId data))
  (.build builder))


(defn cfn-master-builder
  "Creates a  `CfnMaster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-master-builder> (CfnMaster$Builder/create scope (name id)) id config))


(defn cfn-master-props-builder>
  "The cfn-master-props-builder> function updates a CfnMasterProps$Builder instance using the provided configuration.
  The function takes the CfnMasterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `masterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-id` |
"
  [^CfnMasterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :invitation-id)]
    (. builder invitationId data))
  (when-some [data (lookup-entry config id :master-id)]
    (. builder masterId data))
  (.build builder))


(defn cfn-master-props-builder
  "Creates a  `CfnMasterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-master-props-builder> (new CfnMasterProps$Builder) id config))


(defn cfn-member-builder>
  "The cfn-member-builder> function updates a CfnMember$Builder instance using the provided configuration.
  The function takes the CfnMember$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `disableEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnMember$Builder builder id config]
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :disable-email-notification)]
    (. builder disableEmailNotification data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-member-builder
  "Creates a  `CfnMember$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-member-builder> (CfnMember$Builder/create scope (name id)) id config))


(defn cfn-member-props-builder>
  "The cfn-member-props-builder> function updates a CfnMemberProps$Builder instance using the provided configuration.
  The function takes the CfnMemberProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `disableEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnMemberProps$Builder builder id config]
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :disable-email-notification)]
    (. builder disableEmailNotification data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-member-props-builder
  "Creates a  `CfnMemberProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-member-props-builder> (new CfnMemberProps$Builder) id config))


(defn cfn-threat-intel-set-builder>
  "The cfn-threat-intel-set-builder> function updates a CfnThreatIntelSet$Builder instance using the provided configuration.
  The function takes the CfnThreatIntelSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnThreatIntelSet$Builder builder id config]
  (when-some [data (lookup-entry config id :activate)]
    (. builder activate data))
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-threat-intel-set-builder
  "Creates a  `CfnThreatIntelSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-threat-intel-set-builder> (CfnThreatIntelSet$Builder/create scope (name id)) id config))


(defn cfn-threat-intel-set-props-builder>
  "The cfn-threat-intel-set-props-builder> function updates a CfnThreatIntelSetProps$Builder instance using the provided configuration.
  The function takes the CfnThreatIntelSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnThreatIntelSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :activate)]
    (. builder activate data))
  (when-some [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-threat-intel-set-props-builder
  "Creates a  `CfnThreatIntelSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-threat-intel-set-props-builder> (new CfnThreatIntelSetProps$Builder) id config))