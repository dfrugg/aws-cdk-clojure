(ns cdk.api.services.inspectorv2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.inspectorv2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.inspectorv2 CfnCisScanConfiguration$Builder
                                                        CfnCisScanConfiguration$CisTargetsProperty$Builder
                                                        CfnCisScanConfiguration$DailyScheduleProperty$Builder
                                                        CfnCisScanConfiguration$MonthlyScheduleProperty$Builder
                                                        CfnCisScanConfiguration$ScheduleProperty$Builder
                                                        CfnCisScanConfiguration$TimeProperty$Builder
                                                        CfnCisScanConfiguration$WeeklyScheduleProperty$Builder
                                                        CfnCisScanConfigurationProps$Builder
                                                        CfnFilter$Builder
                                                        CfnFilter$DateFilterProperty$Builder
                                                        CfnFilter$FilterCriteriaProperty$Builder
                                                        CfnFilter$MapFilterProperty$Builder
                                                        CfnFilter$NumberFilterProperty$Builder
                                                        CfnFilter$PackageFilterProperty$Builder
                                                        CfnFilter$PortRangeFilterProperty$Builder
                                                        CfnFilter$StringFilterProperty$Builder
                                                        CfnFilterProps$Builder]))


(defn cfn-cis-scan-configuration-builder
  "The cfn-cis-scan-configuration-builder function buildes out new instances of 
CfnCisScanConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-name` |
| `schedule` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `securityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-level` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnCisScanConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :scan-name)]
      (. builder scanName data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :security-level)]
      (. builder securityLevel data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-cis-scan-configuration-cis-targets-property-builder
  "The cfn-cis-scan-configuration-cis-targets-property-builder function buildes out new instances of 
CfnCisScanConfiguration$CisTargetsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:account-ids` |
| `targetResourceTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:target-resource-tags` |"
  [stack id config]
  (let [builder (CfnCisScanConfiguration$CisTargetsProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-ids)]
      (. builder accountIds data))
    (when-let [data (lookup-entry config id :target-resource-tags)]
      (. builder targetResourceTags data))
    (.build builder)))


(defn cfn-cis-scan-configuration-daily-schedule-property-builder
  "The cfn-cis-scan-configuration-daily-schedule-property-builder function buildes out new instances of 
CfnCisScanConfiguration$DailyScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `startTime` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$TimeProperty | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnCisScanConfiguration$DailyScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-cis-scan-configuration-monthly-schedule-property-builder
  "The cfn-cis-scan-configuration-monthly-schedule-property-builder function buildes out new instances of 
CfnCisScanConfiguration$MonthlyScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `startTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnCisScanConfiguration$MonthlyScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :day)]
      (. builder day data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-cis-scan-configuration-props-builder
  "The cfn-cis-scan-configuration-props-builder function buildes out new instances of 
CfnCisScanConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-name` |
| `schedule` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `securityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-level` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$CisTargetsProperty | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnCisScanConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :scan-name)]
      (. builder scanName data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :security-level)]
      (. builder securityLevel data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-cis-scan-configuration-schedule-property-builder
  "The cfn-cis-scan-configuration-schedule-property-builder function buildes out new instances of 
CfnCisScanConfiguration$ScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daily` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:daily` |
| `monthly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monthly` |
| `oneTime` | java.lang.Object | [[cdk.support/lookup-entry]] | `:one-time` |
| `weekly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weekly` |"
  [stack id config]
  (let [builder (CfnCisScanConfiguration$ScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :daily)]
      (. builder daily data))
    (when-let [data (lookup-entry config id :monthly)]
      (. builder monthly data))
    (when-let [data (lookup-entry config id :one-time)]
      (. builder oneTime data))
    (when-let [data (lookup-entry config id :weekly)]
      (. builder weekly data))
    (.build builder)))


