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


(defn add-application-action-props-builder
  "The add-application-action-props-builder function buildes out new instances of 
AddApplicationActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `removeSuffix` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-suffix` |"
  [stack id config]
  (let [builder (AddApplicationActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :remove-suffix)]
      (. builder removeSuffix data))
    (.build builder)))


(defn add-application-target-groups-props-builder
  "The add-application-target-groups-props-builder function buildes out new instances of 
AddApplicationTargetGroupsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (AddApplicationTargetGroupsProps$Builder.)]
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn add-application-targets-props-builder
  "The add-application-targets-props-builder function buildes out new instances of 
AddApplicationTargetsProps$Builder using the provided configuration.  Each field is set as follows:

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
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (AddApplicationTargetsProps$Builder.)]
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :deregistration-delay)]
      (. builder deregistrationDelay data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (target-group-load-balancing-algorithm-type config id :load-balancing-algorithm-type)]
      (. builder loadBalancingAlgorithmType data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :slow-start)]
      (. builder slowStart data))
    (when-let [data (lookup-entry config id :stickiness-cookie-duration)]
      (. builder stickinessCookieDuration data))
    (when-let [data (lookup-entry config id :stickiness-cookie-name)]
      (. builder stickinessCookieName data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn add-network-action-props-builder
  "The add-network-action-props-builder function buildes out new instances of 
AddNetworkActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:action` |"
  [stack id config]
  (let [builder (AddNetworkActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (.build builder)))


(defn add-network-targets-props-builder
  "The add-network-targets-props-builder function buildes out new instances of 
AddNetworkTargetsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `proxyProtocolV2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy-protocol-v2` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (AddNetworkTargetsProps$Builder.)]
    (when-let [data (lookup-entry config id :deregistration-delay)]
      (. builder deregistrationDelay data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :proxy-protocol-v2)]
      (. builder proxyProtocolV2 data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn add-rule-props-builder
  "The add-rule-props-builder function buildes out new instances of 
AddRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (AddRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn application-listener-attributes-builder
  "The application-listener-attributes-builder function buildes out new instances of 
ApplicationListenerAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-port` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |"
  [stack id config]
  (let [builder (ApplicationListenerAttributes$Builder.)]
    (when-let [data (lookup-entry config id :default-port)]
      (. builder defaultPort data))
    (when-let [data (lookup-entry config id :listener-arn)]
      (. builder listenerArn data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (.build builder)))


(defn application-listener-builder
  "The application-listener-builder function buildes out new instances of 
ApplicationListener$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (ApplicationListener$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :default-target-groups)]
      (. builder defaultTargetGroups data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :open)]
      (. builder open data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn application-listener-certificate-builder
  "The application-listener-certificate-builder function buildes out new instances of 
ApplicationListenerCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |"
  [stack id config]
  (let [builder (ApplicationListenerCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (.build builder)))


(defn application-listener-certificate-props-builder
  "The application-listener-certificate-props-builder function buildes out new instances of 
ApplicationListenerCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |"
  [stack id config]
  (let [builder (ApplicationListenerCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (.build builder)))


(defn application-listener-lookup-options-builder
  "The application-listener-lookup-options-builder function buildes out new instances of 
ApplicationListenerLookupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `listenerProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:listener-protocol` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |"
  [stack id config]
  (let [builder (ApplicationListenerLookupOptions$Builder.)]
    (when-let [data (lookup-entry config id :listener-arn)]
      (. builder listenerArn data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (application-protocol config id :listener-protocol)]
      (. builder listenerProtocol data))
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-tags)]
      (. builder loadBalancerTags data))
    (.build builder)))


(defn application-listener-props-builder
  "The application-listener-props-builder function buildes out new instances of 
ApplicationListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (ApplicationListenerProps$Builder.)]
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :default-target-groups)]
      (. builder defaultTargetGroups data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :open)]
      (. builder open data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn application-listener-rule-builder
  "The application-listener-rule-builder function buildes out new instances of 
ApplicationListenerRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (ApplicationListenerRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn application-listener-rule-props-builder
  "The application-listener-rule-props-builder function buildes out new instances of 
ApplicationListenerRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener | [[cdk.support/lookup-entry]] | `:listener` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (ApplicationListenerRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn application-load-balancer-attributes-builder
  "The application-load-balancer-attributes-builder function buildes out new instances of 
ApplicationLoadBalancerAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerCanonicalHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-canonical-hosted-zone-id` |
| `loadBalancerDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-dns-name` |
| `securityGroupAllowsAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:security-group-allows-all-outbound` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancerAttributes$Builder.)]
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-canonical-hosted-zone-id)]
      (. builder loadBalancerCanonicalHostedZoneId data))
    (when-let [data (lookup-entry config id :load-balancer-dns-name)]
      (. builder loadBalancerDnsName data))
    (when-let [data (lookup-entry config id :security-group-allows-all-outbound)]
      (. builder securityGroupAllowsAllOutbound data))
    (when-let [data (lookup-entry config id :security-group-id)]
      (. builder securityGroupId data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-load-balancer-builder
  "The application-load-balancer-builder function buildes out new instances of 
ApplicationLoadBalancer$Builder using the provided configuration.  Each field is set as follows:

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
| `xffHeaderProcessingMode` | software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode | [[cdk.api.services.elasticloadbalancingv2/xff-header-processing-mode]] | `:xff-header-processing-mode` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-keep-alive)]
      (. builder clientKeepAlive data))
    (when-let [data (lookup-entry config id :cross-zone-enabled)]
      (. builder crossZoneEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :deny-all-igw-traffic)]
      (. builder denyAllIgwTraffic data))
    (when-let [data (desync-mitigation-mode config id :desync-mitigation-mode)]
      (. builder desyncMitigationMode data))
    (when-let [data (lookup-entry config id :drop-invalid-header-fields)]
      (. builder dropInvalidHeaderFields data))
    (when-let [data (lookup-entry config id :http2-enabled)]
      (. builder http2Enabled data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :internet-facing)]
      (. builder internetFacing data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :preserve-host-header)]
      (. builder preserveHostHeader data))
    (when-let [data (lookup-entry config id :preserve-xff-client-port)]
      (. builder preserveXffClientPort data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :waf-fail-open)]
      (. builder wafFailOpen data))
    (when-let [data (lookup-entry config id :x-amzn-tls-version-and-cipher-suite-headers)]
      (. builder xAmznTlsVersionAndCipherSuiteHeaders data))
    (when-let [data (xff-header-processing-mode config id :xff-header-processing-mode)]
      (. builder xffHeaderProcessingMode data))
    (.build builder)))


