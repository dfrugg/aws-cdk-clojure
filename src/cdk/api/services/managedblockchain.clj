(ns cdk.api.services.managedblockchain
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.managedblockchain package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.managedblockchain CfnAccessor$Builder
                                                              CfnAccessorProps$Builder
                                                              CfnMember$ApprovalThresholdPolicyProperty$Builder
                                                              CfnMember$Builder
                                                              CfnMember$MemberConfigurationProperty$Builder
                                                              CfnMember$MemberFabricConfigurationProperty$Builder
                                                              CfnMember$MemberFrameworkConfigurationProperty$Builder
                                                              CfnMember$NetworkConfigurationProperty$Builder
                                                              CfnMember$NetworkFabricConfigurationProperty$Builder
                                                              CfnMember$NetworkFrameworkConfigurationProperty$Builder
                                                              CfnMember$VotingPolicyProperty$Builder
                                                              CfnMemberProps$Builder
                                                              CfnNode$Builder
                                                              CfnNode$NodeConfigurationProperty$Builder
                                                              CfnNodeProps$Builder]))


(defn build-cfn-accessor-builder
  "The build-cfn-accessor-builder function updates a CfnAccessor$Builder instance using the provided configuration.
  The function takes the CfnAccessor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:accessor-type` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessor$Builder builder id config]
  (when-let [data (lookup-entry config id :accessor-type)]
    (. builder accessorType data))
  (when-let [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-accessor-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-accessor-builder (CfnAccessor$Builder/create scope (name id)) id config))


(defn build-cfn-accessor-props-builder
  "The build-cfn-accessor-props-builder function updates a CfnAccessorProps$Builder instance using the provided configuration.
  The function takes the CfnAccessorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:accessor-type` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessorProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accessor-type)]
    (. builder accessorType data))
  (when-let [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-accessor-props-builder
  ""
  [id config]
  (build-cfn-accessor-props-builder (new CfnAccessorProps$Builder) id config))


(defn build-cfn-member-approval-threshold-policy-property-builder
  "The build-cfn-member-approval-threshold-policy-property-builder function updates a CfnMember$ApprovalThresholdPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$ApprovalThresholdPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `proposalDurationInHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:proposal-duration-in-hours` |
| `thresholdComparator` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-comparator` |
| `thresholdPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-percentage` |
"
  [^CfnMember$ApprovalThresholdPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :proposal-duration-in-hours)]
    (. builder proposalDurationInHours data))
  (when-let [data (lookup-entry config id :threshold-comparator)]
    (. builder thresholdComparator data))
  (when-let [data (lookup-entry config id :threshold-percentage)]
    (. builder thresholdPercentage data))
  (.build builder))


(defn cfn-member-approval-threshold-policy-property-builder
  ""
  [id config]
  (build-cfn-member-approval-threshold-policy-property-builder (new CfnMember$ApprovalThresholdPolicyProperty$Builder) id config))


(defn build-cfn-member-builder
  "The build-cfn-member-builder function updates a CfnMember$Builder instance using the provided configuration.
  The function takes the CfnMember$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `memberConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-configuration` |
| `networkConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |
"
  [^CfnMember$Builder builder id config]
  (when-let [data (lookup-entry config id :invitation-id)]
    (. builder invitationId data))
  (when-let [data (lookup-entry config id :member-configuration)]
    (. builder memberConfiguration data))
  (when-let [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-let [data (lookup-entry config id :network-id)]
    (. builder networkId data))
  (.build builder))


(defn cfn-member-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-member-builder (CfnMember$Builder/create scope (name id)) id config))


(defn build-cfn-member-member-configuration-property-builder
  "The build-cfn-member-member-configuration-property-builder function updates a CfnMember$MemberConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$MemberConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `memberFrameworkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-framework-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnMember$MemberConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :member-framework-configuration)]
    (. builder memberFrameworkConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-member-member-configuration-property-builder
  ""
  [id config]
  (build-cfn-member-member-configuration-property-builder (new CfnMember$MemberConfigurationProperty$Builder) id config))


(defn build-cfn-member-member-fabric-configuration-property-builder
  "The build-cfn-member-member-fabric-configuration-property-builder function updates a CfnMember$MemberFabricConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$MemberFabricConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-password` |
| `adminUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-username` |
"
  [^CfnMember$MemberFabricConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :admin-password)]
    (. builder adminPassword data))
  (when-let [data (lookup-entry config id :admin-username)]
    (. builder adminUsername data))
  (.build builder))


(defn cfn-member-member-fabric-configuration-property-builder
  ""
  [id config]
  (build-cfn-member-member-fabric-configuration-property-builder (new CfnMember$MemberFabricConfigurationProperty$Builder) id config))


(defn build-cfn-member-member-framework-configuration-property-builder
  "The build-cfn-member-member-framework-configuration-property-builder function updates a CfnMember$MemberFrameworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$MemberFrameworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `memberFabricConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$MemberFabricConfigurationProperty | [[cdk.support/lookup-entry]] | `:member-fabric-configuration` |
"
  [^CfnMember$MemberFrameworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :member-fabric-configuration)]
    (. builder memberFabricConfiguration data))
  (.build builder))


