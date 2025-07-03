import java.util.HashMap;
import java.util.Map;

public class Task012_HashTable {

    // HashMap will take null value

    public static void main(String[] args) {
        // Use HashMap instead of Hashtable
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Anitha", null);
        hm.put("Kavitha", 102);
        hm.put("Meera", 103);

        // Use get method of HashMap
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
