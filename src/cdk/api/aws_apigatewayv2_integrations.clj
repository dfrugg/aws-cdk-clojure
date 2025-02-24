(ns cdk.api.aws-apigatewayv2-integrations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.aws_apigatewayv2_integrations package. "
  (:require [cdk.api.services.apigatewayv2 :refer [content-handling
                                                   http-integration-subtype
                                                   http-method
                                                   passthrough-behavior]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.aws_apigatewayv2_integrations HttpAlbIntegration$Builder
                                                                 HttpAlbIntegrationProps$Builder
                                                                 HttpLambdaIntegration$Builder
                                                                 HttpLambdaIntegrationProps$Builder
                                                                 HttpNlbIntegration$Builder
                                                                 HttpNlbIntegrationProps$Builder
                                                                 HttpPrivateIntegrationOptions$Builder
                                                                 HttpServiceDiscoveryIntegration$Builder
                                                                 HttpServiceDiscoveryIntegrationProps$Builder
                                                                 HttpStepFunctionsIntegration$Builder
                                                                 HttpStepFunctionsIntegrationProps$Builder
                                                                 HttpUrlIntegration$Builder
                                                                 HttpUrlIntegrationProps$Builder
                                                                 WebSocketAwsIntegration$Builder
                                                                 WebSocketAwsIntegrationProps$Builder
                                                                 WebSocketLambdaIntegration$Builder
                                                                 WebSocketLambdaIntegrationProps$Builder]))


(defn build-http-alb-integration-builder
  "The build-http-alb-integration-builder function updates a HttpAlbIntegration$Builder instance using the provided configuration.
  The function takes the HttpAlbIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^HttpAlbIntegration$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (lookup-entry config id :vpc-link)]
    (. builder vpcLink data))
  (.build builder))


(defn build-http-alb-integration-props-builder
  "The build-http-alb-integration-props-builder function updates a HttpAlbIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpAlbIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^HttpAlbIntegrationProps$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (lookup-entry config id :vpc-link)]
    (. builder vpcLink data))
  (.build builder))


(defn http-alb-integration-props-builder
  ""
  [id config]
  (build-http-alb-integration-props-builder (new HttpAlbIntegrationProps$Builder) id config))


(defn build-http-lambda-integration-builder
  "The build-http-lambda-integration-builder function updates a HttpLambdaIntegration$Builder instance using the provided configuration.
  The function takes the HttpLambdaIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion | [[cdk.support/lookup-entry]] | `:payload-format-version` |
"
  [^HttpLambdaIntegration$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (.build builder))


(defn build-http-lambda-integration-props-builder
  "The build-http-lambda-integration-props-builder function updates a HttpLambdaIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpLambdaIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion | [[cdk.support/lookup-entry]] | `:payload-format-version` |
"
  [^HttpLambdaIntegrationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (.build builder))


(defn http-lambda-integration-props-builder
  ""
  [id config]
  (build-http-lambda-integration-props-builder (new HttpLambdaIntegrationProps$Builder) id config))


(defn build-http-nlb-integration-builder
  "The build-http-nlb-integration-builder function updates a HttpNlbIntegration$Builder instance using the provided configuration.
  The function takes the HttpNlbIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^HttpNlbIntegration$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (lookup-entry config id :vpc-link)]
    (. builder vpcLink data))
  (.build builder))


(defn build-http-nlb-integration-props-builder
  "The build-http-nlb-integration-props-builder function updates a HttpNlbIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpNlbIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^HttpNlbIntegrationProps$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (lookup-entry config id :vpc-link)]
    (. builder vpcLink data))
  (.build builder))


(defn http-nlb-integration-props-builder
  ""
  [id config]
  (build-http-nlb-integration-props-builder (new HttpNlbIntegrationProps$Builder) id config))


(defn build-http-private-integration-options-builder
  "The build-http-private-integration-options-builder function updates a HttpPrivateIntegrationOptions$Builder instance using the provided configuration.
  The function takes the HttpPrivateIntegrationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^HttpPrivateIntegrationOptions$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (lookup-entry config id :vpc-link)]
    (. builder vpcLink data))
  (.build builder))


(defn http-private-integration-options-builder
  ""
  [id config]
  (build-http-private-integration-options-builder (new HttpPrivateIntegrationOptions$Builder) id config))


(defn build-http-service-discovery-integration-builder
  "The build-http-service-discovery-integration-builder function updates a HttpServiceDiscoveryIntegration$Builder instance using the provided configuration.
  The function takes the HttpServiceDiscoveryIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^HttpServiceDiscoveryIntegration$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (lookup-entry config id :vpc-link)]
    (. builder vpcLink data))
  (.build builder))


(defn build-http-service-discovery-integration-props-builder
  "The build-http-service-discovery-integration-props-builder function updates a HttpServiceDiscoveryIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpServiceDiscoveryIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^HttpServiceDiscoveryIntegrationProps$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (lookup-entry config id :vpc-link)]
    (. builder vpcLink data))
  (.build builder))


