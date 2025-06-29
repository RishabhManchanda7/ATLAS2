package Day13;
import java.util.LinkedList;
import java.util.Spliterator;

public class Task14_Spliterator {

        public static void main(String[] args) {
            // Create a LinkedList and add some elements
            LinkedList<String> list = new LinkedList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
            list.add("Date");
            list.add("Elderberry");

            // Create a Spliterator for the LinkedList
            Spliterator<String> spliterator = list.spliterator();

            // Display the number of elements
            System.out.println("Number of elements: " + spliterator.estimateSize());

            // Use the Spliterator to traverse the elements
            System.out.println("Elements in the LinkedList:");
            spliterator.forEachRemaining(System.out::println);

            // Alternatively, you can split the Spliterator
            Spliterator<String> secondHalf = spliterator.trySplit();

            // Display elements from the second half
            System.out.println("\nElements from the second half:");
            if (secondHalf != null) {
                secondHalf.forEachRemaining(System.out::println);
            }
        }
    }
