import java.util.stream.Stream;

public class Task019 {
    public static void main(String[] args) {
        // Print original stream (1-20)
        System.out.println("Original stream:");
        Stream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(System.out::println);

        // Print skipped stream (16-20)
        System.out.println("\nSkipped stream:");
        Stream.iterate(1, n -> n + 1)
                .limit(20)
                .skip(15)
                .forEach(System.out::println);
    }
}
