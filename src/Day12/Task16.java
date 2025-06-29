package Day12;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task16 {

    // HashMap will take null value

    public static void main(String[] args) {
        // Use HashMap instead of Hashtable
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Anitha", null);
        hm.put("Kavitha", 102);
        hm.put("Meera", 103);
        hm.put("null", 104);
        hm.put("Ajay", 105);

        // Use get method of HashMap
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println("\n synchronized map");
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

        synchronizedMap.put("Anitha1", null);
        synchronizedMap.put("Kavitha", 102);
        synchronizedMap.put("Meera", 103);
        synchronizedMap.put("null", 104);
        synchronizedMap.put("Ajay", 105);

        // Use the synchronized map
        synchronized (synchronizedMap) { // Synchronize access to the map during iteration
            for (Map.Entry<String, Integer> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}




