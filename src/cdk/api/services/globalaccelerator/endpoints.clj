(ns cdk.api.services.globalaccelerator.endpoints
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.globalaccelerator.endpoints package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ec2 CfnEIP
                                                IInstance]
           [software.amazon.awscdk.services.elasticloadbalancingv2 IApplicationLoadBalancer
                                                                   INetworkLoadBalancer]
           [software.amazon.awscdk.services.globalaccelerator.endpoints ApplicationLoadBalancerEndpoint$Builder
                                                                        ApplicationLoadBalancerEndpointOptions$Builder
                                                                        CfnEipEndpoint$Builder
                                                                        CfnEipEndpointProps$Builder
                                                                        InstanceEndpoint$Builder
                                                                        InstanceEndpointProps$Builder
                                                                        NetworkLoadBalancerEndpoint$Builder
                                                                        NetworkLoadBalancerEndpointProps$Builder]))


(defn application-load-balancer-endpoint-builder>
  "The application-load-balancer-endpoint-builder> function updates a ApplicationLoadBalancerEndpoint$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^ApplicationLoadBalancerEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn application-load-balancer-endpoint-builder
  "Creates a  `ApplicationLoadBalancerEndpoint$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer]___
| Argument | DataType | Description |
|---|---|---|
| load-balancer | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^IApplicationLoadBalancer load-balancer id config]
  (application-load-balancer-endpoint-builder> (ApplicationLoadBalancerEndpoint$Builder/create load-balancer) id config))


(defn application-load-balancer-endpoint-options-builder>
  "The application-load-balancer-endpoint-options-builder> function updates a ApplicationLoadBalancerEndpointOptions$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerEndpointOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^ApplicationLoadBalancerEndpointOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn application-load-balancer-endpoint-options-builder
  "Creates a  `ApplicationLoadBalancerEndpointOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-load-balancer-endpoint-options-builder> (new ApplicationLoadBalancerEndpointOptions$Builder) id config))


(defn cfn-eip-endpoint-builder>
  "The cfn-eip-endpoint-builder> function updates a CfnEipEndpoint$Builder instance using the provided configuration.
  The function takes the CfnEipEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnEipEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-eip-endpoint-builder
  "Creates a  `CfnEipEndpoint$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.ec2.CfnEIP]___
| Argument | DataType | Description |
|---|---|---|
| eip | software.amazon.awscdk.services.ec2.CfnEIP |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^CfnEIP eip id config]
  (cfn-eip-endpoint-builder> (CfnEipEndpoint$Builder/create eip) id config))


(defn cfn-eip-endpoint-props-builder>
  "The cfn-eip-endpoint-props-builder> function updates a CfnEipEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnEipEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnEipEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-eip-endpoint-props-builder
  "Creates a  `CfnEipEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-eip-endpoint-props-builder> (new CfnEipEndpointProps$Builder) id config))


(defn instance-endpoint-builder>
  "The instance-endpoint-builder> function updates a InstanceEndpoint$Builder instance using the provided configuration.
  The function takes the InstanceEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^InstanceEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn instance-endpoint-builder
  "Creates a  `InstanceEndpoint$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.ec2.IInstance]___
| Argument | DataType | Description |
|---|---|---|
| endpoint-instance | software.amazon.awscdk.services.ec2.IInstance |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^IInstance endpoint-instance id config]
  (instance-endpoint-builder> (InstanceEndpoint$Builder/create endpoint-instance) id config))


(defn instance-endpoint-props-builder>
  "The instance-endpoint-props-builder> function updates a InstanceEndpointProps$Builder instance using the provided configuration.
  The function takes the InstanceEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^InstanceEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn instance-endpoint-props-builder
  "Creates a  `InstanceEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (instance-endpoint-props-builder> (new InstanceEndpointProps$Builder) id config))


(defn network-load-balancer-endpoint-builder>
  "The network-load-balancer-endpoint-builder> function updates a NetworkLoadBalancerEndpoint$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^NetworkLoadBalancerEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn network-load-balancer-endpoint-builder
  "Creates a  `NetworkLoadBalancerEndpoint$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer]___
| Argument | DataType | Description |
|---|---|---|
| load-balancer | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^INetworkLoadBalancer load-balancer id config]
  (network-load-balancer-endpoint-builder> (NetworkLoadBalancerEndpoint$Builder/create load-balancer) id config))


(defn network-load-balancer-endpoint-props-builder>
  "The network-load-balancer-endpoint-props-builder> function updates a NetworkLoadBalancerEndpointProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^NetworkLoadBalancerEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn network-load-balancer-endpoint-props-builder
  "Creates a  `NetworkLoadBalancerEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-load-balancer-endpoint-props-builder> (new NetworkLoadBalancerEndpointProps$Builder) id config))