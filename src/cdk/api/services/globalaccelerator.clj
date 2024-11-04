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


(defn accelerator-attributes-builder
  "The accelerator-attributes-builder function buildes out new instances of 
AcceleratorAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-arn` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `dualStackDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dual-stack-dns-name` |
| `ipv4Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv4-addresses` |
| `ipv6Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |"
  [stack id config]
  (let [builder (AcceleratorAttributes$Builder.)]
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
    (.build builder)))


(defn accelerator-builder
  "The accelerator-builder function buildes out new instances of 
Accelerator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | software.amazon.awscdk.services.globalaccelerator.IpAddressType | [[cdk.api.services.globalaccelerator/ip-address-type]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |"
  [stack id config]
  (let [builder (Accelerator$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accelerator-name)]
      (. builder acceleratorName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :ip-addresses)]
      (. builder ipAddresses data))
    (.build builder)))


(defn accelerator-props-builder
  "The accelerator-props-builder function buildes out new instances of 
AcceleratorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | software.amazon.awscdk.services.globalaccelerator.IpAddressType | [[cdk.api.services.globalaccelerator/ip-address-type]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |"
  [stack id config]
  (let [builder (AcceleratorProps$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-name)]
      (. builder acceleratorName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :ip-addresses)]
      (. builder ipAddresses data))
    (.build builder)))


(defn cfn-accelerator-builder
  "The cfn-accelerator-builder function buildes out new instances of 
CfnAccelerator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAccelerator$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-accelerator-props-builder
  "The cfn-accelerator-props-builder function buildes out new instances of 
CfnAcceleratorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAcceleratorProps$Builder.)]
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
    (.build builder)))


