(ns cdk.api.services.athena
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.athena package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.athena CfnCapacityReservation$Builder
                                                   CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder
                                                   CfnCapacityReservation$CapacityAssignmentProperty$Builder
                                                   CfnCapacityReservationProps$Builder
                                                   CfnDataCatalog$Builder
                                                   CfnDataCatalogProps$Builder
                                                   CfnNamedQuery$Builder
                                                   CfnNamedQueryProps$Builder
                                                   CfnPreparedStatement$Builder
                                                   CfnPreparedStatementProps$Builder
                                                   CfnWorkGroup$AclConfigurationProperty$Builder
                                                   CfnWorkGroup$Builder
                                                   CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder
                                                   CfnWorkGroup$EncryptionConfigurationProperty$Builder
                                                   CfnWorkGroup$EngineVersionProperty$Builder
                                                   CfnWorkGroup$ResultConfigurationProperty$Builder
                                                   CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder
                                                   CfnWorkGroup$WorkGroupConfigurationProperty$Builder
                                                   CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder
                                                   CfnWorkGroupProps$Builder]))


(defn cfn-capacity-reservation-builder
  "The cfn-capacity-reservation-builder function buildes out new instances of 
CfnCapacityReservation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityAssignmentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-assignment-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetDpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-dpus` |"
  [stack id config]
  (let [builder (CfnCapacityReservation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-assignment-configuration)]
      (. builder capacityAssignmentConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-dpus)]
      (. builder targetDpus data))
    (.build builder)))


(defn cfn-capacity-reservation-capacity-assignment-configuration-property-builder
  "The cfn-capacity-reservation-capacity-assignment-configuration-property-builder function buildes out new instances of 
CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityAssignments` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-assignments` |"
  [stack id config]
  (let [builder (CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :capacity-assignments)]
      (. builder capacityAssignments data))
    (.build builder)))


(defn cfn-capacity-reservation-capacity-assignment-property-builder
  "The cfn-capacity-reservation-capacity-assignment-property-builder function buildes out new instances of 
CfnCapacityReservation$CapacityAssignmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workgroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:workgroup-names` |"
  [stack id config]
  (let [builder (CfnCapacityReservation$CapacityAssignmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :workgroup-names)]
      (. builder workgroupNames data))
    (.build builder)))


(defn cfn-capacity-reservation-props-builder
  "The cfn-capacity-reservation-props-builder function buildes out new instances of 
CfnCapacityReservationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityAssignmentConfiguration` | software.amazon.awscdk.services.athena.CfnCapacityReservation$CapacityAssignmentConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-assignment-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetDpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-dpus` |"
  [stack id config]
  (let [builder (CfnCapacityReservationProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-assignment-configuration)]
      (. builder capacityAssignmentConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-dpus)]
      (. builder targetDpus data))
    (.build builder)))


(defn cfn-data-catalog-builder
  "The cfn-data-catalog-builder function buildes out new instances of 
CfnDataCatalog$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataCatalog$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-data-catalog-props-builder
  "The cfn-data-catalog-props-builder function buildes out new instances of 
CfnDataCatalogProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataCatalogProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-named-query-builder
  "The cfn-named-query-builder function buildes out new instances of 
CfnNamedQuery$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |"
  [stack id config]
  (let [builder (CfnNamedQuery$Builder/create stack id)]
    (when-let [data (lookup-entry config id :database)]
      (. builder database data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :work-group)]
      (. builder workGroup data))
    (.build builder)))


(defn cfn-named-query-props-builder
  "The cfn-named-query-props-builder function buildes out new instances of 
CfnNamedQueryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |"
  [stack id config]
  (let [builder (CfnNamedQueryProps$Builder.)]
    (when-let [data (lookup-entry config id :database)]
      (. builder database data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :work-group)]
      (. builder workGroup data))
    (.build builder)))


(defn cfn-prepared-statement-builder
  "The cfn-prepared-statement-builder function buildes out new instances of 
CfnPreparedStatement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `queryStatement` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-statement` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |"
  [stack id config]
  (let [builder (CfnPreparedStatement$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :query-statement)]
      (. builder queryStatement data))
    (when-let [data (lookup-entry config id :statement-name)]
      (. builder statementName data))
    (when-let [data (lookup-entry config id :work-group)]
      (. builder workGroup data))
    (.build builder)))


(defn cfn-prepared-statement-props-builder
  "The cfn-prepared-statement-props-builder function buildes out new instances of 
CfnPreparedStatementProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `queryStatement` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-statement` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |"
  [stack id config]
  (let [builder (CfnPreparedStatementProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :query-statement)]
      (. builder queryStatement data))
    (when-let [data (lookup-entry config id :statement-name)]
      (. builder statementName data))
    (when-let [data (lookup-entry config id :work-group)]
      (. builder workGroup data))
    (.build builder)))


