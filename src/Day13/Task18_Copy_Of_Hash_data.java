package Day13;
import java.util.HashMap;

public class Task18_Copy_Of_Hash_data {

        public static void main(String[] args) {
            // Create the first HashMap and add some entries
            HashMap<String, Integer> hm1 = new HashMap<>();
            hm1.put("Alice", 30);
            hm1.put("Bob", 25);
            hm1.put("Charlie", 35);

            // Print the original HashMap
            System.out.println("Original HashMap (hm1): " + hm1);

            // Copy data from hm1 to a new HashMap (hm2)
            HashMap<String, Integer> hm2 = new HashMap<>(hm1);

            // Print the copied HashMap
            System.out.println("Copied HashMap (hm2): " + hm2);

            // Verify that both maps are independent
            // Modify hm2 and show that hm1 remains unchanged
            hm2.put("Diana", 28);
            System.out.println("After adding to hm2:");
            System.out.println("hm1: " + hm1);
            System.out.println("hm2: " + hm2);
        }
    }


