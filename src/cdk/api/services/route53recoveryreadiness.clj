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


(defn build-cfn-cell-builder
  "The build-cfn-cell-builder function updates a CfnCell$Builder instance using the provided configuration.
  The function takes the CfnCell$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cellName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cell-name` |
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCell$Builder builder id config]
  (when-let [data (lookup-entry config id :cell-name)]
    (. builder cellName data))
  (when-let [data (lookup-entry config id :cells)]
    (. builder cells data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cell-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-cell-builder (CfnCell$Builder/create scope (name id)) id config))


(defn build-cfn-cell-props-builder
  "The build-cfn-cell-props-builder function updates a CfnCellProps$Builder instance using the provided configuration.
  The function takes the CfnCellProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cellName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cell-name` |
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCellProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cell-name)]
    (. builder cellName data))
  (when-let [data (lookup-entry config id :cells)]
    (. builder cells data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cell-props-builder
  ""
  [id config]
  (build-cfn-cell-props-builder (new CfnCellProps$Builder) id config))


(defn build-cfn-readiness-check-builder
  "The build-cfn-readiness-check-builder function updates a CfnReadinessCheck$Builder instance using the provided configuration.
  The function takes the CfnReadinessCheck$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readinessCheckName` | java.lang.String | [[cdk.support/lookup-entry]] | `:readiness-check-name` |
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReadinessCheck$Builder builder id config]
  (when-let [data (lookup-entry config id :readiness-check-name)]
    (. builder readinessCheckName data))
  (when-let [data (lookup-entry config id :resource-set-name)]
    (. builder resourceSetName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-readiness-check-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-readiness-check-builder (CfnReadinessCheck$Builder/create scope (name id)) id config))


(defn build-cfn-readiness-check-props-builder
  "The build-cfn-readiness-check-props-builder function updates a CfnReadinessCheckProps$Builder instance using the provided configuration.
  The function takes the CfnReadinessCheckProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readinessCheckName` | java.lang.String | [[cdk.support/lookup-entry]] | `:readiness-check-name` |
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReadinessCheckProps$Builder builder id config]
  (when-let [data (lookup-entry config id :readiness-check-name)]
    (. builder readinessCheckName data))
  (when-let [data (lookup-entry config id :resource-set-name)]
    (. builder resourceSetName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-readiness-check-props-builder
  ""
  [id config]
  (build-cfn-readiness-check-props-builder (new CfnReadinessCheckProps$Builder) id config))


(defn build-cfn-recovery-group-builder
  "The build-cfn-recovery-group-builder function updates a CfnRecoveryGroup$Builder instance using the provided configuration.
  The function takes the CfnRecoveryGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `recoveryGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recovery-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRecoveryGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :cells)]
    (. builder cells data))
  (when-let [data (lookup-entry config id :recovery-group-name)]
    (. builder recoveryGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-recovery-group-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-recovery-group-builder (CfnRecoveryGroup$Builder/create scope (name id)) id config))


(defn build-cfn-recovery-group-props-builder
  "The build-cfn-recovery-group-props-builder function updates a CfnRecoveryGroupProps$Builder instance using the provided configuration.
  The function takes the CfnRecoveryGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cells` | java.util.List | [[cdk.support/lookup-entry]] | `:cells` |
| `recoveryGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recovery-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRecoveryGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cells)]
    (. builder cells data))
  (when-let [data (lookup-entry config id :recovery-group-name)]
    (. builder recoveryGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-recovery-group-props-builder
  ""
  [id config]
  (build-cfn-recovery-group-props-builder (new CfnRecoveryGroupProps$Builder) id config))


(defn build-cfn-resource-set-builder
  "The build-cfn-resource-set-builder function updates a CfnResourceSet$Builder instance using the provided configuration.
  The function takes the CfnResourceSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `resourceSetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-type` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceSet$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-set-name)]
    (. builder resourceSetName data))
  (when-let [data (lookup-entry config id :resource-set-type)]
    (. builder resourceSetType data))
  (when-let [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-set-builder (CfnResourceSet$Builder/create scope (name id)) id config))


(defn build-cfn-resource-set-dns-target-resource-property-builder
  "The build-cfn-resource-set-dns-target-resource-property-builder function updates a CfnResourceSet$DNSTargetResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceSet$DNSTargetResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-arn` |
| `recordSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-set-id` |
| `recordType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-type` |
| `targetResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-resource` |
"
  [^CfnResourceSet$DNSTargetResourceProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-resource-set-dns-target-resource-property-builder
  ""
  [id config]
  (build-cfn-resource-set-dns-target-resource-property-builder (new CfnResourceSet$DNSTargetResourceProperty$Builder) id config))


(defn build-cfn-resource-set-nlb-resource-property-builder
  "The build-cfn-resource-set-nlb-resource-property-builder function updates a CfnResourceSet$NLBResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceSet$NLBResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnResourceSet$NLBResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-resource-set-nlb-resource-property-builder
  ""
  [id config]
  (build-cfn-resource-set-nlb-resource-property-builder (new CfnResourceSet$NLBResourceProperty$Builder) id config))


(defn build-cfn-resource-set-props-builder
  "The build-cfn-resource-set-props-builder function updates a CfnResourceSetProps$Builder instance using the provided configuration.
  The function takes the CfnResourceSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-name` |
| `resourceSetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-set-type` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-set-name)]
    (. builder resourceSetName data))
  (when-let [data (lookup-entry config id :resource-set-type)]
    (. builder resourceSetType data))
  (when-let [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-set-props-builder
  ""
  [id config]
  (build-cfn-resource-set-props-builder (new CfnResourceSetProps$Builder) id config))


(defn build-cfn-resource-set-r53-resource-record-property-builder
  "The build-cfn-resource-set-r53-resource-record-property-builder function updates a CfnResourceSet$R53ResourceRecordProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceSet$R53ResourceRecordProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `recordSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-set-id` |
"
  [^CfnResourceSet$R53ResourceRecordProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :record-set-id)]
    (. builder recordSetId data))
  (.build builder))


(defn cfn-resource-set-r53-resource-record-property-builder
  ""
  [id config]
  (build-cfn-resource-set-r53-resource-record-property-builder (new CfnResourceSet$R53ResourceRecordProperty$Builder) id config))


(defn build-cfn-resource-set-resource-property-builder
  "The build-cfn-resource-set-resource-property-builder function updates a CfnResourceSet$ResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceSet$ResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-id` |
| `dnsTargetResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-target-resource` |
| `readinessScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:readiness-scopes` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnResourceSet$ResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :component-id)]
    (. builder componentId data))
  (when-let [data (lookup-entry config id :dns-target-resource)]
    (. builder dnsTargetResource data))
  (when-let [data (lookup-entry config id :readiness-scopes)]
    (. builder readinessScopes data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-resource-set-resource-property-builder
  ""
  [id config]
  (build-cfn-resource-set-resource-property-builder (new CfnResourceSet$ResourceProperty$Builder) id config))


(defn build-cfn-resource-set-target-resource-property-builder
  "The build-cfn-resource-set-target-resource-property-builder function updates a CfnResourceSet$TargetResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceSet$TargetResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nlbResource` | software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet$NLBResourceProperty | [[cdk.support/lookup-entry]] | `:nlb-resource` |
| `r53Resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:r53-resource` |
"
  [^CfnResourceSet$TargetResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :nlb-resource)]
    (. builder nlbResource data))
  (when-let [data (lookup-entry config id :r53-resource)]
    (. builder r53Resource data))
  (.build builder))


(defn cfn-resource-set-target-resource-property-builder
  ""
  [id config]
  (build-cfn-resource-set-target-resource-property-builder (new CfnResourceSet$TargetResourceProperty$Builder) id config))