(defn http-service-discovery-integration-props-builder
  ""
  [id config]
  (build-http-service-discovery-integration-props-builder (new HttpServiceDiscoveryIntegrationProps$Builder) id config))


(defn build-http-step-functions-integration-builder
  "The build-http-step-functions-integration-builder function updates a HttpStepFunctionsIntegration$Builder instance using the provided configuration.
  The function takes the HttpStepFunctionsIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.StateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `subtype` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype | [[cdk.api.services.apigatewayv2/http-integration-subtype]] | `:subtype` |
"
  [^HttpStepFunctionsIntegration$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :state-machine)]
    (. builder stateMachine data))
  (when-let [data (http-integration-subtype config id :subtype)]
    (. builder subtype data))
  (.build builder))


(defn build-http-step-functions-integration-props-builder
  "The build-http-step-functions-integration-props-builder function updates a HttpStepFunctionsIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpStepFunctionsIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.StateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `subtype` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype | [[cdk.api.services.apigatewayv2/http-integration-subtype]] | `:subtype` |
"
  [^HttpStepFunctionsIntegrationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :state-machine)]
    (. builder stateMachine data))
  (when-let [data (http-integration-subtype config id :subtype)]
    (. builder subtype data))
  (.build builder))


(defn http-step-functions-integration-props-builder
  ""
  [id config]
  (build-http-step-functions-integration-props-builder (new HttpStepFunctionsIntegrationProps$Builder) id config))


(defn build-http-url-integration-builder
  "The build-http-url-integration-builder function updates a HttpUrlIntegration$Builder instance using the provided configuration.
  The function takes the HttpUrlIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
"
  [^HttpUrlIntegration$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (.build builder))


(defn build-http-url-integration-props-builder
  "The build-http-url-integration-props-builder function updates a HttpUrlIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpUrlIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
"
  [^HttpUrlIntegrationProps$Builder builder id config]
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (.build builder))


(defn http-url-integration-props-builder
  ""
  [id config]
  (build-http-url-integration-props-builder (new HttpUrlIntegrationProps$Builder) id config))


(defn build-web-socket-aws-integration-builder
  "The build-web-socket-aws-integration-builder function updates a WebSocketAwsIntegration$Builder instance using the provided configuration.
  The function takes the WebSocketAwsIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-method` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior | [[cdk.api.services.apigatewayv2/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^WebSocketAwsIntegration$Builder builder id config]
  (when-let [data (content-handling config id :content-handling)]
    (. builder contentHandling data))
  (when-let [data (lookup-entry config id :credentials-role)]
    (. builder credentialsRole data))
  (when-let [data (lookup-entry config id :integration-method)]
    (. builder integrationMethod data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (passthrough-behavior config id :passthrough-behavior)]
    (. builder passthroughBehavior data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-templates)]
    (. builder requestTemplates data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn build-web-socket-aws-integration-props-builder
  "The build-web-socket-aws-integration-props-builder function updates a WebSocketAwsIntegrationProps$Builder instance using the provided configuration.
  The function takes the WebSocketAwsIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-method` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior | [[cdk.api.services.apigatewayv2/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^WebSocketAwsIntegrationProps$Builder builder id config]
  (when-let [data (content-handling config id :content-handling)]
    (. builder contentHandling data))
  (when-let [data (lookup-entry config id :credentials-role)]
    (. builder credentialsRole data))
  (when-let [data (lookup-entry config id :integration-method)]
    (. builder integrationMethod data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (passthrough-behavior config id :passthrough-behavior)]
    (. builder passthroughBehavior data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-templates)]
    (. builder requestTemplates data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn web-socket-aws-integration-props-builder
  ""
  [id config]
  (build-web-socket-aws-integration-props-builder (new WebSocketAwsIntegrationProps$Builder) id config))


(defn build-web-socket-lambda-integration-builder
  "The build-web-socket-lambda-integration-builder function updates a WebSocketLambdaIntegration$Builder instance using the provided configuration.
  The function takes the WebSocketLambdaIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^WebSocketLambdaIntegration$Builder builder id config]
  (when-let [data (content-handling config id :content-handling)]
    (. builder contentHandling data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn build-web-socket-lambda-integration-props-builder
  "The build-web-socket-lambda-integration-props-builder function updates a WebSocketLambdaIntegrationProps$Builder instance using the provided configuration.
  The function takes the WebSocketLambdaIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^WebSocketLambdaIntegrationProps$Builder builder id config]
  (when-let [data (content-handling config id :content-handling)]
    (. builder contentHandling data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn web-socket-lambda-integration-props-builder
  ""
  [id config]
  (build-web-socket-lambda-integration-props-builder (new WebSocketLambdaIntegrationProps$Builder) id config))