(defn application-load-balancer-lookup-options-builder
  "The application-load-balancer-lookup-options-builder function buildes out new instances of 
ApplicationLoadBalancerLookupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancerLookupOptions$Builder.)]
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-tags)]
      (. builder loadBalancerTags data))
    (.build builder)))


(defn application-load-balancer-props-builder
  "The application-load-balancer-props-builder function buildes out new instances of 
ApplicationLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

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
| `xffHeaderProcessingMode` | software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode | [[cdk.api.services.elasticloadbalancingv2/xff-header-processing-mode]] | `:xff-header-processing-mode` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :client-keep-alive)]
      (. builder clientKeepAlive data))
    (when-let [data (lookup-entry config id :cross-zone-enabled)]
      (. builder crossZoneEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :deny-all-igw-traffic)]
      (. builder denyAllIgwTraffic data))
    (when-let [data (desync-mitigation-mode config id :desync-mitigation-mode)]
      (. builder desyncMitigationMode data))
    (when-let [data (lookup-entry config id :drop-invalid-header-fields)]
      (. builder dropInvalidHeaderFields data))
    (when-let [data (lookup-entry config id :http2-enabled)]
      (. builder http2Enabled data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :internet-facing)]
      (. builder internetFacing data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :preserve-host-header)]
      (. builder preserveHostHeader data))
    (when-let [data (lookup-entry config id :preserve-xff-client-port)]
      (. builder preserveXffClientPort data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :waf-fail-open)]
      (. builder wafFailOpen data))
    (when-let [data (lookup-entry config id :x-amzn-tls-version-and-cipher-suite-headers)]
      (. builder xAmznTlsVersionAndCipherSuiteHeaders data))
    (when-let [data (xff-header-processing-mode config id :xff-header-processing-mode)]
      (. builder xffHeaderProcessingMode data))
    (.build builder)))


(defn application-load-balancer-redirect-config-builder
  "The application-load-balancer-redirect-config-builder function buildes out new instances of 
ApplicationLoadBalancerRedirectConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `sourcePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source-port` |
| `sourceProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:source-protocol` |
| `targetPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-port` |
| `targetProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:target-protocol` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancerRedirectConfig$Builder.)]
    (when-let [data (lookup-entry config id :open)]
      (. builder open data))
    (when-let [data (lookup-entry config id :source-port)]
      (. builder sourcePort data))
    (when-let [data (application-protocol config id :source-protocol)]
      (. builder sourceProtocol data))
    (when-let [data (lookup-entry config id :target-port)]
      (. builder targetPort data))
    (when-let [data (application-protocol config id :target-protocol)]
      (. builder targetProtocol data))
    (.build builder)))


(defn application-target-group-builder
  "The application-target-group-builder function buildes out new instances of 
ApplicationTargetGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationTargetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deregistration-delay)]
      (. builder deregistrationDelay data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (target-group-load-balancing-algorithm-type config id :load-balancing-algorithm-type)]
      (. builder loadBalancingAlgorithmType data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :slow-start)]
      (. builder slowStart data))
    (when-let [data (lookup-entry config id :stickiness-cookie-duration)]
      (. builder stickinessCookieDuration data))
    (when-let [data (lookup-entry config id :stickiness-cookie-name)]
      (. builder stickinessCookieName data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (when-let [data (target-type config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-target-group-props-builder
  "The application-target-group-props-builder function buildes out new instances of 
ApplicationTargetGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationTargetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :deregistration-delay)]
      (. builder deregistrationDelay data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (target-group-load-balancing-algorithm-type config id :load-balancing-algorithm-type)]
      (. builder loadBalancingAlgorithmType data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :slow-start)]
      (. builder slowStart data))
    (when-let [data (lookup-entry config id :stickiness-cookie-duration)]
      (. builder stickinessCookieDuration data))
    (when-let [data (lookup-entry config id :stickiness-cookie-name)]
      (. builder stickinessCookieName data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (when-let [data (target-type config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn authenticate-oidc-options-builder
  "The authenticate-oidc-options-builder function buildes out new instances of 
AuthenticateOidcOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `userInfoEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info-endpoint` |"
  [stack id config]
  (let [builder (AuthenticateOidcOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-https-outbound)]
      (. builder allowHttpsOutbound data))
    (when-let [data (lookup-entry config id :authentication-request-extra-params)]
      (. builder authenticationRequestExtraParams data))
    (when-let [data (lookup-entry config id :authorization-endpoint)]
      (. builder authorizationEndpoint data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :issuer)]
      (. builder issuer data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (when-let [data (unauthenticated-action config id :on-unauthenticated-request)]
      (. builder onUnauthenticatedRequest data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :session-cookie-name)]
      (. builder sessionCookieName data))
    (when-let [data (lookup-entry config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :token-endpoint)]
      (. builder tokenEndpoint data))
    (when-let [data (lookup-entry config id :user-info-endpoint)]
      (. builder userInfoEndpoint data))
    (.build builder)))


(defn base-application-listener-props-builder
  "The base-application-listener-props-builder function buildes out new instances of 
BaseApplicationListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (BaseApplicationListenerProps$Builder.)]
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :default-target-groups)]
      (. builder defaultTargetGroups data))
    (when-let [data (lookup-entry config id :open)]
      (. builder open data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn base-application-listener-rule-props-builder
  "The base-application-listener-rule-props-builder function buildes out new instances of 
BaseApplicationListenerRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:action` |
| `conditions` | java.util.List | [[cdk.support/lookup-entry]] | `:conditions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (BaseApplicationListenerRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn base-listener-lookup-options-builder
  "The base-listener-lookup-options-builder function buildes out new instances of 
BaseListenerLookupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |"
  [stack id config]
  (let [builder (BaseListenerLookupOptions$Builder.)]
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-tags)]
      (. builder loadBalancerTags data))
    (.build builder)))


