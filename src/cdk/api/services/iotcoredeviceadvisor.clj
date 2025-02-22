(ns cdk.api.services.iotcoredeviceadvisor
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotcoredeviceadvisor package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotcoredeviceadvisor CfnSuiteDefinition$Builder
                                                                 CfnSuiteDefinition$DeviceUnderTestProperty$Builder
                                                                 CfnSuiteDefinition$SuiteDefinitionConfigurationProperty$Builder
                                                                 CfnSuiteDefinitionProps$Builder]))


(defn build-cfn-suite-definition-builder
  "The build-cfn-suite-definition-builder function updates a CfnSuiteDefinition$Builder instance using the provided configuration.
  The function takes the CfnSuiteDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suiteDefinitionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:suite-definition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSuiteDefinition$Builder builder id config]
  (when-let [data (lookup-entry config id :suite-definition-configuration)]
    (. builder suiteDefinitionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-suite-definition-device-under-test-property-builder
  "The build-cfn-suite-definition-device-under-test-property-builder function updates a CfnSuiteDefinition$DeviceUnderTestProperty$Builder instance using the provided configuration.
  The function takes the CfnSuiteDefinition$DeviceUnderTestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
"
  [^CfnSuiteDefinition$DeviceUnderTestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-let [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (.build builder))


(defn build-cfn-suite-definition-props-builder
  "The build-cfn-suite-definition-props-builder function updates a CfnSuiteDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnSuiteDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suiteDefinitionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:suite-definition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSuiteDefinitionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :suite-definition-configuration)]
    (. builder suiteDefinitionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-suite-definition-suite-definition-configuration-property-builder
  "The build-cfn-suite-definition-suite-definition-configuration-property-builder function updates a CfnSuiteDefinition$SuiteDefinitionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSuiteDefinition$SuiteDefinitionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devicePermissionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-permission-role-arn` |
| `devices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:devices` |
| `intendedForQualification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:intended-for-qualification` |
| `rootGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-group` |
| `suiteDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:suite-definition-name` |
"
  [^CfnSuiteDefinition$SuiteDefinitionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :device-permission-role-arn)]
    (. builder devicePermissionRoleArn data))
  (when-let [data (lookup-entry config id :devices)]
    (. builder devices data))
  (when-let [data (lookup-entry config id :intended-for-qualification)]
    (. builder intendedForQualification data))
  (when-let [data (lookup-entry config id :root-group)]
    (. builder rootGroup data))
  (when-let [data (lookup-entry config id :suite-definition-name)]
    (. builder suiteDefinitionName data))
  (.build builder))