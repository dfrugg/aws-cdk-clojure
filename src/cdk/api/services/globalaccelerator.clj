(ns cdk.api.services.globalaccelerator
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.globalaccelerator package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.globalaccelerator Accelerator$Builder
                                                              AcceleratorAttributes$Builder
                                                              AcceleratorProps$Builder
                                                              CfnAccelerator$Builder
                                                              CfnAcceleratorProps$Builder
                                                              CfnCrossAccountAttachment$Builder
                                                              CfnCrossAccountAttachment$ResourceProperty$Builder
                                                              CfnCrossAccountAttachmentProps$Builder
                                                              CfnEndpointGroup$Builder
                                                              CfnEndpointGroup$EndpointConfigurationProperty$Builder
                                                              CfnEndpointGroup$PortOverrideProperty$Builder
                                                              CfnEndpointGroupProps$Builder
                                                              CfnListener$Builder
                                                              CfnListener$PortRangeProperty$Builder
                                                              CfnListenerProps$Builder
                                                              ClientAffinity
                                                              ConnectionProtocol
                                                              EndpointGroup$Builder
                                                              EndpointGroupOptions$Builder
                                                              EndpointGroupProps$Builder
                                                              HealthCheckProtocol
                                                              IpAddressType
                                                              Listener$Builder
                                                              ListenerOptions$Builder
                                                              ListenerProps$Builder
                                                              PortOverride$Builder
                                                              PortRange$Builder
                                                              RawEndpoint$Builder
                                                              RawEndpointProps$Builder]))


(defn client-affinity
  "The `client-affinity` function data interprets values in the provided config data into a 
`ClientAffinity` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ClientAffinity` - the value is returned.
* is `:none` - `ClientAffinity/NONE` is returned
* is `:source-ip` - `ClientAffinity/SOURCE_IP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ClientAffinity data) data
      (= :none data) ClientAffinity/NONE
      (= :source-ip data) ClientAffinity/SOURCE_IP)))


(defn connection-protocol
  "The `connection-protocol` function data interprets values in the provided config data into a 
`ConnectionProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ConnectionProtocol` - the value is returned.
* is `:udp` - `ConnectionProtocol/UDP` is returned
* is `:tcp` - `ConnectionProtocol/TCP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ConnectionProtocol data) data
      (= :udp data) ConnectionProtocol/UDP
      (= :tcp data) ConnectionProtocol/TCP)))


(defn health-check-protocol
  "The `health-check-protocol` function data interprets values in the provided config data into a 
`HealthCheckProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HealthCheckProtocol` - the value is returned.
* is `:http` - `HealthCheckProtocol/HTTP` is returned
* is `:tcp` - `HealthCheckProtocol/TCP` is returned
* is `:https` - `HealthCheckProtocol/HTTPS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HealthCheckProtocol data) data
      (= :http data) HealthCheckProtocol/HTTP
      (= :tcp data) HealthCheckProtocol/TCP
      (= :https data) HealthCheckProtocol/HTTPS)))


