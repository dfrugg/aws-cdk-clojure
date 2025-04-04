(ns cdk.api.services.elasticloadbalancingv2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticloadbalancingv2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.elasticloadbalancingv2 AddApplicationActionProps$Builder
                                                                   AddApplicationTargetGroupsProps$Builder
                                                                   AddApplicationTargetsProps$Builder
                                                                   AddNetworkActionProps$Builder
                                                                   AddNetworkTargetsProps$Builder
                                                                   AddRuleProps$Builder
                                                                   AlpnPolicy
                                                                   ApplicationListener$Builder
                                                                   ApplicationListenerAttributes$Builder
                                                                   ApplicationListenerCertificate$Builder
                                                                   ApplicationListenerCertificateProps$Builder
                                                                   ApplicationListenerLookupOptions$Builder
                                                                   ApplicationListenerProps$Builder
                                                                   ApplicationListenerRule$Builder
                                                                   ApplicationListenerRuleProps$Builder
                                                                   ApplicationLoadBalancer$Builder
                                                                   ApplicationLoadBalancerAttributes$Builder
                                                                   ApplicationLoadBalancerLookupOptions$Builder
                                                                   ApplicationLoadBalancerProps$Builder
                                                                   ApplicationLoadBalancerRedirectConfig$Builder
                                                                   ApplicationProtocol
                                                                   ApplicationProtocolVersion
                                                                   ApplicationTargetGroup$Builder
                                                                   ApplicationTargetGroupProps$Builder
                                                                   AuthenticateOidcOptions$Builder
                                                                   BaseApplicationListenerProps$Builder
                                                                   BaseApplicationListenerRuleProps$Builder
                                                                   BaseListenerLookupOptions$Builder
                                                                   BaseLoadBalancerLookupOptions$Builder
                                                                   BaseLoadBalancerProps$Builder
                                                                   BaseNetworkListenerProps$Builder
                                                                   BaseTargetGroupProps$Builder
                                                                   CfnListener$ActionProperty$Builder
                                                                   CfnListener$AuthenticateCognitoConfigProperty$Builder
                                                                   CfnListener$AuthenticateOidcConfigProperty$Builder
                                                                   CfnListener$Builder
                                                                   CfnListener$CertificateProperty$Builder
                                                                   CfnListener$FixedResponseConfigProperty$Builder
                                                                   CfnListener$ForwardConfigProperty$Builder
                                                                   CfnListener$MutualAuthenticationProperty$Builder
                                                                   CfnListener$RedirectConfigProperty$Builder
                                                                   CfnListener$TargetGroupStickinessConfigProperty$Builder
                                                                   CfnListener$TargetGroupTupleProperty$Builder
                                                                   CfnListenerCertificate$Builder
                                                                   CfnListenerCertificate$CertificateProperty$Builder
                                                                   CfnListenerCertificateProps$Builder
                                                                   CfnListenerProps$Builder
                                                                   CfnListenerRule$ActionProperty$Builder
                                                                   CfnListenerRule$AuthenticateCognitoConfigProperty$Builder
                                                                   CfnListenerRule$AuthenticateOidcConfigProperty$Builder
                                                                   CfnListenerRule$Builder
                                                                   CfnListenerRule$FixedResponseConfigProperty$Builder
                                                                   CfnListenerRule$ForwardConfigProperty$Builder
                                                                   CfnListenerRule$HostHeaderConfigProperty$Builder
                                                                   CfnListenerRule$HttpHeaderConfigProperty$Builder
                                                                   CfnListenerRule$HttpRequestMethodConfigProperty$Builder
                                                                   CfnListenerRule$PathPatternConfigProperty$Builder
                                                                   CfnListenerRule$QueryStringConfigProperty$Builder
                                                                   CfnListenerRule$QueryStringKeyValueProperty$Builder
                                                                   CfnListenerRule$RedirectConfigProperty$Builder
                                                                   CfnListenerRule$RuleConditionProperty$Builder
                                                                   CfnListenerRule$SourceIpConfigProperty$Builder
                                                                   CfnListenerRule$TargetGroupStickinessConfigProperty$Builder
                                                                   CfnListenerRule$TargetGroupTupleProperty$Builder
                                                                   CfnListenerRuleProps$Builder
                                                                   CfnLoadBalancer$Builder
                                                                   CfnLoadBalancer$LoadBalancerAttributeProperty$Builder
                                                                   CfnLoadBalancer$SubnetMappingProperty$Builder
                                                                   CfnLoadBalancerProps$Builder
                                                                   CfnTargetGroup$Builder
                                                                   CfnTargetGroup$MatcherProperty$Builder
                                                                   CfnTargetGroup$TargetDescriptionProperty$Builder
                                                                   CfnTargetGroup$TargetGroupAttributeProperty$Builder
                                                                   CfnTargetGroupProps$Builder
                                                                   CfnTrustStore$Builder
                                                                   CfnTrustStoreProps$Builder
                                                                   CfnTrustStoreRevocation$Builder
                                                                   CfnTrustStoreRevocation$RevocationContentProperty$Builder
                                                                   CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder
                                                                   CfnTrustStoreRevocationProps$Builder
                                                                   ClientRoutingPolicy
                                                                   DesyncMitigationMode
                                                                   FixedResponseOptions$Builder
                                                                   ForwardOptions$Builder
                                                                   HealthCheck$Builder
                                                                   HttpCodeElb
                                                                   HttpCodeTarget
                                                                   IpAddressType
                                                                   LoadBalancerTargetProps$Builder
                                                                   NetworkForwardOptions$Builder
                                                                   NetworkListener$Builder
                                                                   NetworkListenerLookupOptions$Builder
                                                                   NetworkListenerProps$Builder
                                                                   NetworkLoadBalancer$Builder
                                                                   NetworkLoadBalancerAttributes$Builder
                                                                   NetworkLoadBalancerLookupOptions$Builder
                                                                   NetworkLoadBalancerProps$Builder
                                                                   NetworkTargetGroup$Builder
                                                                   NetworkTargetGroupProps$Builder
                                                                   NetworkWeightedTargetGroup$Builder
                                                                   Protocol
                                                                   QueryStringCondition$Builder
                                                                   RedirectOptions$Builder
                                                                   SslPolicy
                                                                   TargetGroupAttributes$Builder
                                                                   TargetGroupLoadBalancingAlgorithmType
                                                                   TargetType
                                                                   UnauthenticatedAction
                                                                   WeightedTargetGroup$Builder
                                                                   XffHeaderProcessingMode]))


(defn alpn-policy
  "The `alpn-policy` function data interprets values in the provided config data into a 
`AlpnPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AlpnPolicy` - the value is returned.
* is `:http2-optional` - `AlpnPolicy/HTTP2_OPTIONAL` is returned
* is `:http2-only` - `AlpnPolicy/HTTP2_ONLY` is returned
* is `:http2-preferred` - `AlpnPolicy/HTTP2_PREFERRED` is returned
* is `:none` - `AlpnPolicy/NONE` is returned
* is `:http1-only` - `AlpnPolicy/HTTP1_ONLY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AlpnPolicy data) data
      (= :http2-optional data) AlpnPolicy/HTTP2_OPTIONAL
      (= :http2-only data) AlpnPolicy/HTTP2_ONLY
      (= :http2-preferred data) AlpnPolicy/HTTP2_PREFERRED
      (= :none data) AlpnPolicy/NONE
      (= :http1-only data) AlpnPolicy/HTTP1_ONLY)))


(defn application-protocol
  "The `application-protocol` function data interprets values in the provided config data into a 
`ApplicationProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ApplicationProtocol` - the value is returned.
* is `:https` - `ApplicationProtocol/HTTPS` is returned
* is `:http` - `ApplicationProtocol/HTTP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ApplicationProtocol data) data
      (= :https data) ApplicationProtocol/HTTPS
      (= :http data) ApplicationProtocol/HTTP)))


(defn application-protocol-version
  "The `application-protocol-version` function data interprets values in the provided config data into a 
`ApplicationProtocolVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ApplicationProtocolVersion` - the value is returned.
* is `:grpc` - `ApplicationProtocolVersion/GRPC` is returned
* is `:http1` - `ApplicationProtocolVersion/HTTP1` is returned
* is `:http2` - `ApplicationProtocolVersion/HTTP2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ApplicationProtocolVersion data) data
      (= :grpc data) ApplicationProtocolVersion/GRPC
      (= :http1 data) ApplicationProtocolVersion/HTTP1
      (= :http2 data) ApplicationProtocolVersion/HTTP2)))


(defn client-routing-policy
  "The `client-routing-policy` function data interprets values in the provided config data into a 
`ClientRoutingPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ClientRoutingPolicy` - the value is returned.
* is `:availability-zone-affinity` - `ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY` is returned
* is `:partial-availability-zone-affinity` - `ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY` is returned
* is `:any-availability-zone` - `ClientRoutingPolicy/ANY_AVAILABILITY_ZONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ClientRoutingPolicy data) data
      (= :availability-zone-affinity data) ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY
      (= :partial-availability-zone-affinity data) ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY
      (= :any-availability-zone data) ClientRoutingPolicy/ANY_AVAILABILITY_ZONE)))


(defn desync-mitigation-mode
  "The `desync-mitigation-mode` function data interprets values in the provided config data into a 
`DesyncMitigationMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DesyncMitigationMode` - the value is returned.
* is `:strictest` - `DesyncMitigationMode/STRICTEST` is returned
* is `:monitor` - `DesyncMitigationMode/MONITOR` is returned
* is `:defensive` - `DesyncMitigationMode/DEFENSIVE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DesyncMitigationMode data) data
      (= :strictest data) DesyncMitigationMode/STRICTEST
      (= :monitor data) DesyncMitigationMode/MONITOR
      (= :defensive data) DesyncMitigationMode/DEFENSIVE)))


(defn http-code-elb
  "The `http-code-elb` function data interprets values in the provided config data into a 
`HttpCodeElb` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpCodeElb` - the value is returned.
* is `:elb-3xx-count` - `HttpCodeElb/ELB_3XX_COUNT` is returned
* is `:elb-4xx-count` - `HttpCodeElb/ELB_4XX_COUNT` is returned
* is `:elb-5xx-count` - `HttpCodeElb/ELB_5XX_COUNT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpCodeElb data) data
      (= :elb-3xx-count data) HttpCodeElb/ELB_3XX_COUNT
      (= :elb-4xx-count data) HttpCodeElb/ELB_4XX_COUNT
      (= :elb-5xx-count data) HttpCodeElb/ELB_5XX_COUNT)))


(defn http-code-target
  "The `http-code-target` function data interprets values in the provided config data into a 
`HttpCodeTarget` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpCodeTarget` - the value is returned.
* is `:target-2xx-count` - `HttpCodeTarget/TARGET_2XX_COUNT` is returned
* is `:target-3xx-count` - `HttpCodeTarget/TARGET_3XX_COUNT` is returned
* is `:target-4xx-count` - `HttpCodeTarget/TARGET_4XX_COUNT` is returned
* is `:target-5xx-count` - `HttpCodeTarget/TARGET_5XX_COUNT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpCodeTarget data) data
      (= :target-2xx-count data) HttpCodeTarget/TARGET_2XX_COUNT
      (= :target-3xx-count data) HttpCodeTarget/TARGET_3XX_COUNT
      (= :target-4xx-count data) HttpCodeTarget/TARGET_4XX_COUNT
      (= :target-5xx-count data) HttpCodeTarget/TARGET_5XX_COUNT)))


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


(defn protocol
  "The `protocol` function data interprets values in the provided config data into a 
`Protocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Protocol` - the value is returned.
* is `:tcp-udp` - `Protocol/TCP_UDP` is returned
* is `:http` - `Protocol/HTTP` is returned
* is `:tls` - `Protocol/TLS` is returned
* is `:tcp` - `Protocol/TCP` is returned
* is `:https` - `Protocol/HTTPS` is returned
* is `:udp` - `Protocol/UDP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Protocol data) data
      (= :tcp-udp data) Protocol/TCP_UDP
      (= :http data) Protocol/HTTP
      (= :tls data) Protocol/TLS
      (= :tcp data) Protocol/TCP
      (= :https data) Protocol/HTTPS
      (= :udp data) Protocol/UDP)))


