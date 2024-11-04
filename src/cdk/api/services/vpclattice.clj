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


(defn cfn-access-log-subscription-builder
  "The cfn-access-log-subscription-builder function buildes out new instances of 
CfnAccessLogSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAccessLogSubscription$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-access-log-subscription-props-builder
  "The cfn-access-log-subscription-props-builder function buildes out new instances of 
CfnAccessLogSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAccessLogSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-auth-policy-builder
  "The cfn-auth-policy-builder function buildes out new instances of 
CfnAuthPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |"
  [stack id config]
  (let [builder (CfnAuthPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (.build builder)))


(defn cfn-auth-policy-props-builder
  "The cfn-auth-policy-props-builder function buildes out new instances of 
CfnAuthPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |"
  [stack id config]
  (let [builder (CfnAuthPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (.build builder)))


(defn cfn-listener-builder
  "The cfn-listener-builder function buildes out new instances of 
CfnListener$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.services.vpclattice.CfnListener$DefaultActionProperty | [[cdk.support/lookup-entry]] | `:default-action` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnListener$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :service-identifier)]
      (. builder serviceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-listener-default-action-property-builder
  "The cfn-listener-default-action-property-builder function buildes out new instances of 
CfnListener$DefaultActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fixedResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fixed-response` |
| `forward` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward` |"
  [stack id config]
  (let [builder (CfnListener$DefaultActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :fixed-response)]
      (. builder fixedResponse data))
    (when-let [data (lookup-entry config id :forward)]
      (. builder forward data))
    (.build builder)))


(defn cfn-listener-fixed-response-property-builder
  "The cfn-listener-fixed-response-property-builder function buildes out new instances of 
CfnListener$FixedResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statusCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnListener$FixedResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-listener-forward-property-builder
  "The cfn-listener-forward-property-builder function buildes out new instances of 
CfnListener$ForwardProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (CfnListener$ForwardProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn cfn-listener-props-builder
  "The cfn-listener-props-builder function buildes out new instances of 
CfnListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.services.vpclattice.CfnListener$DefaultActionProperty | [[cdk.support/lookup-entry]] | `:default-action` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnListenerProps$Builder.)]
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :service-identifier)]
      (. builder serviceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-listener-weighted-target-group-property-builder
  "The cfn-listener-weighted-target-group-property-builder function buildes out new instances of 
CfnListener$WeightedTargetGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-identifier` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnListener$WeightedTargetGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-group-identifier)]
      (. builder targetGroupIdentifier data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-resource-policy-builder
  "The cfn-resource-policy-builder function buildes out new instances of 
CfnResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-resource-policy-props-builder
  "The cfn-resource-policy-props-builder function buildes out new instances of 
CfnResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-rule-action-property-builder
  "The cfn-rule-action-property-builder function buildes out new instances of 
CfnRule$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fixedResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fixed-response` |
| `forward` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward` |"
  [stack id config]
  (let [builder (CfnRule$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :fixed-response)]
      (. builder fixedResponse data))
    (when-let [data (lookup-entry config id :forward)]
      (. builder forward data))
    (.build builder)))


(defn cfn-rule-builder
  "The cfn-rule-builder function buildes out new instances of 
CfnRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.vpclattice.CfnRule$ActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `listenerIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-identifier` |
| `match` | software.amazon.awscdk.services.vpclattice.CfnRule$MatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :listener-identifier)]
      (. builder listenerIdentifier data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :service-identifier)]
      (. builder serviceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-rule-fixed-response-property-builder
  "The cfn-rule-fixed-response-property-builder function buildes out new instances of 
CfnRule$FixedResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statusCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnRule$FixedResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-rule-forward-property-builder
  "The cfn-rule-forward-property-builder function buildes out new instances of 
CfnRule$ForwardProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (CfnRule$ForwardProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn cfn-rule-header-match-property-builder
  "The cfn-rule-header-match-property-builder function buildes out new instances of 
CfnRule$HeaderMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caseSensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-sensitive` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRule$HeaderMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :case-sensitive)]
      (. builder caseSensitive data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-rule-header-match-type-property-builder
  "The cfn-rule-header-match-type-property-builder function buildes out new instances of 
CfnRule$HeaderMatchTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contains` | java.lang.String | [[cdk.support/lookup-entry]] | `:contains` |
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnRule$HeaderMatchTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :contains)]
      (. builder contains data))
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-rule-http-match-property-builder
  "The cfn-rule-http-match-property-builder function buildes out new instances of 
CfnRule$HttpMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerMatches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-matches` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `pathMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path-match` |"
  [stack id config]
  (let [builder (CfnRule$HttpMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-matches)]
      (. builder headerMatches data))
    (when-let [data (lookup-entry config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :path-match)]
      (. builder pathMatch data))
    (.build builder)))


