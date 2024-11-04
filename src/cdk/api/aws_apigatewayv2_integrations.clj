(ns cdk.api.aws-apigatewayv2-integrations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.aws_apigatewayv2_integrations package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.apigatewayv2 :refer [content-handling
                                                   http-integration-subtype
                                                   http-method
                                                   passthrough-behavior]])
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


(defn http-alb-integration-builder
  "The http-alb-integration-builder function buildes out new instances of 
HttpAlbIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config ^software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener listener]
  (let [builder (HttpAlbIntegration$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener listener)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :secure-server-name)]
      (. builder secureServerName data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn http-alb-integration-props-builder
  "The http-alb-integration-props-builder function buildes out new instances of 
HttpAlbIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (HttpAlbIntegrationProps$Builder.)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :secure-server-name)]
      (. builder secureServerName data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn http-lambda-integration-builder
  "The http-lambda-integration-builder function buildes out new instances of 
HttpLambdaIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion | [[cdk.support/lookup-entry]] | `:payload-format-version` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (HttpLambdaIntegration$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :payload-format-version)]
      (. builder payloadFormatVersion data))
    (.build builder)))


(defn http-lambda-integration-props-builder
  "The http-lambda-integration-props-builder function buildes out new instances of 
HttpLambdaIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion | [[cdk.support/lookup-entry]] | `:payload-format-version` |"
  [stack id config]
  (let [builder (HttpLambdaIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :payload-format-version)]
      (. builder payloadFormatVersion data))
    (.build builder)))


(defn http-nlb-integration-builder
  "The http-nlb-integration-builder function buildes out new instances of 
HttpNlbIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config ^software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener listener]
  (let [builder (HttpNlbIntegration$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener listener)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :secure-server-name)]
      (. builder secureServerName data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn http-nlb-integration-props-builder
  "The http-nlb-integration-props-builder function buildes out new instances of 
HttpNlbIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (HttpNlbIntegrationProps$Builder.)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :secure-server-name)]
      (. builder secureServerName data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn http-private-integration-options-builder
  "The http-private-integration-options-builder function buildes out new instances of 
HttpPrivateIntegrationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (HttpPrivateIntegrationOptions$Builder.)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :secure-server-name)]
      (. builder secureServerName data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn http-service-discovery-integration-builder
  "The http-service-discovery-integration-builder function buildes out new instances of 
HttpServiceDiscoveryIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config ^software.amazon.awscdk.services.servicediscovery.IService service]
  (let [builder (HttpServiceDiscoveryIntegration$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.servicediscovery.IService service)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :secure-server-name)]
      (. builder secureServerName data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn http-service-discovery-integration-props-builder
  "The http-service-discovery-integration-props-builder function buildes out new instances of 
HttpServiceDiscoveryIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `vpcLink` | software.amazon.awscdk.services.apigatewayv2.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (HttpServiceDiscoveryIntegrationProps$Builder.)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :secure-server-name)]
      (. builder secureServerName data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn http-step-functions-integration-builder
  "The http-step-functions-integration-builder function buildes out new instances of 
HttpStepFunctionsIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.StateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `subtype` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype | [[cdk.api.services.apigatewayv2/http-integration-subtype]] | `:subtype` |"
  [stack id config]
  (let [builder (HttpStepFunctionsIntegration$Builder/create ^java.lang.String id)]
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (http-integration-subtype config id :subtype)]
      (. builder subtype data))
    (.build builder)))


(defn http-step-functions-integration-props-builder
  "The http-step-functions-integration-props-builder function buildes out new instances of 
HttpStepFunctionsIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.StateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `subtype` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype | [[cdk.api.services.apigatewayv2/http-integration-subtype]] | `:subtype` |"
  [stack id config]
  (let [builder (HttpStepFunctionsIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (http-integration-subtype config id :subtype)]
      (. builder subtype data))
    (.build builder)))


(defn http-url-integration-builder
  "The http-url-integration-builder function buildes out new instances of 
HttpUrlIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |"
  [stack id config ^java.lang.String url]
  (let [builder (HttpUrlIntegration$Builder/create ^java.lang.String id ^java.lang.String url)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (.build builder)))


(defn http-url-integration-props-builder
  "The http-url-integration-props-builder function buildes out new instances of 
HttpUrlIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |"
  [stack id config]
  (let [builder (HttpUrlIntegrationProps$Builder.)]
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :parameter-mapping)]
      (. builder parameterMapping data))
    (.build builder)))


(defn web-socket-aws-integration-builder
  "The web-socket-aws-integration-builder function buildes out new instances of 
WebSocketAwsIntegration$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (WebSocketAwsIntegration$Builder/create ^java.lang.String id)]
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
    (.build builder)))


(defn web-socket-aws-integration-props-builder
  "The web-socket-aws-integration-props-builder function buildes out new instances of 
WebSocketAwsIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (WebSocketAwsIntegrationProps$Builder.)]
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
    (.build builder)))


(defn web-socket-lambda-integration-builder
  "The web-socket-lambda-integration-builder function buildes out new instances of 
WebSocketLambdaIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (WebSocketLambdaIntegration$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn web-socket-lambda-integration-props-builder
  "The web-socket-lambda-integration-props-builder function buildes out new instances of 
WebSocketLambdaIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (WebSocketLambdaIntegrationProps$Builder.)]
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))