(defn cfn-cross-account-attachment-builder
  "The cfn-cross-account-attachment-builder function buildes out new instances of 
CfnCrossAccountAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCrossAccountAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cross-account-attachment-props-builder
  "The cfn-cross-account-attachment-props-builder function buildes out new instances of 
CfnCrossAccountAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCrossAccountAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cross-account-attachment-resource-property-builder
  "The cfn-cross-account-attachment-resource-property-builder function buildes out new instances of 
CfnCrossAccountAttachment$ResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnCrossAccountAttachment$ResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-id)]
      (. builder endpointId data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-endpoint-group-builder
  "The cfn-endpoint-group-builder function buildes out new instances of 
CfnEndpointGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |"
  [stack id config]
  (let [builder (CfnEndpointGroup$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-endpoint-group-endpoint-configuration-property-builder
  "The cfn-endpoint-group-endpoint-configuration-property-builder function buildes out new instances of 
CfnEndpointGroup$EndpointConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachment-arn` |
| `clientIpPreservationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:client-ip-preservation-enabled` |
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnEndpointGroup$EndpointConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachment-arn)]
      (. builder attachmentArn data))
    (when-let [data (lookup-entry config id :client-ip-preservation-enabled)]
      (. builder clientIpPreservationEnabled data))
    (when-let [data (lookup-entry config id :endpoint-id)]
      (. builder endpointId data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-endpoint-group-port-override-property-builder
  "The cfn-endpoint-group-port-override-property-builder function buildes out new instances of 
CfnEndpointGroup$PortOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:endpoint-port` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |"
  [stack id config]
  (let [builder (CfnEndpointGroup$PortOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-port)]
      (. builder endpointPort data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (.build builder)))


(defn cfn-endpoint-group-props-builder
  "The cfn-endpoint-group-props-builder function buildes out new instances of 
CfnEndpointGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |"
  [stack id config]
  (let [builder (CfnEndpointGroupProps$Builder.)]
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
    (.build builder)))


(defn cfn-listener-builder
  "The cfn-listener-builder function buildes out new instances of 
CfnListener$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-arn` |
| `clientAffinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-affinity` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnListener$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accelerator-arn)]
      (. builder acceleratorArn data))
    (when-let [data (lookup-entry config id :client-affinity)]
      (. builder clientAffinity data))
    (when-let [data (lookup-entry config id :port-ranges)]
      (. builder portRanges data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-listener-port-range-property-builder
  "The cfn-listener-port-range-property-builder function buildes out new instances of 
CfnListener$PortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnListener$PortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-listener-props-builder
  "The cfn-listener-props-builder function buildes out new instances of 
CfnListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-arn` |
| `clientAffinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-affinity` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnListenerProps$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-arn)]
      (. builder acceleratorArn data))
    (when-let [data (lookup-entry config id :client-affinity)]
      (. builder clientAffinity data))
    (when-let [data (lookup-entry config id :port-ranges)]
      (. builder portRanges data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn endpoint-group-builder
  "The endpoint-group-builder function buildes out new instances of 
EndpointGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |"
  [stack id config]
  (let [builder (EndpointGroup$Builder/create stack id)]
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
    (.build builder)))


(defn endpoint-group-options-builder
  "The endpoint-group-options-builder function buildes out new instances of 
EndpointGroupOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |"
  [stack id config]
  (let [builder (EndpointGroupOptions$Builder.)]
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
    (.build builder)))


(defn endpoint-group-props-builder
  "The endpoint-group-props-builder function buildes out new instances of 
EndpointGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `trafficDialPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-dial-percentage` |"
  [stack id config]
  (let [builder (EndpointGroupProps$Builder.)]
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
    (.build builder)))


(defn listener-builder
  "The listener-builder function buildes out new instances of 
Listener$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerator` | software.amazon.awscdk.services.globalaccelerator.IAccelerator | [[cdk.support/lookup-entry]] | `:accelerator` |
| `clientAffinity` | software.amazon.awscdk.services.globalaccelerator.ClientAffinity | [[cdk.api.services.globalaccelerator/client-affinity]] | `:client-affinity` |
| `listenerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-name` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol | [[cdk.api.services.globalaccelerator/connection-protocol]] | `:protocol` |"
  [stack id config]
  (let [builder (Listener$Builder/create stack id)]
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
    (.build builder)))


(defn listener-options-builder
  "The listener-options-builder function buildes out new instances of 
ListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAffinity` | software.amazon.awscdk.services.globalaccelerator.ClientAffinity | [[cdk.api.services.globalaccelerator/client-affinity]] | `:client-affinity` |
| `listenerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-name` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol | [[cdk.api.services.globalaccelerator/connection-protocol]] | `:protocol` |"
  [stack id config]
  (let [builder (ListenerOptions$Builder.)]
    (when-let [data (client-affinity config id :client-affinity)]
      (. builder clientAffinity data))
    (when-let [data (lookup-entry config id :listener-name)]
      (. builder listenerName data))
    (when-let [data (lookup-entry config id :port-ranges)]
      (. builder portRanges data))
    (when-let [data (connection-protocol config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn listener-props-builder
  "The listener-props-builder function buildes out new instances of 
ListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerator` | software.amazon.awscdk.services.globalaccelerator.IAccelerator | [[cdk.support/lookup-entry]] | `:accelerator` |
| `clientAffinity` | software.amazon.awscdk.services.globalaccelerator.ClientAffinity | [[cdk.api.services.globalaccelerator/client-affinity]] | `:client-affinity` |
| `listenerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-name` |
| `portRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `protocol` | software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol | [[cdk.api.services.globalaccelerator/connection-protocol]] | `:protocol` |"
  [stack id config]
  (let [builder (ListenerProps$Builder.)]
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
    (.build builder)))


(defn port-override-builder
  "The port-override-builder function buildes out new instances of 
PortOverride$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:endpoint-port` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |"
  [stack id config]
  (let [builder (PortOverride$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-port)]
      (. builder endpointPort data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (.build builder)))


(defn port-range-builder
  "The port-range-builder function buildes out new instances of 
PortRange$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (PortRange$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn raw-endpoint-builder
  "The raw-endpoint-builder function buildes out new instances of 
RawEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (RawEndpoint$Builder/create)]
    (when-let [data (lookup-entry config id :endpoint-id)]
      (. builder endpointId data))
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn raw-endpoint-props-builder
  "The raw-endpoint-props-builder function buildes out new instances of 
RawEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (RawEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-id)]
      (. builder endpointId data))
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))