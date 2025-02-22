(ns cdk.api.aws-apigatewayv2-authorizers-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.aws_apigatewayv2_authorizers package. "
  (:require [cdk.api.aws-apigatewayv2-authorizers :refer [http-lambda-response-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.aws_apigatewayv2_authorizers HttpLambdaResponseType]))


(deftest http-lambda-response-type-test
  (testing "Testing enum function http-lambda-response-type"
    (is (= HttpLambdaResponseType/SIMPLE (http-lambda-response-type {:item HttpLambdaResponseType/SIMPLE} "test" :item)))
    (is (= HttpLambdaResponseType/SIMPLE (http-lambda-response-type {:test/item HttpLambdaResponseType/SIMPLE} "test" :item)))
    (is (= HttpLambdaResponseType/IAM (http-lambda-response-type {:item HttpLambdaResponseType/IAM} "test" :item)))
    (is (= HttpLambdaResponseType/IAM (http-lambda-response-type {:test/item HttpLambdaResponseType/IAM} "test" :item)))
    (is (= HttpLambdaResponseType/SIMPLE (http-lambda-response-type {:item :simple} "test" :item)))
    (is (= HttpLambdaResponseType/SIMPLE (http-lambda-response-type {:test/item :simple} "test" :item)))
    (is (= HttpLambdaResponseType/IAM (http-lambda-response-type {:item :iam} "test" :item)))
    (is (= HttpLambdaResponseType/IAM (http-lambda-response-type {:test/item :iam} "test" :item)))))