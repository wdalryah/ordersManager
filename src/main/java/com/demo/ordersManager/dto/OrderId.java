package com.demo.ordersManager.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderId{

    @DynamoDBHashKey
    private String id;

    @DynamoDBRangeKey
    private LocalDateTime creationDate;

}
