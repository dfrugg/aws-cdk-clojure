(ns cdk.api.services.appmesh
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appmesh package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.appmesh AccessLogConfig$Builder
                                                    BackendConfig$Builder
                                                    BackendDefaults$Builder
                                                    CfnGatewayRoute$Builder
                                                    CfnGatewayRoute$GatewayRouteHostnameMatchProperty$Builder
                                                    CfnGatewayRoute$GatewayRouteHostnameRewriteProperty$Builder
                                                    CfnGatewayRoute$GatewayRouteMetadataMatchProperty$Builder
                                                    CfnGatewayRoute$GatewayRouteRangeMatchProperty$Builder
                                                    CfnGatewayRoute$GatewayRouteSpecProperty$Builder
                                                    CfnGatewayRoute$GatewayRouteTargetProperty$Builder
                                                    CfnGatewayRoute$GatewayRouteVirtualServiceProperty$Builder
                                                    CfnGatewayRoute$GrpcGatewayRouteActionProperty$Builder
                                                    CfnGatewayRoute$GrpcGatewayRouteMatchProperty$Builder
                                                    CfnGatewayRoute$GrpcGatewayRouteMetadataProperty$Builder
                                                    CfnGatewayRoute$GrpcGatewayRouteProperty$Builder
                                                    CfnGatewayRoute$GrpcGatewayRouteRewriteProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRouteActionProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRouteHeaderMatchProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRouteHeaderProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRouteMatchProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRouteProperty$Builder
                                                    CfnGatewayRoute$HttpGatewayRouteRewriteProperty$Builder
                                                    CfnGatewayRoute$HttpPathMatchProperty$Builder
                                                    CfnGatewayRoute$HttpQueryParameterMatchProperty$Builder
                                                    CfnGatewayRoute$QueryParameterProperty$Builder
                                                    CfnGatewayRouteProps$Builder
                                                    CfnMesh$Builder
                                                    CfnMesh$EgressFilterProperty$Builder
                                                    CfnMesh$MeshServiceDiscoveryProperty$Builder
                                                    CfnMesh$MeshSpecProperty$Builder
                                                    CfnMeshProps$Builder
                                                    CfnRoute$Builder
                                                    CfnRoute$DurationProperty$Builder
                                                    CfnRoute$GrpcRetryPolicyProperty$Builder
                                                    CfnRoute$GrpcRouteActionProperty$Builder
                                                    CfnRoute$GrpcRouteMatchProperty$Builder
                                                    CfnRoute$GrpcRouteMetadataMatchMethodProperty$Builder
                                                    CfnRoute$GrpcRouteMetadataProperty$Builder
                                                    CfnRoute$GrpcRouteProperty$Builder
                                                    CfnRoute$GrpcTimeoutProperty$Builder
                                                    CfnRoute$HeaderMatchMethodProperty$Builder
                                                    CfnRoute$HttpPathMatchProperty$Builder
                                                    CfnRoute$HttpQueryParameterMatchProperty$Builder
                                                    CfnRoute$HttpRetryPolicyProperty$Builder
                                                    CfnRoute$HttpRouteActionProperty$Builder
                                                    CfnRoute$HttpRouteHeaderProperty$Builder
                                                    CfnRoute$HttpRouteMatchProperty$Builder
                                                    CfnRoute$HttpRouteProperty$Builder
                                                    CfnRoute$HttpTimeoutProperty$Builder
                                                    CfnRoute$MatchRangeProperty$Builder
                                                    CfnRoute$QueryParameterProperty$Builder
                                                    CfnRoute$RouteSpecProperty$Builder
                                                    CfnRoute$TcpRouteActionProperty$Builder
                                                    CfnRoute$TcpRouteMatchProperty$Builder
                                                    CfnRoute$TcpRouteProperty$Builder
                                                    CfnRoute$TcpTimeoutProperty$Builder
                                                    CfnRoute$WeightedTargetProperty$Builder
                                                    CfnRouteProps$Builder
                                                    CfnVirtualGateway$Builder
                                                    CfnVirtualGateway$JsonFormatRefProperty$Builder
                                                    CfnVirtualGateway$LoggingFormatProperty$Builder
                                                    CfnVirtualGateway$SubjectAlternativeNameMatchersProperty$Builder
                                                    CfnVirtualGateway$SubjectAlternativeNamesProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayAccessLogProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayBackendDefaultsProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayClientPolicyProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayClientPolicyTlsProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayConnectionPoolProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayFileAccessLogProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayGrpcConnectionPoolProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayHttpConnectionPoolProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerTlsCertificateProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerTlsFileCertificateProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerTlsProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayLoggingProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayPortMappingProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewaySpecProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayTlsValidationContextFileTrustProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty$Builder
                                                    CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty$Builder
                                                    CfnVirtualGatewayProps$Builder
                                                    CfnVirtualNode$AccessLogProperty$Builder
                                                    CfnVirtualNode$AwsCloudMapInstanceAttributeProperty$Builder
                                                    CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty$Builder
                                                    CfnVirtualNode$BackendDefaultsProperty$Builder
                                                    CfnVirtualNode$BackendProperty$Builder
                                                    CfnVirtualNode$Builder
                                                    CfnVirtualNode$ClientPolicyProperty$Builder
                                                    CfnVirtualNode$ClientPolicyTlsProperty$Builder
                                                    CfnVirtualNode$ClientTlsCertificateProperty$Builder
                                                    CfnVirtualNode$DnsServiceDiscoveryProperty$Builder
                                                    CfnVirtualNode$DurationProperty$Builder
                                                    CfnVirtualNode$FileAccessLogProperty$Builder
                                                    CfnVirtualNode$GrpcTimeoutProperty$Builder
                                                    CfnVirtualNode$HealthCheckProperty$Builder
                                                    CfnVirtualNode$HttpTimeoutProperty$Builder
                                                    CfnVirtualNode$JsonFormatRefProperty$Builder
                                                    CfnVirtualNode$ListenerProperty$Builder
                                                    CfnVirtualNode$ListenerTimeoutProperty$Builder
                                                    CfnVirtualNode$ListenerTlsAcmCertificateProperty$Builder
                                                    CfnVirtualNode$ListenerTlsCertificateProperty$Builder
                                                    CfnVirtualNode$ListenerTlsFileCertificateProperty$Builder
                                                    CfnVirtualNode$ListenerTlsProperty$Builder
                                                    CfnVirtualNode$ListenerTlsSdsCertificateProperty$Builder
                                                    CfnVirtualNode$ListenerTlsValidationContextProperty$Builder
                                                    CfnVirtualNode$ListenerTlsValidationContextTrustProperty$Builder
                                                    CfnVirtualNode$LoggingFormatProperty$Builder
                                                    CfnVirtualNode$LoggingProperty$Builder
                                                    CfnVirtualNode$OutlierDetectionProperty$Builder
                                                    CfnVirtualNode$PortMappingProperty$Builder
                                                    CfnVirtualNode$ServiceDiscoveryProperty$Builder
                                                    CfnVirtualNode$SubjectAlternativeNameMatchersProperty$Builder
                                                    CfnVirtualNode$SubjectAlternativeNamesProperty$Builder
                                                    CfnVirtualNode$TcpTimeoutProperty$Builder
                                                    CfnVirtualNode$TlsValidationContextAcmTrustProperty$Builder
                                                    CfnVirtualNode$TlsValidationContextFileTrustProperty$Builder
                                                    CfnVirtualNode$TlsValidationContextProperty$Builder
                                                    CfnVirtualNode$TlsValidationContextSdsTrustProperty$Builder
                                                    CfnVirtualNode$TlsValidationContextTrustProperty$Builder
                                                    CfnVirtualNode$VirtualNodeConnectionPoolProperty$Builder
                                                    CfnVirtualNode$VirtualNodeGrpcConnectionPoolProperty$Builder
                                                    CfnVirtualNode$VirtualNodeHttp2ConnectionPoolProperty$Builder
                                                    CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty$Builder
                                                    CfnVirtualNode$VirtualNodeSpecProperty$Builder
                                                    CfnVirtualNode$VirtualNodeTcpConnectionPoolProperty$Builder
                                                    CfnVirtualNode$VirtualServiceBackendProperty$Builder
                                                    CfnVirtualNodeProps$Builder
                                                    CfnVirtualRouter$Builder
                                                    CfnVirtualRouter$PortMappingProperty$Builder
                                                    CfnVirtualRouter$VirtualRouterListenerProperty$Builder
                                                    CfnVirtualRouter$VirtualRouterSpecProperty$Builder
                                                    CfnVirtualRouterProps$Builder
                                                    CfnVirtualService$Builder
                                                    CfnVirtualService$VirtualNodeServiceProviderProperty$Builder
                                                    CfnVirtualService$VirtualRouterServiceProviderProperty$Builder
                                                    CfnVirtualService$VirtualServiceProviderProperty$Builder
                                                    CfnVirtualService$VirtualServiceSpecProperty$Builder
                                                    CfnVirtualServiceProps$Builder
                                                    CommonGatewayRouteSpecOptions$Builder
                                                    DnsResponseType
                                                    GatewayRoute$Builder
                                                    GatewayRouteAttributes$Builder
                                                    GatewayRouteBaseProps$Builder
                                                    GatewayRouteHostnameMatchConfig$Builder
                                                    GatewayRouteProps$Builder
                                                    GatewayRouteSpecConfig$Builder
                                                    GrpcConnectionPool$Builder
                                                    GrpcGatewayListenerOptions$Builder
                                                    GrpcGatewayRouteMatch$Builder
                                                    GrpcGatewayRouteSpecOptions$Builder
                                                    GrpcHealthCheckOptions$Builder
                                                    GrpcRetryEvent
                                                    GrpcRetryPolicy$Builder
                                                    GrpcRouteMatch$Builder
                                                    GrpcRouteSpecOptions$Builder
                                                    GrpcTimeout$Builder
                                                    GrpcVirtualNodeListenerOptions$Builder
                                                    HeaderMatchConfig$Builder
                                                    HealthCheckBindOptions$Builder
                                                    HealthCheckConfig$Builder
                                                    Http2ConnectionPool$Builder
                                                    Http2GatewayListenerOptions$Builder
                                                    Http2VirtualNodeListenerOptions$Builder
                                                    HttpConnectionPool$Builder
                                                    HttpGatewayListenerOptions$Builder
                                                    HttpGatewayRouteMatch$Builder
                                                    HttpGatewayRoutePathMatchConfig$Builder
                                                    HttpGatewayRouteSpecOptions$Builder
                                                    HttpHealthCheckOptions$Builder
                                                    HttpRetryEvent
                                                    HttpRetryPolicy$Builder
                                                    HttpRouteMatch$Builder
                                                    HttpRouteMethod
                                                    HttpRoutePathMatchConfig$Builder
                                                    HttpRouteProtocol
                                                    HttpRouteSpecOptions$Builder
                                                    HttpTimeout$Builder
                                                    HttpVirtualNodeListenerOptions$Builder
                                                    IpPreference
                                                    ListenerTlsOptions$Builder
                                                    LoggingFormatConfig$Builder
                                                    Mesh$Builder
                                                    MeshFilterType
                                                    MeshProps$Builder
                                                    MeshServiceDiscovery$Builder
                                                    MutualTlsValidation$Builder
                                                    OutlierDetection$Builder
                                                    QueryParameterMatchConfig$Builder
                                                    Route$Builder
                                                    RouteAttributes$Builder
                                                    RouteBaseProps$Builder
                                                    RouteProps$Builder
                                                    RouteSpecConfig$Builder
                                                    RouteSpecOptionsBase$Builder
                                                    ServiceDiscoveryConfig$Builder
                                                    SubjectAlternativeNamesMatcherConfig$Builder
                                                    TcpConnectionPool$Builder
                                                    TcpHealthCheckOptions$Builder
                                                    TcpRetryEvent
                                                    TcpRouteSpecOptions$Builder
                                                    TcpTimeout$Builder
                                                    TcpVirtualNodeListenerOptions$Builder
                                                    TlsCertificateConfig$Builder
                                                    TlsClientPolicy$Builder
                                                    TlsMode
                                                    TlsValidation$Builder
                                                    TlsValidationTrustConfig$Builder
                                                    VirtualGateway$Builder
                                                    VirtualGatewayAttributes$Builder
                                                    VirtualGatewayBaseProps$Builder
                                                    VirtualGatewayListenerConfig$Builder
                                                    VirtualGatewayProps$Builder
                                                    VirtualNode$Builder
                                                    VirtualNodeAttributes$Builder
                                                    VirtualNodeBaseProps$Builder
                                                    VirtualNodeListenerConfig$Builder
                                                    VirtualNodeProps$Builder
                                                    VirtualRouter$Builder
                                                    VirtualRouterAttributes$Builder
                                                    VirtualRouterBaseProps$Builder
                                                    VirtualRouterListenerConfig$Builder
                                                    VirtualRouterProps$Builder
                                                    VirtualService$Builder
                                                    VirtualServiceAttributes$Builder
                                                    VirtualServiceBackendOptions$Builder
                                                    VirtualServiceProps$Builder
                                                    VirtualServiceProviderConfig$Builder
                                                    WeightedTarget$Builder]))


(defn dns-response-type
  "The `dns-response-type` function data interprets values in the provided config data into a 
`DnsResponseType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DnsResponseType` - the value is returned.
* is `:endpoints` - `DnsResponseType/ENDPOINTS` is returned
* is `:load-balancer` - `DnsResponseType/LOAD_BALANCER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DnsResponseType data) data
      (= :endpoints data) DnsResponseType/ENDPOINTS
      (= :load-balancer data) DnsResponseType/LOAD_BALANCER)))


(defn grpc-retry-event
  "The `grpc-retry-event` function data interprets values in the provided config data into a 
`GrpcRetryEvent` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `GrpcRetryEvent` - the value is returned.
* is `:unavailable` - `GrpcRetryEvent/UNAVAILABLE` is returned
* is `:resource-exhausted` - `GrpcRetryEvent/RESOURCE_EXHAUSTED` is returned
* is `:deadline-exceeded` - `GrpcRetryEvent/DEADLINE_EXCEEDED` is returned
* is `:internal-error` - `GrpcRetryEvent/INTERNAL_ERROR` is returned
* is `:cancelled` - `GrpcRetryEvent/CANCELLED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? GrpcRetryEvent data) data
      (= :unavailable data) GrpcRetryEvent/UNAVAILABLE
      (= :resource-exhausted data) GrpcRetryEvent/RESOURCE_EXHAUSTED
      (= :deadline-exceeded data) GrpcRetryEvent/DEADLINE_EXCEEDED
      (= :internal-error data) GrpcRetryEvent/INTERNAL_ERROR
      (= :cancelled data) GrpcRetryEvent/CANCELLED)))


(defn http-retry-event
  "The `http-retry-event` function data interprets values in the provided config data into a 
`HttpRetryEvent` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpRetryEvent` - the value is returned.
* is `:stream-error` - `HttpRetryEvent/STREAM_ERROR` is returned
* is `:server-error` - `HttpRetryEvent/SERVER_ERROR` is returned
* is `:gateway-error` - `HttpRetryEvent/GATEWAY_ERROR` is returned
* is `:client-error` - `HttpRetryEvent/CLIENT_ERROR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpRetryEvent data) data
      (= :stream-error data) HttpRetryEvent/STREAM_ERROR
      (= :server-error data) HttpRetryEvent/SERVER_ERROR
      (= :gateway-error data) HttpRetryEvent/GATEWAY_ERROR
      (= :client-error data) HttpRetryEvent/CLIENT_ERROR)))


(defn http-route-method
  "The `http-route-method` function data interprets values in the provided config data into a 
`HttpRouteMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpRouteMethod` - the value is returned.
* is `:put` - `HttpRouteMethod/PUT` is returned
* is `:post` - `HttpRouteMethod/POST` is returned
* is `:connect` - `HttpRouteMethod/CONNECT` is returned
* is `:delete` - `HttpRouteMethod/DELETE` is returned
* is `:get` - `HttpRouteMethod/GET` is returned
* is `:head` - `HttpRouteMethod/HEAD` is returned
* is `:trace` - `HttpRouteMethod/TRACE` is returned
* is `:patch` - `HttpRouteMethod/PATCH` is returned
* is `:options` - `HttpRouteMethod/OPTIONS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpRouteMethod data) data
      (= :put data) HttpRouteMethod/PUT
      (= :post data) HttpRouteMethod/POST
      (= :connect data) HttpRouteMethod/CONNECT
      (= :delete data) HttpRouteMethod/DELETE
      (= :get data) HttpRouteMethod/GET
      (= :head data) HttpRouteMethod/HEAD
      (= :trace data) HttpRouteMethod/TRACE
      (= :patch data) HttpRouteMethod/PATCH
      (= :options data) HttpRouteMethod/OPTIONS)))


(defn http-route-protocol
  "The `http-route-protocol` function data interprets values in the provided config data into a 
`HttpRouteProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpRouteProtocol` - the value is returned.
* is `:http` - `HttpRouteProtocol/HTTP` is returned
* is `:https` - `HttpRouteProtocol/HTTPS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpRouteProtocol data) data
      (= :http data) HttpRouteProtocol/HTTP
      (= :https data) HttpRouteProtocol/HTTPS)))


(defn ip-preference
  "The `ip-preference` function data interprets values in the provided config data into a 
`IpPreference` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IpPreference` - the value is returned.
* is `:ipv4-only` - `IpPreference/IPV4_ONLY` is returned
* is `:ipv6-only` - `IpPreference/IPV6_ONLY` is returned
* is `:ipv6-preferred` - `IpPreference/IPV6_PREFERRED` is returned
* is `:ipv4-preferred` - `IpPreference/IPV4_PREFERRED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IpPreference data) data
      (= :ipv4-only data) IpPreference/IPV4_ONLY
      (= :ipv6-only data) IpPreference/IPV6_ONLY
      (= :ipv6-preferred data) IpPreference/IPV6_PREFERRED
      (= :ipv4-preferred data) IpPreference/IPV4_PREFERRED)))


