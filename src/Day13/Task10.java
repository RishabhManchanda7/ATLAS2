package Day13;

import java.util.LinkedList;

public class Task10 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("45");
        list.add("56");
        list.add("87");
        list.set(1, "23");

        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("Removed last element: " + list.removeLast());
        // Display the LinkedList without loops (Method 1)
        System.out.println("All Items (using LinkedList.toString()):");
        System.out.println(list);
        // Display the LinkedList without loops (Method 2 - Converting to Array)
        System.out.println("All Items (Converting to Array):");
        System.out.println(java.util.Arrays.toString(list.toArray()));
    }
}