(defn ip-address-type
  "The `ip-address-type` function data interprets values in the provided config data into a 
`IpAddressType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IpAddressType` - the value is returned.
* is `:ipv4` - `IpAddressType/IPV4` is returned
* is `:dual-stack` - `IpAddressType/DUAL_STACK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IpAddressType data) data
      (= :ipv4 data) IpAddressType/IPV4
      (= :dual-stack data) IpAddressType/DUAL_STACK)))


(defn build-accelerator-attributes-builder
  "The build-accelerator-attributes-builder function updates a AcceleratorAttributes$Builder instance using the provided configuration.
  The function takes the AcceleratorAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-arn` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `dualStackDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dual-stack-dns-name` |
| `ipv4Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv4-addresses` |
| `ipv6Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
"
  [^AcceleratorAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-arn)]
    (. builder acceleratorArn data))
  (when-let [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-let [data (lookup-entry config id :dual-stack-dns-name)]
    (. builder dualStackDnsName data))
  (when-let [data (lookup-entry config id :ipv4-addresses)]
    (. builder ipv4Addresses data))
  (when-let [data (lookup-entry config id :ipv6-addresses)]
    (. builder ipv6Addresses data))
  (.build builder))


(defn accelerator-attributes-builder
  ""
  [id config]
  (build-accelerator-attributes-builder (new AcceleratorAttributes$Builder) id config))


(defn build-accelerator-builder
  "The build-accelerator-builder function updates a Accelerator$Builder instance using the provided configuration.
  The function takes the Accelerator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | software.amazon.awscdk.services.globalaccelerator.IpAddressType | [[cdk.api.services.globalaccelerator/ip-address-type]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
"
  [^Accelerator$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-name)]
    (. builder acceleratorName data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-let [data (lookup-entry config id :ip-addresses)]
    (. builder ipAddresses data))
  (.build builder))


(defn accelerator-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-accelerator-builder (Accelerator$Builder/create scope (name id)) id config))


(defn build-accelerator-props-builder
  "The build-accelerator-props-builder function updates a AcceleratorProps$Builder instance using the provided configuration.
  The function takes the AcceleratorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | software.amazon.awscdk.services.globalaccelerator.IpAddressType | [[cdk.api.services.globalaccelerator/ip-address-type]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
"
  [^AcceleratorProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-name)]
    (. builder acceleratorName data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-let [data (lookup-entry config id :ip-addresses)]
    (. builder ipAddresses data))
  (.build builder))


(defn accelerator-props-builder
  ""
  [id config]
  (build-accelerator-props-builder (new AcceleratorProps$Builder) id config))


(defn build-cfn-accelerator-builder
  "The build-cfn-accelerator-builder function updates a CfnAccelerator$Builder instance using the provided configuration.
  The function takes the CfnAccelerator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccelerator$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-let [data (lookup-entry config id :ip-addresses)]
    (. builder ipAddresses data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-accelerator-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-accelerator-builder (CfnAccelerator$Builder/create scope (name id)) id config))


(defn build-cfn-accelerator-props-builder
  "The build-cfn-accelerator-props-builder function updates a CfnAcceleratorProps$Builder instance using the provided configuration.
  The function takes the CfnAcceleratorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAcceleratorProps$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-let [data (lookup-entry config id :ip-addresses)]
    (. builder ipAddresses data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-accelerator-props-builder
  ""
  [id config]
  (build-cfn-accelerator-props-builder (new CfnAcceleratorProps$Builder) id config))


(defn build-cfn-cross-account-attachment-builder
  "The build-cfn-cross-account-attachment-builder function updates a CfnCrossAccountAttachment$Builder instance using the provided configuration.
  The function takes the CfnCrossAccountAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCrossAccountAttachment$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :principals)]
    (. builder principals data))
  (when-let [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cross-account-attachment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-cross-account-attachment-builder (CfnCrossAccountAttachment$Builder/create scope (name id)) id config))


(defn build-cfn-cross-account-attachment-props-builder
  "The build-cfn-cross-account-attachment-props-builder function updates a CfnCrossAccountAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnCrossAccountAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCrossAccountAttachmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :principals)]
    (. builder principals data))
  (when-let [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cross-account-attachment-props-builder
  ""
  [id config]
  (build-cfn-cross-account-attachment-props-builder (new CfnCrossAccountAttachmentProps$Builder) id config))


(defn build-cfn-cross-account-attachment-resource-property-builder
  "The build-cfn-cross-account-attachment-resource-property-builder function updates a CfnCrossAccountAttachment$ResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnCrossAccountAttachment$ResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnCrossAccountAttachment$ResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-id)]
    (. builder endpointId data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-cross-account-attachment-resource-property-builder
  ""
  [id config]
  (build-cfn-cross-account-attachment-resource-property-builder (new CfnCrossAccountAttachment$ResourceProperty$Builder) id config))


(defn build-cfn-endpoint-group-builder
  "The build-cfn-endpoint-group-builder function updates a CfnEndpointGroup$Builder instance using the provided configuration.
  The function takes the CfnEndpointGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-configurations` |
| `endpointGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-group-region` |
| `healthCheckIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-interval-seconds` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `healthCheckPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-port` |
| `healthCheckProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-protocol` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `portOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:port-overrides` |
| `thresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-count` |
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |
"
  [^CfnEndpointGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-configurations)]
    (. builder endpointConfigurations data))
  (when-let [data (lookup-entry config id :endpoint-group-region)]
    (. builder endpointGroupRegion data))
  (when-let [data (lookup-entry config id :health-check-interval-seconds)]
    (. builder healthCheckIntervalSeconds data))
  (when-let [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-let [data (lookup-entry config id :health-check-port)]
    (. builder healthCheckPort data))
  (when-let [data (lookup-entry config id :health-check-protocol)]
    (. builder healthCheckProtocol data))
  (when-let [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-let [data (lookup-entry config id :port-overrides)]
    (. builder portOverrides data))
  (when-let [data (lookup-entry config id :threshold-count)]
    (. builder thresholdCount data))
  (when-let [data (lookup-entry config id :traffic-dial-percentage)]
    (. builder trafficDialPercentage data))
  (.build builder))


(defn cfn-endpoint-group-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-endpoint-group-builder (CfnEndpointGroup$Builder/create scope (name id)) id config))


