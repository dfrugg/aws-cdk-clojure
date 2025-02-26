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


(defn build-cfn-cis-scan-configuration-builder
  "The build-cfn-cis-scan-configuration-builder function updates a CfnCisScanConfiguration$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-name` |
| `schedule` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `securityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-level` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnCisScanConfiguration$Builder builder id config]
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
  (.build builder))


(defn cfn-cis-scan-configuration-builder
  "Creates a  `CfnCisScanConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-cis-scan-configuration-builder (CfnCisScanConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-cis-scan-configuration-cis-targets-property-builder
  "The build-cfn-cis-scan-configuration-cis-targets-property-builder function updates a CfnCisScanConfiguration$CisTargetsProperty$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfiguration$CisTargetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:account-ids` |
| `targetResourceTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:target-resource-tags` |
"
  [^CfnCisScanConfiguration$CisTargetsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :account-ids)]
    (. builder accountIds data))
  (when-let [data (lookup-entry config id :target-resource-tags)]
    (. builder targetResourceTags data))
  (.build builder))


(defn cfn-cis-scan-configuration-cis-targets-property-builder
  "Creates a  `CfnCisScanConfiguration$CisTargetsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cis-scan-configuration-cis-targets-property-builder (new CfnCisScanConfiguration$CisTargetsProperty$Builder) id config))


(defn build-cfn-cis-scan-configuration-daily-schedule-property-builder
  "The build-cfn-cis-scan-configuration-daily-schedule-property-builder function updates a CfnCisScanConfiguration$DailyScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfiguration$DailyScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `startTime` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$TimeProperty | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnCisScanConfiguration$DailyScheduleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-cis-scan-configuration-daily-schedule-property-builder
  "Creates a  `CfnCisScanConfiguration$DailyScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cis-scan-configuration-daily-schedule-property-builder (new CfnCisScanConfiguration$DailyScheduleProperty$Builder) id config))


(defn build-cfn-cis-scan-configuration-monthly-schedule-property-builder
  "The build-cfn-cis-scan-configuration-monthly-schedule-property-builder function updates a CfnCisScanConfiguration$MonthlyScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfiguration$MonthlyScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `startTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnCisScanConfiguration$MonthlyScheduleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :day)]
    (. builder day data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-cis-scan-configuration-monthly-schedule-property-builder
  "Creates a  `CfnCisScanConfiguration$MonthlyScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cis-scan-configuration-monthly-schedule-property-builder (new CfnCisScanConfiguration$MonthlyScheduleProperty$Builder) id config))


(defn build-cfn-cis-scan-configuration-props-builder
  "The build-cfn-cis-scan-configuration-props-builder function updates a CfnCisScanConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-name` |
| `schedule` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `securityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-level` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$CisTargetsProperty | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnCisScanConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn cfn-cis-scan-configuration-props-builder
  "Creates a  `CfnCisScanConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cis-scan-configuration-props-builder (new CfnCisScanConfigurationProps$Builder) id config))


(defn build-cfn-cis-scan-configuration-schedule-property-builder
  "The build-cfn-cis-scan-configuration-schedule-property-builder function updates a CfnCisScanConfiguration$ScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfiguration$ScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daily` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:daily` |
| `monthly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monthly` |
| `oneTime` | java.lang.Object | [[cdk.support/lookup-entry]] | `:one-time` |
| `weekly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weekly` |
"
  [^CfnCisScanConfiguration$ScheduleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :daily)]
    (. builder daily data))
  (when-let [data (lookup-entry config id :monthly)]
    (. builder monthly data))
  (when-let [data (lookup-entry config id :one-time)]
    (. builder oneTime data))
  (when-let [data (lookup-entry config id :weekly)]
    (. builder weekly data))
  (.build builder))


(defn cfn-cis-scan-configuration-schedule-property-builder
  "Creates a  `CfnCisScanConfiguration$ScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cis-scan-configuration-schedule-property-builder (new CfnCisScanConfiguration$ScheduleProperty$Builder) id config))


(defn build-cfn-cis-scan-configuration-time-property-builder
  "The build-cfn-cis-scan-configuration-time-property-builder function updates a CfnCisScanConfiguration$TimeProperty$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfiguration$TimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-of-day` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |
"
  [^CfnCisScanConfiguration$TimeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :time-of-day)]
    (. builder timeOfDay data))
  (when-let [data (lookup-entry config id :time-zone)]
    (. builder timeZone data))
  (.build builder))


(defn cfn-cis-scan-configuration-time-property-builder
  "Creates a  `CfnCisScanConfiguration$TimeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cis-scan-configuration-time-property-builder (new CfnCisScanConfiguration$TimeProperty$Builder) id config))


(defn build-cfn-cis-scan-configuration-weekly-schedule-property-builder
  "The build-cfn-cis-scan-configuration-weekly-schedule-property-builder function updates a CfnCisScanConfiguration$WeeklyScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnCisScanConfiguration$WeeklyScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `days` | java.util.List | [[cdk.support/lookup-entry]] | `:days` |
| `startTime` | software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration$TimeProperty | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnCisScanConfiguration$WeeklyScheduleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :days)]
    (. builder days data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-cis-scan-configuration-weekly-schedule-property-builder
  "Creates a  `CfnCisScanConfiguration$WeeklyScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cis-scan-configuration-weekly-schedule-property-builder (new CfnCisScanConfiguration$WeeklyScheduleProperty$Builder) id config))


(defn build-cfn-filter-builder
  "The build-cfn-filter-builder function updates a CfnFilter$Builder instance using the provided configuration.
  The function takes the CfnFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `filterAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-action` |
| `filterCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFilter$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :filter-action)]
    (. builder filterAction data))
  (when-let [data (lookup-entry config id :filter-criteria)]
    (. builder filterCriteria data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-filter-builder
  "Creates a  `CfnFilter$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-filter-builder (CfnFilter$Builder/create scope (name id)) id config))


(defn build-cfn-filter-date-filter-property-builder
  "The build-cfn-filter-date-filter-property-builder function updates a CfnFilter$DateFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$DateFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-inclusive` |
| `startInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-inclusive` |
"
  [^CfnFilter$DateFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end-inclusive)]
    (. builder endInclusive data))
  (when-let [data (lookup-entry config id :start-inclusive)]
    (. builder startInclusive data))
  (.build builder))