(defn base-load-balancer-lookup-options-builder
  "The base-load-balancer-lookup-options-builder function buildes out new instances of 
BaseLoadBalancerLookupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |"
  [stack id config]
  (let [builder (BaseLoadBalancerLookupOptions$Builder.)]
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-tags)]
      (. builder loadBalancerTags data))
    (.build builder)))


(defn base-load-balancer-props-builder
  "The base-load-balancer-props-builder function buildes out new instances of 
BaseLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossZoneEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `denyAllIgwTraffic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deny-all-igw-traffic` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (BaseLoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :cross-zone-enabled)]
      (. builder crossZoneEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :deny-all-igw-traffic)]
      (. builder denyAllIgwTraffic data))
    (when-let [data (lookup-entry config id :internet-facing)]
      (. builder internetFacing data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn base-network-listener-props-builder
  "The base-network-listener-props-builder function buildes out new instances of 
BaseNetworkListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy | [[cdk.api.services.elasticloadbalancingv2/alpn-policy]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (BaseNetworkListenerProps$Builder.)]
    (when-let [data (alpn-policy config id :alpn-policy)]
      (. builder alpnPolicy data))
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :default-target-groups)]
      (. builder defaultTargetGroups data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn base-target-group-props-builder
  "The base-target-group-props-builder function buildes out new instances of 
BaseTargetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deregistrationDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deregistration-delay` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (BaseTargetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :deregistration-delay)]
      (. builder deregistrationDelay data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (when-let [data (target-type config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cfn-listener-action-property-builder
  "The cfn-listener-action-property-builder function buildes out new instances of 
CfnListener$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticateCognitoConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$AuthenticateCognitoConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-cognito-config` |
| `authenticateOidcConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$AuthenticateOidcConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-oidc-config` |
| `fixedResponseConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$FixedResponseConfigProperty | [[cdk.support/lookup-entry]] | `:fixed-response-config` |
| `forwardConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward-config` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |
| `redirectConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redirect-config` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnListener$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :authenticate-cognito-config)]
      (. builder authenticateCognitoConfig data))
    (when-let [data (lookup-entry config id :authenticate-oidc-config)]
      (. builder authenticateOidcConfig data))
    (when-let [data (lookup-entry config id :fixed-response-config)]
      (. builder fixedResponseConfig data))
    (when-let [data (lookup-entry config id :forward-config)]
      (. builder forwardConfig data))
    (when-let [data (lookup-entry config id :order)]
      (. builder order data))
    (when-let [data (lookup-entry config id :redirect-config)]
      (. builder redirectConfig data))
    (when-let [data (lookup-entry config id :target-group-arn)]
      (. builder targetGroupArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-listener-authenticate-cognito-config-property-builder
  "The cfn-listener-authenticate-cognito-config-property-builder function buildes out new instances of 
CfnListener$AuthenticateCognitoConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationRequestExtraParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `onUnauthenticatedRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |
| `userPoolClientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-client-id` |
| `userPoolDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-domain` |"
  [stack id config]
  (let [builder (CfnListener$AuthenticateCognitoConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-request-extra-params)]
      (. builder authenticationRequestExtraParams data))
    (when-let [data (lookup-entry config id :on-unauthenticated-request)]
      (. builder onUnauthenticatedRequest data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :session-cookie-name)]
      (. builder sessionCookieName data))
    (when-let [data (lookup-entry config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :user-pool-arn)]
      (. builder userPoolArn data))
    (when-let [data (lookup-entry config id :user-pool-client-id)]
      (. builder userPoolClientId data))
    (when-let [data (lookup-entry config id :user-pool-domain)]
      (. builder userPoolDomain data))
    (.build builder)))


(defn cfn-listener-authenticate-oidc-config-property-builder
  "The cfn-listener-authenticate-oidc-config-property-builder function buildes out new instances of 
CfnListener$AuthenticateOidcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `userInfoEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info-endpoint` |"
  [stack id config]
  (let [builder (CfnListener$AuthenticateOidcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-request-extra-params)]
      (. builder authenticationRequestExtraParams data))
    (when-let [data (lookup-entry config id :authorization-endpoint)]
      (. builder authorizationEndpoint data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :issuer)]
      (. builder issuer data))
    (when-let [data (lookup-entry config id :on-unauthenticated-request)]
      (. builder onUnauthenticatedRequest data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :session-cookie-name)]
      (. builder sessionCookieName data))
    (when-let [data (lookup-entry config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :token-endpoint)]
      (. builder tokenEndpoint data))
    (when-let [data (lookup-entry config id :use-existing-client-secret)]
      (. builder useExistingClientSecret data))
    (when-let [data (lookup-entry config id :user-info-endpoint)]
      (. builder userInfoEndpoint data))
    (.build builder)))


