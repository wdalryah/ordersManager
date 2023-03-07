package com.demo.ordersManager.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Order")
public class Order {

    private String id;
    private Organization organization;
    private DataList dataList;
}
