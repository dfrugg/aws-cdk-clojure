(ns cdk.api.services.logs.destinations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.logs.destinations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.logs.destinations KinesisDestination$Builder
                                                              KinesisDestinationProps$Builder
                                                              LambdaDestination$Builder
                                                              LambdaDestinationOptions$Builder]))


(defn kinesis-destination-builder
  "The kinesis-destination-builder function buildes out new instances of 
KinesisDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config ^software.amazon.awscdk.services.kinesis.IStream stream]
  (let [builder (KinesisDestination$Builder/create ^software.amazon.awscdk.services.kinesis.IStream stream)]
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn kinesis-destination-props-builder
  "The kinesis-destination-props-builder function buildes out new instances of 
KinesisDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (KinesisDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn lambda-destination-builder
  "The lambda-destination-builder function buildes out new instances of 
LambdaDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-permissions` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (LambdaDestination$Builder/create ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (lookup-entry config id :add-permissions)]
      (. builder addPermissions data))
    (.build builder)))


(defn lambda-destination-options-builder
  "The lambda-destination-options-builder function buildes out new instances of 
LambdaDestinationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-permissions` |"
  [stack id config]
  (let [builder (LambdaDestinationOptions$Builder.)]
    (when-let [data (lookup-entry config id :add-permissions)]
      (. builder addPermissions data))
    (.build builder)))