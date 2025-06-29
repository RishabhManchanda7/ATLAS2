package Day13;
import java.util.LinkedList;

public class Task12_clonedlist {
    public static void main(String[] args) {
        // Create original LinkedList
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

    // Clone the LinkedList
    LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();

    // Display both lists
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List:   " + clonedList);

    // Modify original list
        originalList.add("Dragonfruit");
        System.out.println("\nAfter modifying original list:");
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List:   " + clonedList);
    // Modify cloned list

        clonedList.add("Elderberry");
        System.out.println("\nAfter modifying cloned list:");
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List:   " + clonedList);
    // Verify equality

        //System.out.println("\nVerification:");
//        System.out.println("Are they the same object? " + (originalList == clonedList));
//        System.out.println("Do they have same content? " + originalList.equals(clonedList));
}
}