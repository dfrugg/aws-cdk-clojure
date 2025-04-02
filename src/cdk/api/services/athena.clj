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


(defn cfn-capacity-reservation-builder>
  "The cfn-capacity-reservation-builder> function updates a CfnCapacityReservation$Builder instance using the provided configuration.
  The function takes the CfnCapacityReservation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityAssignmentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-assignment-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetDpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-dpus` |
"
  [^CfnCapacityReservation$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-assignment-configuration)]
    (. builder capacityAssignmentConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-dpus)]
    (. builder targetDpus data))
  (.build builder))


(defn cfn-capacity-reservation-builder
  "Creates a  `CfnCapacityReservation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-capacity-reservation-builder> (CfnCapacityReservation$Builder/create scope (name id)) id config))


(defn cfn-capacity-reservation-capacity-assignment-configuration-property-builder>
  "The cfn-capacity-reservation-capacity-assignment-configuration-property-builder> function updates a CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityAssignments` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-assignments` |
"
  [^CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-assignments)]
    (. builder capacityAssignments data))
  (.build builder))


(defn cfn-capacity-reservation-capacity-assignment-configuration-property-builder
  "Creates a  `CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-capacity-reservation-capacity-assignment-configuration-property-builder> (new CfnCapacityReservation$CapacityAssignmentConfigurationProperty$Builder) id config))


(defn cfn-capacity-reservation-capacity-assignment-property-builder>
  "The cfn-capacity-reservation-capacity-assignment-property-builder> function updates a CfnCapacityReservation$CapacityAssignmentProperty$Builder instance using the provided configuration.
  The function takes the CfnCapacityReservation$CapacityAssignmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workgroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:workgroup-names` |
"
  [^CfnCapacityReservation$CapacityAssignmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :workgroup-names)]
    (. builder workgroupNames data))
  (.build builder))


(defn cfn-capacity-reservation-capacity-assignment-property-builder
  "Creates a  `CfnCapacityReservation$CapacityAssignmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-capacity-reservation-capacity-assignment-property-builder> (new CfnCapacityReservation$CapacityAssignmentProperty$Builder) id config))


(defn cfn-capacity-reservation-props-builder>
  "The cfn-capacity-reservation-props-builder> function updates a CfnCapacityReservationProps$Builder instance using the provided configuration.
  The function takes the CfnCapacityReservationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityAssignmentConfiguration` | software.amazon.awscdk.services.athena.CfnCapacityReservation$CapacityAssignmentConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-assignment-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetDpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-dpus` |
"
  [^CfnCapacityReservationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-assignment-configuration)]
    (. builder capacityAssignmentConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-dpus)]
    (. builder targetDpus data))
  (.build builder))


(defn cfn-capacity-reservation-props-builder
  "Creates a  `CfnCapacityReservationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-capacity-reservation-props-builder> (new CfnCapacityReservationProps$Builder) id config))


(defn cfn-data-catalog-builder>
  "The cfn-data-catalog-builder> function updates a CfnDataCatalog$Builder instance using the provided configuration.
  The function takes the CfnDataCatalog$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataCatalog$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-data-catalog-builder
  "Creates a  `CfnDataCatalog$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-data-catalog-builder> (CfnDataCatalog$Builder/create scope (name id)) id config))


(defn cfn-data-catalog-props-builder>
  "The cfn-data-catalog-props-builder> function updates a CfnDataCatalogProps$Builder instance using the provided configuration.
  The function takes the CfnDataCatalogProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataCatalogProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-data-catalog-props-builder
  "Creates a  `CfnDataCatalogProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-catalog-props-builder> (new CfnDataCatalogProps$Builder) id config))


(defn cfn-named-query-builder>
  "The cfn-named-query-builder> function updates a CfnNamedQuery$Builder instance using the provided configuration.
  The function takes the CfnNamedQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |
"
  [^CfnNamedQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :database)]
    (. builder database data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :work-group)]
    (. builder workGroup data))
  (.build builder))


(defn cfn-named-query-builder
  "Creates a  `CfnNamedQuery$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-named-query-builder> (CfnNamedQuery$Builder/create scope (name id)) id config))


(defn cfn-named-query-props-builder>
  "The cfn-named-query-props-builder> function updates a CfnNamedQueryProps$Builder instance using the provided configuration.
  The function takes the CfnNamedQueryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |
"
  [^CfnNamedQueryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :database)]
    (. builder database data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :work-group)]
    (. builder workGroup data))
  (.build builder))


(defn cfn-named-query-props-builder
  "Creates a  `CfnNamedQueryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-named-query-props-builder> (new CfnNamedQueryProps$Builder) id config))


(defn cfn-prepared-statement-builder>
  "The cfn-prepared-statement-builder> function updates a CfnPreparedStatement$Builder instance using the provided configuration.
  The function takes the CfnPreparedStatement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `queryStatement` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-statement` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |
"
  [^CfnPreparedStatement$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :query-statement)]
    (. builder queryStatement data))
  (when-some [data (lookup-entry config id :statement-name)]
    (. builder statementName data))
  (when-some [data (lookup-entry config id :work-group)]
    (. builder workGroup data))
  (.build builder))


(defn cfn-prepared-statement-builder
  "Creates a  `CfnPreparedStatement$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-prepared-statement-builder> (CfnPreparedStatement$Builder/create scope (name id)) id config))


