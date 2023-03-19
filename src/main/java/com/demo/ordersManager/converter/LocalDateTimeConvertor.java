package com.demo.ordersManager.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import java.time.LocalDateTime;

public class LocalDateTimeConvertor  implements DynamoDBTypeConverter<String, LocalDateTime> {

        @Override
        public String convert(LocalDateTime date) {
            return date.toString();
        }

        @Override
        public LocalDateTime unconvert(final String stringValue) {
            return LocalDateTime.parse(stringValue);
        }

}