(defn ssl-policy
  "The `ssl-policy` function data interprets values in the provided config data into a 
`SslPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SslPolicy` - the value is returned.
* is `:forward-secrecy-tls11` - `SslPolicy/FORWARD_SECRECY_TLS11` is returned
* is `:fips-tls13-12-ext2` - `SslPolicy/FIPS_TLS13_12_EXT2` is returned
* is `:tls13-ext2` - `SslPolicy/TLS13_EXT2` is returned
* is `:legacy` - `SslPolicy/LEGACY` is returned
* is `:fips-tls13-12` - `SslPolicy/FIPS_TLS13_12` is returned
* is `:forward-secrecy-tls12-res-gcm` - `SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM` is returned
* is `:recommended-tls` - `SslPolicy/RECOMMENDED_TLS` is returned
* is `:forward-secrecy` - `SslPolicy/FORWARD_SECRECY` is returned
* is `:tls13-10` - `SslPolicy/TLS13_10` is returned
* is `:tls12` - `SslPolicy/TLS12` is returned
* is `:forward-secrecy-tls12-res` - `SslPolicy/FORWARD_SECRECY_TLS12_RES` is returned
* is `:fips-tls13-12-ext0` - `SslPolicy/FIPS_TLS13_12_EXT0` is returned
* is `:fips-tls13-10` - `SslPolicy/FIPS_TLS13_10` is returned
* is `:fips-tls13-12-ext1` - `SslPolicy/FIPS_TLS13_12_EXT1` is returned
* is `:fips-tls13-13` - `SslPolicy/FIPS_TLS13_13` is returned
* is `:tls13-res` - `SslPolicy/TLS13_RES` is returned
* is `:fips-tls13-11` - `SslPolicy/FIPS_TLS13_11` is returned
* is `:tls13-11` - `SslPolicy/TLS13_11` is returned
* is `:tls12-ext` - `SslPolicy/TLS12_EXT` is returned
* is `:tls11` - `SslPolicy/TLS11` is returned
* is `:tls13-ext1` - `SslPolicy/TLS13_EXT1` is returned
* is `:fips-tls13-12-res` - `SslPolicy/FIPS_TLS13_12_RES` is returned
* is `:tls13-13` - `SslPolicy/TLS13_13` is returned
* is `:forward-secrecy-tls12` - `SslPolicy/FORWARD_SECRECY_TLS12` is returned
* is `:recommended` - `SslPolicy/RECOMMENDED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SslPolicy data) data
      (= :forward-secrecy-tls11 data) SslPolicy/FORWARD_SECRECY_TLS11
      (= :fips-tls13-12-ext2 data) SslPolicy/FIPS_TLS13_12_EXT2
      (= :tls13-ext2 data) SslPolicy/TLS13_EXT2
      (= :legacy data) SslPolicy/LEGACY
      (= :fips-tls13-12 data) SslPolicy/FIPS_TLS13_12
      (= :forward-secrecy-tls12-res-gcm data) SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM
      (= :recommended-tls data) SslPolicy/RECOMMENDED_TLS
      (= :forward-secrecy data) SslPolicy/FORWARD_SECRECY
      (= :tls13-10 data) SslPolicy/TLS13_10
      (= :tls12 data) SslPolicy/TLS12
      (= :forward-secrecy-tls12-res data) SslPolicy/FORWARD_SECRECY_TLS12_RES
      (= :fips-tls13-12-ext0 data) SslPolicy/FIPS_TLS13_12_EXT0
      (= :fips-tls13-10 data) SslPolicy/FIPS_TLS13_10
      (= :fips-tls13-12-ext1 data) SslPolicy/FIPS_TLS13_12_EXT1
      (= :fips-tls13-13 data) SslPolicy/FIPS_TLS13_13
      (= :tls13-res data) SslPolicy/TLS13_RES
      (= :fips-tls13-11 data) SslPolicy/FIPS_TLS13_11
      (= :tls13-11 data) SslPolicy/TLS13_11
      (= :tls12-ext data) SslPolicy/TLS12_EXT
      (= :tls11 data) SslPolicy/TLS11
      (= :tls13-ext1 data) SslPolicy/TLS13_EXT1
      (= :fips-tls13-12-res data) SslPolicy/FIPS_TLS13_12_RES
      (= :tls13-13 data) SslPolicy/TLS13_13
      (= :forward-secrecy-tls12 data) SslPolicy/FORWARD_SECRECY_TLS12
      (= :recommended data) SslPolicy/RECOMMENDED)))


(defn target-group-load-balancing-algorithm-type
  "The `target-group-load-balancing-algorithm-type` function data interprets values in the provided config data into a 
`TargetGroupLoadBalancingAlgorithmType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TargetGroupLoadBalancingAlgorithmType` - the value is returned.
* is `:round-robin` - `TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN` is returned
* is `:least-outstanding-requests` - `TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TargetGroupLoadBalancingAlgorithmType data) data
      (= :round-robin data) TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN
      (= :least-outstanding-requests data) TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS)))


(defn target-type
  "The `target-type` function data interprets values in the provided config data into a 
`TargetType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TargetType` - the value is returned.
* is `:alb` - `TargetType/ALB` is returned
* is `:lambda` - `TargetType/LAMBDA` is returned
* is `:instance` - `TargetType/INSTANCE` is returned
* is `:ip` - `TargetType/IP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TargetType data) data
      (= :alb data) TargetType/ALB
      (= :lambda data) TargetType/LAMBDA
      (= :instance data) TargetType/INSTANCE
      (= :ip data) TargetType/IP)))


(defn unauthenticated-action
  "The `unauthenticated-action` function data interprets values in the provided config data into a 
`UnauthenticatedAction` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `UnauthenticatedAction` - the value is returned.
* is `:allow` - `UnauthenticatedAction/ALLOW` is returned
* is `:authenticate` - `UnauthenticatedAction/AUTHENTICATE` is returned
* is `:deny` - `UnauthenticatedAction/DENY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? UnauthenticatedAction data) data
      (= :allow data) UnauthenticatedAction/ALLOW
      (= :authenticate data) UnauthenticatedAction/AUTHENTICATE
      (= :deny data) UnauthenticatedAction/DENY)))


(defn xff-header-processing-mode
  "The `xff-header-processing-mode` function data interprets values in the provided config data into a 
`XffHeaderProcessingMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `XffHeaderProcessingMode` - the value is returned.
* is `:remove` - `XffHeaderProcessingMode/REMOVE` is returned
* is `:preserve` - `XffHeaderProcessingMode/PRESERVE` is returned
* is `:append` - `XffHeaderProcessingMode/APPEND` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? XffHeaderProcessingMode data) data
      (= :remove data) XffHeaderProcessingMode/REMOVE
      (= :preserve data) XffHeaderProcessingMode/PRESERVE
      (= :append data) XffHeaderProcessingMode/APPEND)))


(defn add-application-action-props-builder>
  "The add-application-action-props-builder> function updates a AddApplicationActionProps$Builder instance using the provided configuration.
  The function takes the AddApplicationActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `removeSuffix` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-suffix` |
"
  [^AddApplicationActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :remove-suffix)]
    (. builder removeSuffix data))
  (.build builder))


(defn add-application-action-props-builder
  "Creates a  `AddApplicationActionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-application-action-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-application-action-props-builder> (new AddApplicationActionProps$Builder) id config))


(defn add-application-target-groups-props-builder>
  "The add-application-target-groups-props-builder> function updates a AddApplicationTargetGroupsProps$Builder instance using the provided configuration.
  The function takes the AddApplicationTargetGroupsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^AddApplicationTargetGroupsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn add-application-target-groups-props-builder
  "Creates a  `AddApplicationTargetGroupsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-application-target-groups-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-application-target-groups-props-builder> (new AddApplicationTargetGroupsProps$Builder) id config))


(defn add-application-targets-props-builder>
  "The add-application-targets-props-builder> function updates a AddApplicationTargetsProps$Builder instance using the provided configuration.
  The function takes the AddApplicationTargetsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `loadBalancingAlgorithmType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType | [[cdk.api.services.elasticloadbalancingv2/target-group-load-balancing-algorithm-type]] | `:load-balancing-algorithm-type` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `slowStart` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:slow-start` |
| `stickinessCookieDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stickiness-cookie-duration` |
| `stickinessCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stickiness-cookie-name` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^AddApplicationTargetsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :deregistration-delay)]
    (. builder deregistrationDelay data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (target-group-load-balancing-algorithm-type config id :load-balancing-algorithm-type)]
    (. builder loadBalancingAlgorithmType data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :slow-start)]
    (. builder slowStart data))
  (when-some [data (lookup-entry config id :stickiness-cookie-duration)]
    (. builder stickinessCookieDuration data))
  (when-some [data (lookup-entry config id :stickiness-cookie-name)]
    (. builder stickinessCookieName data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn add-application-targets-props-builder
  "Creates a  `AddApplicationTargetsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-application-targets-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-application-targets-props-builder> (new AddApplicationTargetsProps$Builder) id config))


(defn add-network-action-props-builder>
  "The add-network-action-props-builder> function updates a AddNetworkActionProps$Builder instance using the provided configuration.
  The function takes the AddNetworkActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:action` |
"
  [^AddNetworkActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn add-network-action-props-builder
  "Creates a  `AddNetworkActionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-network-action-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-network-action-props-builder> (new AddNetworkActionProps$Builder) id config))


(defn add-network-targets-props-builder>
  "The add-network-targets-props-builder> function updates a AddNetworkTargetsProps$Builder instance using the provided configuration.
  The function takes the AddNetworkTargetsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `proxyProtocolV2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy-protocol-v2` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^AddNetworkTargetsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deregistration-delay)]
    (. builder deregistrationDelay data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :proxy-protocol-v2)]
    (. builder proxyProtocolV2 data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn add-network-targets-props-builder
  "Creates a  `AddNetworkTargetsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-network-targets-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-network-targets-props-builder> (new AddNetworkTargetsProps$Builder) id config))


(defn add-rule-props-builder>
  "The add-rule-props-builder> function updates a AddRuleProps$Builder instance using the provided configuration.
  The function takes the AddRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^AddRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn add-rule-props-builder
  "Creates a  `AddRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-rule-props-builder> (new AddRuleProps$Builder) id config))


(defn application-listener-attributes-builder>
  "The application-listener-attributes-builder> function updates a ApplicationListenerAttributes$Builder instance using the provided configuration.
  The function takes the ApplicationListenerAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-port` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
"
  [^ApplicationListenerAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :default-port)]
    (. builder defaultPort data))
  (when-some [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (.build builder))


(defn application-listener-attributes-builder
  "Creates a  `ApplicationListenerAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-listener-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-listener-attributes-builder> (new ApplicationListenerAttributes$Builder) id config))


(defn application-listener-builder>
  "The application-listener-builder> function updates a ApplicationListener$Builder instance using the provided configuration.
  The function takes the ApplicationListener$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
"
  [^ApplicationListener$Builder builder id config]
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :default-target-groups)]
    (. builder defaultTargetGroups data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :open)]
    (. builder open data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn application-listener-builder
  "Creates a  `ApplicationListener$Builder` instance using a scope and ID, applies the data configuration using the [[application-listener-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-listener-builder> (ApplicationListener$Builder/create scope (name id)) id config))


(defn application-listener-certificate-builder>
  "The application-listener-certificate-builder> function updates a ApplicationListenerCertificate$Builder instance using the provided configuration.
  The function takes the ApplicationListenerCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |
"
  [^ApplicationListenerCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :listener)]
    (. builder listener data))
  (.build builder))