(defn cfn-listener-builder
  "The cfn-listener-builder function buildes out new instances of 
CfnListener$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultActions` | java.util.List | [[cdk.support/lookup-entry]] | `:default-actions` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `mutualAuthentication` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$MutualAuthenticationProperty | [[cdk.support/lookup-entry]] | `:mutual-authentication` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `sslPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (CfnListener$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alpn-policy)]
      (. builder alpnPolicy data))
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-actions)]
      (. builder defaultActions data))
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :mutual-authentication)]
      (. builder mutualAuthentication data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn cfn-listener-certificate-builder
  "The cfn-listener-certificate-builder function buildes out new instances of 
CfnListenerCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |"
  [stack id config]
  (let [builder (CfnListenerCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :listener-arn)]
      (. builder listenerArn data))
    (.build builder)))


(defn cfn-listener-certificate-certificate-property-builder
  "The cfn-listener-certificate-certificate-property-builder function buildes out new instances of 
CfnListenerCertificate$CertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |"
  [stack id config]
  (let [builder (CfnListenerCertificate$CertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (.build builder)))


(defn cfn-listener-certificate-property-builder
  "The cfn-listener-certificate-property-builder function buildes out new instances of 
CfnListener$CertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |"
  [stack id config]
  (let [builder (CfnListener$CertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (.build builder)))


(defn cfn-listener-certificate-props-builder
  "The cfn-listener-certificate-props-builder function buildes out new instances of 
CfnListenerCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificates` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |"
  [stack id config]
  (let [builder (CfnListenerCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :listener-arn)]
      (. builder listenerArn data))
    (.build builder)))


(defn cfn-listener-fixed-response-config-property-builder
  "The cfn-listener-fixed-response-config-property-builder function buildes out new instances of 
CfnListener$FixedResponseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `messageBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-body` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnListener$FixedResponseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :message-body)]
      (. builder messageBody data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-listener-forward-config-property-builder
  "The cfn-listener-forward-config-property-builder function buildes out new instances of 
CfnListener$ForwardConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupStickinessConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$TargetGroupStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:target-group-stickiness-config` |
| `targetGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (CfnListener$ForwardConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-group-stickiness-config)]
      (. builder targetGroupStickinessConfig data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn cfn-listener-mutual-authentication-property-builder
  "The cfn-listener-mutual-authentication-property-builder function buildes out new instances of 
CfnListener$MutualAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ignoreClientCertificateExpiry` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ignore-client-certificate-expiry` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |"
  [stack id config]
  (let [builder (CfnListener$MutualAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ignore-client-certificate-expiry)]
      (. builder ignoreClientCertificateExpiry data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :trust-store-arn)]
      (. builder trustStoreArn data))
    (.build builder)))


(defn cfn-listener-props-builder
  "The cfn-listener-props-builder function buildes out new instances of 
CfnListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:alpn-policy` |
| `certificates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultActions` | java.util.List | [[cdk.support/lookup-entry]] | `:default-actions` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `mutualAuthentication` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener$MutualAuthenticationProperty | [[cdk.support/lookup-entry]] | `:mutual-authentication` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `sslPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (CfnListenerProps$Builder.)]
    (when-let [data (lookup-entry config id :alpn-policy)]
      (. builder alpnPolicy data))
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-actions)]
      (. builder defaultActions data))
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :mutual-authentication)]
      (. builder mutualAuthentication data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn cfn-listener-redirect-config-property-builder
  "The cfn-listener-redirect-config-property-builder function buildes out new instances of 
CfnListener$RedirectConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `query` | java.lang.String | [[cdk.support/lookup-entry]] | `:query` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnListener$RedirectConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :query)]
      (. builder query data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-listener-rule-action-property-builder
  "The cfn-listener-rule-action-property-builder function buildes out new instances of 
CfnListenerRule$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticateCognitoConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$AuthenticateCognitoConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-cognito-config` |
| `authenticateOidcConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$AuthenticateOidcConfigProperty | [[cdk.support/lookup-entry]] | `:authenticate-oidc-config` |
| `fixedResponseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fixed-response-config` |
| `forwardConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forward-config` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |
| `redirectConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$RedirectConfigProperty | [[cdk.support/lookup-entry]] | `:redirect-config` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnListenerRule$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :authenticate-cognito-config)]
      (. builder authenticateCognitoConfig data))
    (when-let [data (lookup-entry config id :authenticate-oidc-config)]
      (. builder authenticateOidcConfig data))
    (when-let [data (lookup-entry config id :fixed-response-config)]
      (. builder fixedResponseConfig data))
    (when-let [data (lookup-entry config id :forward-config)]
      (. builder forwardConfig data))
    (when-let [data (lookup-entry config id :order)]
      (. builder order data))
    (when-let [data (lookup-entry config id :redirect-config)]
      (. builder redirectConfig data))
    (when-let [data (lookup-entry config id :target-group-arn)]
      (. builder targetGroupArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-listener-rule-authenticate-cognito-config-property-builder
  "The cfn-listener-rule-authenticate-cognito-config-property-builder function buildes out new instances of 
CfnListenerRule$AuthenticateCognitoConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationRequestExtraParams` | java.util.Map | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `onUnauthenticatedRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |
| `userPoolClientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-client-id` |
| `userPoolDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-domain` |"
  [stack id config]
  (let [builder (CfnListenerRule$AuthenticateCognitoConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-request-extra-params)]
      (. builder authenticationRequestExtraParams data))
    (when-let [data (lookup-entry config id :on-unauthenticated-request)]
      (. builder onUnauthenticatedRequest data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :session-cookie-name)]
      (. builder sessionCookieName data))
    (when-let [data (lookup-entry config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :user-pool-arn)]
      (. builder userPoolArn data))
    (when-let [data (lookup-entry config id :user-pool-client-id)]
      (. builder userPoolClientId data))
    (when-let [data (lookup-entry config id :user-pool-domain)]
      (. builder userPoolDomain data))
    (.build builder)))


(defn cfn-listener-rule-authenticate-oidc-config-property-builder
  "The cfn-listener-rule-authenticate-oidc-config-property-builder function buildes out new instances of 
CfnListenerRule$AuthenticateOidcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `userInfoEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info-endpoint` |"
  [stack id config]
  (let [builder (CfnListenerRule$AuthenticateOidcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-request-extra-params)]
      (. builder authenticationRequestExtraParams data))
    (when-let [data (lookup-entry config id :authorization-endpoint)]
      (. builder authorizationEndpoint data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :issuer)]
      (. builder issuer data))
    (when-let [data (lookup-entry config id :on-unauthenticated-request)]
      (. builder onUnauthenticatedRequest data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :session-cookie-name)]
      (. builder sessionCookieName data))
    (when-let [data (lookup-entry config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :token-endpoint)]
      (. builder tokenEndpoint data))
    (when-let [data (lookup-entry config id :use-existing-client-secret)]
      (. builder useExistingClientSecret data))
    (when-let [data (lookup-entry config id :user-info-endpoint)]
      (. builder userInfoEndpoint data))
    (.build builder)))


