(ns cdk.api.services.qldb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.qldb package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.qldb CfnLedger$Builder
                                                 CfnLedgerProps$Builder
                                                 CfnStream$Builder
                                                 CfnStream$KinesisConfigurationProperty$Builder
                                                 CfnStreamProps$Builder]))


(defn cfn-ledger-builder>
  "The cfn-ledger-builder> function updates a CfnLedger$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :permissions-mode)]
    (. builder permissionsMode data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-ledger-builder
  "Creates a  `CfnLedger$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-ledger-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-ledger-builder> (CfnLedger$Builder/create scope (name id)) id config))


(defn cfn-ledger-props-builder>
  "The cfn-ledger-props-builder> function updates a CfnLedgerProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :permissions-mode)]
    (. builder permissionsMode data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-ledger-props-builder
  "Creates a  `CfnLedgerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-ledger-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-ledger-props-builder> (new CfnLedgerProps$Builder) id config))


(defn cfn-stream-builder>
  "The cfn-stream-builder> function updates a CfnStream$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :exclusive-end-time)]
    (. builder exclusiveEndTime data))
  (when-some [data (lookup-entry config id :inclusive-start-time)]
    (. builder inclusiveStartTime data))
  (when-some [data (lookup-entry config id :kinesis-configuration)]
    (. builder kinesisConfiguration data))
  (when-some [data (lookup-entry config id :ledger-name)]
    (. builder ledgerName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-builder
  "Creates a  `CfnStream$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stream-builder> (CfnStream$Builder/create scope (name id)) id config))


(defn cfn-stream-kinesis-configuration-property-builder>
  "The cfn-stream-kinesis-configuration-property-builder> function updates a CfnStream$KinesisConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStream$KinesisConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:aggregation-enabled` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |
"
  [^CfnStream$KinesisConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation-enabled)]
    (. builder aggregationEnabled data))
  (when-some [data (lookup-entry config id :stream-arn)]
    (. builder streamArn data))
  (.build builder))


(defn cfn-stream-kinesis-configuration-property-builder
  "Creates a  `CfnStream$KinesisConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stream-kinesis-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stream-kinesis-configuration-property-builder> (new CfnStream$KinesisConfigurationProperty$Builder) id config))


(defn cfn-stream-props-builder>
  "The cfn-stream-props-builder> function updates a CfnStreamProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :exclusive-end-time)]
    (. builder exclusiveEndTime data))
  (when-some [data (lookup-entry config id :inclusive-start-time)]
    (. builder inclusiveStartTime data))
  (when-some [data (lookup-entry config id :kinesis-configuration)]
    (. builder kinesisConfiguration data))
  (when-some [data (lookup-entry config id :ledger-name)]
    (. builder ledgerName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-props-builder
  "Creates a  `CfnStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stream-props-builder> (new CfnStreamProps$Builder) id config))