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


(defn cfn-grant-builder
  "The cfn-grant-builder function buildes out new instances of 
CfnGrant$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-operations` |
| `grantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:grant-name` |
| `homeRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-region` |
| `licenseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-arn` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnGrant$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-operations)]
      (. builder allowedOperations data))
    (when-let [data (lookup-entry config id :grant-name)]
      (. builder grantName data))
    (when-let [data (lookup-entry config id :home-region)]
      (. builder homeRegion data))
    (when-let [data (lookup-entry config id :license-arn)]
      (. builder licenseArn data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-grant-props-builder
  "The cfn-grant-props-builder function buildes out new instances of 
CfnGrantProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-operations` |
| `grantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:grant-name` |
| `homeRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-region` |
| `licenseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-arn` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnGrantProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-operations)]
      (. builder allowedOperations data))
    (when-let [data (lookup-entry config id :grant-name)]
      (. builder grantName data))
    (when-let [data (lookup-entry config id :home-region)]
      (. builder homeRegion data))
    (when-let [data (lookup-entry config id :license-arn)]
      (. builder licenseArn data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-license-borrow-configuration-property-builder
  "The cfn-license-borrow-configuration-property-builder function buildes out new instances of 
CfnLicense$BorrowConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowEarlyCheckIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-early-check-in` |
| `maxTimeToLiveInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-to-live-in-minutes` |"
  [stack id config]
  (let [builder (CfnLicense$BorrowConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-early-check-in)]
      (. builder allowEarlyCheckIn data))
    (when-let [data (lookup-entry config id :max-time-to-live-in-minutes)]
      (. builder maxTimeToLiveInMinutes data))
    (.build builder)))


(defn cfn-license-builder
  "The cfn-license-builder function buildes out new instances of 
CfnLicense$Builder using the provided configuration.  Each field is set as follows:

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
| `validity` | software.amazon.awscdk.services.licensemanager.CfnLicense$ValidityDateFormatProperty | [[cdk.support/lookup-entry]] | `:validity` |"
  [stack id config]
  (let [builder (CfnLicense$Builder/create stack id)]
    (when-let [data (lookup-entry config id :beneficiary)]
      (. builder beneficiary data))
    (when-let [data (lookup-entry config id :consumption-configuration)]
      (. builder consumptionConfiguration data))
    (when-let [data (lookup-entry config id :entitlements)]
      (. builder entitlements data))
    (when-let [data (lookup-entry config id :home-region)]
      (. builder homeRegion data))
    (when-let [data (lookup-entry config id :issuer)]
      (. builder issuer data))
    (when-let [data (lookup-entry config id :license-metadata)]
      (. builder licenseMetadata data))
    (when-let [data (lookup-entry config id :license-name)]
      (. builder licenseName data))
    (when-let [data (lookup-entry config id :product-name)]
      (. builder productName data))
    (when-let [data (lookup-entry config id :product-sku)]
      (. builder productSku data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :validity)]
      (. builder validity data))
    (.build builder)))


(defn cfn-license-consumption-configuration-property-builder
  "The cfn-license-consumption-configuration-property-builder function buildes out new instances of 
CfnLicense$ConsumptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `borrowConfiguration` | software.amazon.awscdk.services.licensemanager.CfnLicense$BorrowConfigurationProperty | [[cdk.support/lookup-entry]] | `:borrow-configuration` |
| `provisionalConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisional-configuration` |
| `renewType` | java.lang.String | [[cdk.support/lookup-entry]] | `:renew-type` |"
  [stack id config]
  (let [builder (CfnLicense$ConsumptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :borrow-configuration)]
      (. builder borrowConfiguration data))
    (when-let [data (lookup-entry config id :provisional-configuration)]
      (. builder provisionalConfiguration data))
    (when-let [data (lookup-entry config id :renew-type)]
      (. builder renewType data))
    (.build builder)))


(defn cfn-license-entitlement-property-builder
  "The cfn-license-entitlement-property-builder function buildes out new instances of 
CfnLicense$EntitlementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCheckIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-check-in` |
| `maxCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-count` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overage` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnLicense$EntitlementProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-check-in)]
      (. builder allowCheckIn data))
    (when-let [data (lookup-entry config id :max-count)]
      (. builder maxCount data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :overage)]
      (. builder overage data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-license-issuer-data-property-builder
  "The cfn-license-issuer-data-property-builder function buildes out new instances of 
CfnLicense$IssuerDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `signKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:sign-key` |"
  [stack id config]
  (let [builder (CfnLicense$IssuerDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sign-key)]
      (. builder signKey data))
    (.build builder)))


(defn cfn-license-metadata-property-builder
  "The cfn-license-metadata-property-builder function buildes out new instances of 
CfnLicense$MetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnLicense$MetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-license-props-builder
  "The cfn-license-props-builder function buildes out new instances of 
CfnLicenseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `validity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validity` |"
  [stack id config]
  (let [builder (CfnLicenseProps$Builder.)]
    (when-let [data (lookup-entry config id :beneficiary)]
      (. builder beneficiary data))
    (when-let [data (lookup-entry config id :consumption-configuration)]
      (. builder consumptionConfiguration data))
    (when-let [data (lookup-entry config id :entitlements)]
      (. builder entitlements data))
    (when-let [data (lookup-entry config id :home-region)]
      (. builder homeRegion data))
    (when-let [data (lookup-entry config id :issuer)]
      (. builder issuer data))
    (when-let [data (lookup-entry config id :license-metadata)]
      (. builder licenseMetadata data))
    (when-let [data (lookup-entry config id :license-name)]
      (. builder licenseName data))
    (when-let [data (lookup-entry config id :product-name)]
      (. builder productName data))
    (when-let [data (lookup-entry config id :product-sku)]
      (. builder productSku data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :validity)]
      (. builder validity data))
    (.build builder)))


(defn cfn-license-provisional-configuration-property-builder
  "The cfn-license-provisional-configuration-property-builder function buildes out new instances of 
CfnLicense$ProvisionalConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxTimeToLiveInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-to-live-in-minutes` |"
  [stack id config]
  (let [builder (CfnLicense$ProvisionalConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-time-to-live-in-minutes)]
      (. builder maxTimeToLiveInMinutes data))
    (.build builder)))


(defn cfn-license-validity-date-format-property-builder
  "The cfn-license-validity-date-format-property-builder function buildes out new instances of 
CfnLicense$ValidityDateFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `begin` | java.lang.String | [[cdk.support/lookup-entry]] | `:begin` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |"
  [stack id config]
  (let [builder (CfnLicense$ValidityDateFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :begin)]
      (. builder begin data))
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (.build builder)))