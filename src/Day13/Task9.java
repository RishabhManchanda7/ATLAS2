package Day13;

import java.util.LinkedList;

public class Task9 {

        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("11");
            list.add("22");
            list.add("33");
            list.add("45");
            list.add("56");
            list.add("87");
            list.set(1, "23");
            // Remove first and last elements
            System.out.println("Removed first element: " + list.removeFirst());
            System.out.println("Removed last element: " + list.removeLast());
            // Display all items using a for loop with get method
            System.out.println("All Items (using for loop with get method):");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            // Display all items using a for-each loop
            System.out.println("All Items (using for-each loop):");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }



