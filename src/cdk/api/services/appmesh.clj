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


(defn access-log-config-builder
  "The access-log-config-builder function buildes out new instances of 
AccessLogConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualGatewayAccessLog` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayAccessLogProperty | [[cdk.support/lookup-entry]] | `:virtual-gateway-access-log` |
| `virtualNodeAccessLog` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AccessLogProperty | [[cdk.support/lookup-entry]] | `:virtual-node-access-log` |"
  [stack id config]
  (let [builder (AccessLogConfig$Builder.)]
    (when-let [data (lookup-entry config id :virtual-gateway-access-log)]
      (. builder virtualGatewayAccessLog data))
    (when-let [data (lookup-entry config id :virtual-node-access-log)]
      (. builder virtualNodeAccessLog data))
    (.build builder)))


(defn backend-config-builder
  "The backend-config-builder function buildes out new instances of 
BackendConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceBackend` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$BackendProperty | [[cdk.support/lookup-entry]] | `:virtual-service-backend` |"
  [stack id config]
  (let [builder (BackendConfig$Builder.)]
    (when-let [data (lookup-entry config id :virtual-service-backend)]
      (. builder virtualServiceBackend data))
    (.build builder)))


(defn backend-defaults-builder
  "The backend-defaults-builder function buildes out new instances of 
BackendDefaults$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsClientPolicy` | software.amazon.awscdk.services.appmesh.TlsClientPolicy | [[cdk.support/lookup-entry]] | `:tls-client-policy` |"
  [stack id config]
  (let [builder (BackendDefaults$Builder.)]
    (when-let [data (lookup-entry config id :tls-client-policy)]
      (. builder tlsClientPolicy data))
    (.build builder)))


(defn cfn-gateway-route-builder
  "The cfn-gateway-route-builder function buildes out new instances of 
CfnGatewayRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-gateway-route-gateway-route-hostname-match-property-builder
  "The cfn-gateway-route-gateway-route-hostname-match-property-builder function buildes out new instances of 
CfnGatewayRoute$GatewayRouteHostnameMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GatewayRouteHostnameMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (when-let [data (lookup-entry config id :suffix)]
      (. builder suffix data))
    (.build builder)))


(defn cfn-gateway-route-gateway-route-hostname-rewrite-property-builder
  "The cfn-gateway-route-gateway-route-hostname-rewrite-property-builder function buildes out new instances of 
CfnGatewayRoute$GatewayRouteHostnameRewriteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultTargetHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-target-hostname` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GatewayRouteHostnameRewriteProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-target-hostname)]
      (. builder defaultTargetHostname data))
    (.build builder)))


(defn cfn-gateway-route-gateway-route-metadata-match-property-builder
  "The cfn-gateway-route-gateway-route-metadata-match-property-builder function buildes out new instances of 
CfnGatewayRoute$GatewayRouteMetadataMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteRangeMatchProperty | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GatewayRouteMetadataMatchProperty$Builder.)]
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
    (.build builder)))


(defn cfn-gateway-route-gateway-route-range-match-property-builder
  "The cfn-gateway-route-gateway-route-range-match-property-builder function buildes out new instances of 
CfnGatewayRoute$GatewayRouteRangeMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GatewayRouteRangeMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (.build builder)))


(defn cfn-gateway-route-gateway-route-spec-property-builder
  "The cfn-gateway-route-gateway-route-spec-property-builder function buildes out new instances of 
CfnGatewayRoute$GatewayRouteSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRoute` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-route` |
| `http2Route` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http2-route` |
| `httpRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-route` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GatewayRouteSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :grpc-route)]
      (. builder grpcRoute data))
    (when-let [data (lookup-entry config id :http2-route)]
      (. builder http2Route data))
    (when-let [data (lookup-entry config id :http-route)]
      (. builder httpRoute data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn cfn-gateway-route-gateway-route-target-property-builder
  "The cfn-gateway-route-gateway-route-target-property-builder function buildes out new instances of 
CfnGatewayRoute$GatewayRouteTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `virtualService` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteVirtualServiceProperty | [[cdk.support/lookup-entry]] | `:virtual-service` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GatewayRouteTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :virtual-service)]
      (. builder virtualService data))
    (.build builder)))


(defn cfn-gateway-route-gateway-route-virtual-service-property-builder
  "The cfn-gateway-route-gateway-route-virtual-service-property-builder function buildes out new instances of 
CfnGatewayRoute$GatewayRouteVirtualServiceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GatewayRouteVirtualServiceProperty$Builder.)]
    (when-let [data (lookup-entry config id :virtual-service-name)]
      (. builder virtualServiceName data))
    (.build builder)))


(defn cfn-gateway-route-grpc-gateway-route-action-property-builder
  "The cfn-gateway-route-grpc-gateway-route-action-property-builder function buildes out new instances of 
CfnGatewayRoute$GrpcGatewayRouteActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteRewriteProperty | [[cdk.support/lookup-entry]] | `:rewrite` |
| `target` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteTargetProperty | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GrpcGatewayRouteActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :rewrite)]
      (. builder rewrite data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-gateway-route-grpc-gateway-route-match-property-builder
  "The cfn-gateway-route-grpc-gateway-route-match-property-builder function buildes out new instances of 
CfnGatewayRoute$GrpcGatewayRouteMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |
| `metadata` | java.util.List | [[cdk.support/lookup-entry]] | `:metadata` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GrpcGatewayRouteMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :metadata)]
      (. builder metadata data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn cfn-gateway-route-grpc-gateway-route-metadata-property-builder
  "The cfn-gateway-route-grpc-gateway-route-metadata-property-builder function buildes out new instances of 
CfnGatewayRoute$GrpcGatewayRouteMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GrpcGatewayRouteMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :invert)]
      (. builder invert data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-gateway-route-grpc-gateway-route-property-builder
  "The cfn-gateway-route-grpc-gateway-route-property-builder function buildes out new instances of 
CfnGatewayRoute$GrpcGatewayRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GrpcGatewayRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (.build builder)))


(defn cfn-gateway-route-grpc-gateway-route-rewrite-property-builder
  "The cfn-gateway-route-grpc-gateway-route-rewrite-property-builder function buildes out new instances of 
CfnGatewayRoute$GrpcGatewayRouteRewriteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$GrpcGatewayRouteRewriteProperty$Builder.)]
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-action-property-builder
  "The cfn-gateway-route-http-gateway-route-action-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRouteActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteRewriteProperty | [[cdk.support/lookup-entry]] | `:rewrite` |
| `target` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteTargetProperty | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRouteActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :rewrite)]
      (. builder rewrite data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-header-match-property-builder
  "The cfn-gateway-route-http-gateway-route-header-match-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRouteHeaderMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRouteHeaderMatchProperty$Builder.)]
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
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-header-property-builder
  "The cfn-gateway-route-http-gateway-route-header-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRouteHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRouteHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :invert)]
      (. builder invert data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-match-property-builder
  "The cfn-gateway-route-http-gateway-route-match-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRouteMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRouteMatchProperty$Builder.)]
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
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-path-rewrite-property-builder
  "The cfn-gateway-route-http-gateway-route-path-rewrite-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-prefix-rewrite-property-builder
  "The cfn-gateway-route-http-gateway-route-prefix-rewrite-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-prefix` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-prefix)]
      (. builder defaultPrefix data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-property-builder
  "The cfn-gateway-route-http-gateway-route-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (.build builder)))


(defn cfn-gateway-route-http-gateway-route-rewrite-property-builder
  "The cfn-gateway-route-http-gateway-route-rewrite-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpGatewayRouteRewriteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hostname` |
| `path` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty | [[cdk.support/lookup-entry]] | `:path` |
| `prefix` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpGatewayRouteRewriteProperty$Builder.)]
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-gateway-route-http-path-match-property-builder
  "The cfn-gateway-route-http-path-match-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpPathMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpPathMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (.build builder)))


(defn cfn-gateway-route-http-query-parameter-match-property-builder
  "The cfn-gateway-route-http-query-parameter-match-property-builder function buildes out new instances of 
CfnGatewayRoute$HttpQueryParameterMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$HttpQueryParameterMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (.build builder)))


(defn cfn-gateway-route-props-builder
  "The cfn-gateway-route-props-builder function buildes out new instances of 
CfnGatewayRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (CfnGatewayRouteProps$Builder.)]
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
    (.build builder)))


(defn cfn-gateway-route-query-parameter-property-builder
  "The cfn-gateway-route-query-parameter-property-builder function buildes out new instances of 
CfnGatewayRoute$QueryParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnGatewayRoute$QueryParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-mesh-builder
  "The cfn-mesh-builder function buildes out new instances of 
CfnMesh$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMesh$Builder/create stack id)]
    (when-let [data (lookup-entry config id :mesh-name)]
      (. builder meshName data))
    (when-let [data (lookup-entry config id :spec)]
      (. builder spec data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-mesh-egress-filter-property-builder
  "The cfn-mesh-egress-filter-property-builder function buildes out new instances of 
CfnMesh$EgressFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnMesh$EgressFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-mesh-mesh-service-discovery-property-builder
  "The cfn-mesh-mesh-service-discovery-property-builder function buildes out new instances of 
CfnMesh$MeshServiceDiscoveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-preference` |"
  [stack id config]
  (let [builder (CfnMesh$MeshServiceDiscoveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-preference)]
      (. builder ipPreference data))
    (.build builder)))


(defn cfn-mesh-mesh-spec-property-builder
  "The cfn-mesh-mesh-spec-property-builder function buildes out new instances of 
CfnMesh$MeshSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressFilter` | software.amazon.awscdk.services.appmesh.CfnMesh$EgressFilterProperty | [[cdk.support/lookup-entry]] | `:egress-filter` |
| `serviceDiscovery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-discovery` |"
  [stack id config]
  (let [builder (CfnMesh$MeshSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :egress-filter)]
      (. builder egressFilter data))
    (when-let [data (lookup-entry config id :service-discovery)]
      (. builder serviceDiscovery data))
    (.build builder)))


