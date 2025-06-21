package Day11filehandling;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Task016 {
    public static void main(String[] args) {
        // Create an ArrayList and add some numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        // Filter the odd numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        // Display the odd numbers
        System.out.println("Odd numbers: " + oddNumbers);
    }
}