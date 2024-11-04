(ns cdk.api.services.globalaccelerator.endpoints
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.globalaccelerator.endpoints package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.globalaccelerator.endpoints ApplicationLoadBalancerEndpoint$Builder
                                                                        ApplicationLoadBalancerEndpointOptions$Builder
                                                                        CfnEipEndpoint$Builder
                                                                        CfnEipEndpointProps$Builder
                                                                        InstanceEndpoint$Builder
                                                                        InstanceEndpointProps$Builder
                                                                        NetworkLoadBalancerEndpoint$Builder
                                                                        NetworkLoadBalancerEndpointProps$Builder]))


(defn application-load-balancer-endpoint-builder
  "The application-load-balancer-endpoint-builder function buildes out new instances of 
ApplicationLoadBalancerEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config ^software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer load-balancer]
  (let [builder (ApplicationLoadBalancerEndpoint$Builder/create ^software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer load-balancer)]
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn application-load-balancer-endpoint-options-builder
  "The application-load-balancer-endpoint-options-builder function buildes out new instances of 
ApplicationLoadBalancerEndpointOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancerEndpointOptions$Builder.)]
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-eip-endpoint-builder
  "The cfn-eip-endpoint-builder function buildes out new instances of 
CfnEipEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config ^software.amazon.awscdk.services.ec2.CfnEIP eip]
  (let [builder (CfnEipEndpoint$Builder/create ^software.amazon.awscdk.services.ec2.CfnEIP eip)]
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-eip-endpoint-props-builder
  "The cfn-eip-endpoint-props-builder function buildes out new instances of 
CfnEipEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnEipEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn instance-endpoint-builder
  "The instance-endpoint-builder function buildes out new instances of 
InstanceEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config ^software.amazon.awscdk.services.ec2.IInstance endpoint-instance]
  (let [builder (InstanceEndpoint$Builder/create ^software.amazon.awscdk.services.ec2.IInstance endpoint-instance)]
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn instance-endpoint-props-builder
  "The instance-endpoint-props-builder function buildes out new instances of 
InstanceEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (InstanceEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn network-load-balancer-endpoint-builder
  "The network-load-balancer-endpoint-builder function buildes out new instances of 
NetworkLoadBalancerEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config ^software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer load-balancer]
  (let [builder (NetworkLoadBalancerEndpoint$Builder/create ^software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer load-balancer)]
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn network-load-balancer-endpoint-props-builder
  "The network-load-balancer-endpoint-props-builder function buildes out new instances of 
NetworkLoadBalancerEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (NetworkLoadBalancerEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))