(defn mesh-filter-type
  "The `mesh-filter-type` function data interprets values in the provided config data into a 
`MeshFilterType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MeshFilterType` - the value is returned.
* is `:drop-all` - `MeshFilterType/DROP_ALL` is returned
* is `:allow-all` - `MeshFilterType/ALLOW_ALL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MeshFilterType data) data
      (= :drop-all data) MeshFilterType/DROP_ALL
      (= :allow-all data) MeshFilterType/ALLOW_ALL)))


(defn tcp-retry-event
  "The `tcp-retry-event` function data interprets values in the provided config data into a 
`TcpRetryEvent` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TcpRetryEvent` - the value is returned.
* is `:connection-error` - `TcpRetryEvent/CONNECTION_ERROR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TcpRetryEvent data) data
      (= :connection-error data) TcpRetryEvent/CONNECTION_ERROR)))


(defn tls-mode
  "The `tls-mode` function data interprets values in the provided config data into a 
`TlsMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TlsMode` - the value is returned.
* is `:permissive` - `TlsMode/PERMISSIVE` is returned
* is `:strict` - `TlsMode/STRICT` is returned
* is `:disabled` - `TlsMode/DISABLED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TlsMode data) data
      (= :permissive data) TlsMode/PERMISSIVE
      (= :strict data) TlsMode/STRICT
      (= :disabled data) TlsMode/DISABLED)))


(defn build-access-log-config-builder
  "The build-access-log-config-builder function updates a AccessLogConfig$Builder instance using the provided configuration.
  The function takes the AccessLogConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualGatewayAccessLog` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayAccessLogProperty | [[cdk.support/lookup-entry]] | `:virtual-gateway-access-log` |
| `virtualNodeAccessLog` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AccessLogProperty | [[cdk.support/lookup-entry]] | `:virtual-node-access-log` |
"
  [^AccessLogConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-gateway-access-log)]
    (. builder virtualGatewayAccessLog data))
  (when-let [data (lookup-entry config id :virtual-node-access-log)]
    (. builder virtualNodeAccessLog data))
  (.build builder))


(defn access-log-config-builder
  ""
  [id config]
  (build-access-log-config-builder (new AccessLogConfig$Builder) id config))


(defn build-backend-config-builder
  "The build-backend-config-builder function updates a BackendConfig$Builder instance using the provided configuration.
  The function takes the BackendConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceBackend` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$BackendProperty | [[cdk.support/lookup-entry]] | `:virtual-service-backend` |
"
  [^BackendConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-service-backend)]
    (. builder virtualServiceBackend data))
  (.build builder))


(defn backend-config-builder
  ""
  [id config]
  (build-backend-config-builder (new BackendConfig$Builder) id config))


(defn build-backend-defaults-builder
  "The build-backend-defaults-builder function updates a BackendDefaults$Builder instance using the provided configuration.
  The function takes the BackendDefaults$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsClientPolicy` | software.amazon.awscdk.services.appmesh.TlsClientPolicy | [[cdk.support/lookup-entry]] | `:tls-client-policy` |
"
  [^BackendDefaults$Builder builder id config]
  (when-let [data (lookup-entry config id :tls-client-policy)]
    (. builder tlsClientPolicy data))
  (.build builder))


(defn backend-defaults-builder
  ""
  [id config]
  (build-backend-defaults-builder (new BackendDefaults$Builder) id config))


(defn build-cfn-gateway-route-builder
  "The build-cfn-gateway-route-builder function updates a CfnGatewayRoute$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^CfnGatewayRoute$Builder builder id config]
  (when-let [data (lookup-entry config id :gateway-route-name)]
    (. builder gatewayRouteName data))
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn cfn-gateway-route-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-gateway-route-builder (CfnGatewayRoute$Builder/create scope (name id)) id config))


(defn build-cfn-gateway-route-gateway-route-hostname-match-property-builder
  "The build-cfn-gateway-route-gateway-route-hostname-match-property-builder function updates a CfnGatewayRoute$GatewayRouteHostnameMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GatewayRouteHostnameMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |
"
  [^CfnGatewayRoute$GatewayRouteHostnameMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-let [data (lookup-entry config id :suffix)]
    (. builder suffix data))
  (.build builder))


(defn cfn-gateway-route-gateway-route-hostname-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-gateway-route-hostname-match-property-builder (new CfnGatewayRoute$GatewayRouteHostnameMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-gateway-route-hostname-rewrite-property-builder
  "The build-cfn-gateway-route-gateway-route-hostname-rewrite-property-builder function updates a CfnGatewayRoute$GatewayRouteHostnameRewriteProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GatewayRouteHostnameRewriteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultTargetHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-target-hostname` |
"
  [^CfnGatewayRoute$GatewayRouteHostnameRewriteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-target-hostname)]
    (. builder defaultTargetHostname data))
  (.build builder))


(defn cfn-gateway-route-gateway-route-hostname-rewrite-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-gateway-route-hostname-rewrite-property-builder (new CfnGatewayRoute$GatewayRouteHostnameRewriteProperty$Builder) id config))


(defn build-cfn-gateway-route-gateway-route-metadata-match-property-builder
  "The build-cfn-gateway-route-gateway-route-metadata-match-property-builder function updates a CfnGatewayRoute$GatewayRouteMetadataMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GatewayRouteMetadataMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteRangeMatchProperty | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |
"
  [^CfnGatewayRoute$GatewayRouteMetadataMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :range)]
    (. builder range data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (when-let [data (lookup-entry config id :suffix)]
    (. builder suffix data))
  (.build builder))


(defn cfn-gateway-route-gateway-route-metadata-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-gateway-route-metadata-match-property-builder (new CfnGatewayRoute$GatewayRouteMetadataMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-gateway-route-range-match-property-builder
  "The build-cfn-gateway-route-gateway-route-range-match-property-builder function updates a CfnGatewayRoute$GatewayRouteRangeMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GatewayRouteRangeMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start` |
"
  [^CfnGatewayRoute$GatewayRouteRangeMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end)]
    (. builder end data))
  (when-let [data (lookup-entry config id :start)]
    (. builder start data))
  (.build builder))


(defn cfn-gateway-route-gateway-route-range-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-gateway-route-range-match-property-builder (new CfnGatewayRoute$GatewayRouteRangeMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-gateway-route-spec-property-builder
  "The build-cfn-gateway-route-gateway-route-spec-property-builder function updates a CfnGatewayRoute$GatewayRouteSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GatewayRouteSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRoute` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-route` |
| `http2Route` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http2-route` |
| `httpRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-route` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^CfnGatewayRoute$GatewayRouteSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc-route)]
    (. builder grpcRoute data))
  (when-let [data (lookup-entry config id :http2-route)]
    (. builder http2Route data))
  (when-let [data (lookup-entry config id :http-route)]
    (. builder httpRoute data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn cfn-gateway-route-gateway-route-spec-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-gateway-route-spec-property-builder (new CfnGatewayRoute$GatewayRouteSpecProperty$Builder) id config))


(defn build-cfn-gateway-route-gateway-route-target-property-builder
  "The build-cfn-gateway-route-gateway-route-target-property-builder function updates a CfnGatewayRoute$GatewayRouteTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GatewayRouteTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `virtualService` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteVirtualServiceProperty | [[cdk.support/lookup-entry]] | `:virtual-service` |
"
  [^CfnGatewayRoute$GatewayRouteTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :virtual-service)]
    (. builder virtualService data))
  (.build builder))


(defn cfn-gateway-route-gateway-route-target-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-gateway-route-target-property-builder (new CfnGatewayRoute$GatewayRouteTargetProperty$Builder) id config))


(defn build-cfn-gateway-route-gateway-route-virtual-service-property-builder
  "The build-cfn-gateway-route-gateway-route-virtual-service-property-builder function updates a CfnGatewayRoute$GatewayRouteVirtualServiceProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GatewayRouteVirtualServiceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
"
  [^CfnGatewayRoute$GatewayRouteVirtualServiceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-service-name)]
    (. builder virtualServiceName data))
  (.build builder))


(defn cfn-gateway-route-gateway-route-virtual-service-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-gateway-route-virtual-service-property-builder (new CfnGatewayRoute$GatewayRouteVirtualServiceProperty$Builder) id config))


(defn build-cfn-gateway-route-grpc-gateway-route-action-property-builder
  "The build-cfn-gateway-route-grpc-gateway-route-action-property-builder function updates a CfnGatewayRoute$GrpcGatewayRouteActionProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GrpcGatewayRouteActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteRewriteProperty | [[cdk.support/lookup-entry]] | `:rewrite` |
| `target` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteTargetProperty | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnGatewayRoute$GrpcGatewayRouteActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rewrite)]
    (. builder rewrite data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-gateway-route-grpc-gateway-route-action-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-grpc-gateway-route-action-property-builder (new CfnGatewayRoute$GrpcGatewayRouteActionProperty$Builder) id config))


(defn build-cfn-gateway-route-grpc-gateway-route-match-property-builder
  "The build-cfn-gateway-route-grpc-gateway-route-match-property-builder function updates a CfnGatewayRoute$GrpcGatewayRouteMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GrpcGatewayRouteMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |
| `metadata` | java.util.List | [[cdk.support/lookup-entry]] | `:metadata` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^CfnGatewayRoute$GrpcGatewayRouteMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn cfn-gateway-route-grpc-gateway-route-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-grpc-gateway-route-match-property-builder (new CfnGatewayRoute$GrpcGatewayRouteMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-grpc-gateway-route-metadata-property-builder
  "The build-cfn-gateway-route-grpc-gateway-route-metadata-property-builder function updates a CfnGatewayRoute$GrpcGatewayRouteMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GrpcGatewayRouteMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnGatewayRoute$GrpcGatewayRouteMetadataProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invert)]
    (. builder invert data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-gateway-route-grpc-gateway-route-metadata-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-grpc-gateway-route-metadata-property-builder (new CfnGatewayRoute$GrpcGatewayRouteMetadataProperty$Builder) id config))


(defn build-cfn-gateway-route-grpc-gateway-route-property-builder
  "The build-cfn-gateway-route-grpc-gateway-route-property-builder function updates a CfnGatewayRoute$GrpcGatewayRouteProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GrpcGatewayRouteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
"
  [^CfnGatewayRoute$GrpcGatewayRouteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (.build builder))


(defn cfn-gateway-route-grpc-gateway-route-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-grpc-gateway-route-property-builder (new CfnGatewayRoute$GrpcGatewayRouteProperty$Builder) id config))


(defn build-cfn-gateway-route-grpc-gateway-route-rewrite-property-builder
  "The build-cfn-gateway-route-grpc-gateway-route-rewrite-property-builder function updates a CfnGatewayRoute$GrpcGatewayRouteRewriteProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$GrpcGatewayRouteRewriteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |
"
  [^CfnGatewayRoute$GrpcGatewayRouteRewriteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (.build builder))


(defn cfn-gateway-route-grpc-gateway-route-rewrite-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-grpc-gateway-route-rewrite-property-builder (new CfnGatewayRoute$GrpcGatewayRouteRewriteProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-action-property-builder
  "The build-cfn-gateway-route-http-gateway-route-action-property-builder function updates a CfnGatewayRoute$HttpGatewayRouteActionProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRouteActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteRewriteProperty | [[cdk.support/lookup-entry]] | `:rewrite` |
| `target` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteTargetProperty | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnGatewayRoute$HttpGatewayRouteActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rewrite)]
    (. builder rewrite data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-action-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-action-property-builder (new CfnGatewayRoute$HttpGatewayRouteActionProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-header-match-property-builder
  "The build-cfn-gateway-route-http-gateway-route-header-match-property-builder function updates a CfnGatewayRoute$HttpGatewayRouteHeaderMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRouteHeaderMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |
"
  [^CfnGatewayRoute$HttpGatewayRouteHeaderMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :range)]
    (. builder range data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (when-let [data (lookup-entry config id :suffix)]
    (. builder suffix data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-header-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-header-match-property-builder (new CfnGatewayRoute$HttpGatewayRouteHeaderMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-header-property-builder
  "The build-cfn-gateway-route-http-gateway-route-header-property-builder function updates a CfnGatewayRoute$HttpGatewayRouteHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRouteHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnGatewayRoute$HttpGatewayRouteHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invert)]
    (. builder invert data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-header-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-header-property-builder (new CfnGatewayRoute$HttpGatewayRouteHeaderProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-match-property-builder
  "The build-cfn-gateway-route-http-gateway-route-match-property-builder function updates a CfnGatewayRoute$HttpGatewayRouteMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRouteMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |
"
  [^CfnGatewayRoute$HttpGatewayRouteMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-match-property-builder (new CfnGatewayRoute$HttpGatewayRouteMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-path-rewrite-property-builder
  "The build-cfn-gateway-route-http-gateway-route-path-rewrite-property-builder function updates a CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
"
  [^CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-path-rewrite-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-path-rewrite-property-builder (new CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-prefix-rewrite-property-builder
  "The build-cfn-gateway-route-http-gateway-route-prefix-rewrite-property-builder function updates a CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-prefix` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-prefix)]
    (. builder defaultPrefix data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-prefix-rewrite-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-prefix-rewrite-property-builder (new CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-property-builder
  "The build-cfn-gateway-route-http-gateway-route-property-builder function updates a CfnGatewayRoute$HttpGatewayRouteProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRouteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
"
  [^CfnGatewayRoute$HttpGatewayRouteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-property-builder (new CfnGatewayRoute$HttpGatewayRouteProperty$Builder) id config))


(defn build-cfn-gateway-route-http-gateway-route-rewrite-property-builder
  "The build-cfn-gateway-route-http-gateway-route-rewrite-property-builder function updates a CfnGatewayRoute$HttpGatewayRouteRewriteProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpGatewayRouteRewriteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |
| `path` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty | [[cdk.support/lookup-entry]] | `:path` |
| `prefix` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnGatewayRoute$HttpGatewayRouteRewriteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-gateway-route-http-gateway-route-rewrite-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-gateway-route-rewrite-property-builder (new CfnGatewayRoute$HttpGatewayRouteRewriteProperty$Builder) id config))


(defn build-cfn-gateway-route-http-path-match-property-builder
  "The build-cfn-gateway-route-http-path-match-property-builder function updates a CfnGatewayRoute$HttpPathMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpPathMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
"
  [^CfnGatewayRoute$HttpPathMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (.build builder))


(defn cfn-gateway-route-http-path-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-path-match-property-builder (new CfnGatewayRoute$HttpPathMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-http-query-parameter-match-property-builder
  "The build-cfn-gateway-route-http-query-parameter-match-property-builder function updates a CfnGatewayRoute$HttpQueryParameterMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$HttpQueryParameterMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
"
  [^CfnGatewayRoute$HttpQueryParameterMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (.build builder))


(defn cfn-gateway-route-http-query-parameter-match-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-http-query-parameter-match-property-builder (new CfnGatewayRoute$HttpQueryParameterMatchProperty$Builder) id config))


(defn build-cfn-gateway-route-props-builder
  "The build-cfn-gateway-route-props-builder function updates a CfnGatewayRouteProps$Builder instance using the provided configuration.
  The function takes the CfnGatewayRouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^CfnGatewayRouteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :gateway-route-name)]
    (. builder gatewayRouteName data))
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn cfn-gateway-route-props-builder
  ""
  [id config]
  (build-cfn-gateway-route-props-builder (new CfnGatewayRouteProps$Builder) id config))


(defn build-cfn-gateway-route-query-parameter-property-builder
  "The build-cfn-gateway-route-query-parameter-property-builder function updates a CfnGatewayRoute$QueryParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnGatewayRoute$QueryParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnGatewayRoute$QueryParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-gateway-route-query-parameter-property-builder
  ""
  [id config]
  (build-cfn-gateway-route-query-parameter-property-builder (new CfnGatewayRoute$QueryParameterProperty$Builder) id config))


(defn build-cfn-mesh-builder
  "The build-cfn-mesh-builder function updates a CfnMesh$Builder instance using the provided configuration.
  The function takes the CfnMesh$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMesh$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-mesh-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-mesh-builder (CfnMesh$Builder/create scope (name id)) id config))


(defn build-cfn-mesh-egress-filter-property-builder
  "The build-cfn-mesh-egress-filter-property-builder function updates a CfnMesh$EgressFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnMesh$EgressFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnMesh$EgressFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-mesh-egress-filter-property-builder
  ""
  [id config]
  (build-cfn-mesh-egress-filter-property-builder (new CfnMesh$EgressFilterProperty$Builder) id config))


(defn build-cfn-mesh-mesh-service-discovery-property-builder
  "The build-cfn-mesh-mesh-service-discovery-property-builder function updates a CfnMesh$MeshServiceDiscoveryProperty$Builder instance using the provided configuration.
  The function takes the CfnMesh$MeshServiceDiscoveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-preference` |
"
  [^CfnMesh$MeshServiceDiscoveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ip-preference)]
    (. builder ipPreference data))
  (.build builder))


(defn cfn-mesh-mesh-service-discovery-property-builder
  ""
  [id config]
  (build-cfn-mesh-mesh-service-discovery-property-builder (new CfnMesh$MeshServiceDiscoveryProperty$Builder) id config))


(defn build-cfn-mesh-mesh-spec-property-builder
  "The build-cfn-mesh-mesh-spec-property-builder function updates a CfnMesh$MeshSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnMesh$MeshSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressFilter` | software.amazon.awscdk.services.appmesh.CfnMesh$EgressFilterProperty | [[cdk.support/lookup-entry]] | `:egress-filter` |
| `serviceDiscovery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-discovery` |
"
  [^CfnMesh$MeshSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :egress-filter)]
    (. builder egressFilter data))
  (when-let [data (lookup-entry config id :service-discovery)]
    (. builder serviceDiscovery data))
  (.build builder))