(defn cfn-mesh-props-builder
  "The cfn-mesh-props-builder function buildes out new instances of 
CfnMeshProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMeshProps$Builder.)]
    (when-let [data (lookup-entry config id :mesh-name)]
      (. builder meshName data))
    (when-let [data (lookup-entry config id :spec)]
      (. builder spec data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-route-builder
  "The cfn-route-builder function buildes out new instances of 
CfnRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnRoute$RouteSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (CfnRoute$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-route-duration-property-builder
  "The cfn-route-duration-property-builder function buildes out new instances of 
CfnRoute$DurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRoute$DurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-route-grpc-retry-policy-property-builder
  "The cfn-route-grpc-retry-policy-property-builder function buildes out new instances of 
CfnRoute$GrpcRetryPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:grpc-retry-events` |
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `perRetryTimeout` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:per-retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |"
  [stack id config]
  (let [builder (CfnRoute$GrpcRetryPolicyProperty$Builder.)]
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
    (.build builder)))


(defn cfn-route-grpc-route-action-property-builder
  "The cfn-route-grpc-route-action-property-builder function buildes out new instances of 
CfnRoute$GrpcRouteActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weightedTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weighted-targets` |"
  [stack id config]
  (let [builder (CfnRoute$GrpcRouteActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :weighted-targets)]
      (. builder weightedTargets data))
    (.build builder)))


(defn cfn-route-grpc-route-match-property-builder
  "The cfn-route-grpc-route-match-property-builder function buildes out new instances of 
CfnRoute$GrpcRouteMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metadata` |
| `methodName` | java.lang.String | [[cdk.support/lookup-entry]] | `:method-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (CfnRoute$GrpcRouteMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :metadata)]
      (. builder metadata data))
    (when-let [data (lookup-entry config id :method-name)]
      (. builder methodName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn cfn-route-grpc-route-metadata-match-method-property-builder
  "The cfn-route-grpc-route-metadata-match-method-property-builder function buildes out new instances of 
CfnRoute$GrpcRouteMetadataMatchMethodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.services.appmesh.CfnRoute$MatchRangeProperty | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |"
  [stack id config]
  (let [builder (CfnRoute$GrpcRouteMetadataMatchMethodProperty$Builder.)]
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
    (.build builder)))


(defn cfn-route-grpc-route-metadata-property-builder
  "The cfn-route-grpc-route-metadata-property-builder function buildes out new instances of 
CfnRoute$GrpcRouteMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRoute$GrpcRouteMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :invert)]
      (. builder invert data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-route-grpc-route-property-builder
  "The cfn-route-grpc-route-property-builder function buildes out new instances of 
CfnRoute$GrpcRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRetryPolicyProperty | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnRoute$GrpcRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :retry-policy)]
      (. builder retryPolicy data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-route-grpc-timeout-property-builder
  "The cfn-route-grpc-timeout-property-builder function buildes out new instances of 
CfnRoute$GrpcTimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:per-request` |"
  [stack id config]
  (let [builder (CfnRoute$GrpcTimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (when-let [data (lookup-entry config id :per-request)]
      (. builder perRequest data))
    (.build builder)))


(defn cfn-route-header-match-method-property-builder
  "The cfn-route-header-match-method-property-builder function buildes out new instances of 
CfnRoute$HeaderMatchMethodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `range` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:range` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |"
  [stack id config]
  (let [builder (CfnRoute$HeaderMatchMethodProperty$Builder.)]
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
    (.build builder)))


(defn cfn-route-http-path-match-property-builder
  "The cfn-route-http-path-match-property-builder function buildes out new instances of 
CfnRoute$HttpPathMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |"
  [stack id config]
  (let [builder (CfnRoute$HttpPathMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (.build builder)))


(defn cfn-route-http-query-parameter-match-property-builder
  "The cfn-route-http-query-parameter-match-property-builder function buildes out new instances of 
CfnRoute$HttpQueryParameterMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact` |"
  [stack id config]
  (let [builder (CfnRoute$HttpQueryParameterMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (.build builder)))


(defn cfn-route-http-retry-policy-property-builder
  "The cfn-route-http-retry-policy-property-builder function buildes out new instances of 
CfnRoute$HttpRetryPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `perRetryTimeout` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:per-retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |"
  [stack id config]
  (let [builder (CfnRoute$HttpRetryPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-retry-events)]
      (. builder httpRetryEvents data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :per-retry-timeout)]
      (. builder perRetryTimeout data))
    (when-let [data (lookup-entry config id :tcp-retry-events)]
      (. builder tcpRetryEvents data))
    (.build builder)))


(defn cfn-route-http-route-action-property-builder
  "The cfn-route-http-route-action-property-builder function buildes out new instances of 
CfnRoute$HttpRouteActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weightedTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weighted-targets` |"
  [stack id config]
  (let [builder (CfnRoute$HttpRouteActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :weighted-targets)]
      (. builder weightedTargets data))
    (.build builder)))


(defn cfn-route-http-route-header-property-builder
  "The cfn-route-http-route-header-property-builder function buildes out new instances of 
CfnRoute$HttpRouteHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invert` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invert` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$HeaderMatchMethodProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRoute$HttpRouteHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :invert)]
      (. builder invert data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-route-http-route-match-property-builder
  "The cfn-route-http-route-match-property-builder function buildes out new instances of 
CfnRoute$HttpRouteMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpPathMatchProperty | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `scheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheme` |"
  [stack id config]
  (let [builder (CfnRoute$HttpRouteMatchProperty$Builder.)]
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
    (.build builder)))


(defn cfn-route-http-route-property-builder
  "The cfn-route-http-route-property-builder function buildes out new instances of 
CfnRoute$HttpRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRetryPolicyProperty | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpTimeoutProperty | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnRoute$HttpRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :retry-policy)]
      (. builder retryPolicy data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-route-http-timeout-property-builder
  "The cfn-route-http-timeout-property-builder function buildes out new instances of 
CfnRoute$HttpTimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnRoute$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:per-request` |"
  [stack id config]
  (let [builder (CfnRoute$HttpTimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (when-let [data (lookup-entry config id :per-request)]
      (. builder perRequest data))
    (.build builder)))


(defn cfn-route-match-range-property-builder
  "The cfn-route-match-range-property-builder function buildes out new instances of 
CfnRoute$MatchRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start` |"
  [stack id config]
  (let [builder (CfnRoute$MatchRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (.build builder)))


(defn cfn-route-props-builder
  "The cfn-route-props-builder function buildes out new instances of 
CfnRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnRoute$RouteSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (CfnRouteProps$Builder.)]
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
    (.build builder)))


(defn cfn-route-query-parameter-property-builder
  "The cfn-route-query-parameter-property-builder function buildes out new instances of 
CfnRoute$QueryParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpQueryParameterMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRoute$QueryParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-route-route-spec-property-builder
  "The cfn-route-route-spec-property-builder function buildes out new instances of 
CfnRoute$RouteSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRoute` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-route` |
| `http2Route` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http2-route` |
| `httpRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-route` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tcpRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tcp-route` |"
  [stack id config]
  (let [builder (CfnRoute$RouteSpecProperty$Builder.)]
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
    (.build builder)))


(defn cfn-route-tcp-route-action-property-builder
  "The cfn-route-tcp-route-action-property-builder function buildes out new instances of 
CfnRoute$TcpRouteActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |"
  [stack id config]
  (let [builder (CfnRoute$TcpRouteActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :weighted-targets)]
      (. builder weightedTargets data))
    (.build builder)))


