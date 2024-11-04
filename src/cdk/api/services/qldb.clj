(ns cdk.api.services.qldb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.qldb package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.qldb CfnLedger$Builder
                                                 CfnLedgerProps$Builder
                                                 CfnStream$Builder
                                                 CfnStream$KinesisConfigurationProperty$Builder
                                                 CfnStreamProps$Builder]))


(defn cfn-ledger-builder
  "The cfn-ledger-builder function buildes out new instances of 
CfnLedger$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLedger$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permissions-mode)]
      (. builder permissionsMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ledger-props-builder
  "The cfn-ledger-props-builder function buildes out new instances of 
CfnLedgerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLedgerProps$Builder.)]
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permissions-mode)]
      (. builder permissionsMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stream-builder
  "The cfn-stream-builder function buildes out new instances of 
CfnStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclusiveEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclusive-end-time` |
| `inclusiveStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:inclusive-start-time` |
| `kinesisConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-configuration` |
| `ledgerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ledger-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :exclusive-end-time)]
      (. builder exclusiveEndTime data))
    (when-let [data (lookup-entry config id :inclusive-start-time)]
      (. builder inclusiveStartTime data))
    (when-let [data (lookup-entry config id :kinesis-configuration)]
      (. builder kinesisConfiguration data))
    (when-let [data (lookup-entry config id :ledger-name)]
      (. builder ledgerName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stream-kinesis-configuration-property-builder
  "The cfn-stream-kinesis-configuration-property-builder function buildes out new instances of 
CfnStream$KinesisConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:aggregation-enabled` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnStream$KinesisConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregation-enabled)]
      (. builder aggregationEnabled data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-stream-props-builder
  "The cfn-stream-props-builder function buildes out new instances of 
CfnStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclusiveEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclusive-end-time` |
| `inclusiveStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:inclusive-start-time` |
| `kinesisConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-configuration` |
| `ledgerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ledger-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :exclusive-end-time)]
      (. builder exclusiveEndTime data))
    (when-let [data (lookup-entry config id :inclusive-start-time)]
      (. builder inclusiveStartTime data))
    (when-let [data (lookup-entry config id :kinesis-configuration)]
      (. builder kinesisConfiguration data))
    (when-let [data (lookup-entry config id :ledger-name)]
      (. builder ledgerName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))