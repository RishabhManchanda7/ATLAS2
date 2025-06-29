package Day13;
import java.util.HashMap;

public class Task17_Hashcapacity {


        public static void main(String[] args) {
            // Create a HashMap with initial capacity of 10
            HashMap<String, Integer> map = new HashMap<>(10);

            // Add elements
            map.put("Apple", 10);
            map.put("Banana", 20);
            map.put("Orange", 30);
            map.put("Mango", 40);

            // Print the map
            System.out.println("HashMap contents: " + map);

            // Get a value
            System.out.println("Quantity of Bananas: " + map.get("Banana"));

            // Check if key exists
            System.out.println("Contains 'Grapes'? " + map.containsKey("Grapes"));

            // Remove an item
            map.remove("Orange");
            System.out.println("After removing Orange: " + map);

            // Size of map
            System.out.println("Number of items: " + map.size());
        }
}