(defn cfn-route-tcp-route-match-property-builder
  "The cfn-route-tcp-route-match-property-builder function buildes out new instances of 
CfnRoute$TcpRouteMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnRoute$TcpRouteMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-route-tcp-route-property-builder
  "The cfn-route-tcp-route-property-builder function buildes out new instances of 
CfnRoute$TcpRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpRouteActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `match` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpRouteMatchProperty | [[cdk.support/lookup-entry]] | `:match` |
| `timeout` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpTimeoutProperty | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnRoute$TcpRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-route-tcp-timeout-property-builder
  "The cfn-route-tcp-timeout-property-builder function buildes out new instances of 
CfnRoute$TcpTimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:idle` |"
  [stack id config]
  (let [builder (CfnRoute$TcpTimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (.build builder)))


(defn cfn-route-weighted-target-property-builder
  "The cfn-route-weighted-target-property-builder function buildes out new instances of 
CfnRoute$WeightedTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `virtualNode` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnRoute$WeightedTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :virtual-node)]
      (. builder virtualNode data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-virtual-gateway-builder
  "The cfn-virtual-gateway-builder function buildes out new instances of 
CfnVirtualGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-virtual-gateway-json-format-ref-property-builder
  "The cfn-virtual-gateway-json-format-ref-property-builder function buildes out new instances of 
CfnVirtualGateway$JsonFormatRefProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$JsonFormatRefProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-virtual-gateway-logging-format-property-builder
  "The cfn-virtual-gateway-logging-format-property-builder function buildes out new instances of 
CfnVirtualGateway$LoggingFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `json` | java.util.List | [[cdk.support/lookup-entry]] | `:json` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$LoggingFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (.build builder)))


(defn cfn-virtual-gateway-props-builder
  "The cfn-virtual-gateway-props-builder function buildes out new instances of 
CfnVirtualGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewaySpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (CfnVirtualGatewayProps$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-gateway-subject-alternative-name-matchers-property-builder
  "The cfn-virtual-gateway-subject-alternative-name-matchers-property-builder function buildes out new instances of 
CfnVirtualGateway$SubjectAlternativeNameMatchersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.util.List | [[cdk.support/lookup-entry]] | `:exact` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$SubjectAlternativeNameMatchersProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (.build builder)))


(defn cfn-virtual-gateway-subject-alternative-names-property-builder
  "The cfn-virtual-gateway-subject-alternative-names-property-builder function buildes out new instances of 
CfnVirtualGateway$SubjectAlternativeNamesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$SubjectAlternativeNamesProperty$Builder.)]
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-access-log-property-builder
  "The cfn-virtual-gateway-virtual-gateway-access-log-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayAccessLogProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayFileAccessLogProperty | [[cdk.support/lookup-entry]] | `:file` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayAccessLogProperty$Builder.)]
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-backend-defaults-property-builder
  "The cfn-virtual-gateway-virtual-gateway-backend-defaults-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayBackendDefaultsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-policy` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayBackendDefaultsProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-policy)]
      (. builder clientPolicy data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-client-policy-property-builder
  "The cfn-virtual-gateway-virtual-gateway-client-policy-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayClientPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayClientPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-client-policy-tls-property-builder
  "The cfn-virtual-gateway-virtual-gateway-client-policy-tls-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayClientPolicyTlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty | [[cdk.support/lookup-entry]] | `:certificate` |
| `enforce` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce` |
| `ports` | java.util.List | [[cdk.support/lookup-entry]] | `:ports` |
| `validation` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayClientPolicyTlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :enforce)]
      (. builder enforce data))
    (when-let [data (lookup-entry config id :ports)]
      (. builder ports data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-client-tls-certificate-property-builder
  "The cfn-virtual-gateway-virtual-gateway-client-tls-certificate-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayClientTlsCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-connection-pool-property-builder
  "The cfn-virtual-gateway-virtual-gateway-connection-pool-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grpc` |
| `http` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http` |
| `http2` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty | [[cdk.support/lookup-entry]] | `:http2` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :grpc)]
      (. builder grpc data))
    (when-let [data (lookup-entry config id :http)]
      (. builder http data))
    (when-let [data (lookup-entry config id :http2)]
      (. builder http2 data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-file-access-log-property-builder
  "The cfn-virtual-gateway-virtual-gateway-file-access-log-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayFileAccessLogProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$LoggingFormatProperty | [[cdk.support/lookup-entry]] | `:format` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayFileAccessLogProperty$Builder.)]
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-grpc-connection-pool-property-builder
  "The cfn-virtual-gateway-virtual-gateway-grpc-connection-pool-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayGrpcConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayGrpcConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-requests)]
      (. builder maxRequests data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-health-check-policy-property-builder
  "The cfn-virtual-gateway-virtual-gateway-health-check-policy-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `intervalMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-millis` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `timeoutMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-millis` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-http-connection-pool-property-builder
  "The cfn-virtual-gateway-virtual-gateway-http-connection-pool-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayHttpConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
| `maxPendingRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-pending-requests` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayHttpConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-connections)]
      (. builder maxConnections data))
    (when-let [data (lookup-entry config id :max-pending-requests)]
      (. builder maxPendingRequests data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-http2-connection-pool-property-builder
  "The cfn-virtual-gateway-virtual-gateway-http2-connection-pool-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayHttp2ConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-requests)]
      (. builder maxRequests data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty | [[cdk.support/lookup-entry]] | `:health-check` |
| `portMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-mapping` |
| `tls` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsProperty | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-pool)]
      (. builder connectionPool data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :port-mapping)]
      (. builder portMapping data))
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-acm-certificate-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-tls-acm-certificate-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-certificate-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-tls-certificate-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerTlsCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsAcmCertificateProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerTlsCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :acm)]
      (. builder acm data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-file-certificate-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-tls-file-certificate-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerTlsFileCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerTlsFileCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-tls-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerTlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `validation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerTlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-sds-certificate-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-tls-sds-certificate-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerTlsSdsCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:trust` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :trust)]
      (. builder trust data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-trust-property-builder
  "The cfn-virtual-gateway-virtual-gateway-listener-tls-validation-context-trust-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayListenerTlsValidationContextTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-logging-property-builder
  "The cfn-virtual-gateway-virtual-gateway-logging-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayLoggingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-log` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayLoggingProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-log)]
      (. builder accessLog data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-port-mapping-property-builder
  "The cfn-virtual-gateway-virtual-gateway-port-mapping-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayPortMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayPortMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-spec-property-builder
  "The cfn-virtual-gateway-virtual-gateway-spec-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewaySpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backendDefaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewaySpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :backend-defaults)]
      (. builder backendDefaults data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-acm-trust-property-builder
  "The cfn-virtual-gateway-virtual-gateway-tls-validation-context-acm-trust-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArns` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-authority-arns` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority-arns)]
      (. builder certificateAuthorityArns data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-file-trust-property-builder
  "The cfn-virtual-gateway-virtual-gateway-tls-validation-context-file-trust-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayTlsValidationContextFileTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayTlsValidationContextFileTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-property-builder
  "The cfn-virtual-gateway-virtual-gateway-tls-validation-context-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:trust` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayTlsValidationContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :trust)]
      (. builder trust data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-sds-trust-property-builder
  "The cfn-virtual-gateway-virtual-gateway-tls-validation-context-sds-trust-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn cfn-virtual-gateway-virtual-gateway-tls-validation-context-trust-property-builder
  "The cfn-virtual-gateway-virtual-gateway-tls-validation-context-trust-property-builder function buildes out new instances of 
CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextAcmTrustProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayTlsValidationContextSdsTrustProperty | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualGateway$VirtualGatewayTlsValidationContextTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :acm)]
      (. builder acm data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-node-access-log-property-builder
  "The cfn-virtual-node-access-log-property-builder function buildes out new instances of 
CfnVirtualNode$AccessLogProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$FileAccessLogProperty | [[cdk.support/lookup-entry]] | `:file` |"
  [stack id config]
  (let [builder (CfnVirtualNode$AccessLogProperty$Builder.)]
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (.build builder)))


(defn cfn-virtual-node-aws-cloud-map-instance-attribute-property-builder
  "The cfn-virtual-node-aws-cloud-map-instance-attribute-property-builder function buildes out new instances of 
CfnVirtualNode$AwsCloudMapInstanceAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnVirtualNode$AwsCloudMapInstanceAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-virtual-node-aws-cloud-map-service-discovery-property-builder
  "The cfn-virtual-node-aws-cloud-map-service-discovery-property-builder function buildes out new instances of 
CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `ipPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-preference` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :ip-preference)]
      (. builder ipPreference data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn cfn-virtual-node-backend-defaults-property-builder
  "The cfn-virtual-node-backend-defaults-property-builder function buildes out new instances of 
CfnVirtualNode$BackendDefaultsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-policy` |"
  [stack id config]
  (let [builder (CfnVirtualNode$BackendDefaultsProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-policy)]
      (. builder clientPolicy data))
    (.build builder)))


(defn cfn-virtual-node-backend-property-builder
  "The cfn-virtual-node-backend-property-builder function buildes out new instances of 
CfnVirtualNode$BackendProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualService` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:virtual-service` |"
  [stack id config]
  (let [builder (CfnVirtualNode$BackendProperty$Builder.)]
    (when-let [data (lookup-entry config id :virtual-service)]
      (. builder virtualService data))
    (.build builder)))


(defn cfn-virtual-node-builder
  "The cfn-virtual-node-builder function buildes out new instances of 
CfnVirtualNode$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |"
  [stack id config]
  (let [builder (CfnVirtualNode$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-virtual-node-client-policy-property-builder
  "The cfn-virtual-node-client-policy-property-builder function buildes out new instances of 
CfnVirtualNode$ClientPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ClientPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn cfn-virtual-node-client-policy-tls-property-builder
  "The cfn-virtual-node-client-policy-tls-property-builder function buildes out new instances of 
CfnVirtualNode$ClientPolicyTlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate` |
| `enforce` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enforce` |
| `ports` | java.util.List | [[cdk.support/lookup-entry]] | `:ports` |
| `validation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ClientPolicyTlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :enforce)]
      (. builder enforce data))
    (when-let [data (lookup-entry config id :ports)]
      (. builder ports data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn cfn-virtual-node-client-tls-certificate-property-builder
  "The cfn-virtual-node-client-tls-certificate-property-builder function buildes out new instances of 
CfnVirtualNode$ClientTlsCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ClientTlsCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-node-dns-service-discovery-property-builder
  "The cfn-virtual-node-dns-service-discovery-property-builder function buildes out new instances of 
CfnVirtualNode$DnsServiceDiscoveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `ipPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-preference` |
| `responseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-type` |"
  [stack id config]
  (let [builder (CfnVirtualNode$DnsServiceDiscoveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :ip-preference)]
      (. builder ipPreference data))
    (when-let [data (lookup-entry config id :response-type)]
      (. builder responseType data))
    (.build builder)))


(defn cfn-virtual-node-duration-property-builder
  "The cfn-virtual-node-duration-property-builder function buildes out new instances of 
CfnVirtualNode$DurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnVirtualNode$DurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-virtual-node-file-access-log-property-builder
  "The cfn-virtual-node-file-access-log-property-builder function buildes out new instances of 
CfnVirtualNode$FileAccessLogProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$LoggingFormatProperty | [[cdk.support/lookup-entry]] | `:format` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnVirtualNode$FileAccessLogProperty$Builder.)]
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-virtual-node-grpc-timeout-property-builder
  "The cfn-virtual-node-grpc-timeout-property-builder function buildes out new instances of 
CfnVirtualNode$GrpcTimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:per-request` |"
  [stack id config]
  (let [builder (CfnVirtualNode$GrpcTimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (when-let [data (lookup-entry config id :per-request)]
      (. builder perRequest data))
    (.build builder)))


(defn cfn-virtual-node-health-check-property-builder
  "The cfn-virtual-node-health-check-property-builder function buildes out new instances of 
CfnVirtualNode$HealthCheckProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `intervalMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-millis` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `timeoutMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-millis` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (CfnVirtualNode$HealthCheckProperty$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-node-http-timeout-property-builder
  "The cfn-virtual-node-http-timeout-property-builder function buildes out new instances of 
CfnVirtualNode$HttpTimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:per-request` |"
  [stack id config]
  (let [builder (CfnVirtualNode$HttpTimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (when-let [data (lookup-entry config id :per-request)]
      (. builder perRequest data))
    (.build builder)))


(defn cfn-virtual-node-json-format-ref-property-builder
  "The cfn-virtual-node-json-format-ref-property-builder function buildes out new instances of 
CfnVirtualNode$JsonFormatRefProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnVirtualNode$JsonFormatRefProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-virtual-node-listener-property-builder
  "The cfn-virtual-node-listener-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$HealthCheckProperty | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$OutlierDetectionProperty | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `portMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-mapping` |
| `timeout` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsProperty | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerProperty$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-node-listener-timeout-property-builder
  "The cfn-virtual-node-listener-timeout-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grpc` |
| `http` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http` |
| `http2` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$HttpTimeoutProperty | [[cdk.support/lookup-entry]] | `:http2` |
| `tcp` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TcpTimeoutProperty | [[cdk.support/lookup-entry]] | `:tcp` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :grpc)]
      (. builder grpc data))
    (when-let [data (lookup-entry config id :http)]
      (. builder http data))
    (when-let [data (lookup-entry config id :http2)]
      (. builder http2 data))
    (when-let [data (lookup-entry config id :tcp)]
      (. builder tcp data))
    (.build builder)))


(defn cfn-virtual-node-listener-tls-acm-certificate-property-builder
  "The cfn-virtual-node-listener-tls-acm-certificate-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTlsAcmCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTlsAcmCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (.build builder)))


(defn cfn-virtual-node-listener-tls-certificate-property-builder
  "The cfn-virtual-node-listener-tls-certificate-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTlsCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsAcmCertificateProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTlsCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :acm)]
      (. builder acm data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-node-listener-tls-file-certificate-property-builder
  "The cfn-virtual-node-listener-tls-file-certificate-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTlsFileCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTlsFileCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (.build builder)))


(defn cfn-virtual-node-listener-tls-property-builder
  "The cfn-virtual-node-listener-tls-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsCertificateProperty | [[cdk.support/lookup-entry]] | `:certificate` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `validation` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsValidationContextProperty | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn cfn-virtual-node-listener-tls-sds-certificate-property-builder
  "The cfn-virtual-node-listener-tls-sds-certificate-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTlsSdsCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTlsSdsCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn cfn-virtual-node-listener-tls-validation-context-property-builder
  "The cfn-virtual-node-listener-tls-validation-context-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTlsValidationContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$SubjectAlternativeNamesProperty | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trust` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTlsValidationContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :trust)]
      (. builder trust data))
    (.build builder)))