(defn cfn-mesh-mesh-spec-property-builder
  ""
  [id config]
  (build-cfn-mesh-mesh-spec-property-builder (new CfnMesh$MeshSpecProperty$Builder) id config))


(defn build-cfn-mesh-props-builder
  "The build-cfn-mesh-props-builder function updates a CfnMeshProps$Builder instance using the provided configuration.
  The function takes the CfnMeshProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMeshProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-mesh-props-builder
  ""
  [id config]
  (build-cfn-mesh-props-builder (new CfnMeshProps$Builder) id config))


(defn build-cfn-route-builder
  "The build-cfn-route-builder function updates a CfnRoute$Builder instance using the provided configuration.
  The function takes the CfnRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnRoute$RouteSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^CfnRoute$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :route-name)]
    (. builder routeName data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn cfn-route-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-route-builder (CfnRoute$Builder/create scope (name id)) id config))


(defn build-cfn-route-duration-property-builder
  "The build-cfn-route-duration-property-builder function updates a CfnRoute$DurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$DurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRoute$DurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-route-duration-property-builder
  ""
  [id config]
  (build-cfn-route-duration-property-builder (new CfnRoute$DurationProperty$Builder) id config))


(defn build-cfn-route-grpc-retry-policy-property-builder
  "The build-cfn-route-grpc-retry-policy-property-builder function updates a CfnRoute$GrpcRetryPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$GrpcRetryPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:grpc-retry-events` |
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `perRetryTimeout` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:per-retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |
"
  [^CfnRoute$GrpcRetryPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc-retry-events)]
    (. builder grpcRetryEvents data))
  (when-let [data (lookup-entry config id :http-retry-events)]
    (. builder httpRetryEvents data))
  (when-let [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (when-let [data (lookup-entry config id :per-retry-timeout)]
    (. builder perRetryTimeout data))
  (when-let [data (lookup-entry config id :tcp-retry-events)]
    (. builder tcpRetryEvents data))
  (.build builder))


(defn cfn-route-grpc-retry-policy-property-builder
  ""
  [id config]
  (build-cfn-route-grpc-retry-policy-property-builder (new CfnRoute$GrpcRetryPolicyProperty$Builder) id config))


(defn build-cfn-route-grpc-route-action-property-builder
  "The build-cfn-route-grpc-route-action-property-builder function updates a CfnRoute$GrpcRouteActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$GrpcRouteActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weightedTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weighted-targets` |
"
  [^CfnRoute$GrpcRouteActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :weighted-targets)]
    (. builder weightedTargets data))
  (.build builder))


(defn cfn-route-grpc-route-action-property-builder
  ""
  [id config]
  (build-cfn-route-grpc-route-action-property-builder (new CfnRoute$GrpcRouteActionProperty$Builder) id config))


(defn build-cfn-route-grpc-route-match-property-builder
  "The build-cfn-route-grpc-route-match-property-builder function updates a CfnRoute$GrpcRouteMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$GrpcRouteMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metadata` |
| `methodName` | java.lang.String | [[cdk.support/lookup-entry]] | `:method-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^CfnRoute$GrpcRouteMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :method-name)]
    (. builder methodName data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn cfn-route-grpc-route-match-property-builder
  ""
  [id config]
  (build-cfn-route-grpc-route-match-property-builder (new CfnRoute$GrpcRouteMatchProperty$Builder) id config))


(defn build-cfn-route-grpc-route-metadata-match-method-property-builder
  "The build-cfn-route-grpc-route-metadata-match-method-property-builder function updates a CfnRoute$GrpcRouteMetadataMatchMethodProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$GrpcRouteMetadataMatchMethodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.services.appmesh.CfnRoute$MatchRangeProperty | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |
"
  [^CfnRoute$GrpcRouteMetadataMatchMethodProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :range)]
    (. builder range data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (when-let [data (lookup-entry config id :suffix)]
    (. builder suffix data))
  (.build builder))


(defn cfn-route-grpc-route-metadata-match-method-property-builder
  ""
  [id config]
  (build-cfn-route-grpc-route-metadata-match-method-property-builder (new CfnRoute$GrpcRouteMetadataMatchMethodProperty$Builder) id config))


(defn build-cfn-route-grpc-route-metadata-property-builder
  "The build-cfn-route-grpc-route-metadata-property-builder function updates a CfnRoute$GrpcRouteMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$GrpcRouteMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRoute$GrpcRouteMetadataProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invert)]
    (. builder invert data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-route-grpc-route-metadata-property-builder
  ""
  [id config]
  (build-cfn-route-grpc-route-metadata-property-builder (new CfnRoute$GrpcRouteMetadataProperty$Builder) id config))


(defn build-cfn-route-grpc-route-property-builder
  "The build-cfn-route-grpc-route-property-builder function updates a CfnRoute$GrpcRouteProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$GrpcRouteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRetryPolicyProperty | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnRoute$GrpcRouteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :retry-policy)]
    (. builder retryPolicy data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-route-grpc-route-property-builder
  ""
  [id config]
  (build-cfn-route-grpc-route-property-builder (new CfnRoute$GrpcRouteProperty$Builder) id config))


(defn build-cfn-route-grpc-timeout-property-builder
  "The build-cfn-route-grpc-timeout-property-builder function updates a CfnRoute$GrpcTimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$GrpcTimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:per-request` |
"
  [^CfnRoute$GrpcTimeoutProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (when-let [data (lookup-entry config id :per-request)]
    (. builder perRequest data))
  (.build builder))


(defn cfn-route-grpc-timeout-property-builder
  ""
  [id config]
  (build-cfn-route-grpc-timeout-property-builder (new CfnRoute$GrpcTimeoutProperty$Builder) id config))


(defn build-cfn-route-header-match-method-property-builder
  "The build-cfn-route-header-match-method-property-builder function updates a CfnRoute$HeaderMatchMethodProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HeaderMatchMethodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |
"
  [^CfnRoute$HeaderMatchMethodProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :range)]
    (. builder range data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (when-let [data (lookup-entry config id :suffix)]
    (. builder suffix data))
  (.build builder))


(defn cfn-route-header-match-method-property-builder
  ""
  [id config]
  (build-cfn-route-header-match-method-property-builder (new CfnRoute$HeaderMatchMethodProperty$Builder) id config))


(defn build-cfn-route-http-path-match-property-builder
  "The build-cfn-route-http-path-match-property-builder function updates a CfnRoute$HttpPathMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpPathMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
"
  [^CfnRoute$HttpPathMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (.build builder))


(defn cfn-route-http-path-match-property-builder
  ""
  [id config]
  (build-cfn-route-http-path-match-property-builder (new CfnRoute$HttpPathMatchProperty$Builder) id config))


(defn build-cfn-route-http-query-parameter-match-property-builder
  "The build-cfn-route-http-query-parameter-match-property-builder function updates a CfnRoute$HttpQueryParameterMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpQueryParameterMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
"
  [^CfnRoute$HttpQueryParameterMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (.build builder))


(defn cfn-route-http-query-parameter-match-property-builder
  ""
  [id config]
  (build-cfn-route-http-query-parameter-match-property-builder (new CfnRoute$HttpQueryParameterMatchProperty$Builder) id config))


(defn build-cfn-route-http-retry-policy-property-builder
  "The build-cfn-route-http-retry-policy-property-builder function updates a CfnRoute$HttpRetryPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpRetryPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `perRetryTimeout` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:per-retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |
"
  [^CfnRoute$HttpRetryPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :http-retry-events)]
    (. builder httpRetryEvents data))
  (when-let [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (when-let [data (lookup-entry config id :per-retry-timeout)]
    (. builder perRetryTimeout data))
  (when-let [data (lookup-entry config id :tcp-retry-events)]
    (. builder tcpRetryEvents data))
  (.build builder))


(defn cfn-route-http-retry-policy-property-builder
  ""
  [id config]
  (build-cfn-route-http-retry-policy-property-builder (new CfnRoute$HttpRetryPolicyProperty$Builder) id config))


(defn build-cfn-route-http-route-action-property-builder
  "The build-cfn-route-http-route-action-property-builder function updates a CfnRoute$HttpRouteActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpRouteActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weightedTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weighted-targets` |
"
  [^CfnRoute$HttpRouteActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :weighted-targets)]
    (. builder weightedTargets data))
  (.build builder))


(defn cfn-route-http-route-action-property-builder
  ""
  [id config]
  (build-cfn-route-http-route-action-property-builder (new CfnRoute$HttpRouteActionProperty$Builder) id config))


(defn build-cfn-route-http-route-header-property-builder
  "The build-cfn-route-http-route-header-property-builder function updates a CfnRoute$HttpRouteHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpRouteHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$HeaderMatchMethodProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRoute$HttpRouteHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invert)]
    (. builder invert data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-route-http-route-header-property-builder
  ""
  [id config]
  (build-cfn-route-http-route-header-property-builder (new CfnRoute$HttpRouteHeaderProperty$Builder) id config))


(defn build-cfn-route-http-route-match-property-builder
  "The build-cfn-route-http-route-match-property-builder function updates a CfnRoute$HttpRouteMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpRouteMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpPathMatchProperty | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `scheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheme` |
"
  [^CfnRoute$HttpRouteMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-let [data (lookup-entry config id :scheme)]
    (. builder scheme data))
  (.build builder))


(defn cfn-route-http-route-match-property-builder
  ""
  [id config]
  (build-cfn-route-http-route-match-property-builder (new CfnRoute$HttpRouteMatchProperty$Builder) id config))


(defn build-cfn-route-http-route-property-builder
  "The build-cfn-route-http-route-property-builder function updates a CfnRoute$HttpRouteProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpRouteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRetryPolicyProperty | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpTimeoutProperty | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnRoute$HttpRouteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :retry-policy)]
    (. builder retryPolicy data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-route-http-route-property-builder
  ""
  [id config]
  (build-cfn-route-http-route-property-builder (new CfnRoute$HttpRouteProperty$Builder) id config))


(defn build-cfn-route-http-timeout-property-builder
  "The build-cfn-route-http-timeout-property-builder function updates a CfnRoute$HttpTimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$HttpTimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:per-request` |
"
  [^CfnRoute$HttpTimeoutProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (when-let [data (lookup-entry config id :per-request)]
    (. builder perRequest data))
  (.build builder))


(defn cfn-route-http-timeout-property-builder
  ""
  [id config]
  (build-cfn-route-http-timeout-property-builder (new CfnRoute$HttpTimeoutProperty$Builder) id config))


(defn build-cfn-route-match-range-property-builder
  "The build-cfn-route-match-range-property-builder function updates a CfnRoute$MatchRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$MatchRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start` |
"
  [^CfnRoute$MatchRangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end)]
    (. builder end data))
  (when-let [data (lookup-entry config id :start)]
    (. builder start data))
  (.build builder))


(defn cfn-route-match-range-property-builder
  ""
  [id config]
  (build-cfn-route-match-range-property-builder (new CfnRoute$MatchRangeProperty$Builder) id config))


(defn build-cfn-route-props-builder
  "The build-cfn-route-props-builder function updates a CfnRouteProps$Builder instance using the provided configuration.
  The function takes the CfnRouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnRoute$RouteSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^CfnRouteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :route-name)]
    (. builder routeName data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn cfn-route-props-builder
  ""
  [id config]
  (build-cfn-route-props-builder (new CfnRouteProps$Builder) id config))


(defn build-cfn-route-query-parameter-property-builder
  "The build-cfn-route-query-parameter-property-builder function updates a CfnRoute$QueryParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$QueryParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpQueryParameterMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRoute$QueryParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-route-query-parameter-property-builder
  ""
  [id config]
  (build-cfn-route-query-parameter-property-builder (new CfnRoute$QueryParameterProperty$Builder) id config))


(defn build-cfn-route-route-spec-property-builder
  "The build-cfn-route-route-spec-property-builder function updates a CfnRoute$RouteSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$RouteSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRoute` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-route` |
| `http2Route` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http2-route` |
| `httpRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-route` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tcpRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tcp-route` |
"
  [^CfnRoute$RouteSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc-route)]
    (. builder grpcRoute data))
  (when-let [data (lookup-entry config id :http2-route)]
    (. builder http2Route data))
  (when-let [data (lookup-entry config id :http-route)]
    (. builder httpRoute data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :tcp-route)]
    (. builder tcpRoute data))
  (.build builder))


(defn cfn-route-route-spec-property-builder
  ""
  [id config]
  (build-cfn-route-route-spec-property-builder (new CfnRoute$RouteSpecProperty$Builder) id config))


(defn build-cfn-route-tcp-route-action-property-builder
  "The build-cfn-route-tcp-route-action-property-builder function updates a CfnRoute$TcpRouteActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$TcpRouteActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |
"
  [^CfnRoute$TcpRouteActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :weighted-targets)]
    (. builder weightedTargets data))
  (.build builder))


(defn cfn-route-tcp-route-action-property-builder
  ""
  [id config]
  (build-cfn-route-tcp-route-action-property-builder (new CfnRoute$TcpRouteActionProperty$Builder) id config))


(defn build-cfn-route-tcp-route-match-property-builder
  "The build-cfn-route-tcp-route-match-property-builder function updates a CfnRoute$TcpRouteMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$TcpRouteMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnRoute$TcpRouteMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-route-tcp-route-match-property-builder
  ""
  [id config]
  (build-cfn-route-tcp-route-match-property-builder (new CfnRoute$TcpRouteMatchProperty$Builder) id config))


(defn build-cfn-route-tcp-route-property-builder
  "The build-cfn-route-tcp-route-property-builder function updates a CfnRoute$TcpRouteProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$TcpRouteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpRouteActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `timeout` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpTimeoutProperty | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnRoute$TcpRouteProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-route-tcp-route-property-builder
  ""
  [id config]
  (build-cfn-route-tcp-route-property-builder (new CfnRoute$TcpRouteProperty$Builder) id config))


(defn build-cfn-route-tcp-timeout-property-builder
  "The build-cfn-route-tcp-timeout-property-builder function updates a CfnRoute$TcpTimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$TcpTimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:idle` |
"
  [^CfnRoute$TcpTimeoutProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (.build builder))


(defn cfn-route-tcp-timeout-property-builder
  ""
  [id config]
  (build-cfn-route-tcp-timeout-property-builder (new CfnRoute$TcpTimeoutProperty$Builder) id config))


(defn build-cfn-route-weighted-target-property-builder
  "The build-cfn-route-weighted-target-property-builder function updates a CfnRoute$WeightedTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$WeightedTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `virtualNode` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnRoute$WeightedTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :virtual-node)]
    (. builder virtualNode data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-route-weighted-target-property-builder
  ""
  [id config]
  (build-cfn-route-weighted-target-property-builder (new CfnRoute$WeightedTargetProperty$Builder) id config))


(defn build-cfn-virtual-gateway-builder
  "The build-cfn-virtual-gateway-builder function updates a CfnVirtualGateway$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^CfnVirtualGateway$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn cfn-virtual-gateway-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-virtual-gateway-builder (CfnVirtualGateway$Builder/create scope (name id)) id config))


(defn build-cfn-virtual-gateway-json-format-ref-property-builder
  "The build-cfn-virtual-gateway-json-format-ref-property-builder function updates a CfnVirtualGateway$JsonFormatRefProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$JsonFormatRefProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnVirtualGateway$JsonFormatRefProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-virtual-gateway-json-format-ref-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-json-format-ref-property-builder (new CfnVirtualGateway$JsonFormatRefProperty$Builder) id config))


(defn build-cfn-virtual-gateway-logging-format-property-builder
  "The build-cfn-virtual-gateway-logging-format-property-builder function updates a CfnVirtualGateway$LoggingFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$LoggingFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `json` | java.util.List | [[cdk.support/lookup-entry]] | `:json` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
"
  [^CfnVirtualGateway$LoggingFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :text)]
    (. builder text data))
  (.build builder))


(defn cfn-virtual-gateway-logging-format-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-logging-format-property-builder (new CfnVirtualGateway$LoggingFormatProperty$Builder) id config))


(defn build-cfn-virtual-gateway-props-builder
  "The build-cfn-virtual-gateway-props-builder function updates a CfnVirtualGatewayProps$Builder instance using the provided configuration.
  The function takes the CfnVirtualGatewayProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewaySpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^CfnVirtualGatewayProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn cfn-virtual-gateway-props-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-props-builder (new CfnVirtualGatewayProps$Builder) id config))


(defn build-cfn-virtual-gateway-subject-alternative-name-matchers-property-builder
  "The build-cfn-virtual-gateway-subject-alternative-name-matchers-property-builder function updates a CfnVirtualGateway$SubjectAlternativeNameMatchersProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$SubjectAlternativeNameMatchersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.util.List | [[cdk.support/lookup-entry]] | `:exact` |
"
  [^CfnVirtualGateway$SubjectAlternativeNameMatchersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (.build builder))


(defn cfn-virtual-gateway-subject-alternative-name-matchers-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-subject-alternative-name-matchers-property-builder (new CfnVirtualGateway$SubjectAlternativeNameMatchersProperty$Builder) id config))


