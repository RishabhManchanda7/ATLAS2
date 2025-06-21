package Day11filehandling;

import java.util.stream.Stream;

public class Task018 {
    public static void main(String[] args) {
        // Create a stream that generates numbers from 1 to 20
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);

        // Display only the first 10 numbers from the stream
        nums.limit(10)
                .forEach(System.out::println);
    }
}