(defn cfn-prepared-statement-props-builder>
  "The cfn-prepared-statement-props-builder> function updates a CfnPreparedStatementProps$Builder instance using the provided configuration.
  The function takes the CfnPreparedStatementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `queryStatement` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-statement` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |
"
  [^CfnPreparedStatementProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :query-statement)]
    (. builder queryStatement data))
  (when-some [data (lookup-entry config id :statement-name)]
    (. builder statementName data))
  (when-some [data (lookup-entry config id :work-group)]
    (. builder workGroup data))
  (.build builder))


(defn cfn-prepared-statement-props-builder
  "Creates a  `CfnPreparedStatementProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-prepared-statement-props-builder> (new CfnPreparedStatementProps$Builder) id config))


(defn cfn-work-group-acl-configuration-property-builder>
  "The cfn-work-group-acl-configuration-property-builder> function updates a CfnWorkGroup$AclConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$AclConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3AclOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-acl-option` |
"
  [^CfnWorkGroup$AclConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-acl-option)]
    (. builder s3AclOption data))
  (.build builder))


(defn cfn-work-group-acl-configuration-property-builder
  "Creates a  `CfnWorkGroup$AclConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-acl-configuration-property-builder> (new CfnWorkGroup$AclConfigurationProperty$Builder) id config))


(defn cfn-work-group-builder>
  "The cfn-work-group-builder> function updates a CfnWorkGroup$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recursiveDeleteOption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:recursive-delete-option` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workGroupConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:work-group-configuration` |
| `workGroupConfigurationUpdates` | software.amazon.awscdk.services.athena.CfnWorkGroup$WorkGroupConfigurationUpdatesProperty | [[cdk.support/lookup-entry]] | `:work-group-configuration-updates` |
"
  [^CfnWorkGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :recursive-delete-option)]
    (. builder recursiveDeleteOption data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :work-group-configuration)]
    (. builder workGroupConfiguration data))
  (when-some [data (lookup-entry config id :work-group-configuration-updates)]
    (. builder workGroupConfigurationUpdates data))
  (.build builder))


(defn cfn-work-group-builder
  "Creates a  `CfnWorkGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-work-group-builder> (CfnWorkGroup$Builder/create scope (name id)) id config))


(defn cfn-work-group-customer-content-encryption-configuration-property-builder>
  "The cfn-work-group-customer-content-encryption-configuration-property-builder> function updates a CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
"
  [^CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (.build builder))


(defn cfn-work-group-customer-content-encryption-configuration-property-builder
  "Creates a  `CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-customer-content-encryption-configuration-property-builder> (new CfnWorkGroup$CustomerContentEncryptionConfigurationProperty$Builder) id config))


(defn cfn-work-group-encryption-configuration-property-builder>
  "The cfn-work-group-encryption-configuration-property-builder> function updates a CfnWorkGroup$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-option` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
"
  [^CfnWorkGroup$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-option)]
    (. builder encryptionOption data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (.build builder))


(defn cfn-work-group-encryption-configuration-property-builder
  "Creates a  `CfnWorkGroup$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-encryption-configuration-property-builder> (new CfnWorkGroup$EncryptionConfigurationProperty$Builder) id config))


(defn cfn-work-group-engine-version-property-builder>
  "The cfn-work-group-engine-version-property-builder> function updates a CfnWorkGroup$EngineVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$EngineVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `effectiveEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:effective-engine-version` |
| `selectedEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:selected-engine-version` |
"
  [^CfnWorkGroup$EngineVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :effective-engine-version)]
    (. builder effectiveEngineVersion data))
  (when-some [data (lookup-entry config id :selected-engine-version)]
    (. builder selectedEngineVersion data))
  (.build builder))


(defn cfn-work-group-engine-version-property-builder
  "Creates a  `CfnWorkGroup$EngineVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-engine-version-property-builder> (new CfnWorkGroup$EngineVersionProperty$Builder) id config))


(defn cfn-work-group-props-builder>
  "The cfn-work-group-props-builder> function updates a CfnWorkGroupProps$Builder instance using the provided configuration.
  The function takes the CfnWorkGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recursiveDeleteOption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:recursive-delete-option` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workGroupConfiguration` | software.amazon.awscdk.services.athena.CfnWorkGroup$WorkGroupConfigurationProperty | [[cdk.support/lookup-entry]] | `:work-group-configuration` |
| `workGroupConfigurationUpdates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:work-group-configuration-updates` |
"
  [^CfnWorkGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :recursive-delete-option)]
    (. builder recursiveDeleteOption data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :work-group-configuration)]
    (. builder workGroupConfiguration data))
  (when-some [data (lookup-entry config id :work-group-configuration-updates)]
    (. builder workGroupConfigurationUpdates data))
  (.build builder))