(defn cfn-rule-match-property-builder
  "The cfn-rule-match-property-builder function buildes out new instances of 
CfnRule$MatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMatch` | software.amazon.awscdk.services.vpclattice.CfnRule$HttpMatchProperty | [[cdk.support/lookup-entry]] | `:http-match` |"
  [stack id config]
  (let [builder (CfnRule$MatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-match)]
      (. builder httpMatch data))
    (.build builder)))


(defn cfn-rule-path-match-property-builder
  "The cfn-rule-path-match-property-builder function buildes out new instances of 
CfnRule$PathMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caseSensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-sensitive` |
| `match` | software.amazon.awscdk.services.vpclattice.CfnRule$PathMatchTypeProperty | [[cdk.support/lookup-entry]] | `:match` |"
  [stack id config]
  (let [builder (CfnRule$PathMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :case-sensitive)]
      (. builder caseSensitive data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (.build builder)))


(defn cfn-rule-path-match-type-property-builder
  "The cfn-rule-path-match-type-property-builder function buildes out new instances of 
CfnRule$PathMatchTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnRule$PathMatchTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-rule-props-builder
  "The cfn-rule-props-builder function buildes out new instances of 
CfnRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.vpclattice.CfnRule$ActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `listenerIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-identifier` |
| `match` | software.amazon.awscdk.services.vpclattice.CfnRule$MatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :listener-identifier)]
      (. builder listenerIdentifier data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :service-identifier)]
      (. builder serviceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-rule-weighted-target-group-property-builder
  "The cfn-rule-weighted-target-group-property-builder function buildes out new instances of 
CfnRule$WeightedTargetGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-identifier` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnRule$WeightedTargetGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-group-identifier)]
      (. builder targetGroupIdentifier data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-service-builder
  "The cfn-service-builder function buildes out new instances of 
CfnService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `customDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-domain-name` |
| `dnsEntry` | software.amazon.awscdk.services.vpclattice.CfnService$DnsEntryProperty | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :custom-domain-name)]
      (. builder customDomainName data))
    (when-let [data (lookup-entry config id :dns-entry)]
      (. builder dnsEntry data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-dns-entry-property-builder
  "The cfn-service-dns-entry-property-builder function buildes out new instances of 
CfnService$DnsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |"
  [stack id config]
  (let [builder (CfnService$DnsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (.build builder)))


(defn cfn-service-network-builder
  "The cfn-service-network-builder function buildes out new instances of 
CfnServiceNetwork$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceNetwork$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-network-props-builder
  "The cfn-service-network-props-builder function buildes out new instances of 
CfnServiceNetworkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceNetworkProps$Builder.)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-network-service-association-builder
  "The cfn-service-network-service-association-builder function buildes out new instances of 
CfnServiceNetworkServiceAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsEntry` | software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation$DnsEntryProperty | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceNetworkServiceAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dns-entry)]
      (. builder dnsEntry data))
    (when-let [data (lookup-entry config id :service-identifier)]
      (. builder serviceIdentifier data))
    (when-let [data (lookup-entry config id :service-network-identifier)]
      (. builder serviceNetworkIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-network-service-association-dns-entry-property-builder
  "The cfn-service-network-service-association-dns-entry-property-builder function buildes out new instances of 
CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |"
  [stack id config]
  (let [builder (CfnServiceNetworkServiceAssociation$DnsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (.build builder)))


(defn cfn-service-network-service-association-props-builder
  "The cfn-service-network-service-association-props-builder function buildes out new instances of 
CfnServiceNetworkServiceAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsEntry` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceNetworkServiceAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :dns-entry)]
      (. builder dnsEntry data))
    (when-let [data (lookup-entry config id :service-identifier)]
      (. builder serviceIdentifier data))
    (when-let [data (lookup-entry config id :service-network-identifier)]
      (. builder serviceNetworkIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-network-vpc-association-builder
  "The cfn-service-network-vpc-association-builder function buildes out new instances of 
CfnServiceNetworkVpcAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-identifier` |"
  [stack id config]
  (let [builder (CfnServiceNetworkVpcAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :service-network-identifier)]
      (. builder serviceNetworkIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-identifier)]
      (. builder vpcIdentifier data))
    (.build builder)))


(defn cfn-service-network-vpc-association-props-builder
  "The cfn-service-network-vpc-association-props-builder function buildes out new instances of 
CfnServiceNetworkVpcAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serviceNetworkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-network-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-identifier` |"
  [stack id config]
  (let [builder (CfnServiceNetworkVpcAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :service-network-identifier)]
      (. builder serviceNetworkIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-identifier)]
      (. builder vpcIdentifier data))
    (.build builder)))


(defn cfn-service-props-builder
  "The cfn-service-props-builder function buildes out new instances of 
CfnServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `customDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-domain-name` |
| `dnsEntry` | software.amazon.awscdk.services.vpclattice.CfnService$DnsEntryProperty | [[cdk.support/lookup-entry]] | `:dns-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :custom-domain-name)]
      (. builder customDomainName data))
    (when-let [data (lookup-entry config id :dns-entry)]
      (. builder dnsEntry data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-target-group-builder
  "The cfn-target-group-builder function buildes out new instances of 
CfnTargetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTargetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config)]
      (. builder config data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-target-group-health-check-config-property-builder
  "The cfn-target-group-health-check-config-property-builder function buildes out new instances of 
CfnTargetGroup$HealthCheckConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `unhealthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold-count` |"
  [stack id config]
  (let [builder (CfnTargetGroup$HealthCheckConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :health-check-interval-seconds)]
      (. builder healthCheckIntervalSeconds data))
    (when-let [data (lookup-entry config id :health-check-timeout-seconds)]
      (. builder healthCheckTimeoutSeconds data))
    (when-let [data (lookup-entry config id :healthy-threshold-count)]
      (. builder healthyThresholdCount data))
    (when-let [data (lookup-entry config id :matcher)]
      (. builder matcher data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :unhealthy-threshold-count)]
      (. builder unhealthyThresholdCount data))
    (.build builder)))


(defn cfn-target-group-matcher-property-builder
  "The cfn-target-group-matcher-property-builder function buildes out new instances of 
CfnTargetGroup$MatcherProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-code` |"
  [stack id config]
  (let [builder (CfnTargetGroup$MatcherProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-code)]
      (. builder httpCode data))
    (.build builder)))


(defn cfn-target-group-props-builder
  "The cfn-target-group-props-builder function buildes out new instances of 
CfnTargetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTargetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :config)]
      (. builder config data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-target-group-target-group-config-property-builder
  "The cfn-target-group-target-group-config-property-builder function buildes out new instances of 
CfnTargetGroup$TargetGroupConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `lambdaEventStructureVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-event-structure-version` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `protocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-version` |
| `vpcIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-identifier` |"
  [stack id config]
  (let [builder (CfnTargetGroup$TargetGroupConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :lambda-event-structure-version)]
      (. builder lambdaEventStructureVersion data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :vpc-identifier)]
      (. builder vpcIdentifier data))
    (.build builder)))


(defn cfn-target-group-target-property-builder
  "The cfn-target-group-target-property-builder function buildes out new instances of 
CfnTargetGroup$TargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnTargetGroup$TargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))