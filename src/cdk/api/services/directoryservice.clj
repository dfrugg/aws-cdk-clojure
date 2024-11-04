(ns cdk.api.services.directoryservice
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.directoryservice package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.directoryservice CfnMicrosoftAD$Builder
                                                             CfnMicrosoftAD$VpcSettingsProperty$Builder
                                                             CfnMicrosoftADProps$Builder
                                                             CfnSimpleAD$Builder
                                                             CfnSimpleAD$VpcSettingsProperty$Builder
                                                             CfnSimpleADProps$Builder]))


(defn cfn-microsoft-ad-builder
  "The cfn-microsoft-ad-builder function buildes out new instances of 
CfnMicrosoftAD$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-alias` |
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |
| `enableSso` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `vpcSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-settings` |"
  [stack id config]
  (let [builder (CfnMicrosoftAD$Builder/create stack id)]
    (when-let [data (lookup-entry config id :create-alias)]
      (. builder createAlias data))
    (when-let [data (lookup-entry config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :enable-sso)]
      (. builder enableSso data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :short-name)]
      (. builder shortName data))
    (when-let [data (lookup-entry config id :vpc-settings)]
      (. builder vpcSettings data))
    (.build builder)))


(defn cfn-microsoft-ad-props-builder
  "The cfn-microsoft-ad-props-builder function buildes out new instances of 
CfnMicrosoftADProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-alias` |
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |
| `enableSso` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `vpcSettings` | software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD$VpcSettingsProperty | [[cdk.support/lookup-entry]] | `:vpc-settings` |"
  [stack id config]
  (let [builder (CfnMicrosoftADProps$Builder.)]
    (when-let [data (lookup-entry config id :create-alias)]
      (. builder createAlias data))
    (when-let [data (lookup-entry config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :enable-sso)]
      (. builder enableSso data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :short-name)]
      (. builder shortName data))
    (when-let [data (lookup-entry config id :vpc-settings)]
      (. builder vpcSettings data))
    (.build builder)))


(defn cfn-microsoft-ad-vpc-settings-property-builder
  "The cfn-microsoft-ad-vpc-settings-property-builder function buildes out new instances of 
CfnMicrosoftAD$VpcSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnMicrosoftAD$VpcSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-simple-ad-builder
  "The cfn-simple-ad-builder function buildes out new instances of 
CfnSimpleAD$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-alias` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableSso` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `size` | java.lang.String | [[cdk.support/lookup-entry]] | `:size` |
| `vpcSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-settings` |"
  [stack id config]
  (let [builder (CfnSimpleAD$Builder/create stack id)]
    (when-let [data (lookup-entry config id :create-alias)]
      (. builder createAlias data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-sso)]
      (. builder enableSso data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :short-name)]
      (. builder shortName data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :vpc-settings)]
      (. builder vpcSettings data))
    (.build builder)))


(defn cfn-simple-ad-props-builder
  "The cfn-simple-ad-props-builder function buildes out new instances of 
CfnSimpleADProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-alias` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableSso` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `size` | java.lang.String | [[cdk.support/lookup-entry]] | `:size` |
| `vpcSettings` | software.amazon.awscdk.services.directoryservice.CfnSimpleAD$VpcSettingsProperty | [[cdk.support/lookup-entry]] | `:vpc-settings` |"
  [stack id config]
  (let [builder (CfnSimpleADProps$Builder.)]
    (when-let [data (lookup-entry config id :create-alias)]
      (. builder createAlias data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-sso)]
      (. builder enableSso data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :short-name)]
      (. builder shortName data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :vpc-settings)]
      (. builder vpcSettings data))
    (.build builder)))


(defn cfn-simple-ad-vpc-settings-property-builder
  "The cfn-simple-ad-vpc-settings-property-builder function buildes out new instances of 
CfnSimpleAD$VpcSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnSimpleAD$VpcSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))