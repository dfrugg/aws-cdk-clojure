(ns cdk.api.services.route53.patterns
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53.patterns package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53.patterns HttpsRedirect$Builder
                                                             HttpsRedirectProps$Builder]))


(defn https-redirect-builder>
  "The https-redirect-builder> function updates a HttpsRedirect$Builder instance using the provided configuration.
  The function takes the HttpsRedirect$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `recordNames` | java.util.List | [[cdk.support/lookup-entry]] | `:record-names` |
| `targetDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-domain` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^HttpsRedirect$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :record-names)]
    (. builder recordNames data))
  (when-some [data (lookup-entry config id :target-domain)]
    (. builder targetDomain data))
  (when-some [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn https-redirect-builder
  "Creates a  `HttpsRedirect$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (https-redirect-builder> (HttpsRedirect$Builder/create scope (name id)) id config))


(defn https-redirect-props-builder>
  "The https-redirect-props-builder> function updates a HttpsRedirectProps$Builder instance using the provided configuration.
  The function takes the HttpsRedirectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `recordNames` | java.util.List | [[cdk.support/lookup-entry]] | `:record-names` |
| `targetDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-domain` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^HttpsRedirectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :record-names)]
    (. builder recordNames data))
  (when-some [data (lookup-entry config id :target-domain)]
    (. builder targetDomain data))
  (when-some [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn https-redirect-props-builder
  "Creates a  `HttpsRedirectProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (https-redirect-props-builder> (new HttpsRedirectProps$Builder) id config))