(defn build-cfn-endpoint-group-endpoint-configuration-property-builder
  "The build-cfn-endpoint-group-endpoint-configuration-property-builder function updates a CfnEndpointGroup$EndpointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointGroup$EndpointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachment-arn` |
| `clientIpPreservationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:client-ip-preservation-enabled` |
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnEndpointGroup$EndpointConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachment-arn)]
    (. builder attachmentArn data))
  (when-let [data (lookup-entry config id :client-ip-preservation-enabled)]
    (. builder clientIpPreservationEnabled data))
  (when-let [data (lookup-entry config id :endpoint-id)]
    (. builder endpointId data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-endpoint-group-endpoint-configuration-property-builder
  ""
  [id config]
  (build-cfn-endpoint-group-endpoint-configuration-property-builder (new CfnEndpointGroup$EndpointConfigurationProperty$Builder) id config))


(defn build-cfn-endpoint-group-port-override-property-builder
  "The build-cfn-endpoint-group-port-override-property-builder function updates a CfnEndpointGroup$PortOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointGroup$PortOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:endpoint-port` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
"
  [^CfnEndpointGroup$PortOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-port)]
    (. builder endpointPort data))
  (when-let [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (.build builder))


(defn cfn-endpoint-group-port-override-property-builder
  ""
  [id config]
  (build-cfn-endpoint-group-port-override-property-builder (new CfnEndpointGroup$PortOverrideProperty$Builder) id config))


(defn build-cfn-endpoint-group-props-builder
  "The build-cfn-endpoint-group-props-builder function updates a CfnEndpointGroupProps$Builder instance using the provided configuration.
  The function takes the CfnEndpointGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-configurations` |
| `endpointGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-group-region` |
| `healthCheckIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-interval-seconds` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `healthCheckPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-port` |
| `healthCheckProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-protocol` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `portOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:port-overrides` |
| `thresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-count` |
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |
"
  [^CfnEndpointGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-configurations)]
    (. builder endpointConfigurations data))
  (when-let [data (lookup-entry config id :endpoint-group-region)]
    (. builder endpointGroupRegion data))
  (when-let [data (lookup-entry config id :health-check-interval-seconds)]
    (. builder healthCheckIntervalSeconds data))
  (when-let [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-let [data (lookup-entry config id :health-check-port)]
    (. builder healthCheckPort data))
  (when-let [data (lookup-entry config id :health-check-protocol)]
    (. builder healthCheckProtocol data))
  (when-let [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-let [data (lookup-entry config id :port-overrides)]
    (. builder portOverrides data))
  (when-let [data (lookup-entry config id :threshold-count)]
    (. builder thresholdCount data))
  (when-let [data (lookup-entry config id :traffic-dial-percentage)]
    (. builder trafficDialPercentage data))
  (.build builder))


(defn cfn-endpoint-group-props-builder
  ""
  [id config]
  (build-cfn-endpoint-group-props-builder (new CfnEndpointGroupProps$Builder) id config))


(defn build-cfn-listener-builder
  "The build-cfn-listener-builder function updates a CfnListener$Builder instance using the provided configuration.
  The function takes the CfnListener$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-arn` |
| `clientAffinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-affinity` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnListener$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-arn)]
    (. builder acceleratorArn data))
  (when-let [data (lookup-entry config id :client-affinity)]
    (. builder clientAffinity data))
  (when-let [data (lookup-entry config id :port-ranges)]
    (. builder portRanges data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-listener-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-listener-builder (CfnListener$Builder/create scope (name id)) id config))


