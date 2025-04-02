(ns cdk.api.services.vpclattice
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.vpclattice package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.vpclattice CfnAccessLogSubscription$Builder
                                                       CfnAccessLogSubscriptionProps$Builder
                                                       CfnAuthPolicy$Builder
                                                       CfnAuthPolicyProps$Builder
                                                       CfnListener$Builder
                                                       CfnListener$DefaultActionProperty$Builder
                                                       CfnListener$FixedResponseProperty$Builder
                                                       CfnListener$ForwardProperty$Builder
                                                       CfnListener$WeightedTargetGroupProperty$Builder
                                                       CfnListenerProps$Builder
                                                       CfnResourcePolicy$Builder
                                                       CfnResourcePolicyProps$Builder
                                                       CfnRule$ActionProperty$Builder
                                                       CfnRule$Builder
                                                       CfnRule$FixedResponseProperty$Builder
                                                       CfnRule$ForwardProperty$Builder
                                                       CfnRule$HeaderMatchProperty$Builder
                                                       CfnRule$HeaderMatchTypeProperty$Builder
                                                       CfnRule$HttpMatchProperty$Builder
                                                       CfnRule$MatchProperty$Builder
                                                       CfnRule$PathMatchProperty$Builder
                                                       CfnRule$PathMatchTypeProperty$Builder
                                                       CfnRule$WeightedTargetGroupProperty$Builder
                                                       CfnRuleProps$Builder
                                                       CfnService$Builder
                                                       CfnService$DnsEntryProperty$Builder
                                                       CfnServiceNetwork$Builder
                                                       CfnServiceNetworkProps$Builder
                                                       CfnServiceNetworkServiceAssociation$Builder
                                                       CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder
                                                       CfnServiceNetworkServiceAssociationProps$Builder
                                                       CfnServiceNetworkVpcAssociation$Builder
                                                       CfnServiceNetworkVpcAssociationProps$Builder
                                                       CfnServiceProps$Builder
                                                       CfnTargetGroup$Builder
                                                       CfnTargetGroup$HealthCheckConfigProperty$Builder
                                                       CfnTargetGroup$MatcherProperty$Builder
                                                       CfnTargetGroup$TargetGroupConfigProperty$Builder
                                                       CfnTargetGroup$TargetProperty$Builder
                                                       CfnTargetGroupProps$Builder]))