(defn application-listener-certificate-builder
  "Creates a  `ApplicationListenerCertificate$Builder` instance using a scope and ID, applies the data configuration using the [[application-listener-certificate-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-listener-certificate-builder> (ApplicationListenerCertificate$Builder/create scope (name id)) id config))


(defn application-listener-certificate-props-builder>
  "The application-listener-certificate-props-builder> function updates a ApplicationListenerCertificateProps$Builder instance using the provided configuration.
  The function takes the ApplicationListenerCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |
"
  [^ApplicationListenerCertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :listener)]
    (. builder listener data))
  (.build builder))


(defn application-listener-certificate-props-builder
  "Creates a  `ApplicationListenerCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-listener-certificate-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-listener-certificate-props-builder> (new ApplicationListenerCertificateProps$Builder) id config))


(defn application-listener-lookup-options-builder>
  "The application-listener-lookup-options-builder> function updates a ApplicationListenerLookupOptions$Builder instance using the provided configuration.
  The function takes the ApplicationListenerLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `listenerProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:listener-protocol` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
"
  [^ApplicationListenerLookupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (application-protocol config id :listener-protocol)]
    (. builder listenerProtocol data))
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (.build builder))


(defn application-listener-lookup-options-builder
  "Creates a  `ApplicationListenerLookupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-listener-lookup-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-listener-lookup-options-builder> (new ApplicationListenerLookupOptions$Builder) id config))


(defn application-listener-props-builder>
  "The application-listener-props-builder> function updates a ApplicationListenerProps$Builder instance using the provided configuration.
  The function takes the ApplicationListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
"
  [^ApplicationListenerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :default-target-groups)]
    (. builder defaultTargetGroups data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :open)]
    (. builder open data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn application-listener-props-builder
  "Creates a  `ApplicationListenerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-listener-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-listener-props-builder> (new ApplicationListenerProps$Builder) id config))


(defn application-listener-rule-builder>
  "The application-listener-rule-builder> function updates a ApplicationListenerRule$Builder instance using the provided configuration.
  The function takes the ApplicationListenerRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^ApplicationListenerRule$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :listener)]
    (. builder listener data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn application-listener-rule-builder
  "Creates a  `ApplicationListenerRule$Builder` instance using a scope and ID, applies the data configuration using the [[application-listener-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-listener-rule-builder> (ApplicationListenerRule$Builder/create scope (name id)) id config))


(defn application-listener-rule-props-builder>
  "The application-listener-rule-props-builder> function updates a ApplicationListenerRuleProps$Builder instance using the provided configuration.
  The function takes the ApplicationListenerRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^ApplicationListenerRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :listener)]
    (. builder listener data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn application-listener-rule-props-builder
  "Creates a  `ApplicationListenerRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-listener-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-listener-rule-props-builder> (new ApplicationListenerRuleProps$Builder) id config))


(defn application-load-balancer-attributes-builder>
  "The application-load-balancer-attributes-builder> function updates a ApplicationLoadBalancerAttributes$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerCanonicalHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-canonical-hosted-zone-id` |
| `loadBalancerDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-dns-name` |
| `securityGroupAllowsAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:security-group-allows-all-outbound` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationLoadBalancerAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-canonical-hosted-zone-id)]
    (. builder loadBalancerCanonicalHostedZoneId data))
  (when-some [data (lookup-entry config id :load-balancer-dns-name)]
    (. builder loadBalancerDnsName data))
  (when-some [data (lookup-entry config id :security-group-allows-all-outbound)]
    (. builder securityGroupAllowsAllOutbound data))
  (when-some [data (lookup-entry config id :security-group-id)]
    (. builder securityGroupId data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-load-balancer-attributes-builder
  "Creates a  `ApplicationLoadBalancerAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-load-balancer-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-load-balancer-attributes-builder> (new ApplicationLoadBalancerAttributes$Builder) id config))


(defn application-load-balancer-builder>
  "The application-load-balancer-builder> function updates a ApplicationLoadBalancer$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientKeepAlive` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:client-keep-alive` |
| `crossZoneEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `denyAllIgwTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deny-all-igw-traffic` |
| `desyncMitigationMode` | software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode | [[cdk.api.services.elasticloadbalancingv2/desync-mitigation-mode]] | `:desync-mitigation-mode` |
| `dropInvalidHeaderFields` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:drop-invalid-header-fields` |
| `http2Enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http2-enabled` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `preserveHostHeader` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-host-header` |
| `preserveXffClientPort` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-xff-client-port` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `wafFailOpen` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:waf-fail-open` |
| `xAmznTlsVersionAndCipherSuiteHeaders` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:x-amzn-tls-version-and-cipher-suite-headers` |
| `xffHeaderProcessingMode` | software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode | [[cdk.api.services.elasticloadbalancingv2/xff-header-processing-mode]] | `:xff-header-processing-mode` |
"
  [^ApplicationLoadBalancer$Builder builder id config]
  (when-some [data (lookup-entry config id :client-keep-alive)]
    (. builder clientKeepAlive data))
  (when-some [data (lookup-entry config id :cross-zone-enabled)]
    (. builder crossZoneEnabled data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :deny-all-igw-traffic)]
    (. builder denyAllIgwTraffic data))
  (when-some [data (desync-mitigation-mode config id :desync-mitigation-mode)]
    (. builder desyncMitigationMode data))
  (when-some [data (lookup-entry config id :drop-invalid-header-fields)]
    (. builder dropInvalidHeaderFields data))
  (when-some [data (lookup-entry config id :http2-enabled)]
    (. builder http2Enabled data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :internet-facing)]
    (. builder internetFacing data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :preserve-host-header)]
    (. builder preserveHostHeader data))
  (when-some [data (lookup-entry config id :preserve-xff-client-port)]
    (. builder preserveXffClientPort data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-some [data (lookup-entry config id :waf-fail-open)]
    (. builder wafFailOpen data))
  (when-some [data (lookup-entry config id :x-amzn-tls-version-and-cipher-suite-headers)]
    (. builder xAmznTlsVersionAndCipherSuiteHeaders data))
  (when-some [data (xff-header-processing-mode config id :xff-header-processing-mode)]
    (. builder xffHeaderProcessingMode data))
  (.build builder))


(defn application-load-balancer-builder
  "Creates a  `ApplicationLoadBalancer$Builder` instance using a scope and ID, applies the data configuration using the [[application-load-balancer-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-load-balancer-builder> (ApplicationLoadBalancer$Builder/create scope (name id)) id config))


(defn application-load-balancer-lookup-options-builder>
  "The application-load-balancer-lookup-options-builder> function updates a ApplicationLoadBalancerLookupOptions$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
"
  [^ApplicationLoadBalancerLookupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (.build builder))


(defn application-load-balancer-lookup-options-builder
  "Creates a  `ApplicationLoadBalancerLookupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-load-balancer-lookup-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-load-balancer-lookup-options-builder> (new ApplicationLoadBalancerLookupOptions$Builder) id config))


(defn application-load-balancer-props-builder>
  "The application-load-balancer-props-builder> function updates a ApplicationLoadBalancerProps$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientKeepAlive` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:client-keep-alive` |
| `crossZoneEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `denyAllIgwTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deny-all-igw-traffic` |
| `desyncMitigationMode` | software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode | [[cdk.api.services.elasticloadbalancingv2/desync-mitigation-mode]] | `:desync-mitigation-mode` |
| `dropInvalidHeaderFields` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:drop-invalid-header-fields` |
| `http2Enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http2-enabled` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `preserveHostHeader` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-host-header` |
| `preserveXffClientPort` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-xff-client-port` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `wafFailOpen` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:waf-fail-open` |
| `xAmznTlsVersionAndCipherSuiteHeaders` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:x-amzn-tls-version-and-cipher-suite-headers` |
| `xffHeaderProcessingMode` | software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode | [[cdk.api.services.elasticloadbalancingv2/xff-header-processing-mode]] | `:xff-header-processing-mode` |
"
  [^ApplicationLoadBalancerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-keep-alive)]
    (. builder clientKeepAlive data))
  (when-some [data (lookup-entry config id :cross-zone-enabled)]
    (. builder crossZoneEnabled data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :deny-all-igw-traffic)]
    (. builder denyAllIgwTraffic data))
  (when-some [data (desync-mitigation-mode config id :desync-mitigation-mode)]
    (. builder desyncMitigationMode data))
  (when-some [data (lookup-entry config id :drop-invalid-header-fields)]
    (. builder dropInvalidHeaderFields data))
  (when-some [data (lookup-entry config id :http2-enabled)]
    (. builder http2Enabled data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :internet-facing)]
    (. builder internetFacing data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :preserve-host-header)]
    (. builder preserveHostHeader data))
  (when-some [data (lookup-entry config id :preserve-xff-client-port)]
    (. builder preserveXffClientPort data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-some [data (lookup-entry config id :waf-fail-open)]
    (. builder wafFailOpen data))
  (when-some [data (lookup-entry config id :x-amzn-tls-version-and-cipher-suite-headers)]
    (. builder xAmznTlsVersionAndCipherSuiteHeaders data))
  (when-some [data (xff-header-processing-mode config id :xff-header-processing-mode)]
    (. builder xffHeaderProcessingMode data))
  (.build builder))


(defn application-load-balancer-props-builder
  "Creates a  `ApplicationLoadBalancerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-load-balancer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-load-balancer-props-builder> (new ApplicationLoadBalancerProps$Builder) id config))


(defn application-load-balancer-redirect-config-builder>
  "The application-load-balancer-redirect-config-builder> function updates a ApplicationLoadBalancerRedirectConfig$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerRedirectConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `sourcePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source-port` |
| `sourceProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:source-protocol` |
| `targetPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-port` |
| `targetProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:target-protocol` |
"
  [^ApplicationLoadBalancerRedirectConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :open)]
    (. builder open data))
  (when-some [data (lookup-entry config id :source-port)]
    (. builder sourcePort data))
  (when-some [data (application-protocol config id :source-protocol)]
    (. builder sourceProtocol data))
  (when-some [data (lookup-entry config id :target-port)]
    (. builder targetPort data))
  (when-some [data (application-protocol config id :target-protocol)]
    (. builder targetProtocol data))
  (.build builder))


