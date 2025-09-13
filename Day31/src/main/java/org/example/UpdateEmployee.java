package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;
import java.util.Map;

public class UpdateEmployee {
    private static DynamoDbClient client() {
        return DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8002"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(
                        AwsBasicCredentials.create("fakeaccess", "fakeaccess")))
                .build();
    }

    public static void main(String[] args) {
        String tableName = "Employees04";
        String newName = "Alice Updated";
        String newAddress = "New Address, Hyderabad";
        String id = "101";

        try (DynamoDbClient ddb = client()) {
            // 1) Update attributes
            UpdateItemRequest updateReq = UpdateItemRequest.builder()
                    .tableName(tableName)
                    .key(Map.of("ID", AttributeValue.builder().n(id).build()))
                    .updateExpression("SET #n = :name, #a = :addr")
                    .expressionAttributeNames(Map.of(
                            "#n", "Name",
                            "#a", "Address"
                    ))
                    .expressionAttributeValues(Map.of(
                            ":name", AttributeValue.builder().s(newName).build(),
                            ":addr", AttributeValue.builder().s(newAddress).build()
                    ))

                    .returnValues(ReturnValue.UPDATED_NEW)
                    .build();

            UpdateItemResponse updateResp = ddb.updateItem(updateReq);
            System.out.println("Updated: " + updateResp.attributes());

            // 2) to verify
            GetItemResponse getResp = ddb.getItem(GetItemRequest.builder()
                    .tableName(tableName)
                    .key(Map.of("ID", AttributeValue.builder().n(id).build()))
                    .build());

            if (getResp.hasItem()) {
                System.out.println("After update: " + getResp.item());
            } else {
                System.out.println("Item not found");
            }
        }
    }
}