(defn build-cfn-virtual-gateway-subject-alternative-names-property-builder
  "The build-cfn-virtual-gateway-subject-alternative-names-property-builder function updates a CfnVirtualGateway$SubjectAlternativeNamesProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$SubjectAlternativeNamesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
"
  [^CfnVirtualGateway$SubjectAlternativeNamesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (.build builder))


(defn cfn-virtual-gateway-subject-alternative-names-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-subject-alternative-names-property-builder (new CfnVirtualGateway$SubjectAlternativeNamesProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-access-log-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-access-log-property-builder function updates a CfnVirtualGateway$VirtualGatewayAccessLogProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayAccessLogProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayFileAccessLogProperty | [[cdk.support/lookup-entry]] | `:file` |
"
  [^CfnVirtualGateway$VirtualGatewayAccessLogProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-access-log-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-access-log-property-builder (new CfnVirtualGateway$VirtualGatewayAccessLogProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-backend-defaults-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-backend-defaults-property-builder function updates a CfnVirtualGateway$VirtualGatewayBackendDefaultsProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayBackendDefaultsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-policy` |
"
  [^CfnVirtualGateway$VirtualGatewayBackendDefaultsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-policy)]
    (. builder clientPolicy data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-backend-defaults-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-backend-defaults-property-builder (new CfnVirtualGateway$VirtualGatewayBackendDefaultsProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-client-policy-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-client-policy-property-builder function updates a CfnVirtualGateway$VirtualGatewayClientPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayClientPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^CfnVirtualGateway$VirtualGatewayClientPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-client-policy-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-client-policy-property-builder (new CfnVirtualGateway$VirtualGatewayClientPolicyProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-client-policy-tls-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-client-policy-tls-property-builder function updates a CfnVirtualGateway$VirtualGatewayClientPolicyTlsProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayClientPolicyTlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty | [[cdk.support/lookup-entry]] | `:certificate` |
| `enforce` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce` |
| `ports` | java.util.List | [[cdk.support/lookup-entry]] | `:ports` |
| `validation` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^CfnVirtualGateway$VirtualGatewayClientPolicyTlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :enforce)]
    (. builder enforce data))
  (when-let [data (lookup-entry config id :ports)]
    (. builder ports data))
  (when-let [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-client-policy-tls-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-client-policy-tls-property-builder (new CfnVirtualGateway$VirtualGatewayClientPolicyTlsProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-client-tls-certificate-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-client-tls-certificate-property-builder function updates a CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-client-tls-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-client-tls-certificate-property-builder (new CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-connection-pool-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-connection-pool-property-builder function updates a CfnVirtualGateway$VirtualGatewayConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grpc` |
| `http` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http` |
| `http2` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty | [[cdk.support/lookup-entry]] | `:http2` |
"
  [^CfnVirtualGateway$VirtualGatewayConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc)]
    (. builder grpc data))
  (when-let [data (lookup-entry config id :http)]
    (. builder http data))
  (when-let [data (lookup-entry config id :http2)]
    (. builder http2 data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-connection-pool-property-builder (new CfnVirtualGateway$VirtualGatewayConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-file-access-log-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-file-access-log-property-builder function updates a CfnVirtualGateway$VirtualGatewayFileAccessLogProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayFileAccessLogProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$LoggingFormatProperty | [[cdk.support/lookup-entry]] | `:format` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnVirtualGateway$VirtualGatewayFileAccessLogProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-file-access-log-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-file-access-log-property-builder (new CfnVirtualGateway$VirtualGatewayFileAccessLogProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-grpc-connection-pool-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-grpc-connection-pool-property-builder function updates a CfnVirtualGateway$VirtualGatewayGrpcConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayGrpcConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |
"
  [^CfnVirtualGateway$VirtualGatewayGrpcConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-requests)]
    (. builder maxRequests data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-grpc-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-grpc-connection-pool-property-builder (new CfnVirtualGateway$VirtualGatewayGrpcConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-health-check-policy-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-health-check-policy-property-builder function updates a CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `intervalMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-millis` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `timeoutMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-millis` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |
"
  [^CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :healthy-threshold)]
    (. builder healthyThreshold data))
  (when-let [data (lookup-entry config id :interval-millis)]
    (. builder intervalMillis data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :timeout-millis)]
    (. builder timeoutMillis data))
  (when-let [data (lookup-entry config id :unhealthy-threshold)]
    (. builder unhealthyThreshold data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-health-check-policy-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-health-check-policy-property-builder (new CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-http-connection-pool-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-http-connection-pool-property-builder function updates a CfnVirtualGateway$VirtualGatewayHttpConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayHttpConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
| `maxPendingRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-pending-requests` |
"
  [^CfnVirtualGateway$VirtualGatewayHttpConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-connections)]
    (. builder maxConnections data))
  (when-let [data (lookup-entry config id :max-pending-requests)]
    (. builder maxPendingRequests data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-http-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-http-connection-pool-property-builder (new CfnVirtualGateway$VirtualGatewayHttpConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-http2-connection-pool-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-http2-connection-pool-property-builder function updates a CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |
"
  [^CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-requests)]
    (. builder maxRequests data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-http2-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-http2-connection-pool-property-builder (new CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty | [[cdk.support/lookup-entry]] | `:health-check` |
| `portMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-mapping` |
| `tls` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsProperty | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :port-mapping)]
    (. builder portMapping data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-property-builder (new CfnVirtualGateway$VirtualGatewayListenerProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-tls-acm-certificate-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-tls-acm-certificate-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-acm-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-tls-acm-certificate-property-builder (new CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-tls-certificate-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-tls-certificate-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerTlsCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerTlsCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerTlsCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acm)]
    (. builder acm data))
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-tls-certificate-property-builder (new CfnVirtualGateway$VirtualGatewayListenerTlsCertificateProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-tls-file-certificate-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-tls-file-certificate-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerTlsFileCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerTlsFileCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerTlsFileCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-let [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-file-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-tls-file-certificate-property-builder (new CfnVirtualGateway$VirtualGatewayListenerTlsFileCertificateProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-tls-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-tls-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerTlsProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerTlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `validation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerTlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-tls-property-builder (new CfnVirtualGateway$VirtualGatewayListenerTlsProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-tls-sds-certificate-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-tls-sds-certificate-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-sds-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-tls-sds-certificate-property-builder (new CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:trust` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-let [data (lookup-entry config id :trust)]
    (. builder trust data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-property-builder (new CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-trust-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-trust-property-builder function updates a CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-trust-property-builder (new CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-logging-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-logging-property-builder function updates a CfnVirtualGateway$VirtualGatewayLoggingProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayLoggingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-log` |
"
  [^CfnVirtualGateway$VirtualGatewayLoggingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-logging-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-logging-property-builder (new CfnVirtualGateway$VirtualGatewayLoggingProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-port-mapping-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-port-mapping-property-builder function updates a CfnVirtualGateway$VirtualGatewayPortMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayPortMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnVirtualGateway$VirtualGatewayPortMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-port-mapping-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-port-mapping-property-builder (new CfnVirtualGateway$VirtualGatewayPortMappingProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-spec-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-spec-property-builder function updates a CfnVirtualGateway$VirtualGatewaySpecProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewaySpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backendDefaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
"
  [^CfnVirtualGateway$VirtualGatewaySpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-spec-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-spec-property-builder (new CfnVirtualGateway$VirtualGatewaySpecProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-acm-trust-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-acm-trust-property-builder function updates a CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArns` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-authority-arns` |
"
  [^CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-authority-arns)]
    (. builder certificateAuthorityArns data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-acm-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-acm-trust-property-builder (new CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-file-trust-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-file-trust-property-builder function updates a CfnVirtualGateway$VirtualGatewayTlsValidationContextFileTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayTlsValidationContextFileTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
"
  [^CfnVirtualGateway$VirtualGatewayTlsValidationContextFileTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-file-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-file-trust-property-builder (new CfnVirtualGateway$VirtualGatewayTlsValidationContextFileTrustProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-property-builder function updates a CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:trust` |
"
  [^CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-let [data (lookup-entry config id :trust)]
    (. builder trust data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-property-builder (new CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-sds-trust-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-sds-trust-property-builder function updates a CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-sds-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-sds-trust-property-builder (new CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty$Builder) id config))


(defn build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-trust-property-builder
  "The build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-trust-property-builder function updates a CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acm)]
    (. builder acm data))
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-gateway-virtual-gateway-tls-validation-context-trust-property-builder (new CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty$Builder) id config))


(defn build-cfn-virtual-node-access-log-property-builder
  "The build-cfn-virtual-node-access-log-property-builder function updates a CfnVirtualNode$AccessLogProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$AccessLogProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$FileAccessLogProperty | [[cdk.support/lookup-entry]] | `:file` |
"
  [^CfnVirtualNode$AccessLogProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (.build builder))


(defn cfn-virtual-node-access-log-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-access-log-property-builder (new CfnVirtualNode$AccessLogProperty$Builder) id config))


(defn build-cfn-virtual-node-aws-cloud-map-instance-attribute-property-builder
  "The build-cfn-virtual-node-aws-cloud-map-instance-attribute-property-builder function updates a CfnVirtualNode$AwsCloudMapInstanceAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$AwsCloudMapInstanceAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnVirtualNode$AwsCloudMapInstanceAttributeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-virtual-node-aws-cloud-map-instance-attribute-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-aws-cloud-map-instance-attribute-property-builder (new CfnVirtualNode$AwsCloudMapInstanceAttributeProperty$Builder) id config))


(defn build-cfn-virtual-node-aws-cloud-map-service-discovery-property-builder
  "The build-cfn-virtual-node-aws-cloud-map-service-discovery-property-builder function updates a CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `ipPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-preference` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :ip-preference)]
    (. builder ipPreference data))
  (when-let [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn cfn-virtual-node-aws-cloud-map-service-discovery-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-aws-cloud-map-service-discovery-property-builder (new CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty$Builder) id config))


(defn build-cfn-virtual-node-backend-defaults-property-builder
  "The build-cfn-virtual-node-backend-defaults-property-builder function updates a CfnVirtualNode$BackendDefaultsProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$BackendDefaultsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-policy` |
"
  [^CfnVirtualNode$BackendDefaultsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-policy)]
    (. builder clientPolicy data))
  (.build builder))


(defn cfn-virtual-node-backend-defaults-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-backend-defaults-property-builder (new CfnVirtualNode$BackendDefaultsProperty$Builder) id config))


(defn build-cfn-virtual-node-backend-property-builder
  "The build-cfn-virtual-node-backend-property-builder function updates a CfnVirtualNode$BackendProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$BackendProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualService` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:virtual-service` |
"
  [^CfnVirtualNode$BackendProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-service)]
    (. builder virtualService data))
  (.build builder))


(defn cfn-virtual-node-backend-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-backend-property-builder (new CfnVirtualNode$BackendProperty$Builder) id config))


(defn build-cfn-virtual-node-builder
  "The build-cfn-virtual-node-builder function updates a CfnVirtualNode$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |
"
  [^CfnVirtualNode$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-node-name)]
    (. builder virtualNodeName data))
  (.build builder))


(defn cfn-virtual-node-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-virtual-node-builder (CfnVirtualNode$Builder/create scope (name id)) id config))


(defn build-cfn-virtual-node-client-policy-property-builder
  "The build-cfn-virtual-node-client-policy-property-builder function updates a CfnVirtualNode$ClientPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ClientPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^CfnVirtualNode$ClientPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn cfn-virtual-node-client-policy-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-client-policy-property-builder (new CfnVirtualNode$ClientPolicyProperty$Builder) id config))


(defn build-cfn-virtual-node-client-policy-tls-property-builder
  "The build-cfn-virtual-node-client-policy-tls-property-builder function updates a CfnVirtualNode$ClientPolicyTlsProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ClientPolicyTlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate` |
| `enforce` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enforce` |
| `ports` | java.util.List | [[cdk.support/lookup-entry]] | `:ports` |
| `validation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^CfnVirtualNode$ClientPolicyTlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :enforce)]
    (. builder enforce data))
  (when-let [data (lookup-entry config id :ports)]
    (. builder ports data))
  (when-let [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn cfn-virtual-node-client-policy-tls-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-client-policy-tls-property-builder (new CfnVirtualNode$ClientPolicyTlsProperty$Builder) id config))


(defn build-cfn-virtual-node-client-tls-certificate-property-builder
  "The build-cfn-virtual-node-client-tls-certificate-property-builder function updates a CfnVirtualNode$ClientTlsCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ClientTlsCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualNode$ClientTlsCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-node-client-tls-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-client-tls-certificate-property-builder (new CfnVirtualNode$ClientTlsCertificateProperty$Builder) id config))


(defn build-cfn-virtual-node-dns-service-discovery-property-builder
  "The build-cfn-virtual-node-dns-service-discovery-property-builder function updates a CfnVirtualNode$DnsServiceDiscoveryProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$DnsServiceDiscoveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `ipPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-preference` |
| `responseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-type` |
"
  [^CfnVirtualNode$DnsServiceDiscoveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-let [data (lookup-entry config id :ip-preference)]
    (. builder ipPreference data))
  (when-let [data (lookup-entry config id :response-type)]
    (. builder responseType data))
  (.build builder))


(defn cfn-virtual-node-dns-service-discovery-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-dns-service-discovery-property-builder (new CfnVirtualNode$DnsServiceDiscoveryProperty$Builder) id config))


(defn build-cfn-virtual-node-duration-property-builder
  "The build-cfn-virtual-node-duration-property-builder function updates a CfnVirtualNode$DurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$DurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnVirtualNode$DurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-virtual-node-duration-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-duration-property-builder (new CfnVirtualNode$DurationProperty$Builder) id config))


(defn build-cfn-virtual-node-file-access-log-property-builder
  "The build-cfn-virtual-node-file-access-log-property-builder function updates a CfnVirtualNode$FileAccessLogProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$FileAccessLogProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$LoggingFormatProperty | [[cdk.support/lookup-entry]] | `:format` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnVirtualNode$FileAccessLogProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-virtual-node-file-access-log-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-file-access-log-property-builder (new CfnVirtualNode$FileAccessLogProperty$Builder) id config))


(defn build-cfn-virtual-node-grpc-timeout-property-builder
  "The build-cfn-virtual-node-grpc-timeout-property-builder function updates a CfnVirtualNode$GrpcTimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$GrpcTimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:per-request` |
"
  [^CfnVirtualNode$GrpcTimeoutProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (when-let [data (lookup-entry config id :per-request)]
    (. builder perRequest data))
  (.build builder))


(defn cfn-virtual-node-grpc-timeout-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-grpc-timeout-property-builder (new CfnVirtualNode$GrpcTimeoutProperty$Builder) id config))


(defn build-cfn-virtual-node-health-check-property-builder
  "The build-cfn-virtual-node-health-check-property-builder function updates a CfnVirtualNode$HealthCheckProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$HealthCheckProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `intervalMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-millis` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `timeoutMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-millis` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |
"
  [^CfnVirtualNode$HealthCheckProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :healthy-threshold)]
    (. builder healthyThreshold data))
  (when-let [data (lookup-entry config id :interval-millis)]
    (. builder intervalMillis data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :timeout-millis)]
    (. builder timeoutMillis data))
  (when-let [data (lookup-entry config id :unhealthy-threshold)]
    (. builder unhealthyThreshold data))
  (.build builder))


(defn cfn-virtual-node-health-check-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-health-check-property-builder (new CfnVirtualNode$HealthCheckProperty$Builder) id config))


(defn build-cfn-virtual-node-http-timeout-property-builder
  "The build-cfn-virtual-node-http-timeout-property-builder function updates a CfnVirtualNode$HttpTimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$HttpTimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:per-request` |
"
  [^CfnVirtualNode$HttpTimeoutProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (when-let [data (lookup-entry config id :per-request)]
    (. builder perRequest data))
  (.build builder))


(defn cfn-virtual-node-http-timeout-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-http-timeout-property-builder (new CfnVirtualNode$HttpTimeoutProperty$Builder) id config))


(defn build-cfn-virtual-node-json-format-ref-property-builder
  "The build-cfn-virtual-node-json-format-ref-property-builder function updates a CfnVirtualNode$JsonFormatRefProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$JsonFormatRefProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnVirtualNode$JsonFormatRefProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-virtual-node-json-format-ref-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-json-format-ref-property-builder (new CfnVirtualNode$JsonFormatRefProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-property-builder
  "The build-cfn-virtual-node-listener-property-builder function updates a CfnVirtualNode$ListenerProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$HealthCheckProperty | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$OutlierDetectionProperty | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `portMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-mapping` |
| `timeout` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsProperty | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^CfnVirtualNode$ListenerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :outlier-detection)]
    (. builder outlierDetection data))
  (when-let [data (lookup-entry config id :port-mapping)]
    (. builder portMapping data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn cfn-virtual-node-listener-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-property-builder (new CfnVirtualNode$ListenerProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-timeout-property-builder
  "The build-cfn-virtual-node-listener-timeout-property-builder function updates a CfnVirtualNode$ListenerTimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grpc` |
| `http` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http` |
| `http2` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$HttpTimeoutProperty | [[cdk.support/lookup-entry]] | `:http2` |
| `tcp` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TcpTimeoutProperty | [[cdk.support/lookup-entry]] | `:tcp` |
"
  [^CfnVirtualNode$ListenerTimeoutProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc)]
    (. builder grpc data))
  (when-let [data (lookup-entry config id :http)]
    (. builder http data))
  (when-let [data (lookup-entry config id :http2)]
    (. builder http2 data))
  (when-let [data (lookup-entry config id :tcp)]
    (. builder tcp data))
  (.build builder))


(defn cfn-virtual-node-listener-timeout-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-timeout-property-builder (new CfnVirtualNode$ListenerTimeoutProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-tls-acm-certificate-property-builder
  "The build-cfn-virtual-node-listener-tls-acm-certificate-property-builder function updates a CfnVirtualNode$ListenerTlsAcmCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTlsAcmCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
"
  [^CfnVirtualNode$ListenerTlsAcmCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (.build builder))


(defn cfn-virtual-node-listener-tls-acm-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-tls-acm-certificate-property-builder (new CfnVirtualNode$ListenerTlsAcmCertificateProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-tls-certificate-property-builder
  "The build-cfn-virtual-node-listener-tls-certificate-property-builder function updates a CfnVirtualNode$ListenerTlsCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTlsCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsAcmCertificateProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualNode$ListenerTlsCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acm)]
    (. builder acm data))
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-node-listener-tls-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-tls-certificate-property-builder (new CfnVirtualNode$ListenerTlsCertificateProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-tls-file-certificate-property-builder
  "The build-cfn-virtual-node-listener-tls-file-certificate-property-builder function updates a CfnVirtualNode$ListenerTlsFileCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTlsFileCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
"
  [^CfnVirtualNode$ListenerTlsFileCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-let [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (.build builder))


(defn cfn-virtual-node-listener-tls-file-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-tls-file-certificate-property-builder (new CfnVirtualNode$ListenerTlsFileCertificateProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-tls-property-builder
  "The build-cfn-virtual-node-listener-tls-property-builder function updates a CfnVirtualNode$ListenerTlsProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsCertificateProperty | [[cdk.support/lookup-entry]] | `:certificate` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `validation` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsValidationContextProperty | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^CfnVirtualNode$ListenerTlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn cfn-virtual-node-listener-tls-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-tls-property-builder (new CfnVirtualNode$ListenerTlsProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-tls-sds-certificate-property-builder
  "The build-cfn-virtual-node-listener-tls-sds-certificate-property-builder function updates a CfnVirtualNode$ListenerTlsSdsCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTlsSdsCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^CfnVirtualNode$ListenerTlsSdsCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn cfn-virtual-node-listener-tls-sds-certificate-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-tls-sds-certificate-property-builder (new CfnVirtualNode$ListenerTlsSdsCertificateProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-tls-validation-context-property-builder
  "The build-cfn-virtual-node-listener-tls-validation-context-property-builder function updates a CfnVirtualNode$ListenerTlsValidationContextProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTlsValidationContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$SubjectAlternativeNamesProperty | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trust` |
"
  [^CfnVirtualNode$ListenerTlsValidationContextProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-let [data (lookup-entry config id :trust)]
    (. builder trust data))
  (.build builder))


(defn cfn-virtual-node-listener-tls-validation-context-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-tls-validation-context-property-builder (new CfnVirtualNode$ListenerTlsValidationContextProperty$Builder) id config))


(defn build-cfn-virtual-node-listener-tls-validation-context-trust-property-builder
  "The build-cfn-virtual-node-listener-tls-validation-context-trust-property-builder function updates a CfnVirtualNode$ListenerTlsValidationContextTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ListenerTlsValidationContextTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextFileTrustProperty | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextSdsTrustProperty | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualNode$ListenerTlsValidationContextTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-node-listener-tls-validation-context-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-listener-tls-validation-context-trust-property-builder (new CfnVirtualNode$ListenerTlsValidationContextTrustProperty$Builder) id config))


(defn build-cfn-virtual-node-logging-format-property-builder
  "The build-cfn-virtual-node-logging-format-property-builder function updates a CfnVirtualNode$LoggingFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$LoggingFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `json` | java.util.List | [[cdk.support/lookup-entry]] | `:json` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
"
  [^CfnVirtualNode$LoggingFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :text)]
    (. builder text data))
  (.build builder))


(defn cfn-virtual-node-logging-format-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-logging-format-property-builder (new CfnVirtualNode$LoggingFormatProperty$Builder) id config))