(defn cfn-virtual-node-listener-tls-validation-context-trust-property-builder
  "The cfn-virtual-node-listener-tls-validation-context-trust-property-builder function buildes out new instances of 
CfnVirtualNode$ListenerTlsValidationContextTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextFileTrustProperty | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextSdsTrustProperty | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ListenerTlsValidationContextTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-node-logging-format-property-builder
  "The cfn-virtual-node-logging-format-property-builder function buildes out new instances of 
CfnVirtualNode$LoggingFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `json` | java.util.List | [[cdk.support/lookup-entry]] | `:json` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |"
  [stack id config]
  (let [builder (CfnVirtualNode$LoggingFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (.build builder)))


(defn cfn-virtual-node-logging-property-builder
  "The cfn-virtual-node-logging-property-builder function buildes out new instances of 
CfnVirtualNode$LoggingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AccessLogProperty | [[cdk.support/lookup-entry]] | `:access-log` |"
  [stack id config]
  (let [builder (CfnVirtualNode$LoggingProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-log)]
      (. builder accessLog data))
    (.build builder)))


(defn cfn-virtual-node-outlier-detection-property-builder
  "The cfn-virtual-node-outlier-detection-property-builder function buildes out new instances of 
CfnVirtualNode$OutlierDetectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseEjectionDuration` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:base-ejection-duration` |
| `interval` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:interval` |
| `maxEjectionPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ejection-percent` |
| `maxServerErrors` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-server-errors` |"
  [stack id config]
  (let [builder (CfnVirtualNode$OutlierDetectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-ejection-duration)]
      (. builder baseEjectionDuration data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :max-ejection-percent)]
      (. builder maxEjectionPercent data))
    (when-let [data (lookup-entry config id :max-server-errors)]
      (. builder maxServerErrors data))
    (.build builder)))


(defn cfn-virtual-node-port-mapping-property-builder
  "The cfn-virtual-node-port-mapping-property-builder function buildes out new instances of 
CfnVirtualNode$PortMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnVirtualNode$PortMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-virtual-node-props-builder
  "The cfn-virtual-node-props-builder function buildes out new instances of 
CfnVirtualNodeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |"
  [stack id config]
  (let [builder (CfnVirtualNodeProps$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-node-service-discovery-property-builder
  "The cfn-virtual-node-service-discovery-property-builder function buildes out new instances of 
CfnVirtualNode$ServiceDiscoveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsCloudMap` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty | [[cdk.support/lookup-entry]] | `:aws-cloud-map` |
| `dns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns` |"
  [stack id config]
  (let [builder (CfnVirtualNode$ServiceDiscoveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-cloud-map)]
      (. builder awsCloudMap data))
    (when-let [data (lookup-entry config id :dns)]
      (. builder dns data))
    (.build builder)))


(defn cfn-virtual-node-subject-alternative-name-matchers-property-builder
  "The cfn-virtual-node-subject-alternative-name-matchers-property-builder function buildes out new instances of 
CfnVirtualNode$SubjectAlternativeNameMatchersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exact` | java.util.List | [[cdk.support/lookup-entry]] | `:exact` |"
  [stack id config]
  (let [builder (CfnVirtualNode$SubjectAlternativeNameMatchersProperty$Builder.)]
    (when-let [data (lookup-entry config id :exact)]
      (. builder exact data))
    (.build builder)))


(defn cfn-virtual-node-subject-alternative-names-property-builder
  "The cfn-virtual-node-subject-alternative-names-property-builder function buildes out new instances of 
CfnVirtualNode$SubjectAlternativeNamesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match` |"
  [stack id config]
  (let [builder (CfnVirtualNode$SubjectAlternativeNamesProperty$Builder.)]
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (.build builder)))


(defn cfn-virtual-node-tcp-timeout-property-builder
  "The cfn-virtual-node-tcp-timeout-property-builder function buildes out new instances of 
CfnVirtualNode$TcpTimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DurationProperty | [[cdk.support/lookup-entry]] | `:idle` |"
  [stack id config]
  (let [builder (CfnVirtualNode$TcpTimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (.build builder)))


(defn cfn-virtual-node-tls-validation-context-acm-trust-property-builder
  "The cfn-virtual-node-tls-validation-context-acm-trust-property-builder function buildes out new instances of 
CfnVirtualNode$TlsValidationContextAcmTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArns` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-authority-arns` |"
  [stack id config]
  (let [builder (CfnVirtualNode$TlsValidationContextAcmTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority-arns)]
      (. builder certificateAuthorityArns data))
    (.build builder)))


(defn cfn-virtual-node-tls-validation-context-file-trust-property-builder
  "The cfn-virtual-node-tls-validation-context-file-trust-property-builder function buildes out new instances of 
CfnVirtualNode$TlsValidationContextFileTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |"
  [stack id config]
  (let [builder (CfnVirtualNode$TlsValidationContextFileTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (.build builder)))


(defn cfn-virtual-node-tls-validation-context-property-builder
  "The cfn-virtual-node-tls-validation-context-property-builder function buildes out new instances of 
CfnVirtualNode$TlsValidationContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$SubjectAlternativeNamesProperty | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:trust` |"
  [stack id config]
  (let [builder (CfnVirtualNode$TlsValidationContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :trust)]
      (. builder trust data))
    (.build builder)))


(defn cfn-virtual-node-tls-validation-context-sds-trust-property-builder
  "The cfn-virtual-node-tls-validation-context-sds-trust-property-builder function buildes out new instances of 
CfnVirtualNode$TlsValidationContextSdsTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (CfnVirtualNode$TlsValidationContextSdsTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn cfn-virtual-node-tls-validation-context-trust-property-builder
  "The cfn-virtual-node-tls-validation-context-trust-property-builder function buildes out new instances of 
CfnVirtualNode$TlsValidationContextTrustProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acm` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextAcmTrustProperty | [[cdk.support/lookup-entry]] | `:acm` |
| `file` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextFileTrustProperty | [[cdk.support/lookup-entry]] | `:file` |
| `sds` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sds` |"
  [stack id config]
  (let [builder (CfnVirtualNode$TlsValidationContextTrustProperty$Builder.)]
    (when-let [data (lookup-entry config id :acm)]
      (. builder acm data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :sds)]
      (. builder sds data))
    (.build builder)))


(defn cfn-virtual-node-virtual-node-connection-pool-property-builder
  "The cfn-virtual-node-virtual-node-connection-pool-property-builder function buildes out new instances of 
CfnVirtualNode$VirtualNodeConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grpc` |
| `http` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty | [[cdk.support/lookup-entry]] | `:http` |
| `http2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http2` |
| `tcp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tcp` |"
  [stack id config]
  (let [builder (CfnVirtualNode$VirtualNodeConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :grpc)]
      (. builder grpc data))
    (when-let [data (lookup-entry config id :http)]
      (. builder http data))
    (when-let [data (lookup-entry config id :http2)]
      (. builder http2 data))
    (when-let [data (lookup-entry config id :tcp)]
      (. builder tcp data))
    (.build builder)))


(defn cfn-virtual-node-virtual-node-grpc-connection-pool-property-builder
  "The cfn-virtual-node-virtual-node-grpc-connection-pool-property-builder function buildes out new instances of 
CfnVirtualNode$VirtualNodeGrpcConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |"
  [stack id config]
  (let [builder (CfnVirtualNode$VirtualNodeGrpcConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-requests)]
      (. builder maxRequests data))
    (.build builder)))


(defn cfn-virtual-node-virtual-node-http-connection-pool-property-builder
  "The cfn-virtual-node-virtual-node-http-connection-pool-property-builder function buildes out new instances of 
CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
| `maxPendingRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-pending-requests` |"
  [stack id config]
  (let [builder (CfnVirtualNode$VirtualNodeHttpConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-connections)]
      (. builder maxConnections data))
    (when-let [data (lookup-entry config id :max-pending-requests)]
      (. builder maxPendingRequests data))
    (.build builder)))


(defn cfn-virtual-node-virtual-node-http2-connection-pool-property-builder
  "The cfn-virtual-node-virtual-node-http2-connection-pool-property-builder function buildes out new instances of 
CfnVirtualNode$VirtualNodeHttp2ConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |"
  [stack id config]
  (let [builder (CfnVirtualNode$VirtualNodeHttp2ConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-requests)]
      (. builder maxRequests data))
    (.build builder)))


(defn cfn-virtual-node-virtual-node-spec-property-builder
  "The cfn-virtual-node-virtual-node-spec-property-builder function buildes out new instances of 
CfnVirtualNode$VirtualNodeSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backendDefaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
| `serviceDiscovery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-discovery` |"
  [stack id config]
  (let [builder (CfnVirtualNode$VirtualNodeSpecProperty$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-node-virtual-node-tcp-connection-pool-property-builder
  "The cfn-virtual-node-virtual-node-tcp-connection-pool-property-builder function buildes out new instances of 
CfnVirtualNode$VirtualNodeTcpConnectionPoolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |"
  [stack id config]
  (let [builder (CfnVirtualNode$VirtualNodeTcpConnectionPoolProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-connections)]
      (. builder maxConnections data))
    (.build builder)))


(defn cfn-virtual-node-virtual-service-backend-property-builder
  "The cfn-virtual-node-virtual-service-backend-property-builder function buildes out new instances of 
CfnVirtualNode$VirtualServiceBackendProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-policy` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |"
  [stack id config]
  (let [builder (CfnVirtualNode$VirtualServiceBackendProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-policy)]
      (. builder clientPolicy data))
    (when-let [data (lookup-entry config id :virtual-service-name)]
      (. builder virtualServiceName data))
    (.build builder)))


(defn cfn-virtual-router-builder
  "The cfn-virtual-router-builder function buildes out new instances of 
CfnVirtualRouter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (CfnVirtualRouter$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-virtual-router-port-mapping-property-builder
  "The cfn-virtual-router-port-mapping-property-builder function buildes out new instances of 
CfnVirtualRouter$PortMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnVirtualRouter$PortMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-virtual-router-props-builder
  "The cfn-virtual-router-props-builder function buildes out new instances of 
CfnVirtualRouterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualRouter$VirtualRouterSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (CfnVirtualRouterProps$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-router-virtual-router-listener-property-builder
  "The cfn-virtual-router-virtual-router-listener-property-builder function buildes out new instances of 
CfnVirtualRouter$VirtualRouterListenerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `portMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-mapping` |"
  [stack id config]
  (let [builder (CfnVirtualRouter$VirtualRouterListenerProperty$Builder.)]
    (when-let [data (lookup-entry config id :port-mapping)]
      (. builder portMapping data))
    (.build builder)))


(defn cfn-virtual-router-virtual-router-spec-property-builder
  "The cfn-virtual-router-virtual-router-spec-property-builder function buildes out new instances of 
CfnVirtualRouter$VirtualRouterSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:listeners` |"
  [stack id config]
  (let [builder (CfnVirtualRouter$VirtualRouterSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (.build builder)))


(defn cfn-virtual-service-builder
  "The cfn-virtual-service-builder function buildes out new instances of 
CfnVirtualService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualServiceSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |"
  [stack id config]
  (let [builder (CfnVirtualService$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-virtual-service-props-builder
  "The cfn-virtual-service-props-builder function buildes out new instances of 
CfnVirtualServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `meshOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-owner` |
| `spec` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualServiceSpecProperty | [[cdk.support/lookup-entry]] | `:spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |"
  [stack id config]
  (let [builder (CfnVirtualServiceProps$Builder.)]
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
    (.build builder)))


(defn cfn-virtual-service-virtual-node-service-provider-property-builder
  "The cfn-virtual-service-virtual-node-service-provider-property-builder function buildes out new instances of 
CfnVirtualService$VirtualNodeServiceProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |"
  [stack id config]
  (let [builder (CfnVirtualService$VirtualNodeServiceProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :virtual-node-name)]
      (. builder virtualNodeName data))
    (.build builder)))


(defn cfn-virtual-service-virtual-router-service-provider-property-builder
  "The cfn-virtual-service-virtual-router-service-provider-property-builder function buildes out new instances of 
CfnVirtualService$VirtualRouterServiceProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (CfnVirtualService$VirtualRouterServiceProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :virtual-router-name)]
      (. builder virtualRouterName data))
    (.build builder)))