(defn build-cfn-listener-port-range-property-builder
  "The build-cfn-listener-port-range-property-builder function updates a CfnListener$PortRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$PortRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^CfnListener$PortRangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-let [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn cfn-listener-port-range-property-builder
  ""
  [id config]
  (build-cfn-listener-port-range-property-builder (new CfnListener$PortRangeProperty$Builder) id config))


(defn build-cfn-listener-props-builder
  "The build-cfn-listener-props-builder function updates a CfnListenerProps$Builder instance using the provided configuration.
  The function takes the CfnListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-arn` |
| `clientAffinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-affinity` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnListenerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-arn)]
    (. builder acceleratorArn data))
  (when-let [data (lookup-entry config id :client-affinity)]
    (. builder clientAffinity data))
  (when-let [data (lookup-entry config id :port-ranges)]
    (. builder portRanges data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-listener-props-builder
  ""
  [id config]
  (build-cfn-listener-props-builder (new CfnListenerProps$Builder) id config))


(defn build-endpoint-group-builder
  "The build-endpoint-group-builder function updates a EndpointGroup$Builder instance using the provided configuration.
  The function takes the EndpointGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-group-name` |
| `endpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoints` |
| `healthCheckInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-interval` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `healthCheckPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-port` |
| `healthCheckProtocol` | software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol | [[cdk.api.services.globalaccelerator/health-check-protocol]] | `:health-check-protocol` |
| `healthCheckThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-threshold` |
| `listener` | software.amazon.awscdk.services.globalaccelerator.IListener | [[cdk.support/lookup-entry]] | `:listener` |
| `portOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:port-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |
"
  [^EndpointGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-group-name)]
    (. builder endpointGroupName data))
  (when-let [data (lookup-entry config id :endpoints)]
    (. builder endpoints data))
  (when-let [data (lookup-entry config id :health-check-interval)]
    (. builder healthCheckInterval data))
  (when-let [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-let [data (lookup-entry config id :health-check-port)]
    (. builder healthCheckPort data))
  (when-let [data (health-check-protocol config id :health-check-protocol)]
    (. builder healthCheckProtocol data))
  (when-let [data (lookup-entry config id :health-check-threshold)]
    (. builder healthCheckThreshold data))
  (when-let [data (lookup-entry config id :listener)]
    (. builder listener data))
  (when-let [data (lookup-entry config id :port-overrides)]
    (. builder portOverrides data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :traffic-dial-percentage)]
    (. builder trafficDialPercentage data))
  (.build builder))


(defn endpoint-group-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-endpoint-group-builder (EndpointGroup$Builder/create scope (name id)) id config))


(defn build-endpoint-group-options-builder
  "The build-endpoint-group-options-builder function updates a EndpointGroupOptions$Builder instance using the provided configuration.
  The function takes the EndpointGroupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-group-name` |
| `endpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoints` |
| `healthCheckInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-interval` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `healthCheckPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-port` |
| `healthCheckProtocol` | software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol | [[cdk.api.services.globalaccelerator/health-check-protocol]] | `:health-check-protocol` |
| `healthCheckThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-threshold` |
| `portOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:port-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |
"
  [^EndpointGroupOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-group-name)]
    (. builder endpointGroupName data))
  (when-let [data (lookup-entry config id :endpoints)]
    (. builder endpoints data))
  (when-let [data (lookup-entry config id :health-check-interval)]
    (. builder healthCheckInterval data))
  (when-let [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-let [data (lookup-entry config id :health-check-port)]
    (. builder healthCheckPort data))
  (when-let [data (health-check-protocol config id :health-check-protocol)]
    (. builder healthCheckProtocol data))
  (when-let [data (lookup-entry config id :health-check-threshold)]
    (. builder healthCheckThreshold data))
  (when-let [data (lookup-entry config id :port-overrides)]
    (. builder portOverrides data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :traffic-dial-percentage)]
    (. builder trafficDialPercentage data))
  (.build builder))


(defn endpoint-group-options-builder
  ""
  [id config]
  (build-endpoint-group-options-builder (new EndpointGroupOptions$Builder) id config))


(defn build-endpoint-group-props-builder
  "The build-endpoint-group-props-builder function updates a EndpointGroupProps$Builder instance using the provided configuration.
  The function takes the EndpointGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-group-name` |
| `endpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoints` |
| `healthCheckInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-interval` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `healthCheckPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-port` |
| `healthCheckProtocol` | software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol | [[cdk.api.services.globalaccelerator/health-check-protocol]] | `:health-check-protocol` |
| `healthCheckThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-threshold` |
| `listener` | software.amazon.awscdk.services.globalaccelerator.IListener | [[cdk.support/lookup-entry]] | `:listener` |
| `portOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:port-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |
"
  [^EndpointGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-group-name)]
    (. builder endpointGroupName data))
  (when-let [data (lookup-entry config id :endpoints)]
    (. builder endpoints data))
  (when-let [data (lookup-entry config id :health-check-interval)]
    (. builder healthCheckInterval data))
  (when-let [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-let [data (lookup-entry config id :health-check-port)]
    (. builder healthCheckPort data))
  (when-let [data (health-check-protocol config id :health-check-protocol)]
    (. builder healthCheckProtocol data))
  (when-let [data (lookup-entry config id :health-check-threshold)]
    (. builder healthCheckThreshold data))
  (when-let [data (lookup-entry config id :listener)]
    (. builder listener data))
  (when-let [data (lookup-entry config id :port-overrides)]
    (. builder portOverrides data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :traffic-dial-percentage)]
    (. builder trafficDialPercentage data))
  (.build builder))


(defn endpoint-group-props-builder
  ""
  [id config]
  (build-endpoint-group-props-builder (new EndpointGroupProps$Builder) id config))


(defn build-listener-builder
  "The build-listener-builder function updates a Listener$Builder instance using the provided configuration.
  The function takes the Listener$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerator` | software.amazon.awscdk.services.globalaccelerator.IAccelerator | [[cdk.support/lookup-entry]] | `:accelerator` |
| `clientAffinity` | software.amazon.awscdk.services.globalaccelerator.ClientAffinity | [[cdk.api.services.globalaccelerator/client-affinity]] | `:client-affinity` |
| `listenerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-name` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol | [[cdk.api.services.globalaccelerator/connection-protocol]] | `:protocol` |
"
  [^Listener$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator)]
    (. builder accelerator data))
  (when-let [data (client-affinity config id :client-affinity)]
    (. builder clientAffinity data))
  (when-let [data (lookup-entry config id :listener-name)]
    (. builder listenerName data))
  (when-let [data (lookup-entry config id :port-ranges)]
    (. builder portRanges data))
  (when-let [data (connection-protocol config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn listener-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-listener-builder (Listener$Builder/create scope (name id)) id config))


(defn build-listener-options-builder
  "The build-listener-options-builder function updates a ListenerOptions$Builder instance using the provided configuration.
  The function takes the ListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAffinity` | software.amazon.awscdk.services.globalaccelerator.ClientAffinity | [[cdk.api.services.globalaccelerator/client-affinity]] | `:client-affinity` |
| `listenerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-name` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol | [[cdk.api.services.globalaccelerator/connection-protocol]] | `:protocol` |
"
  [^ListenerOptions$Builder builder id config]
  (when-let [data (client-affinity config id :client-affinity)]
    (. builder clientAffinity data))
  (when-let [data (lookup-entry config id :listener-name)]
    (. builder listenerName data))
  (when-let [data (lookup-entry config id :port-ranges)]
    (. builder portRanges data))
  (when-let [data (connection-protocol config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn listener-options-builder
  ""
  [id config]
  (build-listener-options-builder (new ListenerOptions$Builder) id config))


(defn build-listener-props-builder
  "The build-listener-props-builder function updates a ListenerProps$Builder instance using the provided configuration.
  The function takes the ListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerator` | software.amazon.awscdk.services.globalaccelerator.IAccelerator | [[cdk.support/lookup-entry]] | `:accelerator` |
| `clientAffinity` | software.amazon.awscdk.services.globalaccelerator.ClientAffinity | [[cdk.api.services.globalaccelerator/client-affinity]] | `:client-affinity` |
| `listenerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-name` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol | [[cdk.api.services.globalaccelerator/connection-protocol]] | `:protocol` |
"
  [^ListenerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator)]
    (. builder accelerator data))
  (when-let [data (client-affinity config id :client-affinity)]
    (. builder clientAffinity data))
  (when-let [data (lookup-entry config id :listener-name)]
    (. builder listenerName data))
  (when-let [data (lookup-entry config id :port-ranges)]
    (. builder portRanges data))
  (when-let [data (connection-protocol config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn listener-props-builder
  ""
  [id config]
  (build-listener-props-builder (new ListenerProps$Builder) id config))


(defn build-port-override-builder
  "The build-port-override-builder function updates a PortOverride$Builder instance using the provided configuration.
  The function takes the PortOverride$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:endpoint-port` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
"
  [^PortOverride$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-port)]
    (. builder endpointPort data))
  (when-let [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (.build builder))


(defn port-override-builder
  ""
  [id config]
  (build-port-override-builder (new PortOverride$Builder) id config))


(defn build-port-range-builder
  "The build-port-range-builder function updates a PortRange$Builder instance using the provided configuration.
  The function takes the PortRange$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^PortRange$Builder builder id config]
  (when-let [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-let [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn port-range-builder
  ""
  [id config]
  (build-port-range-builder (new PortRange$Builder) id config))


(defn build-raw-endpoint-builder
  "The build-raw-endpoint-builder function updates a RawEndpoint$Builder instance using the provided configuration.
  The function takes the RawEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^RawEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-id)]
    (. builder endpointId data))
  (when-let [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn raw-endpoint-builder
  ""
  [id config]
  (build-raw-endpoint-builder (RawEndpoint$Builder/create) id config))


(defn build-raw-endpoint-props-builder
  "The build-raw-endpoint-props-builder function updates a RawEndpointProps$Builder instance using the provided configuration.
  The function takes the RawEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^RawEndpointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-id)]
    (. builder endpointId data))
  (when-let [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn raw-endpoint-props-builder
  ""
  [id config]
  (build-raw-endpoint-props-builder (new RawEndpointProps$Builder) id config))