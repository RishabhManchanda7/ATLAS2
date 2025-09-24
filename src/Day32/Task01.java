package Day32;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Creating table in DynamoDB simulation");
        
        String tableName = "Employees02";
        String keyAttribute = "ID";
        String keyType = "Number";
        
        try {
            // Simulate table creation
            System.out.println("Table Configuration:");
            System.out.println("- Table Name: " + tableName);
            System.out.println("- Primary Key: " + keyAttribute + " (" + keyType + ")");
            System.out.println("- Read Capacity: 5 units");
            System.out.println("- Write Capacity: 5 units");

            Thread.sleep(1000); // Simulate processing time
            System.out.println(tableName + " table is created successfully!");
            
        } catch (Exception ex) {
            System.out.println("Error creating table: " + ex.getMessage());
        }
    }
}