(defn build-cfn-virtual-node-logging-property-builder
  "The build-cfn-virtual-node-logging-property-builder function updates a CfnVirtualNode$LoggingProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$LoggingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AccessLogProperty | [[cdk.support/lookup-entry]] | `:access-log` |
"
  [^CfnVirtualNode$LoggingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (.build builder))


(defn cfn-virtual-node-logging-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-logging-property-builder (new CfnVirtualNode$LoggingProperty$Builder) id config))


(defn build-cfn-virtual-node-outlier-detection-property-builder
  "The build-cfn-virtual-node-outlier-detection-property-builder function updates a CfnVirtualNode$OutlierDetectionProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$OutlierDetectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseEjectionDuration` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:base-ejection-duration` |
| `interval` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:interval` |
| `maxEjectionPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ejection-percent` |
| `maxServerErrors` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-server-errors` |
"
  [^CfnVirtualNode$OutlierDetectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base-ejection-duration)]
    (. builder baseEjectionDuration data))
  (when-let [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-let [data (lookup-entry config id :max-ejection-percent)]
    (. builder maxEjectionPercent data))
  (when-let [data (lookup-entry config id :max-server-errors)]
    (. builder maxServerErrors data))
  (.build builder))


(defn cfn-virtual-node-outlier-detection-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-outlier-detection-property-builder (new CfnVirtualNode$OutlierDetectionProperty$Builder) id config))


(defn build-cfn-virtual-node-port-mapping-property-builder
  "The build-cfn-virtual-node-port-mapping-property-builder function updates a CfnVirtualNode$PortMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$PortMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnVirtualNode$PortMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-virtual-node-port-mapping-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-port-mapping-property-builder (new CfnVirtualNode$PortMappingProperty$Builder) id config))


(defn build-cfn-virtual-node-props-builder
  "The build-cfn-virtual-node-props-builder function updates a CfnVirtualNodeProps$Builder instance using the provided configuration.
  The function takes the CfnVirtualNodeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |
"
  [^CfnVirtualNodeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-node-name)]
    (. builder virtualNodeName data))
  (.build builder))


(defn cfn-virtual-node-props-builder
  ""
  [id config]
  (build-cfn-virtual-node-props-builder (new CfnVirtualNodeProps$Builder) id config))


(defn build-cfn-virtual-node-service-discovery-property-builder
  "The build-cfn-virtual-node-service-discovery-property-builder function updates a CfnVirtualNode$ServiceDiscoveryProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$ServiceDiscoveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsCloudMap` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty | [[cdk.support/lookup-entry]] | `:aws-cloud-map` |
| `dns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns` |
"
  [^CfnVirtualNode$ServiceDiscoveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-cloud-map)]
    (. builder awsCloudMap data))
  (when-let [data (lookup-entry config id :dns)]
    (. builder dns data))
  (.build builder))


(defn cfn-virtual-node-service-discovery-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-service-discovery-property-builder (new CfnVirtualNode$ServiceDiscoveryProperty$Builder) id config))


(defn build-cfn-virtual-node-subject-alternative-name-matchers-property-builder
  "The build-cfn-virtual-node-subject-alternative-name-matchers-property-builder function updates a CfnVirtualNode$SubjectAlternativeNameMatchersProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$SubjectAlternativeNameMatchersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.util.List | [[cdk.support/lookup-entry]] | `:exact` |
"
  [^CfnVirtualNode$SubjectAlternativeNameMatchersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exact)]
    (. builder exact data))
  (.build builder))


(defn cfn-virtual-node-subject-alternative-name-matchers-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-subject-alternative-name-matchers-property-builder (new CfnVirtualNode$SubjectAlternativeNameMatchersProperty$Builder) id config))


(defn build-cfn-virtual-node-subject-alternative-names-property-builder
  "The build-cfn-virtual-node-subject-alternative-names-property-builder function updates a CfnVirtualNode$SubjectAlternativeNamesProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$SubjectAlternativeNamesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
"
  [^CfnVirtualNode$SubjectAlternativeNamesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (.build builder))


(defn cfn-virtual-node-subject-alternative-names-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-subject-alternative-names-property-builder (new CfnVirtualNode$SubjectAlternativeNamesProperty$Builder) id config))


(defn build-cfn-virtual-node-tcp-timeout-property-builder
  "The build-cfn-virtual-node-tcp-timeout-property-builder function updates a CfnVirtualNode$TcpTimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$TcpTimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |
"
  [^CfnVirtualNode$TcpTimeoutProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (.build builder))


(defn cfn-virtual-node-tcp-timeout-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-tcp-timeout-property-builder (new CfnVirtualNode$TcpTimeoutProperty$Builder) id config))


(defn build-cfn-virtual-node-tls-validation-context-acm-trust-property-builder
  "The build-cfn-virtual-node-tls-validation-context-acm-trust-property-builder function updates a CfnVirtualNode$TlsValidationContextAcmTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$TlsValidationContextAcmTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArns` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-authority-arns` |
"
  [^CfnVirtualNode$TlsValidationContextAcmTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-authority-arns)]
    (. builder certificateAuthorityArns data))
  (.build builder))


(defn cfn-virtual-node-tls-validation-context-acm-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-tls-validation-context-acm-trust-property-builder (new CfnVirtualNode$TlsValidationContextAcmTrustProperty$Builder) id config))


(defn build-cfn-virtual-node-tls-validation-context-file-trust-property-builder
  "The build-cfn-virtual-node-tls-validation-context-file-trust-property-builder function updates a CfnVirtualNode$TlsValidationContextFileTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$TlsValidationContextFileTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
"
  [^CfnVirtualNode$TlsValidationContextFileTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (.build builder))


(defn cfn-virtual-node-tls-validation-context-file-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-tls-validation-context-file-trust-property-builder (new CfnVirtualNode$TlsValidationContextFileTrustProperty$Builder) id config))


(defn build-cfn-virtual-node-tls-validation-context-property-builder
  "The build-cfn-virtual-node-tls-validation-context-property-builder function updates a CfnVirtualNode$TlsValidationContextProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$TlsValidationContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$SubjectAlternativeNamesProperty | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:trust` |
"
  [^CfnVirtualNode$TlsValidationContextProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-let [data (lookup-entry config id :trust)]
    (. builder trust data))
  (.build builder))


(defn cfn-virtual-node-tls-validation-context-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-tls-validation-context-property-builder (new CfnVirtualNode$TlsValidationContextProperty$Builder) id config))


(defn build-cfn-virtual-node-tls-validation-context-sds-trust-property-builder
  "The build-cfn-virtual-node-tls-validation-context-sds-trust-property-builder function updates a CfnVirtualNode$TlsValidationContextSdsTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$TlsValidationContextSdsTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^CfnVirtualNode$TlsValidationContextSdsTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn cfn-virtual-node-tls-validation-context-sds-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-tls-validation-context-sds-trust-property-builder (new CfnVirtualNode$TlsValidationContextSdsTrustProperty$Builder) id config))


(defn build-cfn-virtual-node-tls-validation-context-trust-property-builder
  "The build-cfn-virtual-node-tls-validation-context-trust-property-builder function updates a CfnVirtualNode$TlsValidationContextTrustProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$TlsValidationContextTrustProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextAcmTrustProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextFileTrustProperty | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |
"
  [^CfnVirtualNode$TlsValidationContextTrustProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acm)]
    (. builder acm data))
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :sds)]
    (. builder sds data))
  (.build builder))


(defn cfn-virtual-node-tls-validation-context-trust-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-tls-validation-context-trust-property-builder (new CfnVirtualNode$TlsValidationContextTrustProperty$Builder) id config))


(defn build-cfn-virtual-node-virtual-node-connection-pool-property-builder
  "The build-cfn-virtual-node-virtual-node-connection-pool-property-builder function updates a CfnVirtualNode$VirtualNodeConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$VirtualNodeConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grpc` |
| `http` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty | [[cdk.support/lookup-entry]] | `:http` |
| `http2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http2` |
| `tcp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tcp` |
"
  [^CfnVirtualNode$VirtualNodeConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc)]
    (. builder grpc data))
  (when-let [data (lookup-entry config id :http)]
    (. builder http data))
  (when-let [data (lookup-entry config id :http2)]
    (. builder http2 data))
  (when-let [data (lookup-entry config id :tcp)]
    (. builder tcp data))
  (.build builder))


(defn cfn-virtual-node-virtual-node-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-virtual-node-connection-pool-property-builder (new CfnVirtualNode$VirtualNodeConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-node-virtual-node-grpc-connection-pool-property-builder
  "The build-cfn-virtual-node-virtual-node-grpc-connection-pool-property-builder function updates a CfnVirtualNode$VirtualNodeGrpcConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$VirtualNodeGrpcConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |
"
  [^CfnVirtualNode$VirtualNodeGrpcConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-requests)]
    (. builder maxRequests data))
  (.build builder))


(defn cfn-virtual-node-virtual-node-grpc-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-virtual-node-grpc-connection-pool-property-builder (new CfnVirtualNode$VirtualNodeGrpcConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-node-virtual-node-http-connection-pool-property-builder
  "The build-cfn-virtual-node-virtual-node-http-connection-pool-property-builder function updates a CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
| `maxPendingRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-pending-requests` |
"
  [^CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-connections)]
    (. builder maxConnections data))
  (when-let [data (lookup-entry config id :max-pending-requests)]
    (. builder maxPendingRequests data))
  (.build builder))


(defn cfn-virtual-node-virtual-node-http-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-virtual-node-http-connection-pool-property-builder (new CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-node-virtual-node-http2-connection-pool-property-builder
  "The build-cfn-virtual-node-virtual-node-http2-connection-pool-property-builder function updates a CfnVirtualNode$VirtualNodeHttp2ConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$VirtualNodeHttp2ConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |
"
  [^CfnVirtualNode$VirtualNodeHttp2ConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-requests)]
    (. builder maxRequests data))
  (.build builder))


(defn cfn-virtual-node-virtual-node-http2-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-virtual-node-http2-connection-pool-property-builder (new CfnVirtualNode$VirtualNodeHttp2ConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-node-virtual-node-spec-property-builder
  "The build-cfn-virtual-node-virtual-node-spec-property-builder function updates a CfnVirtualNode$VirtualNodeSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$VirtualNodeSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backendDefaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
| `serviceDiscovery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-discovery` |
"
  [^CfnVirtualNode$VirtualNodeSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :backends)]
    (. builder backends data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-let [data (lookup-entry config id :service-discovery)]
    (. builder serviceDiscovery data))
  (.build builder))


(defn cfn-virtual-node-virtual-node-spec-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-virtual-node-spec-property-builder (new CfnVirtualNode$VirtualNodeSpecProperty$Builder) id config))


(defn build-cfn-virtual-node-virtual-node-tcp-connection-pool-property-builder
  "The build-cfn-virtual-node-virtual-node-tcp-connection-pool-property-builder function updates a CfnVirtualNode$VirtualNodeTcpConnectionPoolProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$VirtualNodeTcpConnectionPoolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
"
  [^CfnVirtualNode$VirtualNodeTcpConnectionPoolProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-connections)]
    (. builder maxConnections data))
  (.build builder))


(defn cfn-virtual-node-virtual-node-tcp-connection-pool-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-virtual-node-tcp-connection-pool-property-builder (new CfnVirtualNode$VirtualNodeTcpConnectionPoolProperty$Builder) id config))


(defn build-cfn-virtual-node-virtual-service-backend-property-builder
  "The build-cfn-virtual-node-virtual-service-backend-property-builder function updates a CfnVirtualNode$VirtualServiceBackendProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualNode$VirtualServiceBackendProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-policy` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
"
  [^CfnVirtualNode$VirtualServiceBackendProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-policy)]
    (. builder clientPolicy data))
  (when-let [data (lookup-entry config id :virtual-service-name)]
    (. builder virtualServiceName data))
  (.build builder))


(defn cfn-virtual-node-virtual-service-backend-property-builder
  ""
  [id config]
  (build-cfn-virtual-node-virtual-service-backend-property-builder (new CfnVirtualNode$VirtualServiceBackendProperty$Builder) id config))


(defn build-cfn-virtual-router-builder
  "The build-cfn-virtual-router-builder function updates a CfnVirtualRouter$Builder instance using the provided configuration.
  The function takes the CfnVirtualRouter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^CfnVirtualRouter$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn cfn-virtual-router-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-virtual-router-builder (CfnVirtualRouter$Builder/create scope (name id)) id config))


(defn build-cfn-virtual-router-port-mapping-property-builder
  "The build-cfn-virtual-router-port-mapping-property-builder function updates a CfnVirtualRouter$PortMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualRouter$PortMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnVirtualRouter$PortMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-virtual-router-port-mapping-property-builder
  ""
  [id config]
  (build-cfn-virtual-router-port-mapping-property-builder (new CfnVirtualRouter$PortMappingProperty$Builder) id config))


(defn build-cfn-virtual-router-props-builder
  "The build-cfn-virtual-router-props-builder function updates a CfnVirtualRouterProps$Builder instance using the provided configuration.
  The function takes the CfnVirtualRouterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualRouter$VirtualRouterSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^CfnVirtualRouterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn cfn-virtual-router-props-builder
  ""
  [id config]
  (build-cfn-virtual-router-props-builder (new CfnVirtualRouterProps$Builder) id config))


(defn build-cfn-virtual-router-virtual-router-listener-property-builder
  "The build-cfn-virtual-router-virtual-router-listener-property-builder function updates a CfnVirtualRouter$VirtualRouterListenerProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualRouter$VirtualRouterListenerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `portMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-mapping` |
"
  [^CfnVirtualRouter$VirtualRouterListenerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :port-mapping)]
    (. builder portMapping data))
  (.build builder))


(defn cfn-virtual-router-virtual-router-listener-property-builder
  ""
  [id config]
  (build-cfn-virtual-router-virtual-router-listener-property-builder (new CfnVirtualRouter$VirtualRouterListenerProperty$Builder) id config))


(defn build-cfn-virtual-router-virtual-router-spec-property-builder
  "The build-cfn-virtual-router-virtual-router-spec-property-builder function updates a CfnVirtualRouter$VirtualRouterSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualRouter$VirtualRouterSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:listeners` |
"
  [^CfnVirtualRouter$VirtualRouterSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (.build builder))


(defn cfn-virtual-router-virtual-router-spec-property-builder
  ""
  [id config]
  (build-cfn-virtual-router-virtual-router-spec-property-builder (new CfnVirtualRouter$VirtualRouterSpecProperty$Builder) id config))


(defn build-cfn-virtual-service-builder
  "The build-cfn-virtual-service-builder function updates a CfnVirtualService$Builder instance using the provided configuration.
  The function takes the CfnVirtualService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualServiceSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
"
  [^CfnVirtualService$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-service-name)]
    (. builder virtualServiceName data))
  (.build builder))