(defn cfn-listener-rule-builder
  "The cfn-listener-rule-builder function buildes out new instances of 
CfnListenerRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (CfnListenerRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :listener-arn)]
      (. builder listenerArn data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn cfn-listener-rule-fixed-response-config-property-builder
  "The cfn-listener-rule-fixed-response-config-property-builder function buildes out new instances of 
CfnListenerRule$FixedResponseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `messageBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-body` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnListenerRule$FixedResponseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :message-body)]
      (. builder messageBody data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-listener-rule-forward-config-property-builder
  "The cfn-listener-rule-forward-config-property-builder function buildes out new instances of 
CfnListenerRule$ForwardConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupStickinessConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$TargetGroupStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:target-group-stickiness-config` |
| `targetGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (CfnListenerRule$ForwardConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-group-stickiness-config)]
      (. builder targetGroupStickinessConfig data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn cfn-listener-rule-host-header-config-property-builder
  "The cfn-listener-rule-host-header-config-property-builder function buildes out new instances of 
CfnListenerRule$HostHeaderConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnListenerRule$HostHeaderConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-listener-rule-http-header-config-property-builder
  "The cfn-listener-rule-http-header-config-property-builder function buildes out new instances of 
CfnListenerRule$HttpHeaderConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpHeaderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-header-name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnListenerRule$HttpHeaderConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-header-name)]
      (. builder httpHeaderName data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-listener-rule-http-request-method-config-property-builder
  "The cfn-listener-rule-http-request-method-config-property-builder function buildes out new instances of 
CfnListenerRule$HttpRequestMethodConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnListenerRule$HttpRequestMethodConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-listener-rule-path-pattern-config-property-builder
  "The cfn-listener-rule-path-pattern-config-property-builder function buildes out new instances of 
CfnListenerRule$PathPatternConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnListenerRule$PathPatternConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-listener-rule-props-builder
  "The cfn-listener-rule-props-builder function buildes out new instances of 
CfnListenerRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (CfnListenerRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :listener-arn)]
      (. builder listenerArn data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn cfn-listener-rule-query-string-config-property-builder
  "The cfn-listener-rule-query-string-config-property-builder function buildes out new instances of 
CfnListenerRule$QueryStringConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnListenerRule$QueryStringConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-listener-rule-query-string-key-value-property-builder
  "The cfn-listener-rule-query-string-key-value-property-builder function buildes out new instances of 
CfnListenerRule$QueryStringKeyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnListenerRule$QueryStringKeyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-listener-rule-redirect-config-property-builder
  "The cfn-listener-rule-redirect-config-property-builder function buildes out new instances of 
CfnListenerRule$RedirectConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `query` | java.lang.String | [[cdk.support/lookup-entry]] | `:query` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnListenerRule$RedirectConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :query)]
      (. builder query data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-listener-rule-rule-condition-property-builder
  "The cfn-listener-rule-rule-condition-property-builder function buildes out new instances of 
CfnListenerRule$RuleConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `hostHeaderConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:host-header-config` |
| `httpHeaderConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-header-config` |
| `httpRequestMethodConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-request-method-config` |
| `pathPatternConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path-pattern-config` |
| `queryStringConfig` | software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule$QueryStringConfigProperty | [[cdk.support/lookup-entry]] | `:query-string-config` |
| `sourceIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-ip-config` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnListenerRule$RuleConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :field)]
      (. builder field data))
    (when-let [data (lookup-entry config id :host-header-config)]
      (. builder hostHeaderConfig data))
    (when-let [data (lookup-entry config id :http-header-config)]
      (. builder httpHeaderConfig data))
    (when-let [data (lookup-entry config id :http-request-method-config)]
      (. builder httpRequestMethodConfig data))
    (when-let [data (lookup-entry config id :path-pattern-config)]
      (. builder pathPatternConfig data))
    (when-let [data (lookup-entry config id :query-string-config)]
      (. builder queryStringConfig data))
    (when-let [data (lookup-entry config id :source-ip-config)]
      (. builder sourceIpConfig data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-listener-rule-source-ip-config-property-builder
  "The cfn-listener-rule-source-ip-config-property-builder function buildes out new instances of 
CfnListenerRule$SourceIpConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnListenerRule$SourceIpConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-listener-rule-target-group-stickiness-config-property-builder
  "The cfn-listener-rule-target-group-stickiness-config-property-builder function buildes out new instances of 
CfnListenerRule$TargetGroupStickinessConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnListenerRule$TargetGroupStickinessConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-seconds)]
      (. builder durationSeconds data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-listener-rule-target-group-tuple-property-builder
  "The cfn-listener-rule-target-group-tuple-property-builder function buildes out new instances of 
CfnListenerRule$TargetGroupTupleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnListenerRule$TargetGroupTupleProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-group-arn)]
      (. builder targetGroupArn data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-listener-target-group-stickiness-config-property-builder
  "The cfn-listener-target-group-stickiness-config-property-builder function buildes out new instances of 
CfnListener$TargetGroupStickinessConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnListener$TargetGroupStickinessConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-seconds)]
      (. builder durationSeconds data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-listener-target-group-tuple-property-builder
  "The cfn-listener-target-group-tuple-property-builder function buildes out new instances of 
CfnListener$TargetGroupTupleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnListener$TargetGroupTupleProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-group-arn)]
      (. builder targetGroupArn data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-load-balancer-builder
  "The cfn-load-balancer-builder function buildes out new instances of 
CfnLoadBalancer$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
      (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-attributes)]
      (. builder loadBalancerAttributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :scheme)]
      (. builder scheme data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-mappings)]
      (. builder subnetMappings data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-load-balancer-load-balancer-attribute-property-builder
  "The cfn-load-balancer-load-balancer-attribute-property-builder function buildes out new instances of 
CfnLoadBalancer$LoadBalancerAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$LoadBalancerAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-load-balancer-props-builder
  "The cfn-load-balancer-props-builder function buildes out new instances of 
CfnLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
      (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-attributes)]
      (. builder loadBalancerAttributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :scheme)]
      (. builder scheme data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-mappings)]
      (. builder subnetMappings data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-load-balancer-subnet-mapping-property-builder
  "The cfn-load-balancer-subnet-mapping-property-builder function buildes out new instances of 
CfnLoadBalancer$SubnetMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-id` |
| `iPv6Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:i-pv6-address` |
| `privateIPv4Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-i-pv4-address` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$SubnetMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-id)]
      (. builder allocationId data))
    (when-let [data (lookup-entry config id :i-pv6-address)]
      (. builder iPv6Address data))
    (when-let [data (lookup-entry config id :private-i-pv4-address)]
      (. builder privateIPv4Address data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-target-group-builder
  "The cfn-target-group-builder function buildes out new instances of 
CfnTargetGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTargetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :health-check-enabled)]
      (. builder healthCheckEnabled data))
    (when-let [data (lookup-entry config id :health-check-interval-seconds)]
      (. builder healthCheckIntervalSeconds data))
    (when-let [data (lookup-entry config id :health-check-path)]
      (. builder healthCheckPath data))
    (when-let [data (lookup-entry config id :health-check-port)]
      (. builder healthCheckPort data))
    (when-let [data (lookup-entry config id :health-check-protocol)]
      (. builder healthCheckProtocol data))
    (when-let [data (lookup-entry config id :health-check-timeout-seconds)]
      (. builder healthCheckTimeoutSeconds data))
    (when-let [data (lookup-entry config id :healthy-threshold-count)]
      (. builder healthyThresholdCount data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :matcher)]
      (. builder matcher data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-group-attributes)]
      (. builder targetGroupAttributes data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :unhealthy-threshold-count)]
      (. builder unhealthyThresholdCount data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-target-group-matcher-property-builder
  "The cfn-target-group-matcher-property-builder function buildes out new instances of 
CfnTargetGroup$MatcherProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:grpc-code` |
| `httpCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-code` |"
  [stack id config]
  (let [builder (CfnTargetGroup$MatcherProperty$Builder.)]
    (when-let [data (lookup-entry config id :grpc-code)]
      (. builder grpcCode data))
    (when-let [data (lookup-entry config id :http-code)]
      (. builder httpCode data))
    (.build builder)))


