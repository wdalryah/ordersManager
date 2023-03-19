package com.demo.ordersManager.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@DynamoDBTable(tableName = "organization")
public class Organization {

    @Id
    private OrganizationId id;
    private String officeId;

}