(defn cfn-member-member-framework-configuration-property-builder
  ""
  [id config]
  (build-cfn-member-member-framework-configuration-property-builder (new CfnMember$MemberFrameworkConfigurationProperty$Builder) id config))


(defn build-cfn-member-network-configuration-property-builder
  "The build-cfn-member-network-configuration-property-builder function updates a CfnMember$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `framework` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework` |
| `frameworkVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkFrameworkConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$NetworkFrameworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-framework-configuration` |
| `votingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:voting-policy` |
"
  [^CfnMember$NetworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :framework)]
    (. builder framework data))
  (when-let [data (lookup-entry config id :framework-version)]
    (. builder frameworkVersion data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :network-framework-configuration)]
    (. builder networkFrameworkConfiguration data))
  (when-let [data (lookup-entry config id :voting-policy)]
    (. builder votingPolicy data))
  (.build builder))


(defn cfn-member-network-configuration-property-builder
  ""
  [id config]
  (build-cfn-member-network-configuration-property-builder (new CfnMember$NetworkConfigurationProperty$Builder) id config))


(defn build-cfn-member-network-fabric-configuration-property-builder
  "The build-cfn-member-network-fabric-configuration-property-builder function updates a CfnMember$NetworkFabricConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$NetworkFabricConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |
"
  [^CfnMember$NetworkFabricConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :edition)]
    (. builder edition data))
  (.build builder))


(defn cfn-member-network-fabric-configuration-property-builder
  ""
  [id config]
  (build-cfn-member-network-fabric-configuration-property-builder (new CfnMember$NetworkFabricConfigurationProperty$Builder) id config))


(defn build-cfn-member-network-framework-configuration-property-builder
  "The build-cfn-member-network-framework-configuration-property-builder function updates a CfnMember$NetworkFrameworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$NetworkFrameworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkFabricConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$NetworkFabricConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-fabric-configuration` |
"
  [^CfnMember$NetworkFrameworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :network-fabric-configuration)]
    (. builder networkFabricConfiguration data))
  (.build builder))


(defn cfn-member-network-framework-configuration-property-builder
  ""
  [id config]
  (build-cfn-member-network-framework-configuration-property-builder (new CfnMember$NetworkFrameworkConfigurationProperty$Builder) id config))


(defn build-cfn-member-props-builder
  "The build-cfn-member-props-builder function updates a CfnMemberProps$Builder instance using the provided configuration.
  The function takes the CfnMemberProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `memberConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$MemberConfigurationProperty | [[cdk.support/lookup-entry]] | `:member-configuration` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |
"
  [^CfnMemberProps$Builder builder id config]
  (when-let [data (lookup-entry config id :invitation-id)]
    (. builder invitationId data))
  (when-let [data (lookup-entry config id :member-configuration)]
    (. builder memberConfiguration data))
  (when-let [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-let [data (lookup-entry config id :network-id)]
    (. builder networkId data))
  (.build builder))


(defn cfn-member-props-builder
  ""
  [id config]
  (build-cfn-member-props-builder (new CfnMemberProps$Builder) id config))


(defn build-cfn-member-voting-policy-property-builder
  "The build-cfn-member-voting-policy-property-builder function updates a CfnMember$VotingPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnMember$VotingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approvalThresholdPolicy` | software.amazon.awscdk.services.managedblockchain.CfnMember$ApprovalThresholdPolicyProperty | [[cdk.support/lookup-entry]] | `:approval-threshold-policy` |
"
  [^CfnMember$VotingPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :approval-threshold-policy)]
    (. builder approvalThresholdPolicy data))
  (.build builder))


(defn cfn-member-voting-policy-property-builder
  ""
  [id config]
  (build-cfn-member-voting-policy-property-builder (new CfnMember$VotingPolicyProperty$Builder) id config))


(defn build-cfn-node-builder
  "The build-cfn-node-builder function updates a CfnNode$Builder instance using the provided configuration.
  The function takes the CfnNode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |
| `nodeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:node-configuration` |
"
  [^CfnNode$Builder builder id config]
  (when-let [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (when-let [data (lookup-entry config id :network-id)]
    (. builder networkId data))
  (when-let [data (lookup-entry config id :node-configuration)]
    (. builder nodeConfiguration data))
  (.build builder))


(defn cfn-node-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-node-builder (CfnNode$Builder/create scope (name id)) id config))


(defn build-cfn-node-node-configuration-property-builder
  "The build-cfn-node-node-configuration-property-builder function updates a CfnNode$NodeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnNode$NodeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
"
  [^CfnNode$NodeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (.build builder))


(defn cfn-node-node-configuration-property-builder
  ""
  [id config]
  (build-cfn-node-node-configuration-property-builder (new CfnNode$NodeConfigurationProperty$Builder) id config))


(defn build-cfn-node-props-builder
  "The build-cfn-node-props-builder function updates a CfnNodeProps$Builder instance using the provided configuration.
  The function takes the CfnNodeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |
| `nodeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:node-configuration` |
"
  [^CfnNodeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (when-let [data (lookup-entry config id :network-id)]
    (. builder networkId data))
  (when-let [data (lookup-entry config id :node-configuration)]
    (. builder nodeConfiguration data))
  (.build builder))


(defn cfn-node-props-builder
  ""
  [id config]
  (build-cfn-node-props-builder (new CfnNodeProps$Builder) id config))