(ns cdk.api.services.lambda.destinations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.destinations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lambda.destinations LambdaDestination$Builder
                                                                LambdaDestinationOptions$Builder]))


(defn lambda-destination-builder
  "The lambda-destination-builder function buildes out new instances of 
LambdaDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:response-only` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction software.amazon.awscdk.services.lambda.IFunction]
  (let [builder (LambdaDestination$Builder/create ^software.amazon.awscdk.services.lambda.IFunction software.amazon.awscdk.services.lambda.IFunction)]
    (when-let [data (lookup-entry config id :response-only)]
      (. builder responseOnly data))
    (.build builder)))


(defn lambda-destination-options-builder
  "The lambda-destination-options-builder function buildes out new instances of 
LambdaDestinationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:response-only` |"
  [stack id config]
  (let [builder (LambdaDestinationOptions$Builder.)]
    (when-let [data (lookup-entry config id :response-only)]
      (. builder responseOnly data))
    (.build builder)))