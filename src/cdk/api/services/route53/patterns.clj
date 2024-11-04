(ns cdk.api.services.route53.patterns
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53.patterns package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53.patterns HttpsRedirect$Builder
                                                             HttpsRedirectProps$Builder]))


(defn https-redirect-builder
  "The https-redirect-builder function buildes out new instances of 
HttpsRedirect$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `recordNames` | java.util.List | [[cdk.support/lookup-entry]] | `:record-names` |
| `targetDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-domain` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (HttpsRedirect$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :record-names)]
      (. builder recordNames data))
    (when-let [data (lookup-entry config id :target-domain)]
      (. builder targetDomain data))
    (when-let [data (lookup-entry config id :zone)]
      (. builder zone data))
    (.build builder)))


(defn https-redirect-props-builder
  "The https-redirect-props-builder function buildes out new instances of 
HttpsRedirectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `recordNames` | java.util.List | [[cdk.support/lookup-entry]] | `:record-names` |
| `targetDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-domain` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (HttpsRedirectProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :record-names)]
      (. builder recordNames data))
    (when-let [data (lookup-entry config id :target-domain)]
      (. builder targetDomain data))
    (when-let [data (lookup-entry config id :zone)]
      (. builder zone data))
    (.build builder)))