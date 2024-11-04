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


(defn cfn-accessor-builder
  "The cfn-accessor-builder function buildes out new instances of 
CfnAccessor$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:accessor-type` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAccessor$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accessor-type)]
      (. builder accessorType data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-accessor-props-builder
  "The cfn-accessor-props-builder function buildes out new instances of 
CfnAccessorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:accessor-type` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAccessorProps$Builder.)]
    (when-let [data (lookup-entry config id :accessor-type)]
      (. builder accessorType data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-member-approval-threshold-policy-property-builder
  "The cfn-member-approval-threshold-policy-property-builder function buildes out new instances of 
CfnMember$ApprovalThresholdPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `proposalDurationInHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:proposal-duration-in-hours` |
| `thresholdComparator` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-comparator` |
| `thresholdPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-percentage` |"
  [stack id config]
  (let [builder (CfnMember$ApprovalThresholdPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :proposal-duration-in-hours)]
      (. builder proposalDurationInHours data))
    (when-let [data (lookup-entry config id :threshold-comparator)]
      (. builder thresholdComparator data))
    (when-let [data (lookup-entry config id :threshold-percentage)]
      (. builder thresholdPercentage data))
    (.build builder)))


(defn cfn-member-builder
  "The cfn-member-builder function buildes out new instances of 
CfnMember$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `memberConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-configuration` |
| `networkConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |"
  [stack id config]
  (let [builder (CfnMember$Builder/create stack id)]
    (when-let [data (lookup-entry config id :invitation-id)]
      (. builder invitationId data))
    (when-let [data (lookup-entry config id :member-configuration)]
      (. builder memberConfiguration data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :network-id)]
      (. builder networkId data))
    (.build builder)))


(defn cfn-member-member-configuration-property-builder
  "The cfn-member-member-configuration-property-builder function buildes out new instances of 
CfnMember$MemberConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `memberFrameworkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-framework-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnMember$MemberConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :member-framework-configuration)]
      (. builder memberFrameworkConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-member-member-fabric-configuration-property-builder
  "The cfn-member-member-fabric-configuration-property-builder function buildes out new instances of 
CfnMember$MemberFabricConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-password` |
| `adminUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-username` |"
  [stack id config]
  (let [builder (CfnMember$MemberFabricConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :admin-password)]
      (. builder adminPassword data))
    (when-let [data (lookup-entry config id :admin-username)]
      (. builder adminUsername data))
    (.build builder)))


(defn cfn-member-member-framework-configuration-property-builder
  "The cfn-member-member-framework-configuration-property-builder function buildes out new instances of 
CfnMember$MemberFrameworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `memberFabricConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$MemberFabricConfigurationProperty | [[cdk.support/lookup-entry]] | `:member-fabric-configuration` |"
  [stack id config]
  (let [builder (CfnMember$MemberFrameworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :member-fabric-configuration)]
      (. builder memberFabricConfiguration data))
    (.build builder)))


(defn cfn-member-network-configuration-property-builder
  "The cfn-member-network-configuration-property-builder function buildes out new instances of 
CfnMember$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `framework` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework` |
| `frameworkVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkFrameworkConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$NetworkFrameworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-framework-configuration` |
| `votingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:voting-policy` |"
  [stack id config]
  (let [builder (CfnMember$NetworkConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-member-network-fabric-configuration-property-builder
  "The cfn-member-network-fabric-configuration-property-builder function buildes out new instances of 
CfnMember$NetworkFabricConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |"
  [stack id config]
  (let [builder (CfnMember$NetworkFabricConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :edition)]
      (. builder edition data))
    (.build builder)))


(defn cfn-member-network-framework-configuration-property-builder
  "The cfn-member-network-framework-configuration-property-builder function buildes out new instances of 
CfnMember$NetworkFrameworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkFabricConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$NetworkFabricConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-fabric-configuration` |"
  [stack id config]
  (let [builder (CfnMember$NetworkFrameworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :network-fabric-configuration)]
      (. builder networkFabricConfiguration data))
    (.build builder)))


(defn cfn-member-props-builder
  "The cfn-member-props-builder function buildes out new instances of 
CfnMemberProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invitationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:invitation-id` |
| `memberConfiguration` | software.amazon.awscdk.services.managedblockchain.CfnMember$MemberConfigurationProperty | [[cdk.support/lookup-entry]] | `:member-configuration` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |"
  [stack id config]
  (let [builder (CfnMemberProps$Builder.)]
    (when-let [data (lookup-entry config id :invitation-id)]
      (. builder invitationId data))
    (when-let [data (lookup-entry config id :member-configuration)]
      (. builder memberConfiguration data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :network-id)]
      (. builder networkId data))
    (.build builder)))


(defn cfn-member-voting-policy-property-builder
  "The cfn-member-voting-policy-property-builder function buildes out new instances of 
CfnMember$VotingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approvalThresholdPolicy` | software.amazon.awscdk.services.managedblockchain.CfnMember$ApprovalThresholdPolicyProperty | [[cdk.support/lookup-entry]] | `:approval-threshold-policy` |"
  [stack id config]
  (let [builder (CfnMember$VotingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :approval-threshold-policy)]
      (. builder approvalThresholdPolicy data))
    (.build builder)))


(defn cfn-node-builder
  "The cfn-node-builder function buildes out new instances of 
CfnNode$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |
| `nodeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:node-configuration` |"
  [stack id config]
  (let [builder (CfnNode$Builder/create stack id)]
    (when-let [data (lookup-entry config id :member-id)]
      (. builder memberId data))
    (when-let [data (lookup-entry config id :network-id)]
      (. builder networkId data))
    (when-let [data (lookup-entry config id :node-configuration)]
      (. builder nodeConfiguration data))
    (.build builder)))


(defn cfn-node-node-configuration-property-builder
  "The cfn-node-node-configuration-property-builder function buildes out new instances of 
CfnNode$NodeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |"
  [stack id config]
  (let [builder (CfnNode$NodeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (.build builder)))


(defn cfn-node-props-builder
  "The cfn-node-props-builder function buildes out new instances of 
CfnNodeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |
| `nodeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:node-configuration` |"
  [stack id config]
  (let [builder (CfnNodeProps$Builder.)]
    (when-let [data (lookup-entry config id :member-id)]
      (. builder memberId data))
    (when-let [data (lookup-entry config id :network-id)]
      (. builder networkId data))
    (when-let [data (lookup-entry config id :node-configuration)]
      (. builder nodeConfiguration data))
    (.build builder)))