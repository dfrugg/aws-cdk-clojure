(ns cdk.api.services.iotcoredeviceadvisor
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotcoredeviceadvisor package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotcoredeviceadvisor CfnSuiteDefinition$Builder
                                                                 CfnSuiteDefinition$DeviceUnderTestProperty$Builder
                                                                 CfnSuiteDefinition$SuiteDefinitionConfigurationProperty$Builder
                                                                 CfnSuiteDefinitionProps$Builder]))


(defn cfn-suite-definition-builder
  "The cfn-suite-definition-builder function buildes out new instances of 
CfnSuiteDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suiteDefinitionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:suite-definition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSuiteDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :suite-definition-configuration)]
      (. builder suiteDefinitionConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-suite-definition-device-under-test-property-builder
  "The cfn-suite-definition-device-under-test-property-builder function buildes out new instances of 
CfnSuiteDefinition$DeviceUnderTestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |"
  [stack id config]
  (let [builder (CfnSuiteDefinition$DeviceUnderTestProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (.build builder)))


(defn cfn-suite-definition-props-builder
  "The cfn-suite-definition-props-builder function buildes out new instances of 
CfnSuiteDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suiteDefinitionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:suite-definition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSuiteDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :suite-definition-configuration)]
      (. builder suiteDefinitionConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-suite-definition-suite-definition-configuration-property-builder
  "The cfn-suite-definition-suite-definition-configuration-property-builder function buildes out new instances of 
CfnSuiteDefinition$SuiteDefinitionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devicePermissionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-permission-role-arn` |
| `devices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:devices` |
| `intendedForQualification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:intended-for-qualification` |
| `rootGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-group` |
| `suiteDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:suite-definition-name` |"
  [stack id config]
  (let [builder (CfnSuiteDefinition$SuiteDefinitionConfigurationProperty$Builder.)]
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
    (.build builder)))