(defn cfn-cis-scan-configuration-time-property-builder
  "The cfn-cis-scan-configuration-time-property-builder function buildes out new instances of 
CfnCisScanConfiguration$TimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-of-day` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnCisScanConfiguration$TimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :time-of-day)]
      (. builder timeOfDay data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-cis-scan-configuration-weekly-schedule-property-builder
  "The cfn-cis-scan-configuration-weekly-schedule-property-builder function buildes out new instances of 
CfnCisScanConfiguration$WeeklyScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `days` | java.util.List | [[cdk.support/lookup-entry]] | `:days` |
| `startTime` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$TimeProperty | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnCisScanConfiguration$WeeklyScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :days)]
      (. builder days data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-filter-builder
  "The cfn-filter-builder function buildes out new instances of 
CfnFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `filterAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-action` |
| `filterCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :filter-action)]
      (. builder filterAction data))
    (when-let [data (lookup-entry config id :filter-criteria)]
      (. builder filterCriteria data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-filter-date-filter-property-builder
  "The cfn-filter-date-filter-property-builder function buildes out new instances of 
CfnFilter$DateFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-inclusive` |
| `startInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-inclusive` |"
  [stack id config]
  (let [builder (CfnFilter$DateFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-inclusive)]
      (. builder endInclusive data))
    (when-let [data (lookup-entry config id :start-inclusive)]
      (. builder startInclusive data))
    (.build builder)))


(defn cfn-filter-filter-criteria-property-builder
  "The cfn-filter-filter-criteria-property-builder function buildes out new instances of 
CfnFilter$FilterCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `componentId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:component-id` |
| `componentType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:component-type` |
| `ec2InstanceImageId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-instance-image-id` |
| `ec2InstanceSubnetId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-instance-subnet-id` |
| `ec2InstanceVpcId` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-instance-vpc-id` |
| `ecrImageArchitecture` | java.util.List | [[cdk.support/lookup-entry]] | `:ecr-image-architecture` |
| `ecrImageHash` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ecr-image-hash` |
| `ecrImagePushedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:ecr-image-pushed-at` |
| `ecrImageRegistry` | java.util.List | [[cdk.support/lookup-entry]] | `:ecr-image-registry` |
| `ecrImageRepositoryName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ecr-image-repository-name` |
| `ecrImageTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ecr-image-tags` |
| `findingArn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-arn` |
| `findingStatus` | java.util.List | [[cdk.support/lookup-entry]] | `:finding-status` |
| `findingType` | java.util.List | [[cdk.support/lookup-entry]] | `:finding-type` |
| `firstObservedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:first-observed-at` |
| `inspectorScore` | java.util.List | [[cdk.support/lookup-entry]] | `:inspector-score` |
| `lastObservedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:last-observed-at` |
| `networkProtocol` | java.util.List | [[cdk.support/lookup-entry]] | `:network-protocol` |
| `portRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-range` |
| `relatedVulnerabilities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:related-vulnerabilities` |
| `resourceId` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `resourceType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-type` |
| `severity` | java.util.List | [[cdk.support/lookup-entry]] | `:severity` |
| `title` | java.util.List | [[cdk.support/lookup-entry]] | `:title` |
| `updatedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:updated-at` |
| `vendorSeverity` | java.util.List | [[cdk.support/lookup-entry]] | `:vendor-severity` |
| `vulnerabilityId` | java.util.List | [[cdk.support/lookup-entry]] | `:vulnerability-id` |
| `vulnerabilitySource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vulnerability-source` |
| `vulnerablePackages` | java.util.List | [[cdk.support/lookup-entry]] | `:vulnerable-packages` |"
  [stack id config]
  (let [builder (CfnFilter$FilterCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-account-id)]
      (. builder awsAccountId data))
    (when-let [data (lookup-entry config id :component-id)]
      (. builder componentId data))
    (when-let [data (lookup-entry config id :component-type)]
      (. builder componentType data))
    (when-let [data (lookup-entry config id :ec2-instance-image-id)]
      (. builder ec2InstanceImageId data))
    (when-let [data (lookup-entry config id :ec2-instance-subnet-id)]
      (. builder ec2InstanceSubnetId data))
    (when-let [data (lookup-entry config id :ec2-instance-vpc-id)]
      (. builder ec2InstanceVpcId data))
    (when-let [data (lookup-entry config id :ecr-image-architecture)]
      (. builder ecrImageArchitecture data))
    (when-let [data (lookup-entry config id :ecr-image-hash)]
      (. builder ecrImageHash data))
    (when-let [data (lookup-entry config id :ecr-image-pushed-at)]
      (. builder ecrImagePushedAt data))
    (when-let [data (lookup-entry config id :ecr-image-registry)]
      (. builder ecrImageRegistry data))
    (when-let [data (lookup-entry config id :ecr-image-repository-name)]
      (. builder ecrImageRepositoryName data))
    (when-let [data (lookup-entry config id :ecr-image-tags)]
      (. builder ecrImageTags data))
    (when-let [data (lookup-entry config id :finding-arn)]
      (. builder findingArn data))
    (when-let [data (lookup-entry config id :finding-status)]
      (. builder findingStatus data))
    (when-let [data (lookup-entry config id :finding-type)]
      (. builder findingType data))
    (when-let [data (lookup-entry config id :first-observed-at)]
      (. builder firstObservedAt data))
    (when-let [data (lookup-entry config id :inspector-score)]
      (. builder inspectorScore data))
    (when-let [data (lookup-entry config id :last-observed-at)]
      (. builder lastObservedAt data))
    (when-let [data (lookup-entry config id :network-protocol)]
      (. builder networkProtocol data))
    (when-let [data (lookup-entry config id :port-range)]
      (. builder portRange data))
    (when-let [data (lookup-entry config id :related-vulnerabilities)]
      (. builder relatedVulnerabilities data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :severity)]
      (. builder severity data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :updated-at)]
      (. builder updatedAt data))
    (when-let [data (lookup-entry config id :vendor-severity)]
      (. builder vendorSeverity data))
    (when-let [data (lookup-entry config id :vulnerability-id)]
      (. builder vulnerabilityId data))
    (when-let [data (lookup-entry config id :vulnerability-source)]
      (. builder vulnerabilitySource data))
    (when-let [data (lookup-entry config id :vulnerable-packages)]
      (. builder vulnerablePackages data))
    (.build builder)))


(defn cfn-filter-map-filter-property-builder
  "The cfn-filter-map-filter-property-builder function buildes out new instances of 
CfnFilter$MapFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnFilter$MapFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison)]
      (. builder comparison data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-filter-number-filter-property-builder
  "The cfn-filter-number-filter-property-builder function buildes out new instances of 
CfnFilter$NumberFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lowerInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower-inclusive` |
| `upperInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper-inclusive` |"
  [stack id config]
  (let [builder (CfnFilter$NumberFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :lower-inclusive)]
      (. builder lowerInclusive data))
    (when-let [data (lookup-entry config id :upper-inclusive)]
      (. builder upperInclusive data))
    (.build builder)))


