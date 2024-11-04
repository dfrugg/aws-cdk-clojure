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


(defn cfn-detector-builder
  "The cfn-detector-builder function buildes out new instances of 
CfnDetector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSources` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNDataSourceConfigurationsProperty | [[cdk.support/lookup-entry]] | `:data-sources` |
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
| `features` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:features` |
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-sources)]
      (. builder dataSources data))
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (when-let [data (lookup-entry config id :features)]
      (. builder features data))
    (when-let [data (lookup-entry config id :finding-publishing-frequency)]
      (. builder findingPublishingFrequency data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-detector-cfn-data-source-configurations-property-builder
  "The cfn-detector-cfn-data-source-configurations-property-builder function buildes out new instances of 
CfnDetector$CFNDataSourceConfigurationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kubernetes` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNKubernetesConfigurationProperty | [[cdk.support/lookup-entry]] | `:kubernetes` |
| `malwareProtection` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNMalwareProtectionConfigurationProperty | [[cdk.support/lookup-entry]] | `:malware-protection` |
| `s3Logs` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNS3LogsConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-logs` |"
  [stack id config]
  (let [builder (CfnDetector$CFNDataSourceConfigurationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :kubernetes)]
      (. builder kubernetes data))
    (when-let [data (lookup-entry config id :malware-protection)]
      (. builder malwareProtection data))
    (when-let [data (lookup-entry config id :s3-logs)]
      (. builder s3Logs data))
    (.build builder)))


(defn cfn-detector-cfn-feature-additional-configuration-property-builder
  "The cfn-detector-cfn-feature-additional-configuration-property-builder function buildes out new instances of 
CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnDetector$CFNFeatureAdditionalConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-detector-cfn-feature-configuration-property-builder
  "The cfn-detector-cfn-feature-configuration-property-builder function buildes out new instances of 
CfnDetector$CFNFeatureConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnDetector$CFNFeatureConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-configuration)]
      (. builder additionalConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-detector-cfn-kubernetes-audit-logs-configuration-property-builder
  "The cfn-detector-cfn-kubernetes-audit-logs-configuration-property-builder function buildes out new instances of 
CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |"
  [stack id config]
  (let [builder (CfnDetector$CFNKubernetesAuditLogsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (.build builder)))


(defn cfn-detector-cfn-kubernetes-configuration-property-builder
  "The cfn-detector-cfn-kubernetes-configuration-property-builder function buildes out new instances of 
CfnDetector$CFNKubernetesConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auditLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit-logs` |"
  [stack id config]
  (let [builder (CfnDetector$CFNKubernetesConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :audit-logs)]
      (. builder auditLogs data))
    (.build builder)))


(defn cfn-detector-cfn-malware-protection-configuration-property-builder
  "The cfn-detector-cfn-malware-protection-configuration-property-builder function buildes out new instances of 
CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanEc2InstanceWithFindings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scan-ec2-instance-with-findings` |"
  [stack id config]
  (let [builder (CfnDetector$CFNMalwareProtectionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :scan-ec2-instance-with-findings)]
      (. builder scanEc2InstanceWithFindings data))
    (.build builder)))


(defn cfn-detector-cfn-scan-ec2-instance-with-findings-configuration-property-builder
  "The cfn-detector-cfn-scan-ec2-instance-with-findings-configuration-property-builder function buildes out new instances of 
CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsVolumes` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-volumes` |"
  [stack id config]
  (let [builder (CfnDetector$CFNScanEc2InstanceWithFindingsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-volumes)]
      (. builder ebsVolumes data))
    (.build builder)))


