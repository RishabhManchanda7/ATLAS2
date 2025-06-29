package Day13;

import java.util.LinkedList;


public class Task11 {

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
        // Convert LinkedList to array
        Object[] array = list.toArray();
        // Display the array using Arrays.toString()
        System.out.println("List elements as array:");
        System.out.println(java.util.Arrays.toString(array));
        // Alternative: Print each element without using loops (one-by-one)
        System.out.println("\nList elements (direct access):");
        if (array.length > 0) System.out.println(array[0]);
        if (array.length > 1) System.out.println(array[1]);
        if (array.length > 2) System.out.println(array[2]);
        if (array.length > 3) System.out.println(array[3]);
        // And so on for more elements...
    }
}