(defn cfn-target-group-props-builder
  "The cfn-target-group-props-builder function buildes out new instances of 
CfnTargetGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTargetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :health-check-enabled)]
      (. builder healthCheckEnabled data))
    (when-let [data (lookup-entry config id :health-check-interval-seconds)]
      (. builder healthCheckIntervalSeconds data))
    (when-let [data (lookup-entry config id :health-check-path)]
      (. builder healthCheckPath data))
    (when-let [data (lookup-entry config id :health-check-port)]
      (. builder healthCheckPort data))
    (when-let [data (lookup-entry config id :health-check-protocol)]
      (. builder healthCheckProtocol data))
    (when-let [data (lookup-entry config id :health-check-timeout-seconds)]
      (. builder healthCheckTimeoutSeconds data))
    (when-let [data (lookup-entry config id :healthy-threshold-count)]
      (. builder healthyThresholdCount data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :matcher)]
      (. builder matcher data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-group-attributes)]
      (. builder targetGroupAttributes data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :unhealthy-threshold-count)]
      (. builder unhealthyThresholdCount data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-target-group-target-description-property-builder
  "The cfn-target-group-target-description-property-builder function buildes out new instances of 
CfnTargetGroup$TargetDescriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnTargetGroup$TargetDescriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-target-group-target-group-attribute-property-builder
  "The cfn-target-group-target-group-attribute-property-builder function buildes out new instances of 
CfnTargetGroup$TargetGroupAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTargetGroup$TargetGroupAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-trust-store-builder
  "The cfn-trust-store-builder function buildes out new instances of 
CfnTrustStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatesBundleS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-bucket` |
| `caCertificatesBundleS3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-key` |
| `caCertificatesBundleS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-object-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrustStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ca-certificates-bundle-s3-bucket)]
      (. builder caCertificatesBundleS3Bucket data))
    (when-let [data (lookup-entry config id :ca-certificates-bundle-s3-key)]
      (. builder caCertificatesBundleS3Key data))
    (when-let [data (lookup-entry config id :ca-certificates-bundle-s3-object-version)]
      (. builder caCertificatesBundleS3ObjectVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-trust-store-props-builder
  "The cfn-trust-store-props-builder function buildes out new instances of 
CfnTrustStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatesBundleS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-bucket` |
| `caCertificatesBundleS3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-key` |
| `caCertificatesBundleS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificates-bundle-s3-object-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrustStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :ca-certificates-bundle-s3-bucket)]
      (. builder caCertificatesBundleS3Bucket data))
    (when-let [data (lookup-entry config id :ca-certificates-bundle-s3-key)]
      (. builder caCertificatesBundleS3Key data))
    (when-let [data (lookup-entry config id :ca-certificates-bundle-s3-object-version)]
      (. builder caCertificatesBundleS3ObjectVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-trust-store-revocation-builder
  "The cfn-trust-store-revocation-builder function buildes out new instances of 
CfnTrustStoreRevocation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revocationContents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:revocation-contents` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |"
  [stack id config]
  (let [builder (CfnTrustStoreRevocation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :revocation-contents)]
      (. builder revocationContents data))
    (when-let [data (lookup-entry config id :trust-store-arn)]
      (. builder trustStoreArn data))
    (.build builder)))


(defn cfn-trust-store-revocation-props-builder
  "The cfn-trust-store-revocation-props-builder function buildes out new instances of 
CfnTrustStoreRevocationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revocationContents` | java.util.List | [[cdk.support/lookup-entry]] | `:revocation-contents` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |"
  [stack id config]
  (let [builder (CfnTrustStoreRevocationProps$Builder.)]
    (when-let [data (lookup-entry config id :revocation-contents)]
      (. builder revocationContents data))
    (when-let [data (lookup-entry config id :trust-store-arn)]
      (. builder trustStoreArn data))
    (.build builder)))


(defn cfn-trust-store-revocation-revocation-content-property-builder
  "The cfn-trust-store-revocation-revocation-content-property-builder function buildes out new instances of 
CfnTrustStoreRevocation$RevocationContentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:revocation-type` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |"
  [stack id config]
  (let [builder (CfnTrustStoreRevocation$RevocationContentProperty$Builder.)]
    (when-let [data (lookup-entry config id :revocation-type)]
      (. builder revocationType data))
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (when-let [data (lookup-entry config id :s3-object-version)]
      (. builder s3ObjectVersion data))
    (.build builder)))


(defn cfn-trust-store-revocation-trust-store-revocation-property-builder
  "The cfn-trust-store-revocation-trust-store-revocation-property-builder function buildes out new instances of 
CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfRevokedEntries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-revoked-entries` |
| `revocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:revocation-id` |
| `revocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:revocation-type` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |"
  [stack id config]
  (let [builder (CfnTrustStoreRevocation$TrustStoreRevocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :number-of-revoked-entries)]
      (. builder numberOfRevokedEntries data))
    (when-let [data (lookup-entry config id :revocation-id)]
      (. builder revocationId data))
    (when-let [data (lookup-entry config id :revocation-type)]
      (. builder revocationType data))
    (when-let [data (lookup-entry config id :trust-store-arn)]
      (. builder trustStoreArn data))
    (.build builder)))