(defn cfn-filter-date-filter-property-builder
  "Creates a  `CfnFilter$DateFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-date-filter-property-builder (new CfnFilter$DateFilterProperty$Builder) id config))


(defn build-cfn-filter-filter-criteria-property-builder
  "The build-cfn-filter-filter-criteria-property-builder function updates a CfnFilter$FilterCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$FilterCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vulnerablePackages` | java.util.List | [[cdk.support/lookup-entry]] | `:vulnerable-packages` |
"
  [^CfnFilter$FilterCriteriaProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-filter-filter-criteria-property-builder
  "Creates a  `CfnFilter$FilterCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-filter-criteria-property-builder (new CfnFilter$FilterCriteriaProperty$Builder) id config))


(defn build-cfn-filter-map-filter-property-builder
  "The build-cfn-filter-map-filter-property-builder function updates a CfnFilter$MapFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$MapFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFilter$MapFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison)]
    (. builder comparison data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-filter-map-filter-property-builder
  "Creates a  `CfnFilter$MapFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-map-filter-property-builder (new CfnFilter$MapFilterProperty$Builder) id config))


(defn build-cfn-filter-number-filter-property-builder
  "The build-cfn-filter-number-filter-property-builder function updates a CfnFilter$NumberFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$NumberFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lowerInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower-inclusive` |
| `upperInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper-inclusive` |
"
  [^CfnFilter$NumberFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lower-inclusive)]
    (. builder lowerInclusive data))
  (when-let [data (lookup-entry config id :upper-inclusive)]
    (. builder upperInclusive data))
  (.build builder))


(defn cfn-filter-number-filter-property-builder
  "Creates a  `CfnFilter$NumberFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-number-filter-property-builder (new CfnFilter$NumberFilterProperty$Builder) id config))


(defn build-cfn-filter-package-filter-property-builder
  "The build-cfn-filter-package-filter-property-builder function updates a CfnFilter$PackageFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$PackageFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:architecture` |
| `epoch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:epoch` |
| `name` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:name` |
| `release` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:release` |
| `sourceLayerHash` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-layer-hash` |
| `version` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnFilter$PackageFilterProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-filter-package-filter-property-builder
  "Creates a  `CfnFilter$PackageFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-package-filter-property-builder (new CfnFilter$PackageFilterProperty$Builder) id config))


(defn build-cfn-filter-port-range-filter-property-builder
  "The build-cfn-filter-port-range-filter-property-builder function updates a CfnFilter$PortRangeFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$PortRangeFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `beginInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:begin-inclusive` |
| `endInclusive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-inclusive` |
"
  [^CfnFilter$PortRangeFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :begin-inclusive)]
    (. builder beginInclusive data))
  (when-let [data (lookup-entry config id :end-inclusive)]
    (. builder endInclusive data))
  (.build builder))


(defn cfn-filter-port-range-filter-property-builder
  "Creates a  `CfnFilter$PortRangeFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-port-range-filter-property-builder (new CfnFilter$PortRangeFilterProperty$Builder) id config))


(defn build-cfn-filter-props-builder
  "The build-cfn-filter-props-builder function updates a CfnFilterProps$Builder instance using the provided configuration.
  The function takes the CfnFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `filterAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-action` |
| `filterCriteria` | software.amazon.awscdk.services.inspectorv2.CfnFilter$FilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFilterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :filter-action)]
    (. builder filterAction data))
  (when-let [data (lookup-entry config id :filter-criteria)]
    (. builder filterCriteria data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-filter-props-builder
  "Creates a  `CfnFilterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-props-builder (new CfnFilterProps$Builder) id config))


(defn build-cfn-filter-string-filter-property-builder
  "The build-cfn-filter-string-filter-property-builder function updates a CfnFilter$StringFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFilter$StringFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFilter$StringFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison)]
    (. builder comparison data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-filter-string-filter-property-builder
  "Creates a  `CfnFilter$StringFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-filter-string-filter-property-builder (new CfnFilter$StringFilterProperty$Builder) id config))