(defn cfn-work-group-acl-configuration-property-builder
  "The cfn-work-group-acl-configuration-property-builder function buildes out new instances of 
CfnWorkGroup$AclConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3AclOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-acl-option` |"
  [stack id config]
  (let [builder (CfnWorkGroup$AclConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-acl-option)]
      (. builder s3AclOption data))
    (.build builder)))


(defn cfn-work-group-builder
  "The cfn-work-group-builder function buildes out new instances of 
CfnWorkGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recursiveDeleteOption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:recursive-delete-option` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workGroupConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:work-group-configuration` |
| `workGroupConfigurationUpdates` | software.amazon.awscdk.services.athena.CfnWorkGroup$WorkGroupConfigurationUpdatesProperty | [[cdk.support/lookup-entry]] | `:work-group-configuration-updates` |"
  [stack id config]
  (let [builder (CfnWorkGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recursive-delete-option)]
      (. builder recursiveDeleteOption data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :work-group-configuration)]
      (. builder workGroupConfiguration data))
    (when-let [data (lookup-entry config id :work-group-configuration-updates)]
      (. builder workGroupConfigurationUpdates data))
    (.build builder)))


(defn cfn-work-group-customer-content-encryption-configuration-property-builder
  "The cfn-work-group-customer-content-encryption-configuration-property-builder function buildes out new instances of 
CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))


(defn cfn-work-group-encryption-configuration-property-builder
  "The cfn-work-group-encryption-configuration-property-builder function buildes out new instances of 
CfnWorkGroup$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-option` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (CfnWorkGroup$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-option)]
      (. builder encryptionOption data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))


(defn cfn-work-group-engine-version-property-builder
  "The cfn-work-group-engine-version-property-builder function buildes out new instances of 
CfnWorkGroup$EngineVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `effectiveEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:effective-engine-version` |
| `selectedEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:selected-engine-version` |"
  [stack id config]
  (let [builder (CfnWorkGroup$EngineVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :effective-engine-version)]
      (. builder effectiveEngineVersion data))
    (when-let [data (lookup-entry config id :selected-engine-version)]
      (. builder selectedEngineVersion data))
    (.build builder)))


(defn cfn-work-group-props-builder
  "The cfn-work-group-props-builder function buildes out new instances of 
CfnWorkGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recursiveDeleteOption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:recursive-delete-option` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workGroupConfiguration` | software.amazon.awscdk.services.athena.CfnWorkGroup$WorkGroupConfigurationProperty | [[cdk.support/lookup-entry]] | `:work-group-configuration` |
| `workGroupConfigurationUpdates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:work-group-configuration-updates` |"
  [stack id config]
  (let [builder (CfnWorkGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recursive-delete-option)]
      (. builder recursiveDeleteOption data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :work-group-configuration)]
      (. builder workGroupConfiguration data))
    (when-let [data (lookup-entry config id :work-group-configuration-updates)]
      (. builder workGroupConfigurationUpdates data))
    (.build builder)))