(defn cfn-virtual-service-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-virtual-service-builder (CfnVirtualService$Builder/create scope (name id)) id config))


(defn build-cfn-virtual-service-props-builder
  "The build-cfn-virtual-service-props-builder function updates a CfnVirtualServiceProps$Builder instance using the provided configuration.
  The function takes the CfnVirtualServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualServiceSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
"
  [^CfnVirtualServiceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :mesh-owner)]
    (. builder meshOwner data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :virtual-service-name)]
    (. builder virtualServiceName data))
  (.build builder))


(defn cfn-virtual-service-props-builder
  ""
  [id config]
  (build-cfn-virtual-service-props-builder (new CfnVirtualServiceProps$Builder) id config))


(defn build-cfn-virtual-service-virtual-node-service-provider-property-builder
  "The build-cfn-virtual-service-virtual-node-service-provider-property-builder function updates a CfnVirtualService$VirtualNodeServiceProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualService$VirtualNodeServiceProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |
"
  [^CfnVirtualService$VirtualNodeServiceProviderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-node-name)]
    (. builder virtualNodeName data))
  (.build builder))


(defn cfn-virtual-service-virtual-node-service-provider-property-builder
  ""
  [id config]
  (build-cfn-virtual-service-virtual-node-service-provider-property-builder (new CfnVirtualService$VirtualNodeServiceProviderProperty$Builder) id config))


(defn build-cfn-virtual-service-virtual-router-service-provider-property-builder
  "The build-cfn-virtual-service-virtual-router-service-provider-property-builder function updates a CfnVirtualService$VirtualRouterServiceProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualService$VirtualRouterServiceProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^CfnVirtualService$VirtualRouterServiceProviderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn cfn-virtual-service-virtual-router-service-provider-property-builder
  ""
  [id config]
  (build-cfn-virtual-service-virtual-router-service-provider-property-builder (new CfnVirtualService$VirtualRouterServiceProviderProperty$Builder) id config))


(defn build-cfn-virtual-service-virtual-service-provider-property-builder
  "The build-cfn-virtual-service-virtual-service-provider-property-builder function updates a CfnVirtualService$VirtualServiceProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualService$VirtualServiceProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualNode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:virtual-node` |
| `virtualRouter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:virtual-router` |
"
  [^CfnVirtualService$VirtualServiceProviderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-node)]
    (. builder virtualNode data))
  (when-let [data (lookup-entry config id :virtual-router)]
    (. builder virtualRouter data))
  (.build builder))


(defn cfn-virtual-service-virtual-service-provider-property-builder
  ""
  [id config]
  (build-cfn-virtual-service-virtual-service-provider-property-builder (new CfnVirtualService$VirtualServiceProviderProperty$Builder) id config))


(defn build-cfn-virtual-service-virtual-service-spec-property-builder
  "The build-cfn-virtual-service-virtual-service-spec-property-builder function updates a CfnVirtualService$VirtualServiceSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualService$VirtualServiceSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider` |
"
  [^CfnVirtualService$VirtualServiceSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :provider)]
    (. builder provider data))
  (.build builder))


(defn cfn-virtual-service-virtual-service-spec-property-builder
  ""
  [id config]
  (build-cfn-virtual-service-virtual-service-spec-property-builder (new CfnVirtualService$VirtualServiceSpecProperty$Builder) id config))


(defn build-common-gateway-route-spec-options-builder
  "The build-common-gateway-route-spec-options-builder function updates a CommonGatewayRouteSpecOptions$Builder instance using the provided configuration.
  The function takes the CommonGatewayRouteSpecOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^CommonGatewayRouteSpecOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn common-gateway-route-spec-options-builder
  ""
  [id config]
  (build-common-gateway-route-spec-options-builder (new CommonGatewayRouteSpecOptions$Builder) id config))


(defn build-gateway-route-attributes-builder
  "The build-gateway-route-attributes-builder function updates a GatewayRouteAttributes$Builder instance using the provided configuration.
  The function takes the GatewayRouteAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `virtualGateway` | software.amazon.awscdk.services.appmesh.IVirtualGateway | [[cdk.support/lookup-entry]] | `:virtual-gateway` |
"
  [^GatewayRouteAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :gateway-route-name)]
    (. builder gatewayRouteName data))
  (when-let [data (lookup-entry config id :virtual-gateway)]
    (. builder virtualGateway data))
  (.build builder))


(defn gateway-route-attributes-builder
  ""
  [id config]
  (build-gateway-route-attributes-builder (new GatewayRouteAttributes$Builder) id config))


(defn build-gateway-route-base-props-builder
  "The build-gateway-route-base-props-builder function updates a GatewayRouteBaseProps$Builder instance using the provided configuration.
  The function takes the GatewayRouteBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.GatewayRouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
"
  [^GatewayRouteBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :gateway-route-name)]
    (. builder gatewayRouteName data))
  (when-let [data (lookup-entry config id :route-spec)]
    (. builder routeSpec data))
  (.build builder))


(defn gateway-route-base-props-builder
  ""
  [id config]
  (build-gateway-route-base-props-builder (new GatewayRouteBaseProps$Builder) id config))


(defn build-gateway-route-builder
  "The build-gateway-route-builder function updates a GatewayRoute$Builder instance using the provided configuration.
  The function takes the GatewayRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.GatewayRouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualGateway` | software.amazon.awscdk.services.appmesh.IVirtualGateway | [[cdk.support/lookup-entry]] | `:virtual-gateway` |
"
  [^GatewayRoute$Builder builder id config]
  (when-let [data (lookup-entry config id :gateway-route-name)]
    (. builder gatewayRouteName data))
  (when-let [data (lookup-entry config id :route-spec)]
    (. builder routeSpec data))
  (when-let [data (lookup-entry config id :virtual-gateway)]
    (. builder virtualGateway data))
  (.build builder))


(defn gateway-route-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-gateway-route-builder (GatewayRoute$Builder/create scope (name id)) id config))


(defn build-gateway-route-hostname-match-config-builder
  "The build-gateway-route-hostname-match-config-builder function updates a GatewayRouteHostnameMatchConfig$Builder instance using the provided configuration.
  The function takes the GatewayRouteHostnameMatchConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostnameMatch` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteHostnameMatchProperty | [[cdk.support/lookup-entry]] | `:hostname-match` |
"
  [^GatewayRouteHostnameMatchConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :hostname-match)]
    (. builder hostnameMatch data))
  (.build builder))


(defn gateway-route-hostname-match-config-builder
  ""
  [id config]
  (build-gateway-route-hostname-match-config-builder (new GatewayRouteHostnameMatchConfig$Builder) id config))


(defn build-gateway-route-props-builder
  "The build-gateway-route-props-builder function updates a GatewayRouteProps$Builder instance using the provided configuration.
  The function takes the GatewayRouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.GatewayRouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualGateway` | software.amazon.awscdk.services.appmesh.IVirtualGateway | [[cdk.support/lookup-entry]] | `:virtual-gateway` |
"
  [^GatewayRouteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :gateway-route-name)]
    (. builder gatewayRouteName data))
  (when-let [data (lookup-entry config id :route-spec)]
    (. builder routeSpec data))
  (when-let [data (lookup-entry config id :virtual-gateway)]
    (. builder virtualGateway data))
  (.build builder))


(defn gateway-route-props-builder
  ""
  [id config]
  (build-gateway-route-props-builder (new GatewayRouteProps$Builder) id config))


(defn build-gateway-route-spec-config-builder
  "The build-gateway-route-spec-config-builder function updates a GatewayRouteSpecConfig$Builder instance using the provided configuration.
  The function takes the GatewayRouteSpecConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcSpecConfig` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-spec-config` |
| `http2SpecConfig` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:http2-spec-config` |
| `httpSpecConfig` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:http-spec-config` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^GatewayRouteSpecConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc-spec-config)]
    (. builder grpcSpecConfig data))
  (when-let [data (lookup-entry config id :http2-spec-config)]
    (. builder http2SpecConfig data))
  (when-let [data (lookup-entry config id :http-spec-config)]
    (. builder httpSpecConfig data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn gateway-route-spec-config-builder
  ""
  [id config]
  (build-gateway-route-spec-config-builder (new GatewayRouteSpecConfig$Builder) id config))


(defn build-grpc-connection-pool-builder
  "The build-grpc-connection-pool-builder function updates a GrpcConnectionPool$Builder instance using the provided configuration.
  The function takes the GrpcConnectionPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |
"
  [^GrpcConnectionPool$Builder builder id config]
  (when-let [data (lookup-entry config id :max-requests)]
    (. builder maxRequests data))
  (.build builder))


(defn grpc-connection-pool-builder
  ""
  [id config]
  (build-grpc-connection-pool-builder (new GrpcConnectionPool$Builder) id config))


(defn build-grpc-gateway-listener-options-builder
  "The build-grpc-gateway-listener-options-builder function updates a GrpcGatewayListenerOptions$Builder instance using the provided configuration.
  The function takes the GrpcGatewayListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.GrpcConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^GrpcGatewayListenerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn grpc-gateway-listener-options-builder
  ""
  [id config]
  (build-grpc-gateway-listener-options-builder (new GrpcGatewayListenerOptions$Builder) id config))


(defn build-grpc-gateway-route-match-builder
  "The build-grpc-gateway-route-match-builder function updates a GrpcGatewayRouteMatch$Builder instance using the provided configuration.
  The function takes the GrpcGatewayRouteMatch$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch | [[cdk.support/lookup-entry]] | `:hostname` |
| `metadata` | java.util.List | [[cdk.support/lookup-entry]] | `:metadata` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `rewriteRequestHostname` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rewrite-request-hostname` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^GrpcGatewayRouteMatch$Builder builder id config]
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :rewrite-request-hostname)]
    (. builder rewriteRequestHostname data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn grpc-gateway-route-match-builder
  ""
  [id config]
  (build-grpc-gateway-route-match-builder (new GrpcGatewayRouteMatch$Builder) id config))


(defn build-grpc-gateway-route-spec-options-builder
  "The build-grpc-gateway-route-spec-options-builder function updates a GrpcGatewayRouteSpecOptions$Builder instance using the provided configuration.
  The function takes the GrpcGatewayRouteSpecOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `routeTarget` | software.amazon.awscdk.services.appmesh.IVirtualService | [[cdk.support/lookup-entry]] | `:route-target` |
"
  [^GrpcGatewayRouteSpecOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :route-target)]
    (. builder routeTarget data))
  (.build builder))


(defn grpc-gateway-route-spec-options-builder
  ""
  [id config]
  (build-grpc-gateway-route-spec-options-builder (new GrpcGatewayRouteSpecOptions$Builder) id config))


(defn build-grpc-health-check-options-builder
  "The build-grpc-health-check-options-builder function updates a GrpcHealthCheckOptions$Builder instance using the provided configuration.
  The function takes the GrpcHealthCheckOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |
"
  [^GrpcHealthCheckOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :healthy-threshold)]
    (. builder healthyThreshold data))
  (when-let [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :unhealthy-threshold)]
    (. builder unhealthyThreshold data))
  (.build builder))


(defn grpc-health-check-options-builder
  ""
  [id config]
  (build-grpc-health-check-options-builder (new GrpcHealthCheckOptions$Builder) id config))


(defn build-grpc-retry-policy-builder
  "The build-grpc-retry-policy-builder function updates a GrpcRetryPolicy$Builder instance using the provided configuration.
  The function takes the GrpcRetryPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:grpc-retry-events` |
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |
"
  [^GrpcRetryPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc-retry-events)]
    (. builder grpcRetryEvents data))
  (when-let [data (lookup-entry config id :http-retry-events)]
    (. builder httpRetryEvents data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :retry-timeout)]
    (. builder retryTimeout data))
  (when-let [data (lookup-entry config id :tcp-retry-events)]
    (. builder tcpRetryEvents data))
  (.build builder))


(defn grpc-retry-policy-builder
  ""
  [id config]
  (build-grpc-retry-policy-builder (new GrpcRetryPolicy$Builder) id config))


(defn build-grpc-route-match-builder
  "The build-grpc-route-match-builder function updates a GrpcRouteMatch$Builder instance using the provided configuration.
  The function takes the GrpcRouteMatch$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadata` | java.util.List | [[cdk.support/lookup-entry]] | `:metadata` |
| `methodName` | java.lang.String | [[cdk.support/lookup-entry]] | `:method-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^GrpcRouteMatch$Builder builder id config]
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :method-name)]
    (. builder methodName data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn grpc-route-match-builder
  ""
  [id config]
  (build-grpc-route-match-builder (new GrpcRouteMatch$Builder) id config))


(defn build-grpc-route-spec-options-builder
  "The build-grpc-route-spec-options-builder function updates a GrpcRouteSpecOptions$Builder instance using the provided configuration.
  The function takes the GrpcRouteSpecOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.GrpcRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.GrpcRetryPolicy | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.services.appmesh.GrpcTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |
"
  [^GrpcRouteSpecOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :retry-policy)]
    (. builder retryPolicy data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :weighted-targets)]
    (. builder weightedTargets data))
  (.build builder))


(defn grpc-route-spec-options-builder
  ""
  [id config]
  (build-grpc-route-spec-options-builder (new GrpcRouteSpecOptions$Builder) id config))


(defn build-grpc-timeout-builder
  "The build-grpc-timeout-builder function updates a GrpcTimeout$Builder instance using the provided configuration.
  The function takes the GrpcTimeout$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:per-request` |
"
  [^GrpcTimeout$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (when-let [data (lookup-entry config id :per-request)]
    (. builder perRequest data))
  (.build builder))


(defn grpc-timeout-builder
  ""
  [id config]
  (build-grpc-timeout-builder (new GrpcTimeout$Builder) id config))


(defn build-grpc-virtual-node-listener-options-builder
  "The build-grpc-virtual-node-listener-options-builder function updates a GrpcVirtualNodeListenerOptions$Builder instance using the provided configuration.
  The function takes the GrpcVirtualNodeListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.GrpcConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.GrpcTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^GrpcVirtualNodeListenerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :outlier-detection)]
    (. builder outlierDetection data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn grpc-virtual-node-listener-options-builder
  ""
  [id config]
  (build-grpc-virtual-node-listener-options-builder (new GrpcVirtualNodeListenerOptions$Builder) id config))


(defn build-header-match-config-builder
  "The build-header-match-config-builder function updates a HeaderMatchConfig$Builder instance using the provided configuration.
  The function takes the HeaderMatchConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerMatch` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteHeaderProperty | [[cdk.support/lookup-entry]] | `:header-match` |
"
  [^HeaderMatchConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :header-match)]
    (. builder headerMatch data))
  (.build builder))


(defn header-match-config-builder
  ""
  [id config]
  (build-header-match-config-builder (new HeaderMatchConfig$Builder) id config))


(defn build-health-check-bind-options-builder
  "The build-health-check-bind-options-builder function updates a HealthCheckBindOptions$Builder instance using the provided configuration.
  The function takes the HealthCheckBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-port` |
"
  [^HealthCheckBindOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :default-port)]
    (. builder defaultPort data))
  (.build builder))


(defn health-check-bind-options-builder
  ""
  [id config]
  (build-health-check-bind-options-builder (new HealthCheckBindOptions$Builder) id config))


(defn build-health-check-config-builder
  "The build-health-check-config-builder function updates a HealthCheckConfig$Builder instance using the provided configuration.
  The function takes the HealthCheckConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualGatewayHealthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty | [[cdk.support/lookup-entry]] | `:virtual-gateway-health-check` |
| `virtualNodeHealthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$HealthCheckProperty | [[cdk.support/lookup-entry]] | `:virtual-node-health-check` |
"
  [^HealthCheckConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-gateway-health-check)]
    (. builder virtualGatewayHealthCheck data))
  (when-let [data (lookup-entry config id :virtual-node-health-check)]
    (. builder virtualNodeHealthCheck data))
  (.build builder))


(defn health-check-config-builder
  ""
  [id config]
  (build-health-check-config-builder (new HealthCheckConfig$Builder) id config))


(defn build-http-connection-pool-builder
  "The build-http-connection-pool-builder function updates a HttpConnectionPool$Builder instance using the provided configuration.
  The function takes the HttpConnectionPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
| `maxPendingRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-pending-requests` |
"
  [^HttpConnectionPool$Builder builder id config]
  (when-let [data (lookup-entry config id :max-connections)]
    (. builder maxConnections data))
  (when-let [data (lookup-entry config id :max-pending-requests)]
    (. builder maxPendingRequests data))
  (.build builder))


(defn http-connection-pool-builder
  ""
  [id config]
  (build-http-connection-pool-builder (new HttpConnectionPool$Builder) id config))


(defn build-http-gateway-listener-options-builder
  "The build-http-gateway-listener-options-builder function updates a HttpGatewayListenerOptions$Builder instance using the provided configuration.
  The function takes the HttpGatewayListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.HttpConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^HttpGatewayListenerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn http-gateway-listener-options-builder
  ""
  [id config]
  (build-http-gateway-listener-options-builder (new HttpGatewayListenerOptions$Builder) id config))


(defn build-http-gateway-route-match-builder
  "The build-http-gateway-route-match-builder function updates a HttpGatewayRouteMatch$Builder instance using the provided configuration.
  The function takes the HttpGatewayRouteMatch$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `hostname` | software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch | [[cdk.support/lookup-entry]] | `:hostname` |
| `method` | software.amazon.awscdk.services.appmesh.HttpRouteMethod | [[cdk.api.services.appmesh/http-route-method]] | `:method` |
| `path` | software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `rewriteRequestHostname` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rewrite-request-hostname` |
"
  [^HttpGatewayRouteMatch$Builder builder id config]
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-let [data (http-route-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-let [data (lookup-entry config id :rewrite-request-hostname)]
    (. builder rewriteRequestHostname data))
  (.build builder))


(defn http-gateway-route-match-builder
  ""
  [id config]
  (build-http-gateway-route-match-builder (new HttpGatewayRouteMatch$Builder) id config))


(defn build-http-gateway-route-path-match-config-builder
  "The build-http-gateway-route-path-match-config-builder function updates a HttpGatewayRoutePathMatchConfig$Builder instance using the provided configuration.
  The function takes the HttpGatewayRoutePathMatchConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefixPathMatch` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-path-match` |
| `prefixPathRewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty | [[cdk.support/lookup-entry]] | `:prefix-path-rewrite` |
| `wholePathMatch` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpPathMatchProperty | [[cdk.support/lookup-entry]] | `:whole-path-match` |
| `wholePathRewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty | [[cdk.support/lookup-entry]] | `:whole-path-rewrite` |
"
  [^HttpGatewayRoutePathMatchConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :prefix-path-match)]
    (. builder prefixPathMatch data))
  (when-let [data (lookup-entry config id :prefix-path-rewrite)]
    (. builder prefixPathRewrite data))
  (when-let [data (lookup-entry config id :whole-path-match)]
    (. builder wholePathMatch data))
  (when-let [data (lookup-entry config id :whole-path-rewrite)]
    (. builder wholePathRewrite data))
  (.build builder))