(defn cfn-virtual-service-virtual-service-provider-property-builder
  "The cfn-virtual-service-virtual-service-provider-property-builder function buildes out new instances of 
CfnVirtualService$VirtualServiceProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualNode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:virtual-node` |
| `virtualRouter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:virtual-router` |"
  [stack id config]
  (let [builder (CfnVirtualService$VirtualServiceProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :virtual-node)]
      (. builder virtualNode data))
    (when-let [data (lookup-entry config id :virtual-router)]
      (. builder virtualRouter data))
    (.build builder)))


(defn cfn-virtual-service-virtual-service-spec-property-builder
  "The cfn-virtual-service-virtual-service-spec-property-builder function buildes out new instances of 
CfnVirtualService$VirtualServiceSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider` |"
  [stack id config]
  (let [builder (CfnVirtualService$VirtualServiceSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (.build builder)))


(defn common-gateway-route-spec-options-builder
  "The common-gateway-route-spec-options-builder function buildes out new instances of 
CommonGatewayRouteSpecOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (CommonGatewayRouteSpecOptions$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn gateway-route-attributes-builder
  "The gateway-route-attributes-builder function buildes out new instances of 
GatewayRouteAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `virtualGateway` | software.amazon.awscdk.services.appmesh.IVirtualGateway | [[cdk.support/lookup-entry]] | `:virtual-gateway` |"
  [stack id config]
  (let [builder (GatewayRouteAttributes$Builder.)]
    (when-let [data (lookup-entry config id :gateway-route-name)]
      (. builder gatewayRouteName data))
    (when-let [data (lookup-entry config id :virtual-gateway)]
      (. builder virtualGateway data))
    (.build builder)))


(defn gateway-route-base-props-builder
  "The gateway-route-base-props-builder function buildes out new instances of 
GatewayRouteBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.GatewayRouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |"
  [stack id config]
  (let [builder (GatewayRouteBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :gateway-route-name)]
      (. builder gatewayRouteName data))
    (when-let [data (lookup-entry config id :route-spec)]
      (. builder routeSpec data))
    (.build builder)))


(defn gateway-route-builder
  "The gateway-route-builder function buildes out new instances of 
GatewayRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.GatewayRouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualGateway` | software.amazon.awscdk.services.appmesh.IVirtualGateway | [[cdk.support/lookup-entry]] | `:virtual-gateway` |"
  [stack id config]
  (let [builder (GatewayRoute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :gateway-route-name)]
      (. builder gatewayRouteName data))
    (when-let [data (lookup-entry config id :route-spec)]
      (. builder routeSpec data))
    (when-let [data (lookup-entry config id :virtual-gateway)]
      (. builder virtualGateway data))
    (.build builder)))


(defn gateway-route-hostname-match-config-builder
  "The gateway-route-hostname-match-config-builder function buildes out new instances of 
GatewayRouteHostnameMatchConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostnameMatch` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GatewayRouteHostnameMatchProperty | [[cdk.support/lookup-entry]] | `:hostname-match` |"
  [stack id config]
  (let [builder (GatewayRouteHostnameMatchConfig$Builder.)]
    (when-let [data (lookup-entry config id :hostname-match)]
      (. builder hostnameMatch data))
    (.build builder)))


(defn gateway-route-props-builder
  "The gateway-route-props-builder function buildes out new instances of 
GatewayRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayRouteName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.GatewayRouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualGateway` | software.amazon.awscdk.services.appmesh.IVirtualGateway | [[cdk.support/lookup-entry]] | `:virtual-gateway` |"
  [stack id config]
  (let [builder (GatewayRouteProps$Builder.)]
    (when-let [data (lookup-entry config id :gateway-route-name)]
      (. builder gatewayRouteName data))
    (when-let [data (lookup-entry config id :route-spec)]
      (. builder routeSpec data))
    (when-let [data (lookup-entry config id :virtual-gateway)]
      (. builder virtualGateway data))
    (.build builder)))


(defn gateway-route-spec-config-builder
  "The gateway-route-spec-config-builder function buildes out new instances of 
GatewayRouteSpecConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcSpecConfig` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$GrpcGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-spec-config` |
| `http2SpecConfig` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:http2-spec-config` |
| `httpSpecConfig` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRouteProperty | [[cdk.support/lookup-entry]] | `:http-spec-config` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (GatewayRouteSpecConfig$Builder.)]
    (when-let [data (lookup-entry config id :grpc-spec-config)]
      (. builder grpcSpecConfig data))
    (when-let [data (lookup-entry config id :http2-spec-config)]
      (. builder http2SpecConfig data))
    (when-let [data (lookup-entry config id :http-spec-config)]
      (. builder httpSpecConfig data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn grpc-connection-pool-builder
  "The grpc-connection-pool-builder function buildes out new instances of 
GrpcConnectionPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |"
  [stack id config]
  (let [builder (GrpcConnectionPool$Builder.)]
    (when-let [data (lookup-entry config id :max-requests)]
      (. builder maxRequests data))
    (.build builder)))


(defn grpc-gateway-listener-options-builder
  "The grpc-gateway-listener-options-builder function buildes out new instances of 
GrpcGatewayListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.GrpcConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (GrpcGatewayListenerOptions$Builder.)]
    (when-let [data (lookup-entry config id :connection-pool)]
      (. builder connectionPool data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn grpc-gateway-route-match-builder
  "The grpc-gateway-route-match-builder function buildes out new instances of 
GrpcGatewayRouteMatch$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch | [[cdk.support/lookup-entry]] | `:hostname` |
| `metadata` | java.util.List | [[cdk.support/lookup-entry]] | `:metadata` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `rewriteRequestHostname` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rewrite-request-hostname` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (GrpcGatewayRouteMatch$Builder.)]
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
    (.build builder)))


(defn grpc-gateway-route-spec-options-builder
  "The grpc-gateway-route-spec-options-builder function buildes out new instances of 
GrpcGatewayRouteSpecOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `routeTarget` | software.amazon.awscdk.services.appmesh.IVirtualService | [[cdk.support/lookup-entry]] | `:route-target` |"
  [stack id config]
  (let [builder (GrpcGatewayRouteSpecOptions$Builder.)]
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :route-target)]
      (. builder routeTarget data))
    (.build builder)))


(defn grpc-health-check-options-builder
  "The grpc-health-check-options-builder function buildes out new instances of 
GrpcHealthCheckOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (GrpcHealthCheckOptions$Builder.)]
    (when-let [data (lookup-entry config id :healthy-threshold)]
      (. builder healthyThreshold data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :unhealthy-threshold)]
      (. builder unhealthyThreshold data))
    (.build builder)))


(defn grpc-retry-policy-builder
  "The grpc-retry-policy-builder function buildes out new instances of 
GrpcRetryPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:grpc-retry-events` |
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |"
  [stack id config]
  (let [builder (GrpcRetryPolicy$Builder.)]
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
    (.build builder)))


(defn grpc-route-match-builder
  "The grpc-route-match-builder function buildes out new instances of 
GrpcRouteMatch$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadata` | java.util.List | [[cdk.support/lookup-entry]] | `:metadata` |
| `methodName` | java.lang.String | [[cdk.support/lookup-entry]] | `:method-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (GrpcRouteMatch$Builder.)]
    (when-let [data (lookup-entry config id :metadata)]
      (. builder metadata data))
    (when-let [data (lookup-entry config id :method-name)]
      (. builder methodName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn grpc-route-spec-options-builder
  "The grpc-route-spec-options-builder function buildes out new instances of 
GrpcRouteSpecOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.GrpcRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.GrpcRetryPolicy | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.services.appmesh.GrpcTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |"
  [stack id config]
  (let [builder (GrpcRouteSpecOptions$Builder.)]
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
    (.build builder)))


(defn grpc-timeout-builder
  "The grpc-timeout-builder function buildes out new instances of 
GrpcTimeout$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:per-request` |"
  [stack id config]
  (let [builder (GrpcTimeout$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (when-let [data (lookup-entry config id :per-request)]
      (. builder perRequest data))
    (.build builder)))


(defn grpc-virtual-node-listener-options-builder
  "The grpc-virtual-node-listener-options-builder function buildes out new instances of 
GrpcVirtualNodeListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.GrpcConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.GrpcTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (GrpcVirtualNodeListenerOptions$Builder.)]
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
    (.build builder)))


(defn header-match-config-builder
  "The header-match-config-builder function buildes out new instances of 
HeaderMatchConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerMatch` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteHeaderProperty | [[cdk.support/lookup-entry]] | `:header-match` |"
  [stack id config]
  (let [builder (HeaderMatchConfig$Builder.)]
    (when-let [data (lookup-entry config id :header-match)]
      (. builder headerMatch data))
    (.build builder)))


(defn health-check-bind-options-builder
  "The health-check-bind-options-builder function buildes out new instances of 
HealthCheckBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-port` |"
  [stack id config]
  (let [builder (HealthCheckBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :default-port)]
      (. builder defaultPort data))
    (.build builder)))


(defn health-check-config-builder
  "The health-check-config-builder function buildes out new instances of 
HealthCheckConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualGatewayHealthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayHealthCheckPolicyProperty | [[cdk.support/lookup-entry]] | `:virtual-gateway-health-check` |
| `virtualNodeHealthCheck` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$HealthCheckProperty | [[cdk.support/lookup-entry]] | `:virtual-node-health-check` |"
  [stack id config]
  (let [builder (HealthCheckConfig$Builder.)]
    (when-let [data (lookup-entry config id :virtual-gateway-health-check)]
      (. builder virtualGatewayHealthCheck data))
    (when-let [data (lookup-entry config id :virtual-node-health-check)]
      (. builder virtualNodeHealthCheck data))
    (.build builder)))


(defn http-connection-pool-builder
  "The http-connection-pool-builder function buildes out new instances of 
HttpConnectionPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
| `maxPendingRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-pending-requests` |"
  [stack id config]
  (let [builder (HttpConnectionPool$Builder.)]
    (when-let [data (lookup-entry config id :max-connections)]
      (. builder maxConnections data))
    (when-let [data (lookup-entry config id :max-pending-requests)]
      (. builder maxPendingRequests data))
    (.build builder)))


(defn http-gateway-listener-options-builder
  "The http-gateway-listener-options-builder function buildes out new instances of 
HttpGatewayListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.HttpConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (HttpGatewayListenerOptions$Builder.)]
    (when-let [data (lookup-entry config id :connection-pool)]
      (. builder connectionPool data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn http-gateway-route-match-builder
  "The http-gateway-route-match-builder function buildes out new instances of 
HttpGatewayRouteMatch$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `hostname` | software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch | [[cdk.support/lookup-entry]] | `:hostname` |
| `method` | software.amazon.awscdk.services.appmesh.HttpRouteMethod | [[cdk.api.services.appmesh/http-route-method]] | `:method` |
| `path` | software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `rewriteRequestHostname` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rewrite-request-hostname` |"
  [stack id config]
  (let [builder (HttpGatewayRouteMatch$Builder.)]
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
    (.build builder)))


(defn http-gateway-route-path-match-config-builder
  "The http-gateway-route-path-match-config-builder function buildes out new instances of 
HttpGatewayRoutePathMatchConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefixPathMatch` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-path-match` |
| `prefixPathRewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRoutePrefixRewriteProperty | [[cdk.support/lookup-entry]] | `:prefix-path-rewrite` |
| `wholePathMatch` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpPathMatchProperty | [[cdk.support/lookup-entry]] | `:whole-path-match` |
| `wholePathRewrite` | software.amazon.awscdk.services.appmesh.CfnGatewayRoute$HttpGatewayRoutePathRewriteProperty | [[cdk.support/lookup-entry]] | `:whole-path-rewrite` |"
  [stack id config]
  (let [builder (HttpGatewayRoutePathMatchConfig$Builder.)]
    (when-let [data (lookup-entry config id :prefix-path-match)]
      (. builder prefixPathMatch data))
    (when-let [data (lookup-entry config id :prefix-path-rewrite)]
      (. builder prefixPathRewrite data))
    (when-let [data (lookup-entry config id :whole-path-match)]
      (. builder wholePathMatch data))
    (when-let [data (lookup-entry config id :whole-path-rewrite)]
      (. builder wholePathRewrite data))
    (.build builder)))


(defn http-gateway-route-spec-options-builder
  "The http-gateway-route-spec-options-builder function buildes out new instances of 
HttpGatewayRouteSpecOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `routeTarget` | software.amazon.awscdk.services.appmesh.IVirtualService | [[cdk.support/lookup-entry]] | `:route-target` |"
  [stack id config]
  (let [builder (HttpGatewayRouteSpecOptions$Builder.)]
    (when-let [data (lookup-entry config id :match)]
      (. builder match data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :route-target)]
      (. builder routeTarget data))
    (.build builder)))


(defn http-health-check-options-builder
  "The http-health-check-options-builder function buildes out new instances of 
HttpHealthCheckOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (HttpHealthCheckOptions$Builder.)]
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
    (.build builder)))


(defn http-retry-policy-builder
  "The http-retry-policy-builder function buildes out new instances of 
HttpRetryPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:http-retry-events` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retry-timeout` |
| `tcpRetryEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:tcp-retry-events` |"
  [stack id config]
  (let [builder (HttpRetryPolicy$Builder.)]
    (when-let [data (lookup-entry config id :http-retry-events)]
      (. builder httpRetryEvents data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-timeout)]
      (. builder retryTimeout data))
    (when-let [data (lookup-entry config id :tcp-retry-events)]
      (. builder tcpRetryEvents data))
    (.build builder)))


(defn http-route-match-builder
  "The http-route-match-builder function buildes out new instances of 
HttpRouteMatch$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `method` | software.amazon.awscdk.services.appmesh.HttpRouteMethod | [[cdk.api.services.appmesh/http-route-method]] | `:method` |
| `path` | software.amazon.awscdk.services.appmesh.HttpRoutePathMatch | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.appmesh.HttpRouteProtocol | [[cdk.api.services.appmesh/http-route-protocol]] | `:protocol` |
| `queryParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-parameters` |"
  [stack id config]
  (let [builder (HttpRouteMatch$Builder.)]
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
    (.build builder)))


(defn http-route-path-match-config-builder
  "The http-route-path-match-config-builder function buildes out new instances of 
HttpRoutePathMatchConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefixPathMatch` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-path-match` |
| `wholePathMatch` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpPathMatchProperty | [[cdk.support/lookup-entry]] | `:whole-path-match` |"
  [stack id config]
  (let [builder (HttpRoutePathMatchConfig$Builder.)]
    (when-let [data (lookup-entry config id :prefix-path-match)]
      (. builder prefixPathMatch data))
    (when-let [data (lookup-entry config id :whole-path-match)]
      (. builder wholePathMatch data))
    (.build builder)))


(defn http-route-spec-options-builder
  "The http-route-spec-options-builder function buildes out new instances of 
HttpRouteSpecOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `match` | software.amazon.awscdk.services.appmesh.HttpRouteMatch | [[cdk.support/lookup-entry]] | `:match` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `retryPolicy` | software.amazon.awscdk.services.appmesh.HttpRetryPolicy | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `timeout` | software.amazon.awscdk.services.appmesh.HttpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |"
  [stack id config]
  (let [builder (HttpRouteSpecOptions$Builder.)]
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
    (.build builder)))


(defn http-timeout-builder
  "The http-timeout-builder function buildes out new instances of 
HttpTimeout$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle` |
| `perRequest` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:per-request` |"
  [stack id config]
  (let [builder (HttpTimeout$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (when-let [data (lookup-entry config id :per-request)]
      (. builder perRequest data))
    (.build builder)))


(defn http-virtual-node-listener-options-builder
  "The http-virtual-node-listener-options-builder function buildes out new instances of 
HttpVirtualNodeListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.HttpConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.HttpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (HttpVirtualNodeListenerOptions$Builder.)]
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
    (.build builder)))


(defn http2-connection-pool-builder
  "The http2-connection-pool-builder function buildes out new instances of 
Http2ConnectionPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRequests` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-requests` |"
  [stack id config]
  (let [builder (Http2ConnectionPool$Builder.)]
    (when-let [data (lookup-entry config id :max-requests)]
      (. builder maxRequests data))
    (.build builder)))


(defn http2-gateway-listener-options-builder
  "The http2-gateway-listener-options-builder function buildes out new instances of 
Http2GatewayListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.Http2ConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (Http2GatewayListenerOptions$Builder.)]
    (when-let [data (lookup-entry config id :connection-pool)]
      (. builder connectionPool data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn http2-virtual-node-listener-options-builder
  "The http2-virtual-node-listener-options-builder function buildes out new instances of 
Http2VirtualNodeListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.Http2ConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.HttpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (Http2VirtualNodeListenerOptions$Builder.)]
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
    (.build builder)))


(defn listener-tls-options-builder
  "The listener-tls-options-builder function buildes out new instances of 
ListenerTlsOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.appmesh.TlsCertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `mode` | software.amazon.awscdk.services.appmesh.TlsMode | [[cdk.api.services.appmesh/tls-mode]] | `:mode` |
| `mutualTlsValidation` | software.amazon.awscdk.services.appmesh.MutualTlsValidation | [[cdk.support/lookup-entry]] | `:mutual-tls-validation` |"
  [stack id config]
  (let [builder (ListenerTlsOptions$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (tls-mode config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :mutual-tls-validation)]
      (. builder mutualTlsValidation data))
    (.build builder)))


(defn logging-format-config-builder
  "The logging-format-config-builder function buildes out new instances of 
LoggingFormatConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `formatConfig` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$LoggingFormatProperty | [[cdk.support/lookup-entry]] | `:format-config` |"
  [stack id config]
  (let [builder (LoggingFormatConfig$Builder.)]
    (when-let [data (lookup-entry config id :format-config)]
      (. builder formatConfig data))
    (.build builder)))


(defn mesh-builder
  "The mesh-builder function buildes out new instances of 
Mesh$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressFilter` | software.amazon.awscdk.services.appmesh.MeshFilterType | [[cdk.api.services.appmesh/mesh-filter-type]] | `:egress-filter` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.MeshServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |"
  [stack id config]
  (let [builder (Mesh$Builder/create stack id)]
    (when-let [data (mesh-filter-type config id :egress-filter)]
      (. builder egressFilter data))
    (when-let [data (lookup-entry config id :mesh-name)]
      (. builder meshName data))
    (when-let [data (lookup-entry config id :service-discovery)]
      (. builder serviceDiscovery data))
    (.build builder)))


(defn mesh-props-builder
  "The mesh-props-builder function buildes out new instances of 
MeshProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressFilter` | software.amazon.awscdk.services.appmesh.MeshFilterType | [[cdk.api.services.appmesh/mesh-filter-type]] | `:egress-filter` |
| `meshName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mesh-name` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.MeshServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |"
  [stack id config]
  (let [builder (MeshProps$Builder.)]
    (when-let [data (mesh-filter-type config id :egress-filter)]
      (. builder egressFilter data))
    (when-let [data (lookup-entry config id :mesh-name)]
      (. builder meshName data))
    (when-let [data (lookup-entry config id :service-discovery)]
      (. builder serviceDiscovery data))
    (.build builder)))


(defn mesh-service-discovery-builder
  "The mesh-service-discovery-builder function buildes out new instances of 
MeshServiceDiscovery$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipPreference` | software.amazon.awscdk.services.appmesh.IpPreference | [[cdk.api.services.appmesh/ip-preference]] | `:ip-preference` |"
  [stack id config]
  (let [builder (MeshServiceDiscovery$Builder.)]
    (when-let [data (ip-preference config id :ip-preference)]
      (. builder ipPreference data))
    (.build builder)))


(defn mutual-tls-validation-builder
  "The mutual-tls-validation-builder function buildes out new instances of 
MutualTlsValidation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.SubjectAlternativeNames | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust | [[cdk.support/lookup-entry]] | `:trust` |"
  [stack id config]
  (let [builder (MutualTlsValidation$Builder.)]
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :trust)]
      (. builder trust data))
    (.build builder)))


(defn outlier-detection-builder
  "The outlier-detection-builder function buildes out new instances of 
OutlierDetection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseEjectionDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:base-ejection-duration` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `maxEjectionPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ejection-percent` |
| `maxServerErrors` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-server-errors` |"
  [stack id config]
  (let [builder (OutlierDetection$Builder.)]
    (when-let [data (lookup-entry config id :base-ejection-duration)]
      (. builder baseEjectionDuration data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :max-ejection-percent)]
      (. builder maxEjectionPercent data))
    (when-let [data (lookup-entry config id :max-server-errors)]
      (. builder maxServerErrors data))
    (.build builder)))


(defn query-parameter-match-config-builder
  "The query-parameter-match-config-builder function buildes out new instances of 
QueryParameterMatchConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryParameterMatch` | software.amazon.awscdk.services.appmesh.CfnRoute$QueryParameterProperty | [[cdk.support/lookup-entry]] | `:query-parameter-match` |"
  [stack id config]
  (let [builder (QueryParameterMatchConfig$Builder.)]
    (when-let [data (lookup-entry config id :query-parameter-match)]
      (. builder queryParameterMatch data))
    (.build builder)))


(defn route-attributes-builder
  "The route-attributes-builder function buildes out new instances of 
RouteAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `virtualRouter` | software.amazon.awscdk.services.appmesh.IVirtualRouter | [[cdk.support/lookup-entry]] | `:virtual-router` |"
  [stack id config]
  (let [builder (RouteAttributes$Builder.)]
    (when-let [data (lookup-entry config id :route-name)]
      (. builder routeName data))
    (when-let [data (lookup-entry config id :virtual-router)]
      (. builder virtualRouter data))
    (.build builder)))


(defn route-base-props-builder
  "The route-base-props-builder function buildes out new instances of 
RouteBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.RouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |"
  [stack id config]
  (let [builder (RouteBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :route-name)]
      (. builder routeName data))
    (when-let [data (lookup-entry config id :route-spec)]
      (. builder routeSpec data))
    (.build builder)))


(defn route-builder
  "The route-builder function buildes out new instances of 
Route$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.RouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualRouter` | software.amazon.awscdk.services.appmesh.IVirtualRouter | [[cdk.support/lookup-entry]] | `:virtual-router` |"
  [stack id config]
  (let [builder (Route$Builder/create stack id)]
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :route-name)]
      (. builder routeName data))
    (when-let [data (lookup-entry config id :route-spec)]
      (. builder routeSpec data))
    (when-let [data (lookup-entry config id :virtual-router)]
      (. builder virtualRouter data))
    (.build builder)))


