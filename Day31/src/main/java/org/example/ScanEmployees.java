package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ScanRequest;
import software.amazon.awssdk.services.dynamodb.model.ScanResponse;

import java.net.URI;
import java.util.List;
import java.util.Map;

public class ScanEmployees {
    public static void main(String[] args) {
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeaccess", "fakeaccess");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8002"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        String tableName = "Employees04";

        Map<String, AttributeValue> lastKey = null;
        do {
            ScanRequest.Builder req = ScanRequest.builder()
                    .tableName(tableName)
                    .limit(50);
            if (lastKey != null) {
                req.exclusiveStartKey(lastKey);
            }

            ScanResponse resp = client.scan(req.build());
            printItems(resp.items());
            lastKey = resp.lastEvaluatedKey().isEmpty() ? null : resp.lastEvaluatedKey();
        } while (lastKey != null);

        client.close();
    }

    private static void printItems(List<Map<String, AttributeValue>> items) {
        for (Map<String, AttributeValue> item : items) {
            String id = item.getOrDefault("ID", AttributeValue.builder().n("").build()).n();
            String name = item.getOrDefault("Name", AttributeValue.builder().s("").build()).s();
            String address = item.getOrDefault("Address", AttributeValue.builder().s("").build()).s();
            System.out.println("ID=" + id + ", Name=" + name + ", Address=" + address);
        }
    }
}