(defn http-gateway-route-path-match-config-builder
  ""
  [id config]
  (build-http-gateway-route-path-match-config-builder (new HttpGatewayRoutePathMatchConfig$Builder) id config))


(defn build-http-gateway-route-spec-options-builder
  "The build-http-gateway-route-spec-options-builder function updates a HttpGatewayRouteSpecOptions$Builder instance using the provided configuration.
  The function takes the HttpGatewayRouteSpecOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `routeTarget` | software.amazon.awscdk.services.appmesh.IVirtualService | [[cdk.support/lookup-entry]] | `:route-target` |
"
  [^HttpGatewayRouteSpecOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :route-target)]
    (. builder routeTarget data))
  (.build builder))


(defn http-gateway-route-spec-options-builder
  ""
  [id config]
  (build-http-gateway-route-spec-options-builder (new HttpGatewayRouteSpecOptions$Builder) id config))


(defn build-http-health-check-options-builder
  "The build-http-health-check-options-builder function updates a HttpHealthCheckOptions$Builder instance using the provided configuration.
  The function takes the HttpHealthCheckOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |
"
  [^HttpHealthCheckOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :healthy-threshold)]
    (. builder healthyThreshold data))
  (when-let [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :unhealthy-threshold)]
    (. builder unhealthyThreshold data))
  (.build builder))


(defn http-health-check-options-builder
  ""
  [id config]
  (build-http-health-check-options-builder (new HttpHealthCheckOptions$Builder) id config))


(defn build-http-retry-policy-builder
  "The build-http-retry-policy-builder function updates a HttpRetryPolicy$Builder instance using the provided configuration.
  The function takes the HttpRetryPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |
"
  [^HttpRetryPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :http-retry-events)]
    (. builder httpRetryEvents data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :retry-timeout)]
    (. builder retryTimeout data))
  (when-let [data (lookup-entry config id :tcp-retry-events)]
    (. builder tcpRetryEvents data))
  (.build builder))


(defn http-retry-policy-builder
  ""
  [id config]
  (build-http-retry-policy-builder (new HttpRetryPolicy$Builder) id config))


(defn build-http-route-match-builder
  "The build-http-route-match-builder function updates a HttpRouteMatch$Builder instance using the provided configuration.
  The function takes the HttpRouteMatch$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `method` | software.amazon.awscdk.services.appmesh.HttpRouteMethod | [[cdk.api.services.appmesh/http-route-method]] | `:method` |
| `path` | software.amazon.awscdk.services.appmesh.HttpRoutePathMatch | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.appmesh.HttpRouteProtocol | [[cdk.api.services.appmesh/http-route-protocol]] | `:protocol` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |
"
  [^HttpRouteMatch$Builder builder id config]
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (http-route-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (http-route-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (.build builder))


(defn http-route-match-builder
  ""
  [id config]
  (build-http-route-match-builder (new HttpRouteMatch$Builder) id config))


(defn build-http-route-path-match-config-builder
  "The build-http-route-path-match-config-builder function updates a HttpRoutePathMatchConfig$Builder instance using the provided configuration.
  The function takes the HttpRoutePathMatchConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefixPathMatch` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-path-match` |
| `wholePathMatch` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpPathMatchProperty | [[cdk.support/lookup-entry]] | `:whole-path-match` |
"
  [^HttpRoutePathMatchConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :prefix-path-match)]
    (. builder prefixPathMatch data))
  (when-let [data (lookup-entry config id :whole-path-match)]
    (. builder wholePathMatch data))
  (.build builder))


(defn http-route-path-match-config-builder
  ""
  [id config]
  (build-http-route-path-match-config-builder (new HttpRoutePathMatchConfig$Builder) id config))


(defn build-http-route-spec-options-builder
  "The build-http-route-spec-options-builder function updates a HttpRouteSpecOptions$Builder instance using the provided configuration.
  The function takes the HttpRouteSpecOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.HttpRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.HttpRetryPolicy | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.services.appmesh.HttpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |
"
  [^HttpRouteSpecOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :match)]
    (. builder match data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :retry-policy)]
    (. builder retryPolicy data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :weighted-targets)]
    (. builder weightedTargets data))
  (.build builder))


(defn http-route-spec-options-builder
  ""
  [id config]
  (build-http-route-spec-options-builder (new HttpRouteSpecOptions$Builder) id config))


(defn build-http-timeout-builder
  "The build-http-timeout-builder function updates a HttpTimeout$Builder instance using the provided configuration.
  The function takes the HttpTimeout$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:per-request` |
"
  [^HttpTimeout$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (when-let [data (lookup-entry config id :per-request)]
    (. builder perRequest data))
  (.build builder))


(defn http-timeout-builder
  ""
  [id config]
  (build-http-timeout-builder (new HttpTimeout$Builder) id config))


(defn build-http-virtual-node-listener-options-builder
  "The build-http-virtual-node-listener-options-builder function updates a HttpVirtualNodeListenerOptions$Builder instance using the provided configuration.
  The function takes the HttpVirtualNodeListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.HttpConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.HttpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^HttpVirtualNodeListenerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :outlier-detection)]
    (. builder outlierDetection data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn http-virtual-node-listener-options-builder
  ""
  [id config]
  (build-http-virtual-node-listener-options-builder (new HttpVirtualNodeListenerOptions$Builder) id config))


(defn build-http2-connection-pool-builder
  "The build-http2-connection-pool-builder function updates a Http2ConnectionPool$Builder instance using the provided configuration.
  The function takes the Http2ConnectionPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |
"
  [^Http2ConnectionPool$Builder builder id config]
  (when-let [data (lookup-entry config id :max-requests)]
    (. builder maxRequests data))
  (.build builder))


(defn http2-connection-pool-builder
  ""
  [id config]
  (build-http2-connection-pool-builder (new Http2ConnectionPool$Builder) id config))


(defn build-http2-gateway-listener-options-builder
  "The build-http2-gateway-listener-options-builder function updates a Http2GatewayListenerOptions$Builder instance using the provided configuration.
  The function takes the Http2GatewayListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.Http2ConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^Http2GatewayListenerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn http2-gateway-listener-options-builder
  ""
  [id config]
  (build-http2-gateway-listener-options-builder (new Http2GatewayListenerOptions$Builder) id config))


(defn build-http2-virtual-node-listener-options-builder
  "The build-http2-virtual-node-listener-options-builder function updates a Http2VirtualNodeListenerOptions$Builder instance using the provided configuration.
  The function takes the Http2VirtualNodeListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.Http2ConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.HttpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^Http2VirtualNodeListenerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :outlier-detection)]
    (. builder outlierDetection data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn http2-virtual-node-listener-options-builder
  ""
  [id config]
  (build-http2-virtual-node-listener-options-builder (new Http2VirtualNodeListenerOptions$Builder) id config))


(defn build-listener-tls-options-builder
  "The build-listener-tls-options-builder function updates a ListenerTlsOptions$Builder instance using the provided configuration.
  The function takes the ListenerTlsOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.appmesh.TlsCertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `mode` | software.amazon.awscdk.services.appmesh.TlsMode | [[cdk.api.services.appmesh/tls-mode]] | `:mode` |
| `mutualTlsValidation` | software.amazon.awscdk.services.appmesh.MutualTlsValidation | [[cdk.support/lookup-entry]] | `:mutual-tls-validation` |
"
  [^ListenerTlsOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (tls-mode config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :mutual-tls-validation)]
    (. builder mutualTlsValidation data))
  (.build builder))


(defn listener-tls-options-builder
  ""
  [id config]
  (build-listener-tls-options-builder (new ListenerTlsOptions$Builder) id config))


(defn build-logging-format-config-builder
  "The build-logging-format-config-builder function updates a LoggingFormatConfig$Builder instance using the provided configuration.
  The function takes the LoggingFormatConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `formatConfig` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$LoggingFormatProperty | [[cdk.support/lookup-entry]] | `:format-config` |
"
  [^LoggingFormatConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :format-config)]
    (. builder formatConfig data))
  (.build builder))


(defn logging-format-config-builder
  ""
  [id config]
  (build-logging-format-config-builder (new LoggingFormatConfig$Builder) id config))


(defn build-mesh-builder
  "The build-mesh-builder function updates a Mesh$Builder instance using the provided configuration.
  The function takes the Mesh$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressFilter` | software.amazon.awscdk.services.appmesh.MeshFilterType | [[cdk.api.services.appmesh/mesh-filter-type]] | `:egress-filter` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.MeshServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
"
  [^Mesh$Builder builder id config]
  (when-let [data (mesh-filter-type config id :egress-filter)]
    (. builder egressFilter data))
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :service-discovery)]
    (. builder serviceDiscovery data))
  (.build builder))


(defn mesh-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-mesh-builder (Mesh$Builder/create scope (name id)) id config))


(defn build-mesh-props-builder
  "The build-mesh-props-builder function updates a MeshProps$Builder instance using the provided configuration.
  The function takes the MeshProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressFilter` | software.amazon.awscdk.services.appmesh.MeshFilterType | [[cdk.api.services.appmesh/mesh-filter-type]] | `:egress-filter` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.MeshServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
"
  [^MeshProps$Builder builder id config]
  (when-let [data (mesh-filter-type config id :egress-filter)]
    (. builder egressFilter data))
  (when-let [data (lookup-entry config id :mesh-name)]
    (. builder meshName data))
  (when-let [data (lookup-entry config id :service-discovery)]
    (. builder serviceDiscovery data))
  (.build builder))


(defn mesh-props-builder
  ""
  [id config]
  (build-mesh-props-builder (new MeshProps$Builder) id config))


(defn build-mesh-service-discovery-builder
  "The build-mesh-service-discovery-builder function updates a MeshServiceDiscovery$Builder instance using the provided configuration.
  The function takes the MeshServiceDiscovery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipPreference` | software.amazon.awscdk.services.appmesh.IpPreference | [[cdk.api.services.appmesh/ip-preference]] | `:ip-preference` |
"
  [^MeshServiceDiscovery$Builder builder id config]
  (when-let [data (ip-preference config id :ip-preference)]
    (. builder ipPreference data))
  (.build builder))


(defn mesh-service-discovery-builder
  ""
  [id config]
  (build-mesh-service-discovery-builder (new MeshServiceDiscovery$Builder) id config))


(defn build-mutual-tls-validation-builder
  "The build-mutual-tls-validation-builder function updates a MutualTlsValidation$Builder instance using the provided configuration.
  The function takes the MutualTlsValidation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.SubjectAlternativeNames | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust | [[cdk.support/lookup-entry]] | `:trust` |
"
  [^MutualTlsValidation$Builder builder id config]
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-let [data (lookup-entry config id :trust)]
    (. builder trust data))
  (.build builder))


(defn mutual-tls-validation-builder
  ""
  [id config]
  (build-mutual-tls-validation-builder (new MutualTlsValidation$Builder) id config))


(defn build-outlier-detection-builder
  "The build-outlier-detection-builder function updates a OutlierDetection$Builder instance using the provided configuration.
  The function takes the OutlierDetection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseEjectionDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:base-ejection-duration` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `maxEjectionPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ejection-percent` |
| `maxServerErrors` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-server-errors` |
"
  [^OutlierDetection$Builder builder id config]
  (when-let [data (lookup-entry config id :base-ejection-duration)]
    (. builder baseEjectionDuration data))
  (when-let [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-let [data (lookup-entry config id :max-ejection-percent)]
    (. builder maxEjectionPercent data))
  (when-let [data (lookup-entry config id :max-server-errors)]
    (. builder maxServerErrors data))
  (.build builder))


(defn outlier-detection-builder
  ""
  [id config]
  (build-outlier-detection-builder (new OutlierDetection$Builder) id config))


(defn build-query-parameter-match-config-builder
  "The build-query-parameter-match-config-builder function updates a QueryParameterMatchConfig$Builder instance using the provided configuration.
  The function takes the QueryParameterMatchConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryParameterMatch` | software.amazon.awscdk.services.appmesh.CfnRoute$QueryParameterProperty | [[cdk.support/lookup-entry]] | `:query-parameter-match` |
"
  [^QueryParameterMatchConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :query-parameter-match)]
    (. builder queryParameterMatch data))
  (.build builder))


(defn query-parameter-match-config-builder
  ""
  [id config]
  (build-query-parameter-match-config-builder (new QueryParameterMatchConfig$Builder) id config))


(defn build-route-attributes-builder
  "The build-route-attributes-builder function updates a RouteAttributes$Builder instance using the provided configuration.
  The function takes the RouteAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `virtualRouter` | software.amazon.awscdk.services.appmesh.IVirtualRouter | [[cdk.support/lookup-entry]] | `:virtual-router` |
"
  [^RouteAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :route-name)]
    (. builder routeName data))
  (when-let [data (lookup-entry config id :virtual-router)]
    (. builder virtualRouter data))
  (.build builder))


(defn route-attributes-builder
  ""
  [id config]
  (build-route-attributes-builder (new RouteAttributes$Builder) id config))


(defn build-route-base-props-builder
  "The build-route-base-props-builder function updates a RouteBaseProps$Builder instance using the provided configuration.
  The function takes the RouteBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.RouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
"
  [^RouteBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :route-name)]
    (. builder routeName data))
  (when-let [data (lookup-entry config id :route-spec)]
    (. builder routeSpec data))
  (.build builder))


(defn route-base-props-builder
  ""
  [id config]
  (build-route-base-props-builder (new RouteBaseProps$Builder) id config))


(defn build-route-builder
  "The build-route-builder function updates a Route$Builder instance using the provided configuration.
  The function takes the Route$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.RouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualRouter` | software.amazon.awscdk.services.appmesh.IVirtualRouter | [[cdk.support/lookup-entry]] | `:virtual-router` |
"
  [^Route$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :route-name)]
    (. builder routeName data))
  (when-let [data (lookup-entry config id :route-spec)]
    (. builder routeSpec data))
  (when-let [data (lookup-entry config id :virtual-router)]
    (. builder virtualRouter data))
  (.build builder))


(defn route-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-route-builder (Route$Builder/create scope (name id)) id config))


(defn build-route-props-builder
  "The build-route-props-builder function updates a RouteProps$Builder instance using the provided configuration.
  The function takes the RouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.RouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualRouter` | software.amazon.awscdk.services.appmesh.IVirtualRouter | [[cdk.support/lookup-entry]] | `:virtual-router` |
"
  [^RouteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :route-name)]
    (. builder routeName data))
  (when-let [data (lookup-entry config id :route-spec)]
    (. builder routeSpec data))
  (when-let [data (lookup-entry config id :virtual-router)]
    (. builder virtualRouter data))
  (.build builder))


(defn route-props-builder
  ""
  [id config]
  (build-route-props-builder (new RouteProps$Builder) id config))


(defn build-route-spec-config-builder
  "The build-route-spec-config-builder function updates a RouteSpecConfig$Builder instance using the provided configuration.
  The function takes the RouteSpecConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-route-spec` |
| `http2RouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteProperty | [[cdk.support/lookup-entry]] | `:http2-route-spec` |
| `httpRouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteProperty | [[cdk.support/lookup-entry]] | `:http-route-spec` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tcpRouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpRouteProperty | [[cdk.support/lookup-entry]] | `:tcp-route-spec` |
"
  [^RouteSpecConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :grpc-route-spec)]
    (. builder grpcRouteSpec data))
  (when-let [data (lookup-entry config id :http2-route-spec)]
    (. builder http2RouteSpec data))
  (when-let [data (lookup-entry config id :http-route-spec)]
    (. builder httpRouteSpec data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :tcp-route-spec)]
    (. builder tcpRouteSpec data))
  (.build builder))


(defn route-spec-config-builder
  ""
  [id config]
  (build-route-spec-config-builder (new RouteSpecConfig$Builder) id config))


(defn build-route-spec-options-base-builder
  "The build-route-spec-options-base-builder function updates a RouteSpecOptionsBase$Builder instance using the provided configuration.
  The function takes the RouteSpecOptionsBase$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^RouteSpecOptionsBase$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn route-spec-options-base-builder
  ""
  [id config]
  (build-route-spec-options-base-builder (new RouteSpecOptionsBase$Builder) id config))


