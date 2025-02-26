(ns cdk.api.services.licensemanager
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.licensemanager package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.licensemanager CfnGrant$Builder
                                                           CfnGrantProps$Builder
                                                           CfnLicense$BorrowConfigurationProperty$Builder
                                                           CfnLicense$Builder
                                                           CfnLicense$ConsumptionConfigurationProperty$Builder
                                                           CfnLicense$EntitlementProperty$Builder
                                                           CfnLicense$IssuerDataProperty$Builder
                                                           CfnLicense$MetadataProperty$Builder
                                                           CfnLicense$ProvisionalConfigurationProperty$Builder
                                                           CfnLicense$ValidityDateFormatProperty$Builder
                                                           CfnLicenseProps$Builder]))


(defn build-cfn-grant-builder
  "The build-cfn-grant-builder function updates a CfnGrant$Builder instance using the provided configuration.
  The function takes the CfnGrant$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-operations` |
| `grantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:grant-name` |
| `homeRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-region` |
| `licenseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-arn` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnGrant$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-operations)]
    (. builder allowedOperations data))
  (when-some [data (lookup-entry config id :grant-name)]
    (. builder grantName data))
  (when-some [data (lookup-entry config id :home-region)]
    (. builder homeRegion data))
  (when-some [data (lookup-entry config id :license-arn)]
    (. builder licenseArn data))
  (when-some [data (lookup-entry config id :principals)]
    (. builder principals data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-grant-builder
  "Creates a  `CfnGrant$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-grant-builder (CfnGrant$Builder/create scope (name id)) id config))


(defn build-cfn-grant-props-builder
  "The build-cfn-grant-props-builder function updates a CfnGrantProps$Builder instance using the provided configuration.
  The function takes the CfnGrantProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-operations` |
| `grantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:grant-name` |
| `homeRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-region` |
| `licenseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-arn` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnGrantProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-operations)]
    (. builder allowedOperations data))
  (when-some [data (lookup-entry config id :grant-name)]
    (. builder grantName data))
  (when-some [data (lookup-entry config id :home-region)]
    (. builder homeRegion data))
  (when-some [data (lookup-entry config id :license-arn)]
    (. builder licenseArn data))
  (when-some [data (lookup-entry config id :principals)]
    (. builder principals data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-grant-props-builder
  "Creates a  `CfnGrantProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-grant-props-builder (new CfnGrantProps$Builder) id config))


(defn build-cfn-license-borrow-configuration-property-builder
  "The build-cfn-license-borrow-configuration-property-builder function updates a CfnLicense$BorrowConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLicense$BorrowConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowEarlyCheckIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-early-check-in` |
| `maxTimeToLiveInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-to-live-in-minutes` |
"
  [^CfnLicense$BorrowConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-early-check-in)]
    (. builder allowEarlyCheckIn data))
  (when-some [data (lookup-entry config id :max-time-to-live-in-minutes)]
    (. builder maxTimeToLiveInMinutes data))
  (.build builder))


(defn cfn-license-borrow-configuration-property-builder
  "Creates a  `CfnLicense$BorrowConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-borrow-configuration-property-builder (new CfnLicense$BorrowConfigurationProperty$Builder) id config))


(defn build-cfn-license-builder
  "The build-cfn-license-builder function updates a CfnLicense$Builder instance using the provided configuration.
  The function takes the CfnLicense$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `beneficiary` | java.lang.String | [[cdk.support/lookup-entry]] | `:beneficiary` |
| `consumptionConfiguration` | software.amazon.awscdk.services.licensemanager.CfnLicense$ConsumptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:consumption-configuration` |
| `entitlements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entitlements` |
| `homeRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-region` |
| `issuer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:issuer` |
| `licenseMetadata` | java.util.List | [[cdk.support/lookup-entry]] | `:license-metadata` |
| `licenseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-name` |
| `productName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-name` |
| `productSku` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-sku` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `validity` | software.amazon.awscdk.services.licensemanager.CfnLicense$ValidityDateFormatProperty | [[cdk.support/lookup-entry]] | `:validity` |
"
  [^CfnLicense$Builder builder id config]
  (when-some [data (lookup-entry config id :beneficiary)]
    (. builder beneficiary data))
  (when-some [data (lookup-entry config id :consumption-configuration)]
    (. builder consumptionConfiguration data))
  (when-some [data (lookup-entry config id :entitlements)]
    (. builder entitlements data))
  (when-some [data (lookup-entry config id :home-region)]
    (. builder homeRegion data))
  (when-some [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (when-some [data (lookup-entry config id :license-metadata)]
    (. builder licenseMetadata data))
  (when-some [data (lookup-entry config id :license-name)]
    (. builder licenseName data))
  (when-some [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-some [data (lookup-entry config id :product-sku)]
    (. builder productSku data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :validity)]
    (. builder validity data))
  (.build builder))


(defn cfn-license-builder
  "Creates a  `CfnLicense$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-license-builder (CfnLicense$Builder/create scope (name id)) id config))


(defn build-cfn-license-consumption-configuration-property-builder
  "The build-cfn-license-consumption-configuration-property-builder function updates a CfnLicense$ConsumptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLicense$ConsumptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `borrowConfiguration` | software.amazon.awscdk.services.licensemanager.CfnLicense$BorrowConfigurationProperty | [[cdk.support/lookup-entry]] | `:borrow-configuration` |
| `provisionalConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisional-configuration` |
| `renewType` | java.lang.String | [[cdk.support/lookup-entry]] | `:renew-type` |
"
  [^CfnLicense$ConsumptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :borrow-configuration)]
    (. builder borrowConfiguration data))
  (when-some [data (lookup-entry config id :provisional-configuration)]
    (. builder provisionalConfiguration data))
  (when-some [data (lookup-entry config id :renew-type)]
    (. builder renewType data))
  (.build builder))


(defn cfn-license-consumption-configuration-property-builder
  "Creates a  `CfnLicense$ConsumptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-consumption-configuration-property-builder (new CfnLicense$ConsumptionConfigurationProperty$Builder) id config))


(defn build-cfn-license-entitlement-property-builder
  "The build-cfn-license-entitlement-property-builder function updates a CfnLicense$EntitlementProperty$Builder instance using the provided configuration.
  The function takes the CfnLicense$EntitlementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCheckIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-check-in` |
| `maxCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-count` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overage` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnLicense$EntitlementProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-check-in)]
    (. builder allowCheckIn data))
  (when-some [data (lookup-entry config id :max-count)]
    (. builder maxCount data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :overage)]
    (. builder overage data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-license-entitlement-property-builder
  "Creates a  `CfnLicense$EntitlementProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-entitlement-property-builder (new CfnLicense$EntitlementProperty$Builder) id config))


(defn build-cfn-license-issuer-data-property-builder
  "The build-cfn-license-issuer-data-property-builder function updates a CfnLicense$IssuerDataProperty$Builder instance using the provided configuration.
  The function takes the CfnLicense$IssuerDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `signKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:sign-key` |
"
  [^CfnLicense$IssuerDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sign-key)]
    (. builder signKey data))
  (.build builder))