(defn cfn-filter-package-filter-property-builder
  "The cfn-filter-package-filter-property-builder function buildes out new instances of 
CfnFilter$PackageFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:architecture` |
| `epoch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:epoch` |
| `name` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:name` |
| `release` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:release` |
| `sourceLayerHash` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-layer-hash` |
| `version` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnFilter$PackageFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :epoch)]
      (. builder epoch data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :release)]
      (. builder release data))
    (when-let [data (lookup-entry config id :source-layer-hash)]
      (. builder sourceLayerHash data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-filter-port-range-filter-property-builder
  "The cfn-filter-port-range-filter-property-builder function buildes out new instances of 
CfnFilter$PortRangeFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `beginInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:begin-inclusive` |
| `endInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-inclusive` |"
  [stack id config]
  (let [builder (CfnFilter$PortRangeFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :begin-inclusive)]
      (. builder beginInclusive data))
    (when-let [data (lookup-entry config id :end-inclusive)]
      (. builder endInclusive data))
    (.build builder)))


(defn cfn-filter-props-builder
  "The cfn-filter-props-builder function buildes out new instances of 
CfnFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `filterAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-action` |
| `filterCriteria` | software.amazon.awscdk.services.inspectorv2.CfnFilter$FilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :filter-action)]
      (. builder filterAction data))
    (when-let [data (lookup-entry config id :filter-criteria)]
      (. builder filterCriteria data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-filter-string-filter-property-builder
  "The cfn-filter-string-filter-property-builder function buildes out new instances of 
CfnFilter$StringFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnFilter$StringFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison)]
      (. builder comparison data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))