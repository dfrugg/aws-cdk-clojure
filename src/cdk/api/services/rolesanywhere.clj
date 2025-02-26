(ns cdk.api.services.rolesanywhere
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.rolesanywhere package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.rolesanywhere CfnCRL$Builder
                                                          CfnCRLProps$Builder
                                                          CfnProfile$Builder
                                                          CfnProfileProps$Builder
                                                          CfnTrustAnchor$Builder
                                                          CfnTrustAnchor$NotificationSettingProperty$Builder
                                                          CfnTrustAnchor$SourceDataProperty$Builder
                                                          CfnTrustAnchor$SourceProperty$Builder
                                                          CfnTrustAnchorProps$Builder]))


(defn build-cfn-crl-builder
  "The build-cfn-crl-builder function updates a CfnCRL$Builder instance using the provided configuration.
  The function takes the CfnCRL$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlData` | java.lang.String | [[cdk.support/lookup-entry]] | `:crl-data` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustAnchorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-anchor-arn` |
"
  [^CfnCRL$Builder builder id config]
  (when-some [data (lookup-entry config id :crl-data)]
    (. builder crlData data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trust-anchor-arn)]
    (. builder trustAnchorArn data))
  (.build builder))


(defn cfn-crl-builder
  "Creates a  `CfnCRL$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-crl-builder (CfnCRL$Builder/create scope (name id)) id config))


(defn build-cfn-crl-props-builder
  "The build-cfn-crl-props-builder function updates a CfnCRLProps$Builder instance using the provided configuration.
  The function takes the CfnCRLProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlData` | java.lang.String | [[cdk.support/lookup-entry]] | `:crl-data` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustAnchorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-anchor-arn` |
"
  [^CfnCRLProps$Builder builder id config]
  (when-some [data (lookup-entry config id :crl-data)]
    (. builder crlData data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trust-anchor-arn)]
    (. builder trustAnchorArn data))
  (.build builder))


(defn cfn-crl-props-builder
  "Creates a  `CfnCRLProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-crl-props-builder (new CfnCRLProps$Builder) id config))


(defn build-cfn-profile-builder
  "The build-cfn-profile-builder function updates a CfnProfile$Builder instance using the provided configuration.
  The function takes the CfnProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requireInstanceProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-instance-properties` |
| `roleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:role-arns` |
| `sessionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-seconds)]
    (. builder durationSeconds data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :require-instance-properties)]
    (. builder requireInstanceProperties data))
  (when-some [data (lookup-entry config id :role-arns)]
    (. builder roleArns data))
  (when-some [data (lookup-entry config id :session-policy)]
    (. builder sessionPolicy data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-builder
  "Creates a  `CfnProfile$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-profile-builder (CfnProfile$Builder/create scope (name id)) id config))


(defn build-cfn-profile-props-builder
  "The build-cfn-profile-props-builder function updates a CfnProfileProps$Builder instance using the provided configuration.
  The function takes the CfnProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requireInstanceProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-instance-properties` |
| `roleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:role-arns` |
| `sessionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-seconds)]
    (. builder durationSeconds data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :require-instance-properties)]
    (. builder requireInstanceProperties data))
  (when-some [data (lookup-entry config id :role-arns)]
    (. builder roleArns data))
  (when-some [data (lookup-entry config id :session-policy)]
    (. builder sessionPolicy data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-props-builder
  "Creates a  `CfnProfileProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-profile-props-builder (new CfnProfileProps$Builder) id config))


(defn build-cfn-trust-anchor-builder
  "The build-cfn-trust-anchor-builder function updates a CfnTrustAnchor$Builder instance using the provided configuration.
  The function takes the CfnTrustAnchor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-settings` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrustAnchor$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-settings)]
    (. builder notificationSettings data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-trust-anchor-builder
  "Creates a  `CfnTrustAnchor$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-trust-anchor-builder (CfnTrustAnchor$Builder/create scope (name id)) id config))


(defn build-cfn-trust-anchor-notification-setting-property-builder
  "The build-cfn-trust-anchor-notification-setting-property-builder function updates a CfnTrustAnchor$NotificationSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnTrustAnchor$NotificationSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channel` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `event` | java.lang.String | [[cdk.support/lookup-entry]] | `:event` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
"
  [^CfnTrustAnchor$NotificationSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :channel)]
    (. builder channel data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (.build builder))


(defn cfn-trust-anchor-notification-setting-property-builder
  "Creates a  `CfnTrustAnchor$NotificationSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-trust-anchor-notification-setting-property-builder (new CfnTrustAnchor$NotificationSettingProperty$Builder) id config))


(defn build-cfn-trust-anchor-props-builder
  "The build-cfn-trust-anchor-props-builder function updates a CfnTrustAnchorProps$Builder instance using the provided configuration.
  The function takes the CfnTrustAnchorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-settings` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrustAnchorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-settings)]
    (. builder notificationSettings data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-trust-anchor-props-builder
  "Creates a  `CfnTrustAnchorProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-trust-anchor-props-builder (new CfnTrustAnchorProps$Builder) id config))


(defn build-cfn-trust-anchor-source-data-property-builder
  "The build-cfn-trust-anchor-source-data-property-builder function updates a CfnTrustAnchor$SourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnTrustAnchor$SourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acmPcaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:acm-pca-arn` |
| `x509CertificateData` | java.lang.String | [[cdk.support/lookup-entry]] | `:x509-certificate-data` |
"
  [^CfnTrustAnchor$SourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :acm-pca-arn)]
    (. builder acmPcaArn data))
  (when-some [data (lookup-entry config id :x509-certificate-data)]
    (. builder x509CertificateData data))
  (.build builder))


(defn cfn-trust-anchor-source-data-property-builder
  "Creates a  `CfnTrustAnchor$SourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-trust-anchor-source-data-property-builder (new CfnTrustAnchor$SourceDataProperty$Builder) id config))


(defn build-cfn-trust-anchor-source-property-builder
  "The build-cfn-trust-anchor-source-property-builder function updates a CfnTrustAnchor$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTrustAnchor$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-data` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
"
  [^CfnTrustAnchor$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source-data)]
    (. builder sourceData data))
  (when-some [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (.build builder))


(defn cfn-trust-anchor-source-property-builder
  "Creates a  `CfnTrustAnchor$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-trust-anchor-source-property-builder (new CfnTrustAnchor$SourceProperty$Builder) id config))