(defn cfn-detector-cfns3-logs-configuration-property-builder
  "The cfn-detector-cfns3-logs-configuration-property-builder function buildes out new instances of 
CfnDetector$CFNS3LogsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |"
  [stack id config]
  (let [builder (CfnDetector$CFNS3LogsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (.build builder)))


(defn cfn-detector-props-builder
  "The cfn-detector-props-builder function buildes out new instances of 
CfnDetectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSources` | software.amazon.awscdk.services.guardduty.CfnDetector$CFNDataSourceConfigurationsProperty | [[cdk.support/lookup-entry]] | `:data-sources` |
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
| `features` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:features` |
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetectorProps$Builder.)]
    (when-let [data (lookup-entry config id :data-sources)]
      (. builder dataSources data))
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (when-let [data (lookup-entry config id :features)]
      (. builder features data))
    (when-let [data (lookup-entry config id :finding-publishing-frequency)]
      (. builder findingPublishingFrequency data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-detector-tag-item-property-builder
  "The cfn-detector-tag-item-property-builder function buildes out new instances of 
CfnDetector$TagItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDetector$TagItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-filter-builder
  "The cfn-filter-builder function buildes out new instances of 
CfnFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `findingCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rank` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rank` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :finding-criteria)]
      (. builder findingCriteria data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rank)]
      (. builder rank data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-filter-condition-property-builder
  "The cfn-filter-condition-property-builder function buildes out new instances of 
CfnFilter$ConditionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `notEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-equals` |"
  [stack id config]
  (let [builder (CfnFilter$ConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :eq)]
      (. builder eq data))
    (when-let [data (lookup-entry config id :equal-to)]
      (. builder equalTo data))
    (when-let [data (lookup-entry config id :greater-than)]
      (. builder greaterThan data))
    (when-let [data (lookup-entry config id :greater-than-or-equal)]
      (. builder greaterThanOrEqual data))
    (when-let [data (lookup-entry config id :gt)]
      (. builder gt data))
    (when-let [data (lookup-entry config id :gte)]
      (. builder gte data))
    (when-let [data (lookup-entry config id :less-than)]
      (. builder lessThan data))
    (when-let [data (lookup-entry config id :less-than-or-equal)]
      (. builder lessThanOrEqual data))
    (when-let [data (lookup-entry config id :lt)]
      (. builder lt data))
    (when-let [data (lookup-entry config id :lte)]
      (. builder lte data))
    (when-let [data (lookup-entry config id :neq)]
      (. builder neq data))
    (when-let [data (lookup-entry config id :not-equals)]
      (. builder notEquals data))
    (.build builder)))


(defn cfn-filter-finding-criteria-property-builder
  "The cfn-filter-finding-criteria-property-builder function buildes out new instances of 
CfnFilter$FindingCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criterion` | java.lang.Object | [[cdk.support/lookup-entry]] | `:criterion` |
| `itemType` | software.amazon.awscdk.services.guardduty.CfnFilter$ConditionProperty | [[cdk.support/lookup-entry]] | `:item-type` |"
  [stack id config]
  (let [builder (CfnFilter$FindingCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :criterion)]
      (. builder criterion data))
    (when-let [data (lookup-entry config id :item-type)]
      (. builder itemType data))
    (.build builder)))


(defn cfn-filter-props-builder
  "The cfn-filter-props-builder function buildes out new instances of 
CfnFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `findingCriteria` | software.amazon.awscdk.services.guardduty.CfnFilter$FindingCriteriaProperty | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rank` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rank` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :finding-criteria)]
      (. builder findingCriteria data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rank)]
      (. builder rank data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ip-set-builder
  "The cfn-ip-set-builder function buildes out new instances of 
CfnIPSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :activate)]
      (. builder activate data))
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ip-set-props-builder
  "The cfn-ip-set-props-builder function buildes out new instances of 
CfnIPSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPSetProps$Builder.)]
    (when-let [data (lookup-entry config id :activate)]
      (. builder activate data))
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-master-builder
  "The cfn-master-builder function buildes out new instances of 
CfnMaster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `masterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-id` |"
  [stack id config]
  (let [builder (CfnMaster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :invitation-id)]
      (. builder invitationId data))
    (when-let [data (lookup-entry config id :master-id)]
      (. builder masterId data))
    (.build builder)))


(defn cfn-master-props-builder
  "The cfn-master-props-builder function buildes out new instances of 
CfnMasterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `masterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-id` |"
  [stack id config]
  (let [builder (CfnMasterProps$Builder.)]
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :invitation-id)]
      (. builder invitationId data))
    (when-let [data (lookup-entry config id :master-id)]
      (. builder masterId data))
    (.build builder)))


(defn cfn-member-builder
  "The cfn-member-builder function buildes out new instances of 
CfnMember$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `disableEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnMember$Builder/create stack id)]
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :disable-email-notification)]
      (. builder disableEmailNotification data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :member-id)]
      (. builder memberId data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-member-props-builder
  "The cfn-member-props-builder function buildes out new instances of 
CfnMemberProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `disableEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnMemberProps$Builder.)]
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :disable-email-notification)]
      (. builder disableEmailNotification data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :member-id)]
      (. builder memberId data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-threat-intel-set-builder
  "The cfn-threat-intel-set-builder function buildes out new instances of 
CfnThreatIntelSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnThreatIntelSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :activate)]
      (. builder activate data))
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-threat-intel-set-props-builder
  "The cfn-threat-intel-set-props-builder function buildes out new instances of 
CfnThreatIntelSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:activate` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnThreatIntelSetProps$Builder.)]
    (when-let [data (lookup-entry config id :activate)]
      (. builder activate data))
    (when-let [data (lookup-entry config id :detector-id)]
      (. builder detectorId data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))