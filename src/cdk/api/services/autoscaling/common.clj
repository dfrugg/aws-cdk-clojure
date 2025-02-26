(ns cdk.api.services.autoscaling.common
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.autoscaling.common package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.autoscaling.common Alarms$Builder
                                                               ArbitraryIntervals$Builder
                                                               CompleteScalingInterval$Builder
                                                               ScalingInterval$Builder]))


(defn build-alarms-builder
  "The build-alarms-builder function updates a Alarms$Builder instance using the provided configuration.
  The function takes the Alarms$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lowerAlarmIntervalIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower-alarm-interval-index` |
| `upperAlarmIntervalIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper-alarm-interval-index` |
"
  [^Alarms$Builder builder id config]
  (when-let [data (lookup-entry config id :lower-alarm-interval-index)]
    (. builder lowerAlarmIntervalIndex data))
  (when-let [data (lookup-entry config id :upper-alarm-interval-index)]
    (. builder upperAlarmIntervalIndex data))
  (.build builder))


(defn alarms-builder
  "Creates a  `Alarms$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-alarms-builder (new Alarms$Builder) id config))


(defn build-arbitrary-intervals-builder
  "The build-arbitrary-intervals-builder function updates a ArbitraryIntervals$Builder instance using the provided configuration.
  The function takes the ArbitraryIntervals$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `absolute` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:absolute` |
| `intervals` | java.util.List | [[cdk.support/lookup-entry]] | `:intervals` |
"
  [^ArbitraryIntervals$Builder builder id config]
  (when-let [data (lookup-entry config id :absolute)]
    (. builder absolute data))
  (when-let [data (lookup-entry config id :intervals)]
    (. builder intervals data))
  (.build builder))


(defn arbitrary-intervals-builder
  "Creates a  `ArbitraryIntervals$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-arbitrary-intervals-builder (new ArbitraryIntervals$Builder) id config))


(defn build-complete-scaling-interval-builder
  "The build-complete-scaling-interval-builder function updates a CompleteScalingInterval$Builder instance using the provided configuration.
  The function takes the CompleteScalingInterval$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `change` | java.lang.Number | [[cdk.support/lookup-entry]] | `:change` |
| `lower` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower` |
| `upper` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper` |
"
  [^CompleteScalingInterval$Builder builder id config]
  (when-let [data (lookup-entry config id :change)]
    (. builder change data))
  (when-let [data (lookup-entry config id :lower)]
    (. builder lower data))
  (when-let [data (lookup-entry config id :upper)]
    (. builder upper data))
  (.build builder))


(defn complete-scaling-interval-builder
  "Creates a  `CompleteScalingInterval$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-complete-scaling-interval-builder (new CompleteScalingInterval$Builder) id config))


(defn build-scaling-interval-builder
  "The build-scaling-interval-builder function updates a ScalingInterval$Builder instance using the provided configuration.
  The function takes the ScalingInterval$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `change` | java.lang.Number | [[cdk.support/lookup-entry]] | `:change` |
| `lower` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower` |
| `upper` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper` |
"
  [^ScalingInterval$Builder builder id config]
  (when-let [data (lookup-entry config id :change)]
    (. builder change data))
  (when-let [data (lookup-entry config id :lower)]
    (. builder lower data))
  (when-let [data (lookup-entry config id :upper)]
    (. builder upper data))
  (.build builder))


(defn scaling-interval-builder
  "Creates a  `ScalingInterval$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-scaling-interval-builder (new ScalingInterval$Builder) id config))