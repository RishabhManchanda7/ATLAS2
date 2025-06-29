package Day13;
import java.util.HashMap;

public class Task19_LoadFactor {

        public static void main(String[] args) {
            // Create a HashMap with an initial capacity of 10 and a load factor of 0.75
            float loadFactor = 0.75f;
            HashMap<String, Integer> map = new HashMap<>(10, loadFactor);

            // Add entries to the HashMap
            map.put("Alice", 30);
            map.put("Bob", 25);
            map.put("Charlie", 35);
            map.put("Diana", 28);

            // Print the HashMap
            System.out.println("HashMap contents: " + map);

            // Check the size of the HashMap
            System.out.println("Current size: " + map.size());

            // Adding more entries to demonstrate resizing
            map.put("Eva", 22);
            map.put("Frank", 40);

            // Print the updated HashMap
            System.out.println("Updated HashMap contents: " + map);
            System.out.println("Updated size: " + map.size());
        }
    }