(defn build-service-discovery-config-builder
  "The build-service-discovery-config-builder function updates a ServiceDiscoveryConfig$Builder instance using the provided configuration.
  The function takes the ServiceDiscoveryConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudmap` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty | [[cdk.support/lookup-entry]] | `:cloudmap` |
| `dns` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DnsServiceDiscoveryProperty | [[cdk.support/lookup-entry]] | `:dns` |
"
  [^ServiceDiscoveryConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :cloudmap)]
    (. builder cloudmap data))
  (when-let [data (lookup-entry config id :dns)]
    (. builder dns data))
  (.build builder))


(defn service-discovery-config-builder
  ""
  [id config]
  (build-service-discovery-config-builder (new ServiceDiscoveryConfig$Builder) id config))


(defn build-subject-alternative-names-matcher-config-builder
  "The build-subject-alternative-names-matcher-config-builder function updates a SubjectAlternativeNamesMatcherConfig$Builder instance using the provided configuration.
  The function takes the SubjectAlternativeNamesMatcherConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNamesMatch` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$SubjectAlternativeNameMatchersProperty | [[cdk.support/lookup-entry]] | `:subject-alternative-names-match` |
"
  [^SubjectAlternativeNamesMatcherConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :subject-alternative-names-match)]
    (. builder subjectAlternativeNamesMatch data))
  (.build builder))


(defn subject-alternative-names-matcher-config-builder
  ""
  [id config]
  (build-subject-alternative-names-matcher-config-builder (new SubjectAlternativeNamesMatcherConfig$Builder) id config))


(defn build-tcp-connection-pool-builder
  "The build-tcp-connection-pool-builder function updates a TcpConnectionPool$Builder instance using the provided configuration.
  The function takes the TcpConnectionPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
"
  [^TcpConnectionPool$Builder builder id config]
  (when-let [data (lookup-entry config id :max-connections)]
    (. builder maxConnections data))
  (.build builder))


(defn tcp-connection-pool-builder
  ""
  [id config]
  (build-tcp-connection-pool-builder (new TcpConnectionPool$Builder) id config))


(defn build-tcp-health-check-options-builder
  "The build-tcp-health-check-options-builder function updates a TcpHealthCheckOptions$Builder instance using the provided configuration.
  The function takes the TcpHealthCheckOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |
"
  [^TcpHealthCheckOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :healthy-threshold)]
    (. builder healthyThreshold data))
  (when-let [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :unhealthy-threshold)]
    (. builder unhealthyThreshold data))
  (.build builder))


(defn tcp-health-check-options-builder
  ""
  [id config]
  (build-tcp-health-check-options-builder (new TcpHealthCheckOptions$Builder) id config))


(defn build-tcp-route-spec-options-builder
  "The build-tcp-route-spec-options-builder function updates a TcpRouteSpecOptions$Builder instance using the provided configuration.
  The function takes the TcpRouteSpecOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `timeout` | software.amazon.awscdk.services.appmesh.TcpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |
"
  [^TcpRouteSpecOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :weighted-targets)]
    (. builder weightedTargets data))
  (.build builder))


(defn tcp-route-spec-options-builder
  ""
  [id config]
  (build-tcp-route-spec-options-builder (new TcpRouteSpecOptions$Builder) id config))


(defn build-tcp-timeout-builder
  "The build-tcp-timeout-builder function updates a TcpTimeout$Builder instance using the provided configuration.
  The function takes the TcpTimeout$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle` |
"
  [^TcpTimeout$Builder builder id config]
  (when-let [data (lookup-entry config id :idle)]
    (. builder idle data))
  (.build builder))


(defn tcp-timeout-builder
  ""
  [id config]
  (build-tcp-timeout-builder (new TcpTimeout$Builder) id config))


(defn build-tcp-virtual-node-listener-options-builder
  "The build-tcp-virtual-node-listener-options-builder function updates a TcpVirtualNodeListenerOptions$Builder instance using the provided configuration.
  The function takes the TcpVirtualNodeListenerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.TcpConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.TcpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^TcpVirtualNodeListenerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-pool)]
    (. builder connectionPool data))
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-let [data (lookup-entry config id :outlier-detection)]
    (. builder outlierDetection data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn tcp-virtual-node-listener-options-builder
  ""
  [id config]
  (build-tcp-virtual-node-listener-options-builder (new TcpVirtualNodeListenerOptions$Builder) id config))


(defn build-tls-certificate-config-builder
  "The build-tls-certificate-config-builder function updates a TlsCertificateConfig$Builder instance using the provided configuration.
  The function takes the TlsCertificateConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsCertificate` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsCertificateProperty | [[cdk.support/lookup-entry]] | `:tls-certificate` |
"
  [^TlsCertificateConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :tls-certificate)]
    (. builder tlsCertificate data))
  (.build builder))


(defn tls-certificate-config-builder
  ""
  [id config]
  (build-tls-certificate-config-builder (new TlsCertificateConfig$Builder) id config))


(defn build-tls-client-policy-builder
  "The build-tls-client-policy-builder function updates a TlsClientPolicy$Builder instance using the provided configuration.
  The function takes the TlsClientPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforce` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce` |
| `mutualTlsCertificate` | software.amazon.awscdk.services.appmesh.MutualTlsCertificate | [[cdk.support/lookup-entry]] | `:mutual-tls-certificate` |
| `ports` | java.util.List | [[cdk.support/lookup-entry]] | `:ports` |
| `validation` | software.amazon.awscdk.services.appmesh.TlsValidation | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^TlsClientPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :enforce)]
    (. builder enforce data))
  (when-let [data (lookup-entry config id :mutual-tls-certificate)]
    (. builder mutualTlsCertificate data))
  (when-let [data (lookup-entry config id :ports)]
    (. builder ports data))
  (when-let [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn tls-client-policy-builder
  ""
  [id config]
  (build-tls-client-policy-builder (new TlsClientPolicy$Builder) id config))


(defn build-tls-validation-builder
  "The build-tls-validation-builder function updates a TlsValidation$Builder instance using the provided configuration.
  The function takes the TlsValidation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.SubjectAlternativeNames | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.TlsValidationTrust | [[cdk.support/lookup-entry]] | `:trust` |
"
  [^TlsValidation$Builder builder id config]
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-let [data (lookup-entry config id :trust)]
    (. builder trust data))
  (.build builder))


(defn tls-validation-builder
  ""
  [id config]
  (build-tls-validation-builder (new TlsValidation$Builder) id config))


(defn build-tls-validation-trust-config-builder
  "The build-tls-validation-trust-config-builder function updates a TlsValidationTrustConfig$Builder instance using the provided configuration.
  The function takes the TlsValidationTrustConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsValidationTrust` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:tls-validation-trust` |
"
  [^TlsValidationTrustConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :tls-validation-trust)]
    (. builder tlsValidationTrust data))
  (.build builder))


(defn tls-validation-trust-config-builder
  ""
  [id config]
  (build-tls-validation-trust-config-builder (new TlsValidationTrustConfig$Builder) id config))


(defn build-virtual-gateway-attributes-builder
  "The build-virtual-gateway-attributes-builder function updates a VirtualGatewayAttributes$Builder instance using the provided configuration.
  The function takes the VirtualGatewayAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^VirtualGatewayAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn virtual-gateway-attributes-builder
  ""
  [id config]
  (build-virtual-gateway-attributes-builder (new VirtualGatewayAttributes$Builder) id config))


(defn build-virtual-gateway-base-props-builder
  "The build-virtual-gateway-base-props-builder function updates a VirtualGatewayBaseProps$Builder instance using the provided configuration.
  The function takes the VirtualGatewayBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^VirtualGatewayBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn virtual-gateway-base-props-builder
  ""
  [id config]
  (build-virtual-gateway-base-props-builder (new VirtualGatewayBaseProps$Builder) id config))


(defn build-virtual-gateway-builder
  "The build-virtual-gateway-builder function updates a VirtualGateway$Builder instance using the provided configuration.
  The function takes the VirtualGateway$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^VirtualGateway$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn virtual-gateway-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-virtual-gateway-builder (VirtualGateway$Builder/create scope (name id)) id config))


(defn build-virtual-gateway-listener-config-builder
  "The build-virtual-gateway-listener-config-builder function updates a VirtualGatewayListenerConfig$Builder instance using the provided configuration.
  The function takes the VirtualGatewayListenerConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listener` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerProperty | [[cdk.support/lookup-entry]] | `:listener` |
"
  [^VirtualGatewayListenerConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :listener)]
    (. builder listener data))
  (.build builder))


(defn virtual-gateway-listener-config-builder
  ""
  [id config]
  (build-virtual-gateway-listener-config-builder (new VirtualGatewayListenerConfig$Builder) id config))


(defn build-virtual-gateway-props-builder
  "The build-virtual-gateway-props-builder function updates a VirtualGatewayProps$Builder instance using the provided configuration.
  The function takes the VirtualGatewayProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |
"
  [^VirtualGatewayProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-gateway-name)]
    (. builder virtualGatewayName data))
  (.build builder))


(defn virtual-gateway-props-builder
  ""
  [id config]
  (build-virtual-gateway-props-builder (new VirtualGatewayProps$Builder) id config))


(defn build-virtual-node-attributes-builder
  "The build-virtual-node-attributes-builder function updates a VirtualNodeAttributes$Builder instance using the provided configuration.
  The function takes the VirtualNodeAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |
"
  [^VirtualNodeAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-node-name)]
    (. builder virtualNodeName data))
  (.build builder))


(defn virtual-node-attributes-builder
  ""
  [id config]
  (build-virtual-node-attributes-builder (new VirtualNodeAttributes$Builder) id config))


(defn build-virtual-node-base-props-builder
  "The build-virtual-node-base-props-builder function updates a VirtualNodeBaseProps$Builder instance using the provided configuration.
  The function takes the VirtualNodeBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | java.util.List | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.ServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |
"
  [^VirtualNodeBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :backends)]
    (. builder backends data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :service-discovery)]
    (. builder serviceDiscovery data))
  (when-let [data (lookup-entry config id :virtual-node-name)]
    (. builder virtualNodeName data))
  (.build builder))


(defn virtual-node-base-props-builder
  ""
  [id config]
  (build-virtual-node-base-props-builder (new VirtualNodeBaseProps$Builder) id config))


(defn build-virtual-node-builder
  "The build-virtual-node-builder function updates a VirtualNode$Builder instance using the provided configuration.
  The function takes the VirtualNode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | java.util.List | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.ServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |
"
  [^VirtualNode$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :backends)]
    (. builder backends data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :service-discovery)]
    (. builder serviceDiscovery data))
  (when-let [data (lookup-entry config id :virtual-node-name)]
    (. builder virtualNodeName data))
  (.build builder))


(defn virtual-node-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-virtual-node-builder (VirtualNode$Builder/create scope (name id)) id config))


(defn build-virtual-node-listener-config-builder
  "The build-virtual-node-listener-config-builder function updates a VirtualNodeListenerConfig$Builder instance using the provided configuration.
  The function takes the VirtualNodeListenerConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listener` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerProperty | [[cdk.support/lookup-entry]] | `:listener` |
"
  [^VirtualNodeListenerConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :listener)]
    (. builder listener data))
  (.build builder))


(defn virtual-node-listener-config-builder
  ""
  [id config]
  (build-virtual-node-listener-config-builder (new VirtualNodeListenerConfig$Builder) id config))


(defn build-virtual-node-props-builder
  "The build-virtual-node-props-builder function updates a VirtualNodeProps$Builder instance using the provided configuration.
  The function takes the VirtualNodeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | java.util.List | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.ServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |
"
  [^VirtualNodeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log)]
    (. builder accessLog data))
  (when-let [data (lookup-entry config id :backend-defaults)]
    (. builder backendDefaults data))
  (when-let [data (lookup-entry config id :backends)]
    (. builder backends data))
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :service-discovery)]
    (. builder serviceDiscovery data))
  (when-let [data (lookup-entry config id :virtual-node-name)]
    (. builder virtualNodeName data))
  (.build builder))


(defn virtual-node-props-builder
  ""
  [id config]
  (build-virtual-node-props-builder (new VirtualNodeProps$Builder) id config))


(defn build-virtual-router-attributes-builder
  "The build-virtual-router-attributes-builder function updates a VirtualRouterAttributes$Builder instance using the provided configuration.
  The function takes the VirtualRouterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^VirtualRouterAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn virtual-router-attributes-builder
  ""
  [id config]
  (build-virtual-router-attributes-builder (new VirtualRouterAttributes$Builder) id config))


(defn build-virtual-router-base-props-builder
  "The build-virtual-router-base-props-builder function updates a VirtualRouterBaseProps$Builder instance using the provided configuration.
  The function takes the VirtualRouterBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^VirtualRouterBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn virtual-router-base-props-builder
  ""
  [id config]
  (build-virtual-router-base-props-builder (new VirtualRouterBaseProps$Builder) id config))


(defn build-virtual-router-builder
  "The build-virtual-router-builder function updates a VirtualRouter$Builder instance using the provided configuration.
  The function takes the VirtualRouter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^VirtualRouter$Builder builder id config]
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn virtual-router-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-virtual-router-builder (VirtualRouter$Builder/create scope (name id)) id config))


(defn build-virtual-router-listener-config-builder
  "The build-virtual-router-listener-config-builder function updates a VirtualRouterListenerConfig$Builder instance using the provided configuration.
  The function takes the VirtualRouterListenerConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listener` | software.amazon.awscdk.services.appmesh.CfnVirtualRouter$VirtualRouterListenerProperty | [[cdk.support/lookup-entry]] | `:listener` |
"
  [^VirtualRouterListenerConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :listener)]
    (. builder listener data))
  (.build builder))


(defn virtual-router-listener-config-builder
  ""
  [id config]
  (build-virtual-router-listener-config-builder (new VirtualRouterListenerConfig$Builder) id config))


(defn build-virtual-router-props-builder
  "The build-virtual-router-props-builder function updates a VirtualRouterProps$Builder instance using the provided configuration.
  The function takes the VirtualRouterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |
"
  [^VirtualRouterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-router-name)]
    (. builder virtualRouterName data))
  (.build builder))


(defn virtual-router-props-builder
  ""
  [id config]
  (build-virtual-router-props-builder (new VirtualRouterProps$Builder) id config))


(defn build-virtual-service-attributes-builder
  "The build-virtual-service-attributes-builder function updates a VirtualServiceAttributes$Builder instance using the provided configuration.
  The function takes the VirtualServiceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
"
  [^VirtualServiceAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-service-name)]
    (. builder virtualServiceName data))
  (.build builder))


(defn virtual-service-attributes-builder
  ""
  [id config]
  (build-virtual-service-attributes-builder (new VirtualServiceAttributes$Builder) id config))


(defn build-virtual-service-backend-options-builder
  "The build-virtual-service-backend-options-builder function updates a VirtualServiceBackendOptions$Builder instance using the provided configuration.
  The function takes the VirtualServiceBackendOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsClientPolicy` | software.amazon.awscdk.services.appmesh.TlsClientPolicy | [[cdk.support/lookup-entry]] | `:tls-client-policy` |
"
  [^VirtualServiceBackendOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :tls-client-policy)]
    (. builder tlsClientPolicy data))
  (.build builder))


(defn virtual-service-backend-options-builder
  ""
  [id config]
  (build-virtual-service-backend-options-builder (new VirtualServiceBackendOptions$Builder) id config))


(defn build-virtual-service-builder
  "The build-virtual-service-builder function updates a VirtualService$Builder instance using the provided configuration.
  The function takes the VirtualService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
| `virtualServiceProvider` | software.amazon.awscdk.services.appmesh.VirtualServiceProvider | [[cdk.support/lookup-entry]] | `:virtual-service-provider` |
"
  [^VirtualService$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-service-name)]
    (. builder virtualServiceName data))
  (when-let [data (lookup-entry config id :virtual-service-provider)]
    (. builder virtualServiceProvider data))
  (.build builder))


(defn virtual-service-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-virtual-service-builder (VirtualService$Builder/create scope (name id)) id config))


(defn build-virtual-service-props-builder
  "The build-virtual-service-props-builder function updates a VirtualServiceProps$Builder instance using the provided configuration.
  The function takes the VirtualServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
| `virtualServiceProvider` | software.amazon.awscdk.services.appmesh.VirtualServiceProvider | [[cdk.support/lookup-entry]] | `:virtual-service-provider` |
"
  [^VirtualServiceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :virtual-service-name)]
    (. builder virtualServiceName data))
  (when-let [data (lookup-entry config id :virtual-service-provider)]
    (. builder virtualServiceProvider data))
  (.build builder))


(defn virtual-service-props-builder
  ""
  [id config]
  (build-virtual-service-props-builder (new VirtualServiceProps$Builder) id config))


(defn build-virtual-service-provider-config-builder
  "The build-virtual-service-provider-config-builder function updates a VirtualServiceProviderConfig$Builder instance using the provided configuration.
  The function takes the VirtualServiceProviderConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualNodeProvider` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualNodeServiceProviderProperty | [[cdk.support/lookup-entry]] | `:virtual-node-provider` |
| `virtualRouterProvider` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualRouterServiceProviderProperty | [[cdk.support/lookup-entry]] | `:virtual-router-provider` |
"
  [^VirtualServiceProviderConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :mesh)]
    (. builder mesh data))
  (when-let [data (lookup-entry config id :virtual-node-provider)]
    (. builder virtualNodeProvider data))
  (when-let [data (lookup-entry config id :virtual-router-provider)]
    (. builder virtualRouterProvider data))
  (.build builder))


(defn virtual-service-provider-config-builder
  ""
  [id config]
  (build-virtual-service-provider-config-builder (new VirtualServiceProviderConfig$Builder) id config))


(defn build-weighted-target-builder
  "The build-weighted-target-builder function updates a WeightedTarget$Builder instance using the provided configuration.
  The function takes the WeightedTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `virtualNode` | software.amazon.awscdk.services.appmesh.IVirtualNode | [[cdk.support/lookup-entry]] | `:virtual-node` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^WeightedTarget$Builder builder id config]
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :virtual-node)]
    (. builder virtualNode data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn weighted-target-builder
  ""
  [id config]
  (build-weighted-target-builder (new WeightedTarget$Builder) id config))