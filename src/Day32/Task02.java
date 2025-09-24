package Day32;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Loading data to table simulation");
        
        // Simulate employee data
        String[][] employees = {
            {"1001", "John Doe", "123 Main St"},
            {"1002", "Jane Smith", "456 Oak Ave"},
            {"1003", "Bob Johnson", "789 Pine Rd"}
        };
        
        String tableName = "Employees02";
        
        try {
            for (String[] emp : employees) {
                Map<String, String> item = new HashMap<>();
                item.put("ID", emp[0]);
                item.put("Name", emp[1]);
                item.put("Address", emp[2]);
                
                // Simulate DynamoDB put operation
                System.out.println("Inserting to " + tableName + ": ID=" + emp[0] + 
                                 " ***** Name=" + emp[1] + " $$$ Address=" + emp[2]);
            }
            
            System.out.println("Data loading completed successfully!");
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}