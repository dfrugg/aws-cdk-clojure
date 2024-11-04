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


(defn cfn-crl-builder
  "The cfn-crl-builder function buildes out new instances of 
CfnCRL$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlData` | java.lang.String | [[cdk.support/lookup-entry]] | `:crl-data` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustAnchorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-anchor-arn` |"
  [stack id config]
  (let [builder (CfnCRL$Builder/create stack id)]
    (when-let [data (lookup-entry config id :crl-data)]
      (. builder crlData data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trust-anchor-arn)]
      (. builder trustAnchorArn data))
    (.build builder)))


(defn cfn-crl-props-builder
  "The cfn-crl-props-builder function buildes out new instances of 
CfnCRLProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlData` | java.lang.String | [[cdk.support/lookup-entry]] | `:crl-data` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustAnchorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-anchor-arn` |"
  [stack id config]
  (let [builder (CfnCRLProps$Builder.)]
    (when-let [data (lookup-entry config id :crl-data)]
      (. builder crlData data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trust-anchor-arn)]
      (. builder trustAnchorArn data))
    (.build builder)))


(defn cfn-profile-builder
  "The cfn-profile-builder function buildes out new instances of 
CfnProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requireInstanceProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-instance-properties` |
| `roleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:role-arns` |
| `sessionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :duration-seconds)]
      (. builder durationSeconds data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :require-instance-properties)]
      (. builder requireInstanceProperties data))
    (when-let [data (lookup-entry config id :role-arns)]
      (. builder roleArns data))
    (when-let [data (lookup-entry config id :session-policy)]
      (. builder sessionPolicy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-props-builder
  "The cfn-profile-props-builder function buildes out new instances of 
CfnProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requireInstanceProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-instance-properties` |
| `roleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:role-arns` |
| `sessionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :duration-seconds)]
      (. builder durationSeconds data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :require-instance-properties)]
      (. builder requireInstanceProperties data))
    (when-let [data (lookup-entry config id :role-arns)]
      (. builder roleArns data))
    (when-let [data (lookup-entry config id :session-policy)]
      (. builder sessionPolicy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-trust-anchor-builder
  "The cfn-trust-anchor-builder function buildes out new instances of 
CfnTrustAnchor$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-settings` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrustAnchor$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-settings)]
      (. builder notificationSettings data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-trust-anchor-notification-setting-property-builder
  "The cfn-trust-anchor-notification-setting-property-builder function buildes out new instances of 
CfnTrustAnchor$NotificationSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channel` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `event` | java.lang.String | [[cdk.support/lookup-entry]] | `:event` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |"
  [stack id config]
  (let [builder (CfnTrustAnchor$NotificationSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel)]
      (. builder channel data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event)]
      (. builder event data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (.build builder)))


(defn cfn-trust-anchor-props-builder
  "The cfn-trust-anchor-props-builder function buildes out new instances of 
CfnTrustAnchorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-settings` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrustAnchorProps$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-settings)]
      (. builder notificationSettings data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-trust-anchor-source-data-property-builder
  "The cfn-trust-anchor-source-data-property-builder function buildes out new instances of 
CfnTrustAnchor$SourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acmPcaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:acm-pca-arn` |
| `x509CertificateData` | java.lang.String | [[cdk.support/lookup-entry]] | `:x509-certificate-data` |"
  [stack id config]
  (let [builder (CfnTrustAnchor$SourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :acm-pca-arn)]
      (. builder acmPcaArn data))
    (when-let [data (lookup-entry config id :x509-certificate-data)]
      (. builder x509CertificateData data))
    (.build builder)))


(defn cfn-trust-anchor-source-property-builder
  "The cfn-trust-anchor-source-property-builder function buildes out new instances of 
CfnTrustAnchor$SourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-data` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |"
  [stack id config]
  (let [builder (CfnTrustAnchor$SourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-data)]
      (. builder sourceData data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (.build builder)))