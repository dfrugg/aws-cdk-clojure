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


(defn build-application-load-balancer-endpoint-builder
  "The build-application-load-balancer-endpoint-builder function updates a ApplicationLoadBalancerEndpoint$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^ApplicationLoadBalancerEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-application-load-balancer-endpoint-options-builder
  "The build-application-load-balancer-endpoint-options-builder function updates a ApplicationLoadBalancerEndpointOptions$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerEndpointOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^ApplicationLoadBalancerEndpointOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-cfn-eip-endpoint-builder
  "The build-cfn-eip-endpoint-builder function updates a CfnEipEndpoint$Builder instance using the provided configuration.
  The function takes the CfnEipEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnEipEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-cfn-eip-endpoint-props-builder
  "The build-cfn-eip-endpoint-props-builder function updates a CfnEipEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnEipEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnEipEndpointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-instance-endpoint-builder
  "The build-instance-endpoint-builder function updates a InstanceEndpoint$Builder instance using the provided configuration.
  The function takes the InstanceEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^InstanceEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-instance-endpoint-props-builder
  "The build-instance-endpoint-props-builder function updates a InstanceEndpointProps$Builder instance using the provided configuration.
  The function takes the InstanceEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^InstanceEndpointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-network-load-balancer-endpoint-builder
  "The build-network-load-balancer-endpoint-builder function updates a NetworkLoadBalancerEndpoint$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^NetworkLoadBalancerEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-network-load-balancer-endpoint-props-builder
  "The build-network-load-balancer-endpoint-props-builder function updates a NetworkLoadBalancerEndpointProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^NetworkLoadBalancerEndpointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))