(defn cfn-work-group-props-builder
  "Creates a  `CfnWorkGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-props-builder> (new CfnWorkGroupProps$Builder) id config))


(defn cfn-work-group-result-configuration-property-builder>
  "The cfn-work-group-result-configuration-property-builder> function updates a CfnWorkGroup$ResultConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$ResultConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acl-configuration` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `expectedBucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-bucket-owner` |
| `outputLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-location` |
"
  [^CfnWorkGroup$ResultConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :acl-configuration)]
    (. builder aclConfiguration data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :expected-bucket-owner)]
    (. builder expectedBucketOwner data))
  (when-some [data (lookup-entry config id :output-location)]
    (. builder outputLocation data))
  (.build builder))


(defn cfn-work-group-result-configuration-property-builder
  "Creates a  `CfnWorkGroup$ResultConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-result-configuration-property-builder> (new CfnWorkGroup$ResultConfigurationProperty$Builder) id config))


(defn cfn-work-group-result-configuration-updates-property-builder>
  "The cfn-work-group-result-configuration-updates-property-builder> function updates a CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acl-configuration` |
| `encryptionConfiguration` | software.amazon.awscdk.services.athena.CfnWorkGroup$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `expectedBucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-bucket-owner` |
| `outputLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-location` |
| `removeAclConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-acl-configuration` |
| `removeEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-encryption-configuration` |
| `removeExpectedBucketOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-expected-bucket-owner` |
| `removeOutputLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-output-location` |
"
  [^CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :acl-configuration)]
    (. builder aclConfiguration data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :expected-bucket-owner)]
    (. builder expectedBucketOwner data))
  (when-some [data (lookup-entry config id :output-location)]
    (. builder outputLocation data))
  (when-some [data (lookup-entry config id :remove-acl-configuration)]
    (. builder removeAclConfiguration data))
  (when-some [data (lookup-entry config id :remove-encryption-configuration)]
    (. builder removeEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :remove-expected-bucket-owner)]
    (. builder removeExpectedBucketOwner data))
  (when-some [data (lookup-entry config id :remove-output-location)]
    (. builder removeOutputLocation data))
  (.build builder))


(defn cfn-work-group-result-configuration-updates-property-builder
  "Creates a  `CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-result-configuration-updates-property-builder> (new CfnWorkGroup$ResultConfigurationUpdatesProperty$Builder) id config))


(defn cfn-work-group-work-group-configuration-property-builder>
  "The cfn-work-group-work-group-configuration-property-builder> function updates a CfnWorkGroup$WorkGroupConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$WorkGroupConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `resultConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:result-configuration` |
"
  [^CfnWorkGroup$WorkGroupConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-configuration)]
    (. builder additionalConfiguration data))
  (when-some [data (lookup-entry config id :bytes-scanned-cutoff-per-query)]
    (. builder bytesScannedCutoffPerQuery data))
  (when-some [data (lookup-entry config id :customer-content-encryption-configuration)]
    (. builder customerContentEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :enforce-work-group-configuration)]
    (. builder enforceWorkGroupConfiguration data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :publish-cloud-watch-metrics-enabled)]
    (. builder publishCloudWatchMetricsEnabled data))
  (when-some [data (lookup-entry config id :requester-pays-enabled)]
    (. builder requesterPaysEnabled data))
  (when-some [data (lookup-entry config id :result-configuration)]
    (. builder resultConfiguration data))
  (.build builder))


(defn cfn-work-group-work-group-configuration-property-builder
  "Creates a  `CfnWorkGroup$WorkGroupConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-work-group-configuration-property-builder> (new CfnWorkGroup$WorkGroupConfigurationProperty$Builder) id config))


(defn cfn-work-group-work-group-configuration-updates-property-builder>
  "The cfn-work-group-work-group-configuration-updates-property-builder> function updates a CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `resultConfigurationUpdates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:result-configuration-updates` |
"
  [^CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-configuration)]
    (. builder additionalConfiguration data))
  (when-some [data (lookup-entry config id :bytes-scanned-cutoff-per-query)]
    (. builder bytesScannedCutoffPerQuery data))
  (when-some [data (lookup-entry config id :customer-content-encryption-configuration)]
    (. builder customerContentEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :enforce-work-group-configuration)]
    (. builder enforceWorkGroupConfiguration data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :publish-cloud-watch-metrics-enabled)]
    (. builder publishCloudWatchMetricsEnabled data))
  (when-some [data (lookup-entry config id :remove-bytes-scanned-cutoff-per-query)]
    (. builder removeBytesScannedCutoffPerQuery data))
  (when-some [data (lookup-entry config id :remove-customer-content-encryption-configuration)]
    (. builder removeCustomerContentEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :requester-pays-enabled)]
    (. builder requesterPaysEnabled data))
  (when-some [data (lookup-entry config id :result-configuration-updates)]
    (. builder resultConfigurationUpdates data))
  (.build builder))


(defn cfn-work-group-work-group-configuration-updates-property-builder
  "Creates a  `CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-work-group-work-group-configuration-updates-property-builder> (new CfnWorkGroup$WorkGroupConfigurationUpdatesProperty$Builder) id config))