(defn cfn-license-issuer-data-property-builder
  "Creates a  `CfnLicense$IssuerDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-issuer-data-property-builder (new CfnLicense$IssuerDataProperty$Builder) id config))


(defn build-cfn-license-metadata-property-builder
  "The build-cfn-license-metadata-property-builder function updates a CfnLicense$MetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnLicense$MetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnLicense$MetadataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-license-metadata-property-builder
  "Creates a  `CfnLicense$MetadataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-metadata-property-builder (new CfnLicense$MetadataProperty$Builder) id config))


(defn build-cfn-license-props-builder
  "The build-cfn-license-props-builder function updates a CfnLicenseProps$Builder instance using the provided configuration.
  The function takes the CfnLicenseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `beneficiary` | java.lang.String | [[cdk.support/lookup-entry]] | `:beneficiary` |
| `consumptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:consumption-configuration` |
| `entitlements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entitlements` |
| `homeRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-region` |
| `issuer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:issuer` |
| `licenseMetadata` | java.util.List | [[cdk.support/lookup-entry]] | `:license-metadata` |
| `licenseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-name` |
| `productName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-name` |
| `productSku` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-sku` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `validity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validity` |
"
  [^CfnLicenseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :beneficiary)]
    (. builder beneficiary data))
  (when-some [data (lookup-entry config id :consumption-configuration)]
    (. builder consumptionConfiguration data))
  (when-some [data (lookup-entry config id :entitlements)]
    (. builder entitlements data))
  (when-some [data (lookup-entry config id :home-region)]
    (. builder homeRegion data))
  (when-some [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (when-some [data (lookup-entry config id :license-metadata)]
    (. builder licenseMetadata data))
  (when-some [data (lookup-entry config id :license-name)]
    (. builder licenseName data))
  (when-some [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-some [data (lookup-entry config id :product-sku)]
    (. builder productSku data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :validity)]
    (. builder validity data))
  (.build builder))


(defn cfn-license-props-builder
  "Creates a  `CfnLicenseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-props-builder (new CfnLicenseProps$Builder) id config))


(defn build-cfn-license-provisional-configuration-property-builder
  "The build-cfn-license-provisional-configuration-property-builder function updates a CfnLicense$ProvisionalConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLicense$ProvisionalConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxTimeToLiveInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-to-live-in-minutes` |
"
  [^CfnLicense$ProvisionalConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-time-to-live-in-minutes)]
    (. builder maxTimeToLiveInMinutes data))
  (.build builder))


(defn cfn-license-provisional-configuration-property-builder
  "Creates a  `CfnLicense$ProvisionalConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-provisional-configuration-property-builder (new CfnLicense$ProvisionalConfigurationProperty$Builder) id config))


(defn build-cfn-license-validity-date-format-property-builder
  "The build-cfn-license-validity-date-format-property-builder function updates a CfnLicense$ValidityDateFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnLicense$ValidityDateFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `begin` | java.lang.String | [[cdk.support/lookup-entry]] | `:begin` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
"
  [^CfnLicense$ValidityDateFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :begin)]
    (. builder begin data))
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (.build builder))


(defn cfn-license-validity-date-format-property-builder
  "Creates a  `CfnLicense$ValidityDateFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-license-validity-date-format-property-builder (new CfnLicense$ValidityDateFormatProperty$Builder) id config))