package Day33;

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import com.amazon.dax.client.dynamodbv2.AmazonDaxClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static <AttributeValue, PutItemRequest, GetItemRequest> void main(String[] args) {
        String daxEndpoint = "daxs://daxcluster01.ee3lf0.dax-clusters.ap-south-1.amazonaws.com";

        AmazonDynamoDB daxClient = AmazonDaxClientBuilder.standard()
                .withRegion("ap-south-1")
                .withEndpointConfiguration(daxEndpoint)
                .build();

        String tableName = "Employees01";
        String KeyName = "ID";
        String KeyValue = "10001";

        Map<String, AttributeValue> item = new HashMap<>();
        item.put(KeyName, new AttributeValue().withS(KeyValue));
        item.put("msg", new AttributeValue().withS("we are creating DAX"));

        PutItemRequest request = new PutItemRequest()
                .withTableName(tableName)
                .withItem(item);

        try {
            daxClient.putItem(request);
        } catch (Exception e) {
            System.out.println("Put failed: " + e.getMessage());
        }

        Map<String, AttributeValue> getItem = new HashMap<>();
        getItem.put(KeyName, new AttributeValue().withS(KeyValue));

        GetItemRequest getRequest = new GetItemRequest()
                .withTableName(tableName)
                .withKey(getItem);

        try {
            GetItemResult response = daxClient.getItem(getRequest);
            if (response.getItem() != null) {
                System.out.println("Item retrieved: " + response.getItem());
            }
            System.out.println("DAX working..");
        } catch (Exception e) {
            System.out.println("Get failed: " + e.getMessage());
        }
        daxClient.shutdown();
    }
}