(defn route-props-builder
  "The route-props-builder function buildes out new instances of 
RouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `routeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-name` |
| `routeSpec` | software.amazon.awscdk.services.appmesh.RouteSpec | [[cdk.support/lookup-entry]] | `:route-spec` |
| `virtualRouter` | software.amazon.awscdk.services.appmesh.IVirtualRouter | [[cdk.support/lookup-entry]] | `:virtual-router` |"
  [stack id config]
  (let [builder (RouteProps$Builder.)]
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :route-name)]
      (. builder routeName data))
    (when-let [data (lookup-entry config id :route-spec)]
      (. builder routeSpec data))
    (when-let [data (lookup-entry config id :virtual-router)]
      (. builder virtualRouter data))
    (.build builder)))


(defn route-spec-config-builder
  "The route-spec-config-builder function buildes out new instances of 
RouteSpecConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grpcRouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$GrpcRouteProperty | [[cdk.support/lookup-entry]] | `:grpc-route-spec` |
| `http2RouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteProperty | [[cdk.support/lookup-entry]] | `:http2-route-spec` |
| `httpRouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$HttpRouteProperty | [[cdk.support/lookup-entry]] | `:http-route-spec` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tcpRouteSpec` | software.amazon.awscdk.services.appmesh.CfnRoute$TcpRouteProperty | [[cdk.support/lookup-entry]] | `:tcp-route-spec` |"
  [stack id config]
  (let [builder (RouteSpecConfig$Builder.)]
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
    (.build builder)))


(defn route-spec-options-base-builder
  "The route-spec-options-base-builder function buildes out new instances of 
RouteSpecOptionsBase$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (RouteSpecOptionsBase$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn service-discovery-config-builder
  "The service-discovery-config-builder function buildes out new instances of 
ServiceDiscoveryConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudmap` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$AwsCloudMapServiceDiscoveryProperty | [[cdk.support/lookup-entry]] | `:cloudmap` |
| `dns` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$DnsServiceDiscoveryProperty | [[cdk.support/lookup-entry]] | `:dns` |"
  [stack id config]
  (let [builder (ServiceDiscoveryConfig$Builder.)]
    (when-let [data (lookup-entry config id :cloudmap)]
      (. builder cloudmap data))
    (when-let [data (lookup-entry config id :dns)]
      (. builder dns data))
    (.build builder)))