(defn cfn-access-log-subscription-builder>
  "The cfn-access-log-subscription-builder> function updates a CfnAccessLogSubscription$Builder instance using the provided configuration.
  The function takes the CfnAccessLogSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessLogSubscription$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-access-log-subscription-builder
  "Creates a  `CfnAccessLogSubscription$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-access-log-subscription-builder> (CfnAccessLogSubscription$Builder/create scope (name id)) id config))


(defn cfn-access-log-subscription-props-builder>
  "The cfn-access-log-subscription-props-builder> function updates a CfnAccessLogSubscriptionProps$Builder instance using the provided configuration.
  The function takes the CfnAccessLogSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessLogSubscriptionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-access-log-subscription-props-builder
  "Creates a  `CfnAccessLogSubscriptionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-access-log-subscription-props-builder> (new CfnAccessLogSubscriptionProps$Builder) id config))


(defn cfn-auth-policy-builder>
  "The cfn-auth-policy-builder> function updates a CfnAuthPolicy$Builder instance using the provided configuration.
  The function takes the CfnAuthPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
"
  [^CfnAuthPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (.build builder))


(defn cfn-auth-policy-builder
  "Creates a  `CfnAuthPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-auth-policy-builder> (CfnAuthPolicy$Builder/create scope (name id)) id config))


(defn cfn-auth-policy-props-builder>
  "The cfn-auth-policy-props-builder> function updates a CfnAuthPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnAuthPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
"
  [^CfnAuthPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (.build builder))


(defn cfn-auth-policy-props-builder
  "Creates a  `CfnAuthPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-auth-policy-props-builder> (new CfnAuthPolicyProps$Builder) id config))


(defn cfn-listener-builder>
  "The cfn-listener-builder> function updates a CfnListener$Builder instance using the provided configuration.
  The function takes the CfnListener$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.services.vpclattice.CfnListener$DefaultActionProperty | [[cdk.support/lookup-entry]] | `:default-action` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnListener$Builder builder id config]
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-listener-builder
  "Creates a  `CfnListener$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-listener-builder> (CfnListener$Builder/create scope (name id)) id config))


(defn cfn-listener-default-action-property-builder>
  "The cfn-listener-default-action-property-builder> function updates a CfnListener$DefaultActionProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$DefaultActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fixedResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fixed-response` |
| `forward` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward` |
"
  [^CfnListener$DefaultActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fixed-response)]
    (. builder fixedResponse data))
  (when-some [data (lookup-entry config id :forward)]
    (. builder forward data))
  (.build builder))


(defn cfn-listener-default-action-property-builder
  "Creates a  `CfnListener$DefaultActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-listener-default-action-property-builder> (new CfnListener$DefaultActionProperty$Builder) id config))


(defn cfn-listener-fixed-response-property-builder>
  "The cfn-listener-fixed-response-property-builder> function updates a CfnListener$FixedResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$FixedResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statusCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnListener$FixedResponseProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-listener-fixed-response-property-builder
  "Creates a  `CfnListener$FixedResponseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-listener-fixed-response-property-builder> (new CfnListener$FixedResponseProperty$Builder) id config))


(defn cfn-listener-forward-property-builder>
  "The cfn-listener-forward-property-builder> function updates a CfnListener$ForwardProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$ForwardProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^CfnListener$ForwardProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn cfn-listener-forward-property-builder
  "Creates a  `CfnListener$ForwardProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-listener-forward-property-builder> (new CfnListener$ForwardProperty$Builder) id config))


(defn cfn-listener-props-builder>
  "The cfn-listener-props-builder> function updates a CfnListenerProps$Builder instance using the provided configuration.
  The function takes the CfnListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.services.vpclattice.CfnListener$DefaultActionProperty | [[cdk.support/lookup-entry]] | `:default-action` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnListenerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-listener-props-builder
  "Creates a  `CfnListenerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-listener-props-builder> (new CfnListenerProps$Builder) id config))


(defn cfn-listener-weighted-target-group-property-builder>
  "The cfn-listener-weighted-target-group-property-builder> function updates a CfnListener$WeightedTargetGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$WeightedTargetGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-identifier` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnListener$WeightedTargetGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group-identifier)]
    (. builder targetGroupIdentifier data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-listener-weighted-target-group-property-builder
  "Creates a  `CfnListener$WeightedTargetGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-listener-weighted-target-group-property-builder> (new CfnListener$WeightedTargetGroupProperty$Builder) id config))


(defn cfn-resource-policy-builder>
  "The cfn-resource-policy-builder> function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-resource-policy-builder
  "Creates a  `CfnResourcePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-policy-builder> (CfnResourcePolicy$Builder/create scope (name id)) id config))


(defn cfn-resource-policy-props-builder>
  "The cfn-resource-policy-props-builder> function updates a CfnResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-resource-policy-props-builder
  "Creates a  `CfnResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-policy-props-builder> (new CfnResourcePolicyProps$Builder) id config))


(defn cfn-rule-action-property-builder>
  "The cfn-rule-action-property-builder> function updates a CfnRule$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fixedResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fixed-response` |
| `forward` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward` |
"
  [^CfnRule$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fixed-response)]
    (. builder fixedResponse data))
  (when-some [data (lookup-entry config id :forward)]
    (. builder forward data))
  (.build builder))


(defn cfn-rule-action-property-builder
  "Creates a  `CfnRule$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-action-property-builder> (new CfnRule$ActionProperty$Builder) id config))


(defn cfn-rule-builder>
  "The cfn-rule-builder> function updates a CfnRule$Builder instance using the provided configuration.
  The function takes the CfnRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.vpclattice.CfnRule$ActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `listenerIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-identifier` |
| `match` | software.amazon.awscdk.services.vpclattice.CfnRule$MatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRule$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :listener-identifier)]
    (. builder listenerIdentifier data))
  (when-some [data (lookup-entry config id :match)]
    (. builder match data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-rule-builder
  "Creates a  `CfnRule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-rule-builder> (CfnRule$Builder/create scope (name id)) id config))


(defn cfn-rule-fixed-response-property-builder>
  "The cfn-rule-fixed-response-property-builder> function updates a CfnRule$FixedResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$FixedResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statusCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnRule$FixedResponseProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-rule-fixed-response-property-builder
  "Creates a  `CfnRule$FixedResponseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-fixed-response-property-builder> (new CfnRule$FixedResponseProperty$Builder) id config))


(defn cfn-rule-forward-property-builder>
  "The cfn-rule-forward-property-builder> function updates a CfnRule$ForwardProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$ForwardProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^CfnRule$ForwardProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn cfn-rule-forward-property-builder
  "Creates a  `CfnRule$ForwardProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-forward-property-builder> (new CfnRule$ForwardProperty$Builder) id config))


(defn cfn-rule-header-match-property-builder>
  "The cfn-rule-header-match-property-builder> function updates a CfnRule$HeaderMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$HeaderMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caseSensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-sensitive` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRule$HeaderMatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :case-sensitive)]
    (. builder caseSensitive data))
  (when-some [data (lookup-entry config id :match)]
    (. builder match data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-rule-header-match-property-builder
  "Creates a  `CfnRule$HeaderMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-header-match-property-builder> (new CfnRule$HeaderMatchProperty$Builder) id config))


(defn cfn-rule-header-match-type-property-builder>
  "The cfn-rule-header-match-type-property-builder> function updates a CfnRule$HeaderMatchTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$HeaderMatchTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contains` | java.lang.String | [[cdk.support/lookup-entry]] | `:contains` |
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnRule$HeaderMatchTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :contains)]
    (. builder contains data))
  (when-some [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-rule-header-match-type-property-builder
  "Creates a  `CfnRule$HeaderMatchTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-header-match-type-property-builder> (new CfnRule$HeaderMatchTypeProperty$Builder) id config))


(defn cfn-rule-http-match-property-builder>
  "The cfn-rule-http-match-property-builder> function updates a CfnRule$HttpMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$HttpMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerMatches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-matches` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `pathMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path-match` |
"
  [^CfnRule$HttpMatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header-matches)]
    (. builder headerMatches data))
  (when-some [data (lookup-entry config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :path-match)]
    (. builder pathMatch data))
  (.build builder))


(defn cfn-rule-http-match-property-builder
  "Creates a  `CfnRule$HttpMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-http-match-property-builder> (new CfnRule$HttpMatchProperty$Builder) id config))


(defn cfn-rule-match-property-builder>
  "The cfn-rule-match-property-builder> function updates a CfnRule$MatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$MatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMatch` | software.amazon.awscdk.services.vpclattice.CfnRule$HttpMatchProperty | [[cdk.support/lookup-entry]] | `:http-match` |
"
  [^CfnRule$MatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :http-match)]
    (. builder httpMatch data))
  (.build builder))


(defn cfn-rule-match-property-builder
  "Creates a  `CfnRule$MatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-match-property-builder> (new CfnRule$MatchProperty$Builder) id config))


(defn cfn-rule-path-match-property-builder>
  "The cfn-rule-path-match-property-builder> function updates a CfnRule$PathMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$PathMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caseSensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-sensitive` |
| `match` | software.amazon.awscdk.services.vpclattice.CfnRule$PathMatchTypeProperty | [[cdk.support/lookup-entry]] | `:match` |
"
  [^CfnRule$PathMatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :case-sensitive)]
    (. builder caseSensitive data))
  (when-some [data (lookup-entry config id :match)]
    (. builder match data))
  (.build builder))


(defn cfn-rule-path-match-property-builder
  "Creates a  `CfnRule$PathMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-path-match-property-builder> (new CfnRule$PathMatchProperty$Builder) id config))


(defn cfn-rule-path-match-type-property-builder>
  "The cfn-rule-path-match-type-property-builder> function updates a CfnRule$PathMatchTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$PathMatchTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnRule$PathMatchTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-rule-path-match-type-property-builder
  "Creates a  `CfnRule$PathMatchTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-path-match-type-property-builder> (new CfnRule$PathMatchTypeProperty$Builder) id config))


(defn cfn-rule-props-builder>
  "The cfn-rule-props-builder> function updates a CfnRuleProps$Builder instance using the provided configuration.
  The function takes the CfnRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.vpclattice.CfnRule$ActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `listenerIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-identifier` |
| `match` | software.amazon.awscdk.services.vpclattice.CfnRule$MatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :listener-identifier)]
    (. builder listenerIdentifier data))
  (when-some [data (lookup-entry config id :match)]
    (. builder match data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-rule-props-builder
  "Creates a  `CfnRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-props-builder> (new CfnRuleProps$Builder) id config))


(defn cfn-rule-weighted-target-group-property-builder>
  "The cfn-rule-weighted-target-group-property-builder> function updates a CfnRule$WeightedTargetGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$WeightedTargetGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-identifier` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnRule$WeightedTargetGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group-identifier)]
    (. builder targetGroupIdentifier data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-rule-weighted-target-group-property-builder
  "Creates a  `CfnRule$WeightedTargetGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-weighted-target-group-property-builder> (new CfnRule$WeightedTargetGroupProperty$Builder) id config))


(defn cfn-service-builder>
  "The cfn-service-builder> function updates a CfnService$Builder instance using the provided configuration.
  The function takes the CfnService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `customDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-domain-name` |
| `dnsEntry` | software.amazon.awscdk.services.vpclattice.CfnService$DnsEntryProperty | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnService$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-some [data (lookup-entry config id :custom-domain-name)]
    (. builder customDomainName data))
  (when-some [data (lookup-entry config id :dns-entry)]
    (. builder dnsEntry data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-builder
  "Creates a  `CfnService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-builder> (CfnService$Builder/create scope (name id)) id config))


(defn cfn-service-dns-entry-property-builder>
  "The cfn-service-dns-entry-property-builder> function updates a CfnService$DnsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnService$DnsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
"
  [^CfnService$DnsEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (.build builder))


(defn cfn-service-dns-entry-property-builder
  "Creates a  `CfnService$DnsEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-dns-entry-property-builder> (new CfnService$DnsEntryProperty$Builder) id config))


(defn cfn-service-network-builder>
  "The cfn-service-network-builder> function updates a CfnServiceNetwork$Builder instance using the provided configuration.
  The function takes the CfnServiceNetwork$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceNetwork$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-network-builder
  "Creates a  `CfnServiceNetwork$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-network-builder> (CfnServiceNetwork$Builder/create scope (name id)) id config))


(defn cfn-service-network-props-builder>
  "The cfn-service-network-props-builder> function updates a CfnServiceNetworkProps$Builder instance using the provided configuration.
  The function takes the CfnServiceNetworkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceNetworkProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-network-props-builder
  "Creates a  `CfnServiceNetworkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-network-props-builder> (new CfnServiceNetworkProps$Builder) id config))


(defn cfn-service-network-service-association-builder>
  "The cfn-service-network-service-association-builder> function updates a CfnServiceNetworkServiceAssociation$Builder instance using the provided configuration.
  The function takes the CfnServiceNetworkServiceAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsEntry` | software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation$DnsEntryProperty | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceNetworkServiceAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :dns-entry)]
    (. builder dnsEntry data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :service-network-identifier)]
    (. builder serviceNetworkIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-network-service-association-builder
  "Creates a  `CfnServiceNetworkServiceAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-network-service-association-builder> (CfnServiceNetworkServiceAssociation$Builder/create scope (name id)) id config))


(defn cfn-service-network-service-association-dns-entry-property-builder>
  "The cfn-service-network-service-association-dns-entry-property-builder> function updates a CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
"
  [^CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (.build builder))


(defn cfn-service-network-service-association-dns-entry-property-builder
  "Creates a  `CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-network-service-association-dns-entry-property-builder> (new CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder) id config))


(defn cfn-service-network-service-association-props-builder>
  "The cfn-service-network-service-association-props-builder> function updates a CfnServiceNetworkServiceAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnServiceNetworkServiceAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsEntry` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceNetworkServiceAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dns-entry)]
    (. builder dnsEntry data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :service-network-identifier)]
    (. builder serviceNetworkIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-network-service-association-props-builder
  "Creates a  `CfnServiceNetworkServiceAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-network-service-association-props-builder> (new CfnServiceNetworkServiceAssociationProps$Builder) id config))


(defn cfn-service-network-vpc-association-builder>
  "The cfn-service-network-vpc-association-builder> function updates a CfnServiceNetworkVpcAssociation$Builder instance using the provided configuration.
  The function takes the CfnServiceNetworkVpcAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-identifier` |
"
  [^CfnServiceNetworkVpcAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :service-network-identifier)]
    (. builder serviceNetworkIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-identifier)]
    (. builder vpcIdentifier data))
  (.build builder))


(defn cfn-service-network-vpc-association-builder
  "Creates a  `CfnServiceNetworkVpcAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-network-vpc-association-builder> (CfnServiceNetworkVpcAssociation$Builder/create scope (name id)) id config))


(defn cfn-service-network-vpc-association-props-builder>
  "The cfn-service-network-vpc-association-props-builder> function updates a CfnServiceNetworkVpcAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnServiceNetworkVpcAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-identifier` |
"
  [^CfnServiceNetworkVpcAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :service-network-identifier)]
    (. builder serviceNetworkIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-identifier)]
    (. builder vpcIdentifier data))
  (.build builder))


(defn cfn-service-network-vpc-association-props-builder
  "Creates a  `CfnServiceNetworkVpcAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-network-vpc-association-props-builder> (new CfnServiceNetworkVpcAssociationProps$Builder) id config))


(defn cfn-service-props-builder>
  "The cfn-service-props-builder> function updates a CfnServiceProps$Builder instance using the provided configuration.
  The function takes the CfnServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `customDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-domain-name` |
| `dnsEntry` | software.amazon.awscdk.services.vpclattice.CfnService$DnsEntryProperty | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-some [data (lookup-entry config id :custom-domain-name)]
    (. builder customDomainName data))
  (when-some [data (lookup-entry config id :dns-entry)]
    (. builder dnsEntry data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-props-builder
  "Creates a  `CfnServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-props-builder> (new CfnServiceProps$Builder) id config))


(defn cfn-target-group-builder>
  "The cfn-target-group-builder> function updates a CfnTargetGroup$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTargetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :config)]
    (. builder config data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-target-group-builder
  "Creates a  `CfnTargetGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-target-group-builder> (CfnTargetGroup$Builder/create scope (name id)) id config))


(defn cfn-target-group-health-check-config-property-builder>
  "The cfn-target-group-health-check-config-property-builder> function updates a CfnTargetGroup$HealthCheckConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$HealthCheckConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `healthCheckIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-interval-seconds` |
| `healthCheckTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-timeout-seconds` |
| `healthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold-count` |
| `matcher` | software.amazon.awscdk.services.vpclattice.CfnTargetGroup$MatcherProperty | [[cdk.support/lookup-entry]] | `:matcher` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `protocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-version` |
| `unhealthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold-count` |
"
  [^CfnTargetGroup$HealthCheckConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :health-check-interval-seconds)]
    (. builder healthCheckIntervalSeconds data))
  (when-some [data (lookup-entry config id :health-check-timeout-seconds)]
    (. builder healthCheckTimeoutSeconds data))
  (when-some [data (lookup-entry config id :healthy-threshold-count)]
    (. builder healthyThresholdCount data))
  (when-some [data (lookup-entry config id :matcher)]
    (. builder matcher data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :unhealthy-threshold-count)]
    (. builder unhealthyThresholdCount data))
  (.build builder))


(defn cfn-target-group-health-check-config-property-builder
  "Creates a  `CfnTargetGroup$HealthCheckConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-target-group-health-check-config-property-builder> (new CfnTargetGroup$HealthCheckConfigProperty$Builder) id config))


(defn cfn-target-group-matcher-property-builder>
  "The cfn-target-group-matcher-property-builder> function updates a CfnTargetGroup$MatcherProperty$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$MatcherProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-code` |
"
  [^CfnTargetGroup$MatcherProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :http-code)]
    (. builder httpCode data))
  (.build builder))


(defn cfn-target-group-matcher-property-builder
  "Creates a  `CfnTargetGroup$MatcherProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-target-group-matcher-property-builder> (new CfnTargetGroup$MatcherProperty$Builder) id config))


(defn cfn-target-group-props-builder>
  "The cfn-target-group-props-builder> function updates a CfnTargetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnTargetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTargetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :config)]
    (. builder config data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-target-group-props-builder
  "Creates a  `CfnTargetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-target-group-props-builder> (new CfnTargetGroupProps$Builder) id config))


(defn cfn-target-group-target-group-config-property-builder>
  "The cfn-target-group-target-group-config-property-builder> function updates a CfnTargetGroup$TargetGroupConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$TargetGroupConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `lambdaEventStructureVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-event-structure-version` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `protocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-version` |
| `vpcIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-identifier` |
"
  [^CfnTargetGroup$TargetGroupConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :lambda-event-structure-version)]
    (. builder lambdaEventStructureVersion data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :vpc-identifier)]
    (. builder vpcIdentifier data))
  (.build builder))


(defn cfn-target-group-target-group-config-property-builder
  "Creates a  `CfnTargetGroup$TargetGroupConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-target-group-target-group-config-property-builder> (new CfnTargetGroup$TargetGroupConfigProperty$Builder) id config))


(defn cfn-target-group-target-property-builder>
  "The cfn-target-group-target-property-builder> function updates a CfnTargetGroup$TargetProperty$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$TargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnTargetGroup$TargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-target-group-target-property-builder
  "Creates a  `CfnTargetGroup$TargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-target-group-target-property-builder> (new CfnTargetGroup$TargetProperty$Builder) id config))