(defn application-load-balancer-redirect-config-builder
  "Creates a  `ApplicationLoadBalancerRedirectConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-load-balancer-redirect-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-load-balancer-redirect-config-builder> (new ApplicationLoadBalancerRedirectConfig$Builder) id config))


(defn application-target-group-builder>
  "The application-target-group-builder> function updates a ApplicationTargetGroup$Builder instance using the provided configuration.
  The function takes the ApplicationTargetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `loadBalancingAlgorithmType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType | [[cdk.api.services.elasticloadbalancingv2/target-group-load-balancing-algorithm-type]] | `:load-balancing-algorithm-type` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `slowStart` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:slow-start` |
| `stickinessCookieDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stickiness-cookie-duration` |
| `stickinessCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stickiness-cookie-name` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationTargetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :deregistration-delay)]
    (. builder deregistrationDelay data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (target-group-load-balancing-algorithm-type config id :load-balancing-algorithm-type)]
    (. builder loadBalancingAlgorithmType data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :slow-start)]
    (. builder slowStart data))
  (when-some [data (lookup-entry config id :stickiness-cookie-duration)]
    (. builder stickinessCookieDuration data))
  (when-some [data (lookup-entry config id :stickiness-cookie-name)]
    (. builder stickinessCookieName data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (when-some [data (target-type config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-target-group-builder
  "Creates a  `ApplicationTargetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[application-target-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-target-group-builder> (ApplicationTargetGroup$Builder/create scope (name id)) id config))


(defn application-target-group-props-builder>
  "The application-target-group-props-builder> function updates a ApplicationTargetGroupProps$Builder instance using the provided configuration.
  The function takes the ApplicationTargetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `loadBalancingAlgorithmType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType | [[cdk.api.services.elasticloadbalancingv2/target-group-load-balancing-algorithm-type]] | `:load-balancing-algorithm-type` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `slowStart` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:slow-start` |
| `stickinessCookieDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stickiness-cookie-duration` |
| `stickinessCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stickiness-cookie-name` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationTargetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deregistration-delay)]
    (. builder deregistrationDelay data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (target-group-load-balancing-algorithm-type config id :load-balancing-algorithm-type)]
    (. builder loadBalancingAlgorithmType data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :slow-start)]
    (. builder slowStart data))
  (when-some [data (lookup-entry config id :stickiness-cookie-duration)]
    (. builder stickinessCookieDuration data))
  (when-some [data (lookup-entry config id :stickiness-cookie-name)]
    (. builder stickinessCookieName data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (when-some [data (target-type config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-target-group-props-builder
  "Creates a  `ApplicationTargetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-target-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-target-group-props-builder> (new ApplicationTargetGroupProps$Builder) id config))


(defn authenticate-oidc-options-builder>
  "The authenticate-oidc-options-builder> function updates a AuthenticateOidcOptions$Builder instance using the provided configuration.
  The function takes the AuthenticateOidcOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowHttpsOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-https-outbound` |
| `authenticationRequestExtraParams` | java.util.Map | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:client-secret` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
| `next` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:next` |
| `onUnauthenticatedRequest` | software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction | [[cdk.api.services.elasticloadbalancingv2/unauthenticated-action]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `tokenEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-endpoint` |
| `userInfoEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info-endpoint` |
"
  [^AuthenticateOidcOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-https-outbound)]
    (. builder allowHttpsOutbound data))
  (when-some [data (lookup-entry config id :authentication-request-extra-params)]
    (. builder authenticationRequestExtraParams data))
  (when-some [data (lookup-entry config id :authorization-endpoint)]
    (. builder authorizationEndpoint data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (when-some [data (unauthenticated-action config id :on-unauthenticated-request)]
    (. builder onUnauthenticatedRequest data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :session-cookie-name)]
    (. builder sessionCookieName data))
  (when-some [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-some [data (lookup-entry config id :token-endpoint)]
    (. builder tokenEndpoint data))
  (when-some [data (lookup-entry config id :user-info-endpoint)]
    (. builder userInfoEndpoint data))
  (.build builder))


(defn authenticate-oidc-options-builder
  "Creates a  `AuthenticateOidcOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[authenticate-oidc-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (authenticate-oidc-options-builder> (new AuthenticateOidcOptions$Builder) id config))


(defn base-application-listener-props-builder>
  "The base-application-listener-props-builder> function updates a BaseApplicationListenerProps$Builder instance using the provided configuration.
  The function takes the BaseApplicationListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
"
  [^BaseApplicationListenerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :default-target-groups)]
    (. builder defaultTargetGroups data))
  (when-some [data (lookup-entry config id :open)]
    (. builder open data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn base-application-listener-props-builder
  "Creates a  `BaseApplicationListenerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-application-listener-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-application-listener-props-builder> (new BaseApplicationListenerProps$Builder) id config))


(defn base-application-listener-rule-props-builder>
  "The base-application-listener-rule-props-builder> function updates a BaseApplicationListenerRuleProps$Builder instance using the provided configuration.
  The function takes the BaseApplicationListenerRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^BaseApplicationListenerRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn base-application-listener-rule-props-builder
  "Creates a  `BaseApplicationListenerRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-application-listener-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-application-listener-rule-props-builder> (new BaseApplicationListenerRuleProps$Builder) id config))


(defn base-listener-lookup-options-builder>
  "The base-listener-lookup-options-builder> function updates a BaseListenerLookupOptions$Builder instance using the provided configuration.
  The function takes the BaseListenerLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
"
  [^BaseListenerLookupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (.build builder))


(defn base-listener-lookup-options-builder
  "Creates a  `BaseListenerLookupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-listener-lookup-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-listener-lookup-options-builder> (new BaseListenerLookupOptions$Builder) id config))


(defn base-load-balancer-lookup-options-builder>
  "The base-load-balancer-lookup-options-builder> function updates a BaseLoadBalancerLookupOptions$Builder instance using the provided configuration.
  The function takes the BaseLoadBalancerLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
"
  [^BaseLoadBalancerLookupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (.build builder))


(defn base-load-balancer-lookup-options-builder
  "Creates a  `BaseLoadBalancerLookupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-load-balancer-lookup-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-load-balancer-lookup-options-builder> (new BaseLoadBalancerLookupOptions$Builder) id config))


(defn base-load-balancer-props-builder>
  "The base-load-balancer-props-builder> function updates a BaseLoadBalancerProps$Builder instance using the provided configuration.
  The function takes the BaseLoadBalancerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossZoneEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `denyAllIgwTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deny-all-igw-traffic` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^BaseLoadBalancerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cross-zone-enabled)]
    (. builder crossZoneEnabled data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :deny-all-igw-traffic)]
    (. builder denyAllIgwTraffic data))
  (when-some [data (lookup-entry config id :internet-facing)]
    (. builder internetFacing data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn base-load-balancer-props-builder
  "Creates a  `BaseLoadBalancerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-load-balancer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-load-balancer-props-builder> (new BaseLoadBalancerProps$Builder) id config))


(defn base-network-listener-props-builder>
  "The base-network-listener-props-builder> function updates a BaseNetworkListenerProps$Builder instance using the provided configuration.
  The function takes the BaseNetworkListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy | [[cdk.api.services.elasticloadbalancingv2/alpn-policy]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
"
  [^BaseNetworkListenerProps$Builder builder id config]
  (when-some [data (alpn-policy config id :alpn-policy)]
    (. builder alpnPolicy data))
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :default-target-groups)]
    (. builder defaultTargetGroups data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn base-network-listener-props-builder
  "Creates a  `BaseNetworkListenerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-network-listener-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-network-listener-props-builder> (new BaseNetworkListenerProps$Builder) id config))


(defn base-target-group-props-builder>
  "The base-target-group-props-builder> function updates a BaseTargetGroupProps$Builder instance using the provided configuration.
  The function takes the BaseTargetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^BaseTargetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deregistration-delay)]
    (. builder deregistrationDelay data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (when-some [data (target-type config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn base-target-group-props-builder
  "Creates a  `BaseTargetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-target-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-target-group-props-builder> (new BaseTargetGroupProps$Builder) id config))


(defn cfn-listener-action-property-builder>
  "The cfn-listener-action-property-builder> function updates a CfnListener$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticateCognitoConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$AuthenticateCognitoConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-cognito-config` |
| `authenticateOidcConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$AuthenticateOidcConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-oidc-config` |
| `fixedResponseConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$FixedResponseConfigProperty | [[cdk.support/lookup-entry]] | `:fixed-response-config` |
| `forwardConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward-config` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |
| `redirectConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redirect-config` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnListener$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authenticate-cognito-config)]
    (. builder authenticateCognitoConfig data))
  (when-some [data (lookup-entry config id :authenticate-oidc-config)]
    (. builder authenticateOidcConfig data))
  (when-some [data (lookup-entry config id :fixed-response-config)]
    (. builder fixedResponseConfig data))
  (when-some [data (lookup-entry config id :forward-config)]
    (. builder forwardConfig data))
  (when-some [data (lookup-entry config id :order)]
    (. builder order data))
  (when-some [data (lookup-entry config id :redirect-config)]
    (. builder redirectConfig data))
  (when-some [data (lookup-entry config id :target-group-arn)]
    (. builder targetGroupArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-listener-action-property-builder
  "Creates a  `CfnListener$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-action-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-action-property-builder> (new CfnListener$ActionProperty$Builder) id config))


(defn cfn-listener-authenticate-cognito-config-property-builder>
  "The cfn-listener-authenticate-cognito-config-property-builder> function updates a CfnListener$AuthenticateCognitoConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$AuthenticateCognitoConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationRequestExtraParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `onUnauthenticatedRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |
| `userPoolClientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-client-id` |
| `userPoolDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-domain` |
"
  [^CfnListener$AuthenticateCognitoConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-request-extra-params)]
    (. builder authenticationRequestExtraParams data))
  (when-some [data (lookup-entry config id :on-unauthenticated-request)]
    (. builder onUnauthenticatedRequest data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :session-cookie-name)]
    (. builder sessionCookieName data))
  (when-some [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-some [data (lookup-entry config id :user-pool-arn)]
    (. builder userPoolArn data))
  (when-some [data (lookup-entry config id :user-pool-client-id)]
    (. builder userPoolClientId data))
  (when-some [data (lookup-entry config id :user-pool-domain)]
    (. builder userPoolDomain data))
  (.build builder))


(defn cfn-listener-authenticate-cognito-config-property-builder
  "Creates a  `CfnListener$AuthenticateCognitoConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-authenticate-cognito-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-authenticate-cognito-config-property-builder> (new CfnListener$AuthenticateCognitoConfigProperty$Builder) id config))


(defn cfn-listener-authenticate-oidc-config-property-builder>
  "The cfn-listener-authenticate-oidc-config-property-builder> function updates a CfnListener$AuthenticateOidcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$AuthenticateOidcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationRequestExtraParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
| `onUnauthenticatedRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `tokenEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-endpoint` |
| `useExistingClientSecret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-existing-client-secret` |
| `userInfoEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info-endpoint` |
"
  [^CfnListener$AuthenticateOidcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-request-extra-params)]
    (. builder authenticationRequestExtraParams data))
  (when-some [data (lookup-entry config id :authorization-endpoint)]
    (. builder authorizationEndpoint data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (when-some [data (lookup-entry config id :on-unauthenticated-request)]
    (. builder onUnauthenticatedRequest data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :session-cookie-name)]
    (. builder sessionCookieName data))
  (when-some [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-some [data (lookup-entry config id :token-endpoint)]
    (. builder tokenEndpoint data))
  (when-some [data (lookup-entry config id :use-existing-client-secret)]
    (. builder useExistingClientSecret data))
  (when-some [data (lookup-entry config id :user-info-endpoint)]
    (. builder userInfoEndpoint data))
  (.build builder))


(defn cfn-listener-authenticate-oidc-config-property-builder
  "Creates a  `CfnListener$AuthenticateOidcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-authenticate-oidc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-authenticate-oidc-config-property-builder> (new CfnListener$AuthenticateOidcConfigProperty$Builder) id config))


(defn cfn-listener-builder>
  "The cfn-listener-builder> function updates a CfnListener$Builder instance using the provided configuration.
  The function takes the CfnListener$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultActions` | java.util.List | [[cdk.support/lookup-entry]] | `:default-actions` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `mutualAuthentication` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$MutualAuthenticationProperty | [[cdk.support/lookup-entry]] | `:mutual-authentication` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `sslPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-policy` |
"
  [^CfnListener$Builder builder id config]
  (when-some [data (lookup-entry config id :alpn-policy)]
    (. builder alpnPolicy data))
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-actions)]
    (. builder defaultActions data))
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :mutual-authentication)]
    (. builder mutualAuthentication data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn cfn-listener-builder
  "Creates a  `CfnListener$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-listener-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-listener-builder> (CfnListener$Builder/create scope (name id)) id config))


(defn cfn-listener-certificate-builder>
  "The cfn-listener-certificate-builder> function updates a CfnListenerCertificate$Builder instance using the provided configuration.
  The function takes the CfnListenerCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
"
  [^CfnListenerCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (.build builder))


(defn cfn-listener-certificate-builder
  "Creates a  `CfnListenerCertificate$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-listener-certificate-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-listener-certificate-builder> (CfnListenerCertificate$Builder/create scope (name id)) id config))


(defn cfn-listener-certificate-certificate-property-builder>
  "The cfn-listener-certificate-certificate-property-builder> function updates a CfnListenerCertificate$CertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerCertificate$CertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
"
  [^CfnListenerCertificate$CertificateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (.build builder))


(defn cfn-listener-certificate-certificate-property-builder
  "Creates a  `CfnListenerCertificate$CertificateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-certificate-certificate-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-certificate-certificate-property-builder> (new CfnListenerCertificate$CertificateProperty$Builder) id config))


(defn cfn-listener-certificate-property-builder>
  "The cfn-listener-certificate-property-builder> function updates a CfnListener$CertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$CertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
"
  [^CfnListener$CertificateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (.build builder))


(defn cfn-listener-certificate-property-builder
  "Creates a  `CfnListener$CertificateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-certificate-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-certificate-property-builder> (new CfnListener$CertificateProperty$Builder) id config))


(defn cfn-listener-certificate-props-builder>
  "The cfn-listener-certificate-props-builder> function updates a CfnListenerCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnListenerCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificates` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
"
  [^CfnListenerCertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (.build builder))


(defn cfn-listener-certificate-props-builder
  "Creates a  `CfnListenerCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-certificate-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-certificate-props-builder> (new CfnListenerCertificateProps$Builder) id config))


(defn cfn-listener-fixed-response-config-property-builder>
  "The cfn-listener-fixed-response-config-property-builder> function updates a CfnListener$FixedResponseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$FixedResponseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `messageBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-body` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnListener$FixedResponseConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :message-body)]
    (. builder messageBody data))
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-listener-fixed-response-config-property-builder
  "Creates a  `CfnListener$FixedResponseConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-fixed-response-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-fixed-response-config-property-builder> (new CfnListener$FixedResponseConfigProperty$Builder) id config))


(defn cfn-listener-forward-config-property-builder>
  "The cfn-listener-forward-config-property-builder> function updates a CfnListener$ForwardConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$ForwardConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupStickinessConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$TargetGroupStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:target-group-stickiness-config` |
| `targetGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^CfnListener$ForwardConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group-stickiness-config)]
    (. builder targetGroupStickinessConfig data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn cfn-listener-forward-config-property-builder
  "Creates a  `CfnListener$ForwardConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-forward-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-forward-config-property-builder> (new CfnListener$ForwardConfigProperty$Builder) id config))


(defn cfn-listener-mutual-authentication-property-builder>
  "The cfn-listener-mutual-authentication-property-builder> function updates a CfnListener$MutualAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$MutualAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ignoreClientCertificateExpiry` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ignore-client-certificate-expiry` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |
"
  [^CfnListener$MutualAuthenticationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ignore-client-certificate-expiry)]
    (. builder ignoreClientCertificateExpiry data))
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :trust-store-arn)]
    (. builder trustStoreArn data))
  (.build builder))


(defn cfn-listener-mutual-authentication-property-builder
  "Creates a  `CfnListener$MutualAuthenticationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-mutual-authentication-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-mutual-authentication-property-builder> (new CfnListener$MutualAuthenticationProperty$Builder) id config))


(defn cfn-listener-props-builder>
  "The cfn-listener-props-builder> function updates a CfnListenerProps$Builder instance using the provided configuration.
  The function takes the CfnListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:alpn-policy` |
| `certificates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultActions` | java.util.List | [[cdk.support/lookup-entry]] | `:default-actions` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `mutualAuthentication` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$MutualAuthenticationProperty | [[cdk.support/lookup-entry]] | `:mutual-authentication` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `sslPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-policy` |
"
  [^CfnListenerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alpn-policy)]
    (. builder alpnPolicy data))
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-actions)]
    (. builder defaultActions data))
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :mutual-authentication)]
    (. builder mutualAuthentication data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn cfn-listener-props-builder
  "Creates a  `CfnListenerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-props-builder> (new CfnListenerProps$Builder) id config))


(defn cfn-listener-redirect-config-property-builder>
  "The cfn-listener-redirect-config-property-builder> function updates a CfnListener$RedirectConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$RedirectConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `query` | java.lang.String | [[cdk.support/lookup-entry]] | `:query` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnListener$RedirectConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :host)]
    (. builder host data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :query)]
    (. builder query data))
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-listener-redirect-config-property-builder
  "Creates a  `CfnListener$RedirectConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-redirect-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-redirect-config-property-builder> (new CfnListener$RedirectConfigProperty$Builder) id config))


(defn cfn-listener-rule-action-property-builder>
  "The cfn-listener-rule-action-property-builder> function updates a CfnListenerRule$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticateCognitoConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$AuthenticateCognitoConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-cognito-config` |
| `authenticateOidcConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$AuthenticateOidcConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-oidc-config` |
| `fixedResponseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fixed-response-config` |
| `forwardConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward-config` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |
| `redirectConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$RedirectConfigProperty | [[cdk.support/lookup-entry]] | `:redirect-config` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnListenerRule$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authenticate-cognito-config)]
    (. builder authenticateCognitoConfig data))
  (when-some [data (lookup-entry config id :authenticate-oidc-config)]
    (. builder authenticateOidcConfig data))
  (when-some [data (lookup-entry config id :fixed-response-config)]
    (. builder fixedResponseConfig data))
  (when-some [data (lookup-entry config id :forward-config)]
    (. builder forwardConfig data))
  (when-some [data (lookup-entry config id :order)]
    (. builder order data))
  (when-some [data (lookup-entry config id :redirect-config)]
    (. builder redirectConfig data))
  (when-some [data (lookup-entry config id :target-group-arn)]
    (. builder targetGroupArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-listener-rule-action-property-builder
  "Creates a  `CfnListenerRule$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-action-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-action-property-builder> (new CfnListenerRule$ActionProperty$Builder) id config))


(defn cfn-listener-rule-authenticate-cognito-config-property-builder>
  "The cfn-listener-rule-authenticate-cognito-config-property-builder> function updates a CfnListenerRule$AuthenticateCognitoConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$AuthenticateCognitoConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationRequestExtraParams` | java.util.Map | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `onUnauthenticatedRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |
| `userPoolClientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-client-id` |
| `userPoolDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-domain` |
"
  [^CfnListenerRule$AuthenticateCognitoConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-request-extra-params)]
    (. builder authenticationRequestExtraParams data))
  (when-some [data (lookup-entry config id :on-unauthenticated-request)]
    (. builder onUnauthenticatedRequest data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :session-cookie-name)]
    (. builder sessionCookieName data))
  (when-some [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-some [data (lookup-entry config id :user-pool-arn)]
    (. builder userPoolArn data))
  (when-some [data (lookup-entry config id :user-pool-client-id)]
    (. builder userPoolClientId data))
  (when-some [data (lookup-entry config id :user-pool-domain)]
    (. builder userPoolDomain data))
  (.build builder))


(defn cfn-listener-rule-authenticate-cognito-config-property-builder
  "Creates a  `CfnListenerRule$AuthenticateCognitoConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-authenticate-cognito-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-authenticate-cognito-config-property-builder> (new CfnListenerRule$AuthenticateCognitoConfigProperty$Builder) id config))


(defn cfn-listener-rule-authenticate-oidc-config-property-builder>
  "The cfn-listener-rule-authenticate-oidc-config-property-builder> function updates a CfnListenerRule$AuthenticateOidcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$AuthenticateOidcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationRequestExtraParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
| `onUnauthenticatedRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `tokenEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-endpoint` |
| `useExistingClientSecret` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-existing-client-secret` |
| `userInfoEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info-endpoint` |
"
  [^CfnListenerRule$AuthenticateOidcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-request-extra-params)]
    (. builder authenticationRequestExtraParams data))
  (when-some [data (lookup-entry config id :authorization-endpoint)]
    (. builder authorizationEndpoint data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (when-some [data (lookup-entry config id :on-unauthenticated-request)]
    (. builder onUnauthenticatedRequest data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :session-cookie-name)]
    (. builder sessionCookieName data))
  (when-some [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-some [data (lookup-entry config id :token-endpoint)]
    (. builder tokenEndpoint data))
  (when-some [data (lookup-entry config id :use-existing-client-secret)]
    (. builder useExistingClientSecret data))
  (when-some [data (lookup-entry config id :user-info-endpoint)]
    (. builder userInfoEndpoint data))
  (.build builder))


(defn cfn-listener-rule-authenticate-oidc-config-property-builder
  "Creates a  `CfnListenerRule$AuthenticateOidcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-authenticate-oidc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-authenticate-oidc-config-property-builder> (new CfnListenerRule$AuthenticateOidcConfigProperty$Builder) id config))


(defn cfn-listener-rule-builder>
  "The cfn-listener-rule-builder> function updates a CfnListenerRule$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^CfnListenerRule$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn cfn-listener-rule-builder
  "Creates a  `CfnListenerRule$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-listener-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-listener-rule-builder> (CfnListenerRule$Builder/create scope (name id)) id config))


(defn cfn-listener-rule-fixed-response-config-property-builder>
  "The cfn-listener-rule-fixed-response-config-property-builder> function updates a CfnListenerRule$FixedResponseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$FixedResponseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `messageBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-body` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnListenerRule$FixedResponseConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :message-body)]
    (. builder messageBody data))
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-listener-rule-fixed-response-config-property-builder
  "Creates a  `CfnListenerRule$FixedResponseConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-fixed-response-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-fixed-response-config-property-builder> (new CfnListenerRule$FixedResponseConfigProperty$Builder) id config))


(defn cfn-listener-rule-forward-config-property-builder>
  "The cfn-listener-rule-forward-config-property-builder> function updates a CfnListenerRule$ForwardConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$ForwardConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupStickinessConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$TargetGroupStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:target-group-stickiness-config` |
| `targetGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups` |
"
  [^CfnListenerRule$ForwardConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group-stickiness-config)]
    (. builder targetGroupStickinessConfig data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (.build builder))


(defn cfn-listener-rule-forward-config-property-builder
  "Creates a  `CfnListenerRule$ForwardConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-forward-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-forward-config-property-builder> (new CfnListenerRule$ForwardConfigProperty$Builder) id config))


(defn cfn-listener-rule-host-header-config-property-builder>
  "The cfn-listener-rule-host-header-config-property-builder> function updates a CfnListenerRule$HostHeaderConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$HostHeaderConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnListenerRule$HostHeaderConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-listener-rule-host-header-config-property-builder
  "Creates a  `CfnListenerRule$HostHeaderConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-host-header-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-host-header-config-property-builder> (new CfnListenerRule$HostHeaderConfigProperty$Builder) id config))


(defn cfn-listener-rule-http-header-config-property-builder>
  "The cfn-listener-rule-http-header-config-property-builder> function updates a CfnListenerRule$HttpHeaderConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$HttpHeaderConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpHeaderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-header-name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnListenerRule$HttpHeaderConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :http-header-name)]
    (. builder httpHeaderName data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-listener-rule-http-header-config-property-builder
  "Creates a  `CfnListenerRule$HttpHeaderConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-http-header-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-http-header-config-property-builder> (new CfnListenerRule$HttpHeaderConfigProperty$Builder) id config))


(defn cfn-listener-rule-http-request-method-config-property-builder>
  "The cfn-listener-rule-http-request-method-config-property-builder> function updates a CfnListenerRule$HttpRequestMethodConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$HttpRequestMethodConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnListenerRule$HttpRequestMethodConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-listener-rule-http-request-method-config-property-builder
  "Creates a  `CfnListenerRule$HttpRequestMethodConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-http-request-method-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-http-request-method-config-property-builder> (new CfnListenerRule$HttpRequestMethodConfigProperty$Builder) id config))


(defn cfn-listener-rule-path-pattern-config-property-builder>
  "The cfn-listener-rule-path-pattern-config-property-builder> function updates a CfnListenerRule$PathPatternConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$PathPatternConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnListenerRule$PathPatternConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-listener-rule-path-pattern-config-property-builder
  "Creates a  `CfnListenerRule$PathPatternConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-path-pattern-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-path-pattern-config-property-builder> (new CfnListenerRule$PathPatternConfigProperty$Builder) id config))


(defn cfn-listener-rule-props-builder>
  "The cfn-listener-rule-props-builder> function updates a CfnListenerRuleProps$Builder instance using the provided configuration.
  The function takes the CfnListenerRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^CfnListenerRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn cfn-listener-rule-props-builder
  "Creates a  `CfnListenerRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-props-builder> (new CfnListenerRuleProps$Builder) id config))


(defn cfn-listener-rule-query-string-config-property-builder>
  "The cfn-listener-rule-query-string-config-property-builder> function updates a CfnListenerRule$QueryStringConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$QueryStringConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnListenerRule$QueryStringConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-listener-rule-query-string-config-property-builder
  "Creates a  `CfnListenerRule$QueryStringConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-query-string-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-query-string-config-property-builder> (new CfnListenerRule$QueryStringConfigProperty$Builder) id config))


(defn cfn-listener-rule-query-string-key-value-property-builder>
  "The cfn-listener-rule-query-string-key-value-property-builder> function updates a CfnListenerRule$QueryStringKeyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$QueryStringKeyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnListenerRule$QueryStringKeyValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-listener-rule-query-string-key-value-property-builder
  "Creates a  `CfnListenerRule$QueryStringKeyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-query-string-key-value-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-query-string-key-value-property-builder> (new CfnListenerRule$QueryStringKeyValueProperty$Builder) id config))


(defn cfn-listener-rule-redirect-config-property-builder>
  "The cfn-listener-rule-redirect-config-property-builder> function updates a CfnListenerRule$RedirectConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$RedirectConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `query` | java.lang.String | [[cdk.support/lookup-entry]] | `:query` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnListenerRule$RedirectConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :host)]
    (. builder host data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :query)]
    (. builder query data))
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-listener-rule-redirect-config-property-builder
  "Creates a  `CfnListenerRule$RedirectConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-redirect-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-redirect-config-property-builder> (new CfnListenerRule$RedirectConfigProperty$Builder) id config))


(defn cfn-listener-rule-rule-condition-property-builder>
  "The cfn-listener-rule-rule-condition-property-builder> function updates a CfnListenerRule$RuleConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$RuleConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `hostHeaderConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:host-header-config` |
| `httpHeaderConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-header-config` |
| `httpRequestMethodConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-request-method-config` |
| `pathPatternConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path-pattern-config` |
| `queryStringConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$QueryStringConfigProperty | [[cdk.support/lookup-entry]] | `:query-string-config` |
| `sourceIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-ip-config` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnListenerRule$RuleConditionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :field)]
    (. builder field data))
  (when-some [data (lookup-entry config id :host-header-config)]
    (. builder hostHeaderConfig data))
  (when-some [data (lookup-entry config id :http-header-config)]
    (. builder httpHeaderConfig data))
  (when-some [data (lookup-entry config id :http-request-method-config)]
    (. builder httpRequestMethodConfig data))
  (when-some [data (lookup-entry config id :path-pattern-config)]
    (. builder pathPatternConfig data))
  (when-some [data (lookup-entry config id :query-string-config)]
    (. builder queryStringConfig data))
  (when-some [data (lookup-entry config id :source-ip-config)]
    (. builder sourceIpConfig data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-listener-rule-rule-condition-property-builder
  "Creates a  `CfnListenerRule$RuleConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-rule-condition-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-rule-condition-property-builder> (new CfnListenerRule$RuleConditionProperty$Builder) id config))


(defn cfn-listener-rule-source-ip-config-property-builder>
  "The cfn-listener-rule-source-ip-config-property-builder> function updates a CfnListenerRule$SourceIpConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$SourceIpConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnListenerRule$SourceIpConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-listener-rule-source-ip-config-property-builder
  "Creates a  `CfnListenerRule$SourceIpConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-source-ip-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-source-ip-config-property-builder> (new CfnListenerRule$SourceIpConfigProperty$Builder) id config))


(defn cfn-listener-rule-target-group-stickiness-config-property-builder>
  "The cfn-listener-rule-target-group-stickiness-config-property-builder> function updates a CfnListenerRule$TargetGroupStickinessConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$TargetGroupStickinessConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnListenerRule$TargetGroupStickinessConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-seconds)]
    (. builder durationSeconds data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-listener-rule-target-group-stickiness-config-property-builder
  "Creates a  `CfnListenerRule$TargetGroupStickinessConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-target-group-stickiness-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-target-group-stickiness-config-property-builder> (new CfnListenerRule$TargetGroupStickinessConfigProperty$Builder) id config))


(defn cfn-listener-rule-target-group-tuple-property-builder>
  "The cfn-listener-rule-target-group-tuple-property-builder> function updates a CfnListenerRule$TargetGroupTupleProperty$Builder instance using the provided configuration.
  The function takes the CfnListenerRule$TargetGroupTupleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnListenerRule$TargetGroupTupleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group-arn)]
    (. builder targetGroupArn data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-listener-rule-target-group-tuple-property-builder
  "Creates a  `CfnListenerRule$TargetGroupTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-rule-target-group-tuple-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-rule-target-group-tuple-property-builder> (new CfnListenerRule$TargetGroupTupleProperty$Builder) id config))


(defn cfn-listener-target-group-stickiness-config-property-builder>
  "The cfn-listener-target-group-stickiness-config-property-builder> function updates a CfnListener$TargetGroupStickinessConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$TargetGroupStickinessConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnListener$TargetGroupStickinessConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-seconds)]
    (. builder durationSeconds data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-listener-target-group-stickiness-config-property-builder
  "Creates a  `CfnListener$TargetGroupStickinessConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-target-group-stickiness-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-target-group-stickiness-config-property-builder> (new CfnListener$TargetGroupStickinessConfigProperty$Builder) id config))


(defn cfn-listener-target-group-tuple-property-builder>
  "The cfn-listener-target-group-tuple-property-builder> function updates a CfnListener$TargetGroupTupleProperty$Builder instance using the provided configuration.
  The function takes the CfnListener$TargetGroupTupleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnListener$TargetGroupTupleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group-arn)]
    (. builder targetGroupArn data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-listener-target-group-tuple-property-builder
  "Creates a  `CfnListener$TargetGroupTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-listener-target-group-tuple-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-listener-target-group-tuple-property-builder> (new CfnListener$TargetGroupTupleProperty$Builder) id config))


(defn cfn-load-balancer-builder>
  "The cfn-load-balancer-builder> function updates a CfnLoadBalancer$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforceSecurityGroupInboundRulesOnPrivateLinkTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:enforce-security-group-inbound-rules-on-private-link-traffic` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `loadBalancerAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheme` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subnet-mappings` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLoadBalancer$Builder builder id config]
  (when-some [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
    (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-attributes)]
    (. builder loadBalancerAttributes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :scheme)]
    (. builder scheme data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-mappings)]
    (. builder subnetMappings data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-load-balancer-builder
  "Creates a  `CfnLoadBalancer$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-load-balancer-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-load-balancer-builder> (CfnLoadBalancer$Builder/create scope (name id)) id config))


(defn cfn-load-balancer-load-balancer-attribute-property-builder>
  "The cfn-load-balancer-load-balancer-attribute-property-builder> function updates a CfnLoadBalancer$LoadBalancerAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancer$LoadBalancerAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnLoadBalancer$LoadBalancerAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-load-balancer-load-balancer-attribute-property-builder
  "Creates a  `CfnLoadBalancer$LoadBalancerAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-load-balancer-load-balancer-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-load-balancer-load-balancer-attribute-property-builder> (new CfnLoadBalancer$LoadBalancerAttributeProperty$Builder) id config))


(defn cfn-load-balancer-props-builder>
  "The cfn-load-balancer-props-builder> function updates a CfnLoadBalancerProps$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforceSecurityGroupInboundRulesOnPrivateLinkTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:enforce-security-group-inbound-rules-on-private-link-traffic` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `loadBalancerAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheme` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subnet-mappings` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLoadBalancerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
    (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-attributes)]
    (. builder loadBalancerAttributes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :scheme)]
    (. builder scheme data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-mappings)]
    (. builder subnetMappings data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-load-balancer-props-builder
  "Creates a  `CfnLoadBalancerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-load-balancer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-load-balancer-props-builder> (new CfnLoadBalancerProps$Builder) id config))


(defn cfn-load-balancer-subnet-mapping-property-builder>
  "The cfn-load-balancer-subnet-mapping-property-builder> function updates a CfnLoadBalancer$SubnetMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancer$SubnetMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-id` |
| `iPv6Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:i-pv6-address` |
| `privateIPv4Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-i-pv4-address` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnLoadBalancer$SubnetMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allocation-id)]
    (. builder allocationId data))
  (when-some [data (lookup-entry config id :i-pv6-address)]
    (. builder iPv6Address data))
  (when-some [data (lookup-entry config id :private-i-pv4-address)]
    (. builder privateIPv4Address data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-load-balancer-subnet-mapping-property-builder
  "Creates a  `CfnLoadBalancer$SubnetMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-load-balancer-subnet-mapping-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-load-balancer-subnet-mapping-property-builder> (new CfnLoadBalancer$SubnetMappingProperty$Builder) id config))


(defn cfn-target-group-builder>
  "The cfn-target-group-builder> function updates a CfnTargetGroup$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheckEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:health-check-enabled` |
| `healthCheckIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-interval-seconds` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `healthCheckPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-port` |
| `healthCheckProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-protocol` |
| `healthCheckTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-timeout-seconds` |
| `healthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold-count` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `matcher` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup$MatcherProperty | [[cdk.support/lookup-entry]] | `:matcher` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `protocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-version` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetGroupAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:target-group-attributes` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `unhealthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold-count` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnTargetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :health-check-enabled)]
    (. builder healthCheckEnabled data))
  (when-some [data (lookup-entry config id :health-check-interval-seconds)]
    (. builder healthCheckIntervalSeconds data))
  (when-some [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-some [data (lookup-entry config id :health-check-port)]
    (. builder healthCheckPort data))
  (when-some [data (lookup-entry config id :health-check-protocol)]
    (. builder healthCheckProtocol data))
  (when-some [data (lookup-entry config id :health-check-timeout-seconds)]
    (. builder healthCheckTimeoutSeconds data))
  (when-some [data (lookup-entry config id :healthy-threshold-count)]
    (. builder healthyThresholdCount data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :matcher)]
    (. builder matcher data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-group-attributes)]
    (. builder targetGroupAttributes data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :unhealthy-threshold-count)]
    (. builder unhealthyThresholdCount data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-target-group-builder
  "Creates a  `CfnTargetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-target-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-target-group-builder> (CfnTargetGroup$Builder/create scope (name id)) id config))


(defn cfn-target-group-matcher-property-builder>
  "The cfn-target-group-matcher-property-builder> function updates a CfnTargetGroup$MatcherProperty$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$MatcherProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:grpc-code` |
| `httpCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-code` |
"
  [^CfnTargetGroup$MatcherProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :grpc-code)]
    (. builder grpcCode data))
  (when-some [data (lookup-entry config id :http-code)]
    (. builder httpCode data))
  (.build builder))


(defn cfn-target-group-matcher-property-builder
  "Creates a  `CfnTargetGroup$MatcherProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-target-group-matcher-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-target-group-matcher-property-builder> (new CfnTargetGroup$MatcherProperty$Builder) id config))


(defn cfn-target-group-props-builder>
  "The cfn-target-group-props-builder> function updates a CfnTargetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnTargetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheckEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:health-check-enabled` |
| `healthCheckIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-interval-seconds` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `healthCheckPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-port` |
| `healthCheckProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-protocol` |
| `healthCheckTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-timeout-seconds` |
| `healthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold-count` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `matcher` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:matcher` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `protocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-version` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetGroupAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-group-attributes` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
| `unhealthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold-count` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnTargetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :health-check-enabled)]
    (. builder healthCheckEnabled data))
  (when-some [data (lookup-entry config id :health-check-interval-seconds)]
    (. builder healthCheckIntervalSeconds data))
  (when-some [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-some [data (lookup-entry config id :health-check-port)]
    (. builder healthCheckPort data))
  (when-some [data (lookup-entry config id :health-check-protocol)]
    (. builder healthCheckProtocol data))
  (when-some [data (lookup-entry config id :health-check-timeout-seconds)]
    (. builder healthCheckTimeoutSeconds data))
  (when-some [data (lookup-entry config id :healthy-threshold-count)]
    (. builder healthyThresholdCount data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :matcher)]
    (. builder matcher data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-group-attributes)]
    (. builder targetGroupAttributes data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :unhealthy-threshold-count)]
    (. builder unhealthyThresholdCount data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-target-group-props-builder
  "Creates a  `CfnTargetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-target-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-target-group-props-builder> (new CfnTargetGroupProps$Builder) id config))


(defn cfn-target-group-target-description-property-builder>
  "The cfn-target-group-target-description-property-builder> function updates a CfnTargetGroup$TargetDescriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$TargetDescriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnTargetGroup$TargetDescriptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-target-group-target-description-property-builder
  "Creates a  `CfnTargetGroup$TargetDescriptionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-target-group-target-description-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-target-group-target-description-property-builder> (new CfnTargetGroup$TargetDescriptionProperty$Builder) id config))


(defn cfn-target-group-target-group-attribute-property-builder>
  "The cfn-target-group-target-group-attribute-property-builder> function updates a CfnTargetGroup$TargetGroupAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnTargetGroup$TargetGroupAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTargetGroup$TargetGroupAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-target-group-target-group-attribute-property-builder
  "Creates a  `CfnTargetGroup$TargetGroupAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-target-group-target-group-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-target-group-target-group-attribute-property-builder> (new CfnTargetGroup$TargetGroupAttributeProperty$Builder) id config))


(defn cfn-trust-store-builder>
  "The cfn-trust-store-builder> function updates a CfnTrustStore$Builder instance using the provided configuration.
  The function takes the CfnTrustStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatesBundleS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-bucket` |
| `caCertificatesBundleS3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-key` |
| `caCertificatesBundleS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-object-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrustStore$Builder builder id config]
  (when-some [data (lookup-entry config id :ca-certificates-bundle-s3-bucket)]
    (. builder caCertificatesBundleS3Bucket data))
  (when-some [data (lookup-entry config id :ca-certificates-bundle-s3-key)]
    (. builder caCertificatesBundleS3Key data))
  (when-some [data (lookup-entry config id :ca-certificates-bundle-s3-object-version)]
    (. builder caCertificatesBundleS3ObjectVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-trust-store-builder
  "Creates a  `CfnTrustStore$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-trust-store-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-trust-store-builder> (CfnTrustStore$Builder/create scope (name id)) id config))


(defn cfn-trust-store-props-builder>
  "The cfn-trust-store-props-builder> function updates a CfnTrustStoreProps$Builder instance using the provided configuration.
  The function takes the CfnTrustStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatesBundleS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-bucket` |
| `caCertificatesBundleS3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-key` |
| `caCertificatesBundleS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-object-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrustStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :ca-certificates-bundle-s3-bucket)]
    (. builder caCertificatesBundleS3Bucket data))
  (when-some [data (lookup-entry config id :ca-certificates-bundle-s3-key)]
    (. builder caCertificatesBundleS3Key data))
  (when-some [data (lookup-entry config id :ca-certificates-bundle-s3-object-version)]
    (. builder caCertificatesBundleS3ObjectVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-trust-store-props-builder
  "Creates a  `CfnTrustStoreProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-trust-store-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-trust-store-props-builder> (new CfnTrustStoreProps$Builder) id config))


(defn cfn-trust-store-revocation-builder>
  "The cfn-trust-store-revocation-builder> function updates a CfnTrustStoreRevocation$Builder instance using the provided configuration.
  The function takes the CfnTrustStoreRevocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revocationContents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:revocation-contents` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |
"
  [^CfnTrustStoreRevocation$Builder builder id config]
  (when-some [data (lookup-entry config id :revocation-contents)]
    (. builder revocationContents data))
  (when-some [data (lookup-entry config id :trust-store-arn)]
    (. builder trustStoreArn data))
  (.build builder))


(defn cfn-trust-store-revocation-builder
  "Creates a  `CfnTrustStoreRevocation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-trust-store-revocation-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-trust-store-revocation-builder> (CfnTrustStoreRevocation$Builder/create scope (name id)) id config))


(defn cfn-trust-store-revocation-props-builder>
  "The cfn-trust-store-revocation-props-builder> function updates a CfnTrustStoreRevocationProps$Builder instance using the provided configuration.
  The function takes the CfnTrustStoreRevocationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revocationContents` | java.util.List | [[cdk.support/lookup-entry]] | `:revocation-contents` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |
"
  [^CfnTrustStoreRevocationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :revocation-contents)]
    (. builder revocationContents data))
  (when-some [data (lookup-entry config id :trust-store-arn)]
    (. builder trustStoreArn data))
  (.build builder))


(defn cfn-trust-store-revocation-props-builder
  "Creates a  `CfnTrustStoreRevocationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-trust-store-revocation-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-trust-store-revocation-props-builder> (new CfnTrustStoreRevocationProps$Builder) id config))


(defn cfn-trust-store-revocation-revocation-content-property-builder>
  "The cfn-trust-store-revocation-revocation-content-property-builder> function updates a CfnTrustStoreRevocation$RevocationContentProperty$Builder instance using the provided configuration.
  The function takes the CfnTrustStoreRevocation$RevocationContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:revocation-type` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |
"
  [^CfnTrustStoreRevocation$RevocationContentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :revocation-type)]
    (. builder revocationType data))
  (when-some [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-some [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (when-some [data (lookup-entry config id :s3-object-version)]
    (. builder s3ObjectVersion data))
  (.build builder))


(defn cfn-trust-store-revocation-revocation-content-property-builder
  "Creates a  `CfnTrustStoreRevocation$RevocationContentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-trust-store-revocation-revocation-content-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-trust-store-revocation-revocation-content-property-builder> (new CfnTrustStoreRevocation$RevocationContentProperty$Builder) id config))


(defn cfn-trust-store-revocation-trust-store-revocation-property-builder>
  "The cfn-trust-store-revocation-trust-store-revocation-property-builder> function updates a CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder instance using the provided configuration.
  The function takes the CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfRevokedEntries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-revoked-entries` |
| `revocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:revocation-id` |
| `revocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:revocation-type` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |
"
  [^CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :number-of-revoked-entries)]
    (. builder numberOfRevokedEntries data))
  (when-some [data (lookup-entry config id :revocation-id)]
    (. builder revocationId data))
  (when-some [data (lookup-entry config id :revocation-type)]
    (. builder revocationType data))
  (when-some [data (lookup-entry config id :trust-store-arn)]
    (. builder trustStoreArn data))
  (.build builder))


(defn cfn-trust-store-revocation-trust-store-revocation-property-builder
  "Creates a  `CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-trust-store-revocation-trust-store-revocation-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-trust-store-revocation-trust-store-revocation-property-builder> (new CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder) id config))


(defn fixed-response-options-builder>
  "The fixed-response-options-builder> function updates a FixedResponseOptions$Builder instance using the provided configuration.
  The function takes the FixedResponseOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `messageBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-body` |
"
  [^FixedResponseOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :message-body)]
    (. builder messageBody data))
  (.build builder))


(defn fixed-response-options-builder
  "Creates a  `FixedResponseOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[fixed-response-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (fixed-response-options-builder> (new FixedResponseOptions$Builder) id config))


(defn forward-options-builder>
  "The forward-options-builder> function updates a ForwardOptions$Builder instance using the provided configuration.
  The function takes the ForwardOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stickinessDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stickiness-duration` |
"
  [^ForwardOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :stickiness-duration)]
    (. builder stickinessDuration data))
  (.build builder))


(defn forward-options-builder
  "Creates a  `ForwardOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[forward-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (forward-options-builder> (new ForwardOptions$Builder) id config))


(defn health-check-builder>
  "The health-check-builder> function updates a HealthCheck$Builder instance using the provided configuration.
  The function takes the HealthCheck$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `healthyGrpcCodes` | java.lang.String | [[cdk.support/lookup-entry]] | `:healthy-grpc-codes` |
| `healthyHttpCodes` | java.lang.String | [[cdk.support/lookup-entry]] | `:healthy-http-codes` |
| `healthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold-count` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold-count` |
"
  [^HealthCheck$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :healthy-grpc-codes)]
    (. builder healthyGrpcCodes data))
  (when-some [data (lookup-entry config id :healthy-http-codes)]
    (. builder healthyHttpCodes data))
  (when-some [data (lookup-entry config id :healthy-threshold-count)]
    (. builder healthyThresholdCount data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :unhealthy-threshold-count)]
    (. builder unhealthyThresholdCount data))
  (.build builder))


(defn health-check-builder
  "Creates a  `HealthCheck$Builder` instance using a no-argument constructor, applies the data configuration using the [[health-check-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (health-check-builder> (new HealthCheck$Builder) id config))


(defn load-balancer-target-props-builder>
  "The load-balancer-target-props-builder> function updates a LoadBalancerTargetProps$Builder instance using the provided configuration.
  The function takes the LoadBalancerTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:target-json` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |
"
  [^LoadBalancerTargetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :target-json)]
    (. builder targetJson data))
  (when-some [data (target-type config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn load-balancer-target-props-builder
  "Creates a  `LoadBalancerTargetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[load-balancer-target-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (load-balancer-target-props-builder> (new LoadBalancerTargetProps$Builder) id config))


(defn network-forward-options-builder>
  "The network-forward-options-builder> function updates a NetworkForwardOptions$Builder instance using the provided configuration.
  The function takes the NetworkForwardOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stickinessDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stickiness-duration` |
"
  [^NetworkForwardOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :stickiness-duration)]
    (. builder stickinessDuration data))
  (.build builder))


(defn network-forward-options-builder
  "Creates a  `NetworkForwardOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-forward-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-forward-options-builder> (new NetworkForwardOptions$Builder) id config))


(defn network-listener-builder>
  "The network-listener-builder> function updates a NetworkListener$Builder instance using the provided configuration.
  The function takes the NetworkListener$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy | [[cdk.api.services.elasticloadbalancingv2/alpn-policy]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
"
  [^NetworkListener$Builder builder id config]
  (when-some [data (alpn-policy config id :alpn-policy)]
    (. builder alpnPolicy data))
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :default-target-groups)]
    (. builder defaultTargetGroups data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn network-listener-builder
  "Creates a  `NetworkListener$Builder` instance using a scope and ID, applies the data configuration using the [[network-listener-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (network-listener-builder> (NetworkListener$Builder/create scope (name id)) id config))


(defn network-listener-lookup-options-builder>
  "The network-listener-lookup-options-builder> function updates a NetworkListenerLookupOptions$Builder instance using the provided configuration.
  The function takes the NetworkListenerLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `listenerProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:listener-protocol` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
"
  [^NetworkListenerLookupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (protocol config id :listener-protocol)]
    (. builder listenerProtocol data))
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (.build builder))


(defn network-listener-lookup-options-builder
  "Creates a  `NetworkListenerLookupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-listener-lookup-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-listener-lookup-options-builder> (new NetworkListenerLookupOptions$Builder) id config))


(defn network-listener-props-builder>
  "The network-listener-props-builder> function updates a NetworkListenerProps$Builder instance using the provided configuration.
  The function takes the NetworkListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy | [[cdk.api.services.elasticloadbalancingv2/alpn-policy]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
"
  [^NetworkListenerProps$Builder builder id config]
  (when-some [data (alpn-policy config id :alpn-policy)]
    (. builder alpnPolicy data))
  (when-some [data (lookup-entry config id :certificates)]
    (. builder certificates data))
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :default-target-groups)]
    (. builder defaultTargetGroups data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn network-listener-props-builder
  "Creates a  `NetworkListenerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-listener-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-listener-props-builder> (new NetworkListenerProps$Builder) id config))


(defn network-load-balancer-attributes-builder>
  "The network-load-balancer-attributes-builder> function updates a NetworkLoadBalancerAttributes$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerCanonicalHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-canonical-hosted-zone-id` |
| `loadBalancerDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-dns-name` |
| `loadBalancerSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkLoadBalancerAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-canonical-hosted-zone-id)]
    (. builder loadBalancerCanonicalHostedZoneId data))
  (when-some [data (lookup-entry config id :load-balancer-dns-name)]
    (. builder loadBalancerDnsName data))
  (when-some [data (lookup-entry config id :load-balancer-security-groups)]
    (. builder loadBalancerSecurityGroups data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-load-balancer-attributes-builder
  "Creates a  `NetworkLoadBalancerAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-load-balancer-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-load-balancer-attributes-builder> (new NetworkLoadBalancerAttributes$Builder) id config))


(defn network-load-balancer-builder>
  "The network-load-balancer-builder> function updates a NetworkLoadBalancer$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientRoutingPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy | [[cdk.api.services.elasticloadbalancingv2/client-routing-policy]] | `:client-routing-policy` |
| `crossZoneEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `denyAllIgwTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deny-all-igw-traffic` |
| `enforceSecurityGroupInboundRulesOnPrivateLinkTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-security-group-inbound-rules-on-private-link-traffic` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^NetworkLoadBalancer$Builder builder id config]
  (when-some [data (client-routing-policy config id :client-routing-policy)]
    (. builder clientRoutingPolicy data))
  (when-some [data (lookup-entry config id :cross-zone-enabled)]
    (. builder crossZoneEnabled data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :deny-all-igw-traffic)]
    (. builder denyAllIgwTraffic data))
  (when-some [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
    (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
  (when-some [data (lookup-entry config id :internet-facing)]
    (. builder internetFacing data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn network-load-balancer-builder
  "Creates a  `NetworkLoadBalancer$Builder` instance using a scope and ID, applies the data configuration using the [[network-load-balancer-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (network-load-balancer-builder> (NetworkLoadBalancer$Builder/create scope (name id)) id config))


(defn network-load-balancer-lookup-options-builder>
  "The network-load-balancer-lookup-options-builder> function updates a NetworkLoadBalancerLookupOptions$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
"
  [^NetworkLoadBalancerLookupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (.build builder))


(defn network-load-balancer-lookup-options-builder
  "Creates a  `NetworkLoadBalancerLookupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-load-balancer-lookup-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-load-balancer-lookup-options-builder> (new NetworkLoadBalancerLookupOptions$Builder) id config))


(defn network-load-balancer-props-builder>
  "The network-load-balancer-props-builder> function updates a NetworkLoadBalancerProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientRoutingPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy | [[cdk.api.services.elasticloadbalancingv2/client-routing-policy]] | `:client-routing-policy` |
| `crossZoneEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `denyAllIgwTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deny-all-igw-traffic` |
| `enforceSecurityGroupInboundRulesOnPrivateLinkTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-security-group-inbound-rules-on-private-link-traffic` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^NetworkLoadBalancerProps$Builder builder id config]
  (when-some [data (client-routing-policy config id :client-routing-policy)]
    (. builder clientRoutingPolicy data))
  (when-some [data (lookup-entry config id :cross-zone-enabled)]
    (. builder crossZoneEnabled data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :deny-all-igw-traffic)]
    (. builder denyAllIgwTraffic data))
  (when-some [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
    (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
  (when-some [data (lookup-entry config id :internet-facing)]
    (. builder internetFacing data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn network-load-balancer-props-builder
  "Creates a  `NetworkLoadBalancerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-load-balancer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-load-balancer-props-builder> (new NetworkLoadBalancerProps$Builder) id config))


(defn network-target-group-builder>
  "The network-target-group-builder> function updates a NetworkTargetGroup$Builder instance using the provided configuration.
  The function takes the NetworkTargetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:connection-termination` |
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `proxyProtocolV2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy-protocol-v2` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkTargetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-termination)]
    (. builder connectionTermination data))
  (when-some [data (lookup-entry config id :deregistration-delay)]
    (. builder deregistrationDelay data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :proxy-protocol-v2)]
    (. builder proxyProtocolV2 data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (when-some [data (target-type config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-target-group-builder
  "Creates a  `NetworkTargetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[network-target-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (network-target-group-builder> (NetworkTargetGroup$Builder/create scope (name id)) id config))


(defn network-target-group-props-builder>
  "The network-target-group-props-builder> function updates a NetworkTargetGroupProps$Builder instance using the provided configuration.
  The function takes the NetworkTargetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:connection-termination` |
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `proxyProtocolV2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy-protocol-v2` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkTargetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-termination)]
    (. builder connectionTermination data))
  (when-some [data (lookup-entry config id :deregistration-delay)]
    (. builder deregistrationDelay data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preserve-client-ip)]
    (. builder preserveClientIp data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :proxy-protocol-v2)]
    (. builder proxyProtocolV2 data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (when-some [data (target-type config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-target-group-props-builder
  "Creates a  `NetworkTargetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-target-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-target-group-props-builder> (new NetworkTargetGroupProps$Builder) id config))


(defn network-weighted-target-group-builder>
  "The network-weighted-target-group-builder> function updates a NetworkWeightedTargetGroup$Builder instance using the provided configuration.
  The function takes the NetworkWeightedTargetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup | [[cdk.support/lookup-entry]] | `:target-group` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^NetworkWeightedTargetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group)]
    (. builder targetGroup data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn network-weighted-target-group-builder
  "Creates a  `NetworkWeightedTargetGroup$Builder` instance using a no-argument constructor, applies the data configuration using the [[network-weighted-target-group-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (network-weighted-target-group-builder> (new NetworkWeightedTargetGroup$Builder) id config))


(defn query-string-condition-builder>
  "The query-string-condition-builder> function updates a QueryStringCondition$Builder instance using the provided configuration.
  The function takes the QueryStringCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^QueryStringCondition$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn query-string-condition-builder
  "Creates a  `QueryStringCondition$Builder` instance using a no-argument constructor, applies the data configuration using the [[query-string-condition-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (query-string-condition-builder> (new QueryStringCondition$Builder) id config))


(defn redirect-options-builder>
  "The redirect-options-builder> function updates a RedirectOptions$Builder instance using the provided configuration.
  The function takes the RedirectOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permanent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:permanent` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `query` | java.lang.String | [[cdk.support/lookup-entry]] | `:query` |
"
  [^RedirectOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :host)]
    (. builder host data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permanent)]
    (. builder permanent data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :query)]
    (. builder query data))
  (.build builder))


(defn redirect-options-builder
  "Creates a  `RedirectOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[redirect-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (redirect-options-builder> (new RedirectOptions$Builder) id config))


(defn target-group-attributes-builder>
  "The target-group-attributes-builder> function updates a TargetGroupAttributes$Builder instance using the provided configuration.
  The function takes the TargetGroupAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArns` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arns` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
"
  [^TargetGroupAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :load-balancer-arns)]
    (. builder loadBalancerArns data))
  (when-some [data (lookup-entry config id :target-group-arn)]
    (. builder targetGroupArn data))
  (.build builder))


(defn target-group-attributes-builder
  "Creates a  `TargetGroupAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[target-group-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (target-group-attributes-builder> (new TargetGroupAttributes$Builder) id config))


(defn weighted-target-group-builder>
  "The weighted-target-group-builder> function updates a WeightedTargetGroup$Builder instance using the provided configuration.
  The function takes the WeightedTargetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup | [[cdk.support/lookup-entry]] | `:target-group` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^WeightedTargetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :target-group)]
    (. builder targetGroup data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn weighted-target-group-builder
  "Creates a  `WeightedTargetGroup$Builder` instance using a no-argument constructor, applies the data configuration using the [[weighted-target-group-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (weighted-target-group-builder> (new WeightedTargetGroup$Builder) id config))