(defn subject-alternative-names-matcher-config-builder
  "The subject-alternative-names-matcher-config-builder function buildes out new instances of 
SubjectAlternativeNamesMatcherConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNamesMatch` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$SubjectAlternativeNameMatchersProperty | [[cdk.support/lookup-entry]] | `:subject-alternative-names-match` |"
  [stack id config]
  (let [builder (SubjectAlternativeNamesMatcherConfig$Builder.)]
    (when-let [data (lookup-entry config id :subject-alternative-names-match)]
      (. builder subjectAlternativeNamesMatch data))
    (.build builder)))


(defn tcp-connection-pool-builder
  "The tcp-connection-pool-builder function buildes out new instances of 
TcpConnectionPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |"
  [stack id config]
  (let [builder (TcpConnectionPool$Builder.)]
    (when-let [data (lookup-entry config id :max-connections)]
      (. builder maxConnections data))
    (.build builder)))


(defn tcp-health-check-options-builder
  "The tcp-health-check-options-builder function buildes out new instances of 
TcpHealthCheckOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (TcpHealthCheckOptions$Builder.)]
    (when-let [data (lookup-entry config id :healthy-threshold)]
      (. builder healthyThreshold data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :unhealthy-threshold)]
      (. builder unhealthyThreshold data))
    (.build builder)))


(defn tcp-route-spec-options-builder
  "The tcp-route-spec-options-builder function buildes out new instances of 
TcpRouteSpecOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `timeout` | software.amazon.awscdk.services.appmesh.TcpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `weightedTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:weighted-targets` |"
  [stack id config]
  (let [builder (TcpRouteSpecOptions$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :weighted-targets)]
      (. builder weightedTargets data))
    (.build builder)))


(defn tcp-timeout-builder
  "The tcp-timeout-builder function buildes out new instances of 
TcpTimeout$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idle` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle` |"
  [stack id config]
  (let [builder (TcpTimeout$Builder.)]
    (when-let [data (lookup-entry config id :idle)]
      (. builder idle data))
    (.build builder)))


(defn tcp-virtual-node-listener-options-builder
  "The tcp-virtual-node-listener-options-builder function buildes out new instances of 
TcpVirtualNodeListenerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPool` | software.amazon.awscdk.services.appmesh.TcpConnectionPool | [[cdk.support/lookup-entry]] | `:connection-pool` |
| `healthCheck` | software.amazon.awscdk.services.appmesh.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `outlierDetection` | software.amazon.awscdk.services.appmesh.OutlierDetection | [[cdk.support/lookup-entry]] | `:outlier-detection` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `timeout` | software.amazon.awscdk.services.appmesh.TcpTimeout | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.services.appmesh.ListenerTlsOptions | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (TcpVirtualNodeListenerOptions$Builder.)]
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
    (.build builder)))


