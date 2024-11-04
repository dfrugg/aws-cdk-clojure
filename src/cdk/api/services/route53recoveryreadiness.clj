(ns cdk.api.services.route53recoveryreadiness
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53recoveryreadiness package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53recoveryreadiness CfnCell$Builder
                                                                     CfnCellProps$Builder
                                                                     CfnReadinessCheck$Builder
                                                                     CfnReadinessCheckProps$Builder
                                                                     CfnRecoveryGroup$Builder
                                                                     CfnRecoveryGroupProps$Builder
                                                                     CfnResourceSet$Builder
                                                                     CfnResourceSet$DNSTargetResourceProperty$Builder
                                                                     CfnResourceSet$NLBResourceProperty$Builder
                                                                     CfnResourceSet$R53ResourceRecordProperty$Builder
                                                                     CfnResourceSet$ResourceProperty$Builder
                                                                     CfnResourceSet$TargetResourceProperty$Builder
                                                                     CfnResourceSetProps$Builder]))


(defn cfn-cell-builder
  "The cfn-cell-builder function buildes out new instances of 
CfnCell$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cellName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cell-name` |
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCell$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cell-name)]
      (. builder cellName data))
    (when-let [data (lookup-entry config id :cells)]
      (. builder cells data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cell-props-builder
  "The cfn-cell-props-builder function buildes out new instances of 
CfnCellProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cellName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cell-name` |
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCellProps$Builder.)]
    (when-let [data (lookup-entry config id :cell-name)]
      (. builder cellName data))
    (when-let [data (lookup-entry config id :cells)]
      (. builder cells data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-readiness-check-builder
  "The cfn-readiness-check-builder function buildes out new instances of 
CfnReadinessCheck$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readinessCheckName` | java.lang.String | [[cdk.support/lookup-entry]] | `:readiness-check-name` |
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReadinessCheck$Builder/create stack id)]
    (when-let [data (lookup-entry config id :readiness-check-name)]
      (. builder readinessCheckName data))
    (when-let [data (lookup-entry config id :resource-set-name)]
      (. builder resourceSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-readiness-check-props-builder
  "The cfn-readiness-check-props-builder function buildes out new instances of 
CfnReadinessCheckProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readinessCheckName` | java.lang.String | [[cdk.support/lookup-entry]] | `:readiness-check-name` |
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReadinessCheckProps$Builder.)]
    (when-let [data (lookup-entry config id :readiness-check-name)]
      (. builder readinessCheckName data))
    (when-let [data (lookup-entry config id :resource-set-name)]
      (. builder resourceSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-recovery-group-builder
  "The cfn-recovery-group-builder function buildes out new instances of 
CfnRecoveryGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `recoveryGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recovery-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRecoveryGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cells)]
      (. builder cells data))
    (when-let [data (lookup-entry config id :recovery-group-name)]
      (. builder recoveryGroupName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-recovery-group-props-builder
  "The cfn-recovery-group-props-builder function buildes out new instances of 
CfnRecoveryGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `recoveryGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recovery-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRecoveryGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :cells)]
      (. builder cells data))
    (when-let [data (lookup-entry config id :recovery-group-name)]
      (. builder recoveryGroupName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-set-builder
  "The cfn-resource-set-builder function buildes out new instances of 
CfnResourceSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `resourceSetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-type` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-set-name)]
      (. builder resourceSetName data))
    (when-let [data (lookup-entry config id :resource-set-type)]
      (. builder resourceSetType data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-set-dns-target-resource-property-builder
  "The cfn-resource-set-dns-target-resource-property-builder function buildes out new instances of 
CfnResourceSet$DNSTargetResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-arn` |
| `recordSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-set-id` |
| `recordType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-type` |
| `targetResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-resource` |"
  [stack id config]
  (let [builder (CfnResourceSet$DNSTargetResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :hosted-zone-arn)]
      (. builder hostedZoneArn data))
    (when-let [data (lookup-entry config id :record-set-id)]
      (. builder recordSetId data))
    (when-let [data (lookup-entry config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :target-resource)]
      (. builder targetResource data))
    (.build builder)))


(defn cfn-resource-set-nlb-resource-property-builder
  "The cfn-resource-set-nlb-resource-property-builder function buildes out new instances of 
CfnResourceSet$NLBResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnResourceSet$NLBResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-resource-set-props-builder
  "The cfn-resource-set-props-builder function buildes out new instances of 
CfnResourceSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `resourceSetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-type` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceSetProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-set-name)]
      (. builder resourceSetName data))
    (when-let [data (lookup-entry config id :resource-set-type)]
      (. builder resourceSetType data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-set-r53-resource-record-property-builder
  "The cfn-resource-set-r53-resource-record-property-builder function buildes out new instances of 
CfnResourceSet$R53ResourceRecordProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `recordSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-set-id` |"
  [stack id config]
  (let [builder (CfnResourceSet$R53ResourceRecordProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :record-set-id)]
      (. builder recordSetId data))
    (.build builder)))


(defn cfn-resource-set-resource-property-builder
  "The cfn-resource-set-resource-property-builder function buildes out new instances of 
CfnResourceSet$ResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-id` |
| `dnsTargetResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-target-resource` |
| `readinessScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:readiness-scopes` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnResourceSet$ResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-id)]
      (. builder componentId data))
    (when-let [data (lookup-entry config id :dns-target-resource)]
      (. builder dnsTargetResource data))
    (when-let [data (lookup-entry config id :readiness-scopes)]
      (. builder readinessScopes data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-resource-set-target-resource-property-builder
  "The cfn-resource-set-target-resource-property-builder function buildes out new instances of 
CfnResourceSet$TargetResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nlbResource` | software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet$NLBResourceProperty | [[cdk.support/lookup-entry]] | `:nlb-resource` |
| `r53Resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:r53-resource` |"
  [stack id config]
  (let [builder (CfnResourceSet$TargetResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :nlb-resource)]
      (. builder nlbResource data))
    (when-let [data (lookup-entry config id :r53-resource)]
      (. builder r53Resource data))
    (.build builder)))