(defn fixed-response-options-builder
  "The fixed-response-options-builder function buildes out new instances of 
FixedResponseOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `messageBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-body` |"
  [stack id config]
  (let [builder (FixedResponseOptions$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :message-body)]
      (. builder messageBody data))
    (.build builder)))


(defn forward-options-builder
  "The forward-options-builder function buildes out new instances of 
ForwardOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stickinessDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stickiness-duration` |"
  [stack id config]
  (let [builder (ForwardOptions$Builder.)]
    (when-let [data (lookup-entry config id :stickiness-duration)]
      (. builder stickinessDuration data))
    (.build builder)))


(defn health-check-builder
  "The health-check-builder function buildes out new instances of 
HealthCheck$Builder using the provided configuration.  Each field is set as follows:

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
| `unhealthyThresholdCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold-count` |"
  [stack id config]
  (let [builder (HealthCheck$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :healthy-grpc-codes)]
      (. builder healthyGrpcCodes data))
    (when-let [data (lookup-entry config id :healthy-http-codes)]
      (. builder healthyHttpCodes data))
    (when-let [data (lookup-entry config id :healthy-threshold-count)]
      (. builder healthyThresholdCount data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :unhealthy-threshold-count)]
      (. builder unhealthyThresholdCount data))
    (.build builder)))


(defn load-balancer-target-props-builder
  "The load-balancer-target-props-builder function buildes out new instances of 
LoadBalancerTargetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:target-json` |
| `targetType` | software.amazon.awscdk.services.elasticloadbalancingv2.TargetType | [[cdk.api.services.elasticloadbalancingv2/target-type]] | `:target-type` |"
  [stack id config]
  (let [builder (LoadBalancerTargetProps$Builder.)]
    (when-let [data (lookup-entry config id :target-json)]
      (. builder targetJson data))
    (when-let [data (target-type config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn network-forward-options-builder
  "The network-forward-options-builder function buildes out new instances of 
NetworkForwardOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stickinessDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stickiness-duration` |"
  [stack id config]
  (let [builder (NetworkForwardOptions$Builder.)]
    (when-let [data (lookup-entry config id :stickiness-duration)]
      (. builder stickinessDuration data))
    (.build builder)))


(defn network-listener-builder
  "The network-listener-builder function buildes out new instances of 
NetworkListener$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy | [[cdk.api.services.elasticloadbalancingv2/alpn-policy]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (NetworkListener$Builder/create stack id)]
    (when-let [data (alpn-policy config id :alpn-policy)]
      (. builder alpnPolicy data))
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :default-target-groups)]
      (. builder defaultTargetGroups data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn network-listener-lookup-options-builder
  "The network-listener-lookup-options-builder function buildes out new instances of 
NetworkListenerLookupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `listenerProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:listener-protocol` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |"
  [stack id config]
  (let [builder (NetworkListenerLookupOptions$Builder.)]
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (protocol config id :listener-protocol)]
      (. builder listenerProtocol data))
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-tags)]
      (. builder loadBalancerTags data))
    (.build builder)))


(defn network-listener-props-builder
  "The network-listener-props-builder function buildes out new instances of 
NetworkListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alpnPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy | [[cdk.api.services.elasticloadbalancingv2/alpn-policy]] | `:alpn-policy` |
| `certificates` | java.util.List | [[cdk.support/lookup-entry]] | `:certificates` |
| `defaultAction` | software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction | [[cdk.support/lookup-entry]] | `:default-action` |
| `defaultTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:default-target-groups` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.Protocol | [[cdk.api.services.elasticloadbalancingv2/protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (NetworkListenerProps$Builder.)]
    (when-let [data (alpn-policy config id :alpn-policy)]
      (. builder alpnPolicy data))
    (when-let [data (lookup-entry config id :certificates)]
      (. builder certificates data))
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :default-target-groups)]
      (. builder defaultTargetGroups data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn network-load-balancer-attributes-builder
  "The network-load-balancer-attributes-builder function buildes out new instances of 
NetworkLoadBalancerAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerCanonicalHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-canonical-hosted-zone-id` |
| `loadBalancerDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-dns-name` |
| `loadBalancerSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkLoadBalancerAttributes$Builder.)]
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-canonical-hosted-zone-id)]
      (. builder loadBalancerCanonicalHostedZoneId data))
    (when-let [data (lookup-entry config id :load-balancer-dns-name)]
      (. builder loadBalancerDnsName data))
    (when-let [data (lookup-entry config id :load-balancer-security-groups)]
      (. builder loadBalancerSecurityGroups data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-load-balancer-builder
  "The network-load-balancer-builder function buildes out new instances of 
NetworkLoadBalancer$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (NetworkLoadBalancer$Builder/create stack id)]
    (when-let [data (client-routing-policy config id :client-routing-policy)]
      (. builder clientRoutingPolicy data))
    (when-let [data (lookup-entry config id :cross-zone-enabled)]
      (. builder crossZoneEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :deny-all-igw-traffic)]
      (. builder denyAllIgwTraffic data))
    (when-let [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
      (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
    (when-let [data (lookup-entry config id :internet-facing)]
      (. builder internetFacing data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn network-load-balancer-lookup-options-builder
  "The network-load-balancer-lookup-options-builder function buildes out new instances of 
NetworkLoadBalancerLookupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |"
  [stack id config]
  (let [builder (NetworkLoadBalancerLookupOptions$Builder.)]
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-tags)]
      (. builder loadBalancerTags data))
    (.build builder)))


(defn network-load-balancer-props-builder
  "The network-load-balancer-props-builder function buildes out new instances of 
NetworkLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (NetworkLoadBalancerProps$Builder.)]
    (when-let [data (client-routing-policy config id :client-routing-policy)]
      (. builder clientRoutingPolicy data))
    (when-let [data (lookup-entry config id :cross-zone-enabled)]
      (. builder crossZoneEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :deny-all-igw-traffic)]
      (. builder denyAllIgwTraffic data))
    (when-let [data (lookup-entry config id :enforce-security-group-inbound-rules-on-private-link-traffic)]
      (. builder enforceSecurityGroupInboundRulesOnPrivateLinkTraffic data))
    (when-let [data (lookup-entry config id :internet-facing)]
      (. builder internetFacing data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn network-target-group-builder
  "The network-target-group-builder function buildes out new instances of 
NetworkTargetGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkTargetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-termination)]
      (. builder connectionTermination data))
    (when-let [data (lookup-entry config id :deregistration-delay)]
      (. builder deregistrationDelay data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :proxy-protocol-v2)]
      (. builder proxyProtocolV2 data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (when-let [data (target-type config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-target-group-props-builder
  "The network-target-group-props-builder function buildes out new instances of 
NetworkTargetGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkTargetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-termination)]
      (. builder connectionTermination data))
    (when-let [data (lookup-entry config id :deregistration-delay)]
      (. builder deregistrationDelay data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :proxy-protocol-v2)]
      (. builder proxyProtocolV2 data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (when-let [data (target-type config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-weighted-target-group-builder
  "The network-weighted-target-group-builder function buildes out new instances of 
NetworkWeightedTargetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup | [[cdk.support/lookup-entry]] | `:target-group` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (NetworkWeightedTargetGroup$Builder.)]
    (when-let [data (lookup-entry config id :target-group)]
      (. builder targetGroup data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn query-string-condition-builder
  "The query-string-condition-builder function buildes out new instances of 
QueryStringCondition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (QueryStringCondition$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn redirect-options-builder
  "The redirect-options-builder function buildes out new instances of 
RedirectOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permanent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:permanent` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `query` | java.lang.String | [[cdk.support/lookup-entry]] | `:query` |"
  [stack id config]
  (let [builder (RedirectOptions$Builder.)]
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permanent)]
      (. builder permanent data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :query)]
      (. builder query data))
    (.build builder)))


(defn target-group-attributes-builder
  "The target-group-attributes-builder function buildes out new instances of 
TargetGroupAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArns` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arns` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |"
  [stack id config]
  (let [builder (TargetGroupAttributes$Builder.)]
    (when-let [data (lookup-entry config id :load-balancer-arns)]
      (. builder loadBalancerArns data))
    (when-let [data (lookup-entry config id :target-group-arn)]
      (. builder targetGroupArn data))
    (.build builder)))


(defn weighted-target-group-builder
  "The weighted-target-group-builder function buildes out new instances of 
WeightedTargetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup | [[cdk.support/lookup-entry]] | `:target-group` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (WeightedTargetGroup$Builder.)]
    (when-let [data (lookup-entry config id :target-group)]
      (. builder targetGroup data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))