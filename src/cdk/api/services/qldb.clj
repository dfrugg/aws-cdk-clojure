(ns cdk.api.services.qldb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.qldb package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.qldb CfnLedger$Builder
                                                 CfnLedgerProps$Builder
                                                 CfnStream$Builder
                                                 CfnStream$KinesisConfigurationProperty$Builder
                                                 CfnStreamProps$Builder]))


(defn build-cfn-ledger-builder
  "The build-cfn-ledger-builder function updates a CfnLedger$Builder instance using the provided configuration.
  The function takes the CfnLedger$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLedger$Builder builder id config]
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
  (.build builder))


(defn build-cfn-ledger-props-builder
  "The build-cfn-ledger-props-builder function updates a CfnLedgerProps$Builder instance using the provided configuration.
  The function takes the CfnLedgerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLedgerProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stream-builder
  "The build-cfn-stream-builder function updates a CfnStream$Builder instance using the provided configuration.
  The function takes the CfnStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclusiveEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclusive-end-time` |
| `inclusiveStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:inclusive-start-time` |
| `kinesisConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-configuration` |
| `ledgerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ledger-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStream$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stream-kinesis-configuration-property-builder
  "The build-cfn-stream-kinesis-configuration-property-builder function updates a CfnStream$KinesisConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStream$KinesisConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:aggregation-enabled` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |
"
  [^CfnStream$KinesisConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aggregation-enabled)]
    (. builder aggregationEnabled data))
  (when-let [data (lookup-entry config id :stream-arn)]
    (. builder streamArn data))
  (.build builder))


(defn build-cfn-stream-props-builder
  "The build-cfn-stream-props-builder function updates a CfnStreamProps$Builder instance using the provided configuration.
  The function takes the CfnStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclusiveEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclusive-end-time` |
| `inclusiveStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:inclusive-start-time` |
| `kinesisConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-configuration` |
| `ledgerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ledger-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamProps$Builder builder id config]
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
  (.build builder))