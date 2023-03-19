package com.demo.ordersManager.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import lombok.Data;

@Data
public class OrganizationId {

    @DynamoDBHashKey
    private String id;
    @DynamoDBRangeKey
    private String userId;

}