(defn cfn-work-group-result-configuration-property-builder
  "The cfn-work-group-result-configuration-property-builder function buildes out new instances of 
CfnWorkGroup$ResultConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acl-configuration` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `expectedBucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-bucket-owner` |
| `outputLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-location` |"
  [stack id config]
  (let [builder (CfnWorkGroup$ResultConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :acl-configuration)]
      (. builder aclConfiguration data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :expected-bucket-owner)]
      (. builder expectedBucketOwner data))
    (when-let [data (lookup-entry config id :output-location)]
      (. builder outputLocation data))
    (.build builder)))


(defn cfn-work-group-result-configuration-updates-property-builder
  "The cfn-work-group-result-configuration-updates-property-builder function buildes out new instances of 
CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acl-configuration` |
| `encryptionConfiguration` | software.amazon.awscdk.services.athena.CfnWorkGroup$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `expectedBucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-bucket-owner` |
| `outputLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-location` |
| `removeAclConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-acl-configuration` |
| `removeEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-encryption-configuration` |
| `removeExpectedBucketOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-expected-bucket-owner` |
| `removeOutputLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-output-location` |"
  [stack id config]
  (let [builder (CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder.)]
    (when-let [data (lookup-entry config id :acl-configuration)]
      (. builder aclConfiguration data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :expected-bucket-owner)]
      (. builder expectedBucketOwner data))
    (when-let [data (lookup-entry config id :output-location)]
      (. builder outputLocation data))
    (when-let [data (lookup-entry config id :remove-acl-configuration)]
      (. builder removeAclConfiguration data))
    (when-let [data (lookup-entry config id :remove-encryption-configuration)]
      (. builder removeEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :remove-expected-bucket-owner)]
      (. builder removeExpectedBucketOwner data))
    (when-let [data (lookup-entry config id :remove-output-location)]
      (. builder removeOutputLocation data))
    (.build builder)))


(defn cfn-work-group-work-group-configuration-property-builder
  "The cfn-work-group-work-group-configuration-property-builder function buildes out new instances of 
CfnWorkGroup$WorkGroupConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-configuration` |
| `bytesScannedCutoffPerQuery` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bytes-scanned-cutoff-per-query` |
| `customerContentEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-content-encryption-configuration` |
| `enforceWorkGroupConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-work-group-configuration` |
| `engineVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:engine-version` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `publishCloudWatchMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publish-cloud-watch-metrics-enabled` |
| `requesterPaysEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:requester-pays-enabled` |
| `resultConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:result-configuration` |"
  [stack id config]
  (let [builder (CfnWorkGroup$WorkGroupConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-configuration)]
      (. builder additionalConfiguration data))
    (when-let [data (lookup-entry config id :bytes-scanned-cutoff-per-query)]
      (. builder bytesScannedCutoffPerQuery data))
    (when-let [data (lookup-entry config id :customer-content-encryption-configuration)]
      (. builder customerContentEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :enforce-work-group-configuration)]
      (. builder enforceWorkGroupConfiguration data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :publish-cloud-watch-metrics-enabled)]
      (. builder publishCloudWatchMetricsEnabled data))
    (when-let [data (lookup-entry config id :requester-pays-enabled)]
      (. builder requesterPaysEnabled data))
    (when-let [data (lookup-entry config id :result-configuration)]
      (. builder resultConfiguration data))
    (.build builder)))


(defn cfn-work-group-work-group-configuration-updates-property-builder
  "The cfn-work-group-work-group-configuration-updates-property-builder function buildes out new instances of 
CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-configuration` |
| `bytesScannedCutoffPerQuery` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bytes-scanned-cutoff-per-query` |
| `customerContentEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-content-encryption-configuration` |
| `enforceWorkGroupConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-work-group-configuration` |
| `engineVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:engine-version` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `publishCloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publish-cloud-watch-metrics-enabled` |
| `removeBytesScannedCutoffPerQuery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-bytes-scanned-cutoff-per-query` |
| `removeCustomerContentEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-customer-content-encryption-configuration` |
| `requesterPaysEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:requester-pays-enabled` |
| `resultConfigurationUpdates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:result-configuration-updates` |"
  [stack id config]
  (let [builder (CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-configuration)]
      (. builder additionalConfiguration data))
    (when-let [data (lookup-entry config id :bytes-scanned-cutoff-per-query)]
      (. builder bytesScannedCutoffPerQuery data))
    (when-let [data (lookup-entry config id :customer-content-encryption-configuration)]
      (. builder customerContentEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :enforce-work-group-configuration)]
      (. builder enforceWorkGroupConfiguration data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :publish-cloud-watch-metrics-enabled)]
      (. builder publishCloudWatchMetricsEnabled data))
    (when-let [data (lookup-entry config id :remove-bytes-scanned-cutoff-per-query)]
      (. builder removeBytesScannedCutoffPerQuery data))
    (when-let [data (lookup-entry config id :remove-customer-content-encryption-configuration)]
      (. builder removeCustomerContentEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :requester-pays-enabled)]
      (. builder requesterPaysEnabled data))
    (when-let [data (lookup-entry config id :result-configuration-updates)]
      (. builder resultConfigurationUpdates data))
    (.build builder)))