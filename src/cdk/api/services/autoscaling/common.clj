(ns cdk.api.services.autoscaling.common
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.autoscaling.common package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.autoscaling.common Alarms$Builder
                                                               ArbitraryIntervals$Builder
                                                               CompleteScalingInterval$Builder
                                                               ScalingInterval$Builder]))


(defn alarms-builder
  "The alarms-builder function buildes out new instances of 
Alarms$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lowerAlarmIntervalIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower-alarm-interval-index` |
| `upperAlarmIntervalIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper-alarm-interval-index` |"
  [stack id config]
  (let [builder (Alarms$Builder.)]
    (when-let [data (lookup-entry config id :lower-alarm-interval-index)]
      (. builder lowerAlarmIntervalIndex data))
    (when-let [data (lookup-entry config id :upper-alarm-interval-index)]
      (. builder upperAlarmIntervalIndex data))
    (.build builder)))


(defn arbitrary-intervals-builder
  "The arbitrary-intervals-builder function buildes out new instances of 
ArbitraryIntervals$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `absolute` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:absolute` |
| `intervals` | java.util.List | [[cdk.support/lookup-entry]] | `:intervals` |"
  [stack id config]
  (let [builder (ArbitraryIntervals$Builder.)]
    (when-let [data (lookup-entry config id :absolute)]
      (. builder absolute data))
    (when-let [data (lookup-entry config id :intervals)]
      (. builder intervals data))
    (.build builder)))


(defn complete-scaling-interval-builder
  "The complete-scaling-interval-builder function buildes out new instances of 
CompleteScalingInterval$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `change` | java.lang.Number | [[cdk.support/lookup-entry]] | `:change` |
| `lower` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower` |
| `upper` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper` |"
  [stack id config]
  (let [builder (CompleteScalingInterval$Builder.)]
    (when-let [data (lookup-entry config id :change)]
      (. builder change data))
    (when-let [data (lookup-entry config id :lower)]
      (. builder lower data))
    (when-let [data (lookup-entry config id :upper)]
      (. builder upper data))
    (.build builder)))


(defn scaling-interval-builder
  "The scaling-interval-builder function buildes out new instances of 
ScalingInterval$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `change` | java.lang.Number | [[cdk.support/lookup-entry]] | `:change` |
| `lower` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower` |
| `upper` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper` |"
  [stack id config]
  (let [builder (ScalingInterval$Builder.)]
    (when-let [data (lookup-entry config id :change)]
      (. builder change data))
    (when-let [data (lookup-entry config id :lower)]
      (. builder lower data))
    (when-let [data (lookup-entry config id :upper)]
      (. builder upper data))
    (.build builder)))