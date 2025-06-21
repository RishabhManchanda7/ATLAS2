package Day11filehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Task017 {
    public static void main(String[] args) {
        // Create an ArrayList and add some numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);


                List<Integer> RemovDups= numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Display the odd numbers
        System.out.println("Remove : " + RemovDups);
    }
}
