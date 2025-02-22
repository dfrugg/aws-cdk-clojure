(ns cdk.api.services.ssm-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ssm package. "
  (:require [cdk.api.services.ssm :refer [parameter-data-type
                                          parameter-tier
                                          parameter-value-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.ssm ParameterDataType
                                                ParameterTier
                                                ParameterValueType]))


(deftest parameter-data-type-test
  (testing "Testing enum function parameter-data-type"
    (is (= ParameterDataType/TEXT (parameter-data-type {:item ParameterDataType/TEXT} "test" :item)))
    (is (= ParameterDataType/TEXT (parameter-data-type {:test/item ParameterDataType/TEXT} "test" :item)))
    (is (= ParameterDataType/AWS_EC2_IMAGE (parameter-data-type {:item ParameterDataType/AWS_EC2_IMAGE} "test" :item)))
    (is (= ParameterDataType/AWS_EC2_IMAGE (parameter-data-type {:test/item ParameterDataType/AWS_EC2_IMAGE} "test" :item)))
    (is (= ParameterDataType/TEXT (parameter-data-type {:item :text} "test" :item)))
    (is (= ParameterDataType/TEXT (parameter-data-type {:test/item :text} "test" :item)))
    (is (= ParameterDataType/AWS_EC2_IMAGE (parameter-data-type {:item :aws-ec2-image} "test" :item)))
    (is (= ParameterDataType/AWS_EC2_IMAGE (parameter-data-type {:test/item :aws-ec2-image} "test" :item)))))


(deftest parameter-tier-test
  (testing "Testing enum function parameter-tier"
    (is (= ParameterTier/STANDARD (parameter-tier {:item ParameterTier/STANDARD} "test" :item)))
    (is (= ParameterTier/STANDARD (parameter-tier {:test/item ParameterTier/STANDARD} "test" :item)))
    (is (= ParameterTier/INTELLIGENT_TIERING (parameter-tier {:item ParameterTier/INTELLIGENT_TIERING} "test" :item)))
    (is (= ParameterTier/INTELLIGENT_TIERING (parameter-tier {:test/item ParameterTier/INTELLIGENT_TIERING} "test" :item)))
    (is (= ParameterTier/ADVANCED (parameter-tier {:item ParameterTier/ADVANCED} "test" :item)))
    (is (= ParameterTier/ADVANCED (parameter-tier {:test/item ParameterTier/ADVANCED} "test" :item)))
    (is (= ParameterTier/STANDARD (parameter-tier {:item :standard} "test" :item)))
    (is (= ParameterTier/STANDARD (parameter-tier {:test/item :standard} "test" :item)))
    (is (= ParameterTier/INTELLIGENT_TIERING (parameter-tier {:item :intelligent-tiering} "test" :item)))
    (is (= ParameterTier/INTELLIGENT_TIERING (parameter-tier {:test/item :intelligent-tiering} "test" :item)))
    (is (= ParameterTier/ADVANCED (parameter-tier {:item :advanced} "test" :item)))
    (is (= ParameterTier/ADVANCED (parameter-tier {:test/item :advanced} "test" :item)))))


(deftest parameter-value-type-test
  (testing "Testing enum function parameter-value-type"
    (is (= ParameterValueType/AWS_EC2_VOLUME_ID (parameter-value-type {:item ParameterValueType/AWS_EC2_VOLUME_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_VOLUME_ID (parameter-value-type {:test/item ParameterValueType/AWS_EC2_VOLUME_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SUBNET_ID (parameter-value-type {:item ParameterValueType/AWS_EC2_SUBNET_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SUBNET_ID (parameter-value-type {:test/item ParameterValueType/AWS_EC2_SUBNET_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_INSTANCE_ID (parameter-value-type {:item ParameterValueType/AWS_EC2_INSTANCE_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_INSTANCE_ID (parameter-value-type {:test/item ParameterValueType/AWS_EC2_INSTANCE_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_VPC_ID (parameter-value-type {:item ParameterValueType/AWS_EC2_VPC_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_VPC_ID (parameter-value-type {:test/item ParameterValueType/AWS_EC2_VPC_ID} "test" :item)))
    (is (= ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID (parameter-value-type {:item ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID} "test" :item)))
    (is (= ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID (parameter-value-type {:test/item ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME (parameter-value-type {:item ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME (parameter-value-type {:test/item ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_ID (parameter-value-type {:item ParameterValueType/AWS_EC2_SECURITYGROUP_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_ID (parameter-value-type {:test/item ParameterValueType/AWS_EC2_SECURITYGROUP_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_IMAGE_ID (parameter-value-type {:item ParameterValueType/AWS_EC2_IMAGE_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_IMAGE_ID (parameter-value-type {:test/item ParameterValueType/AWS_EC2_IMAGE_ID} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME (parameter-value-type {:item ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME (parameter-value-type {:test/item ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME} "test" :item)))
    (is (= ParameterValueType/STRING (parameter-value-type {:item ParameterValueType/STRING} "test" :item)))
    (is (= ParameterValueType/STRING (parameter-value-type {:test/item ParameterValueType/STRING} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME (parameter-value-type {:item ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME (parameter-value-type {:test/item ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_VOLUME_ID (parameter-value-type {:item :aws-ec2-volume-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_VOLUME_ID (parameter-value-type {:test/item :aws-ec2-volume-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SUBNET_ID (parameter-value-type {:item :aws-ec2-subnet-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SUBNET_ID (parameter-value-type {:test/item :aws-ec2-subnet-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_INSTANCE_ID (parameter-value-type {:item :aws-ec2-instance-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_INSTANCE_ID (parameter-value-type {:test/item :aws-ec2-instance-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_VPC_ID (parameter-value-type {:item :aws-ec2-vpc-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_VPC_ID (parameter-value-type {:test/item :aws-ec2-vpc-id} "test" :item)))
    (is (= ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID (parameter-value-type {:item :aws-route53-hostedzone-id} "test" :item)))
    (is (= ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID (parameter-value-type {:test/item :aws-route53-hostedzone-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME (parameter-value-type {:item :aws-ec2-securitygroup-groupname} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME (parameter-value-type {:test/item :aws-ec2-securitygroup-groupname} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_ID (parameter-value-type {:item :aws-ec2-securitygroup-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_SECURITYGROUP_ID (parameter-value-type {:test/item :aws-ec2-securitygroup-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_IMAGE_ID (parameter-value-type {:item :aws-ec2-image-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_IMAGE_ID (parameter-value-type {:test/item :aws-ec2-image-id} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME (parameter-value-type {:item :aws-ec2-availabilityzone-name} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME (parameter-value-type {:test/item :aws-ec2-availabilityzone-name} "test" :item)))
    (is (= ParameterValueType/STRING (parameter-value-type {:item :string} "test" :item)))
    (is (= ParameterValueType/STRING (parameter-value-type {:test/item :string} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME (parameter-value-type {:item :aws-ec2-keypair-keyname} "test" :item)))
    (is (= ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME (parameter-value-type {:test/item :aws-ec2-keypair-keyname} "test" :item)))))