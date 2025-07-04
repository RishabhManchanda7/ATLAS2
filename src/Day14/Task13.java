package Day14;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " "); // Print the current term
            int next = first + second; // Calculate the next term
            first = second; // Update first to the second term
            second = next; // Update second to the next term
        }

        scanner.close();
    }
}
