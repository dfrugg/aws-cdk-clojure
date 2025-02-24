(ns cdk.api.services.directoryservice
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.directoryservice package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.directoryservice CfnMicrosoftAD$Builder
                                                             CfnMicrosoftAD$VpcSettingsProperty$Builder
                                                             CfnMicrosoftADProps$Builder
                                                             CfnSimpleAD$Builder
                                                             CfnSimpleAD$VpcSettingsProperty$Builder
                                                             CfnSimpleADProps$Builder]))


(defn build-cfn-microsoft-ad-builder
  "The build-cfn-microsoft-ad-builder function updates a CfnMicrosoftAD$Builder instance using the provided configuration.
  The function takes the CfnMicrosoftAD$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-alias` |
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |
| `enableSso` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `vpcSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-settings` |
"
  [^CfnMicrosoftAD$Builder builder id config]
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
  (.build builder))


(defn cfn-microsoft-ad-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-microsoft-ad-builder (CfnMicrosoftAD$Builder/create scope (name id)) id config))


(defn build-cfn-microsoft-ad-props-builder
  "The build-cfn-microsoft-ad-props-builder function updates a CfnMicrosoftADProps$Builder instance using the provided configuration.
  The function takes the CfnMicrosoftADProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-alias` |
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |
| `enableSso` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `vpcSettings` | software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD$VpcSettingsProperty | [[cdk.support/lookup-entry]] | `:vpc-settings` |
"
  [^CfnMicrosoftADProps$Builder builder id config]
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
  (.build builder))


(defn cfn-microsoft-ad-props-builder
  ""
  [id config]
  (build-cfn-microsoft-ad-props-builder (new CfnMicrosoftADProps$Builder) id config))


(defn build-cfn-microsoft-ad-vpc-settings-property-builder
  "The build-cfn-microsoft-ad-vpc-settings-property-builder function updates a CfnMicrosoftAD$VpcSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnMicrosoftAD$VpcSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnMicrosoftAD$VpcSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-microsoft-ad-vpc-settings-property-builder
  ""
  [id config]
  (build-cfn-microsoft-ad-vpc-settings-property-builder (new CfnMicrosoftAD$VpcSettingsProperty$Builder) id config))


(defn build-cfn-simple-ad-builder
  "The build-cfn-simple-ad-builder function updates a CfnSimpleAD$Builder instance using the provided configuration.
  The function takes the CfnSimpleAD$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-alias` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableSso` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `size` | java.lang.String | [[cdk.support/lookup-entry]] | `:size` |
| `vpcSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-settings` |
"
  [^CfnSimpleAD$Builder builder id config]
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
  (.build builder))


(defn cfn-simple-ad-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-simple-ad-builder (CfnSimpleAD$Builder/create scope (name id)) id config))


(defn build-cfn-simple-ad-props-builder
  "The build-cfn-simple-ad-props-builder function updates a CfnSimpleADProps$Builder instance using the provided configuration.
  The function takes the CfnSimpleADProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAlias` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-alias` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableSso` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sso` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `shortName` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-name` |
| `size` | java.lang.String | [[cdk.support/lookup-entry]] | `:size` |
| `vpcSettings` | software.amazon.awscdk.services.directoryservice.CfnSimpleAD$VpcSettingsProperty | [[cdk.support/lookup-entry]] | `:vpc-settings` |
"
  [^CfnSimpleADProps$Builder builder id config]
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
  (.build builder))


(defn cfn-simple-ad-props-builder
  ""
  [id config]
  (build-cfn-simple-ad-props-builder (new CfnSimpleADProps$Builder) id config))


(defn build-cfn-simple-ad-vpc-settings-property-builder
  "The build-cfn-simple-ad-vpc-settings-property-builder function updates a CfnSimpleAD$VpcSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSimpleAD$VpcSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnSimpleAD$VpcSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-simple-ad-vpc-settings-property-builder
  ""
  [id config]
  (build-cfn-simple-ad-vpc-settings-property-builder (new CfnSimpleAD$VpcSettingsProperty$Builder) id config))