(defn tls-certificate-config-builder
  "The tls-certificate-config-builder function buildes out new instances of 
TlsCertificateConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsCertificate` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerTlsCertificateProperty | [[cdk.support/lookup-entry]] | `:tls-certificate` |"
  [stack id config]
  (let [builder (TlsCertificateConfig$Builder.)]
    (when-let [data (lookup-entry config id :tls-certificate)]
      (. builder tlsCertificate data))
    (.build builder)))


(defn tls-client-policy-builder
  "The tls-client-policy-builder function buildes out new instances of 
TlsClientPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforce` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce` |
| `mutualTlsCertificate` | software.amazon.awscdk.services.appmesh.MutualTlsCertificate | [[cdk.support/lookup-entry]] | `:mutual-tls-certificate` |
| `ports` | java.util.List | [[cdk.support/lookup-entry]] | `:ports` |
| `validation` | software.amazon.awscdk.services.appmesh.TlsValidation | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (TlsClientPolicy$Builder.)]
    (when-let [data (lookup-entry config id :enforce)]
      (. builder enforce data))
    (when-let [data (lookup-entry config id :mutual-tls-certificate)]
      (. builder mutualTlsCertificate data))
    (when-let [data (lookup-entry config id :ports)]
      (. builder ports data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn tls-validation-builder
  "The tls-validation-builder function buildes out new instances of 
TlsValidation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subjectAlternativeNames` | software.amazon.awscdk.services.appmesh.SubjectAlternativeNames | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `trust` | software.amazon.awscdk.services.appmesh.TlsValidationTrust | [[cdk.support/lookup-entry]] | `:trust` |"
  [stack id config]
  (let [builder (TlsValidation$Builder.)]
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :trust)]
      (. builder trust data))
    (.build builder)))


(defn tls-validation-trust-config-builder
  "The tls-validation-trust-config-builder function buildes out new instances of 
TlsValidationTrustConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsValidationTrust` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$TlsValidationContextTrustProperty | [[cdk.support/lookup-entry]] | `:tls-validation-trust` |"
  [stack id config]
  (let [builder (TlsValidationTrustConfig$Builder.)]
    (when-let [data (lookup-entry config id :tls-validation-trust)]
      (. builder tlsValidationTrust data))
    (.build builder)))


(defn virtual-gateway-attributes-builder
  "The virtual-gateway-attributes-builder function buildes out new instances of 
VirtualGatewayAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (VirtualGatewayAttributes$Builder.)]
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :virtual-gateway-name)]
      (. builder virtualGatewayName data))
    (.build builder)))


(defn virtual-gateway-base-props-builder
  "The virtual-gateway-base-props-builder function buildes out new instances of 
VirtualGatewayBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (VirtualGatewayBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :access-log)]
      (. builder accessLog data))
    (when-let [data (lookup-entry config id :backend-defaults)]
      (. builder backendDefaults data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :virtual-gateway-name)]
      (. builder virtualGatewayName data))
    (.build builder)))


(defn virtual-gateway-builder
  "The virtual-gateway-builder function buildes out new instances of 
VirtualGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (VirtualGateway$Builder/create stack id)]
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
    (.build builder)))


(defn virtual-gateway-listener-config-builder
  "The virtual-gateway-listener-config-builder function buildes out new instances of 
VirtualGatewayListenerConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listener` | software.amazon.awscdk.services.appmesh.CfnVirtualGateway$VirtualGatewayListenerProperty | [[cdk.support/lookup-entry]] | `:listener` |"
  [stack id config]
  (let [builder (VirtualGatewayListenerConfig$Builder.)]
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (.build builder)))


(defn virtual-gateway-props-builder
  "The virtual-gateway-props-builder function buildes out new instances of 
VirtualGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualGatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-gateway-name` |"
  [stack id config]
  (let [builder (VirtualGatewayProps$Builder.)]
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
    (.build builder)))


(defn virtual-node-attributes-builder
  "The virtual-node-attributes-builder function buildes out new instances of 
VirtualNodeAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |"
  [stack id config]
  (let [builder (VirtualNodeAttributes$Builder.)]
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :virtual-node-name)]
      (. builder virtualNodeName data))
    (.build builder)))


(defn virtual-node-base-props-builder
  "The virtual-node-base-props-builder function buildes out new instances of 
VirtualNodeBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | java.util.List | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.ServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |"
  [stack id config]
  (let [builder (VirtualNodeBaseProps$Builder.)]
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
    (.build builder)))


(defn virtual-node-builder
  "The virtual-node-builder function buildes out new instances of 
VirtualNode$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | java.util.List | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.ServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |"
  [stack id config]
  (let [builder (VirtualNode$Builder/create stack id)]
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
    (.build builder)))


(defn virtual-node-listener-config-builder
  "The virtual-node-listener-config-builder function buildes out new instances of 
VirtualNodeListenerConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listener` | software.amazon.awscdk.services.appmesh.CfnVirtualNode$ListenerProperty | [[cdk.support/lookup-entry]] | `:listener` |"
  [stack id config]
  (let [builder (VirtualNodeListenerConfig$Builder.)]
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (.build builder)))


(defn virtual-node-props-builder
  "The virtual-node-props-builder function buildes out new instances of 
VirtualNodeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLog` | software.amazon.awscdk.services.appmesh.AccessLog | [[cdk.support/lookup-entry]] | `:access-log` |
| `backendDefaults` | software.amazon.awscdk.services.appmesh.BackendDefaults | [[cdk.support/lookup-entry]] | `:backend-defaults` |
| `backends` | java.util.List | [[cdk.support/lookup-entry]] | `:backends` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `serviceDiscovery` | software.amazon.awscdk.services.appmesh.ServiceDiscovery | [[cdk.support/lookup-entry]] | `:service-discovery` |
| `virtualNodeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-node-name` |"
  [stack id config]
  (let [builder (VirtualNodeProps$Builder.)]
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
    (.build builder)))


(defn virtual-router-attributes-builder
  "The virtual-router-attributes-builder function buildes out new instances of 
VirtualRouterAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (VirtualRouterAttributes$Builder.)]
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :virtual-router-name)]
      (. builder virtualRouterName data))
    (.build builder)))


(defn virtual-router-base-props-builder
  "The virtual-router-base-props-builder function buildes out new instances of 
VirtualRouterBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (VirtualRouterBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :virtual-router-name)]
      (. builder virtualRouterName data))
    (.build builder)))


(defn virtual-router-builder
  "The virtual-router-builder function buildes out new instances of 
VirtualRouter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (VirtualRouter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :virtual-router-name)]
      (. builder virtualRouterName data))
    (.build builder)))


(defn virtual-router-listener-config-builder
  "The virtual-router-listener-config-builder function buildes out new instances of 
VirtualRouterListenerConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listener` | software.amazon.awscdk.services.appmesh.CfnVirtualRouter$VirtualRouterListenerProperty | [[cdk.support/lookup-entry]] | `:listener` |"
  [stack id config]
  (let [builder (VirtualRouterListenerConfig$Builder.)]
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (.build builder)))


(defn virtual-router-props-builder
  "The virtual-router-props-builder function buildes out new instances of 
VirtualRouterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualRouterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-router-name` |"
  [stack id config]
  (let [builder (VirtualRouterProps$Builder.)]
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :virtual-router-name)]
      (. builder virtualRouterName data))
    (.build builder)))


(defn virtual-service-attributes-builder
  "The virtual-service-attributes-builder function buildes out new instances of 
VirtualServiceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |"
  [stack id config]
  (let [builder (VirtualServiceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :virtual-service-name)]
      (. builder virtualServiceName data))
    (.build builder)))


(defn virtual-service-backend-options-builder
  "The virtual-service-backend-options-builder function buildes out new instances of 
VirtualServiceBackendOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tlsClientPolicy` | software.amazon.awscdk.services.appmesh.TlsClientPolicy | [[cdk.support/lookup-entry]] | `:tls-client-policy` |"
  [stack id config]
  (let [builder (VirtualServiceBackendOptions$Builder.)]
    (when-let [data (lookup-entry config id :tls-client-policy)]
      (. builder tlsClientPolicy data))
    (.build builder)))


(defn virtual-service-builder
  "The virtual-service-builder function buildes out new instances of 
VirtualService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
| `virtualServiceProvider` | software.amazon.awscdk.services.appmesh.VirtualServiceProvider | [[cdk.support/lookup-entry]] | `:virtual-service-provider` |"
  [stack id config]
  (let [builder (VirtualService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :virtual-service-name)]
      (. builder virtualServiceName data))
    (when-let [data (lookup-entry config id :virtual-service-provider)]
      (. builder virtualServiceProvider data))
    (.build builder)))


(defn virtual-service-props-builder
  "The virtual-service-props-builder function buildes out new instances of 
VirtualServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `virtualServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-service-name` |
| `virtualServiceProvider` | software.amazon.awscdk.services.appmesh.VirtualServiceProvider | [[cdk.support/lookup-entry]] | `:virtual-service-provider` |"
  [stack id config]
  (let [builder (VirtualServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :virtual-service-name)]
      (. builder virtualServiceName data))
    (when-let [data (lookup-entry config id :virtual-service-provider)]
      (. builder virtualServiceProvider data))
    (.build builder)))


(defn virtual-service-provider-config-builder
  "The virtual-service-provider-config-builder function buildes out new instances of 
VirtualServiceProviderConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mesh` | software.amazon.awscdk.services.appmesh.IMesh | [[cdk.support/lookup-entry]] | `:mesh` |
| `virtualNodeProvider` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualNodeServiceProviderProperty | [[cdk.support/lookup-entry]] | `:virtual-node-provider` |
| `virtualRouterProvider` | software.amazon.awscdk.services.appmesh.CfnVirtualService$VirtualRouterServiceProviderProperty | [[cdk.support/lookup-entry]] | `:virtual-router-provider` |"
  [stack id config]
  (let [builder (VirtualServiceProviderConfig$Builder.)]
    (when-let [data (lookup-entry config id :mesh)]
      (. builder mesh data))
    (when-let [data (lookup-entry config id :virtual-node-provider)]
      (. builder virtualNodeProvider data))
    (when-let [data (lookup-entry config id :virtual-router-provider)]
      (. builder virtualRouterProvider data))
    (.build builder)))


(defn weighted-target-builder
  "The weighted-target-builder function buildes out new instances of 
WeightedTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `virtualNode` | software.amazon.awscdk.services.appmesh.IVirtualNode | [[cdk.support/lookup-entry]] | `:virtual-node` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (WeightedTarget$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :virtual-node)]
      (. builder virtualNode data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))