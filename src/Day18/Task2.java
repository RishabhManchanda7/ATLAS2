package Day18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a 6-digit number: ");
        String number = scanner.nextLine();

        // Validate input
        if (number.length() != 6 || !number.matches("\\d+")) {
            System.out.println("Please enter a valid 6-digit number.");
            scanner.close();
            return;
        }

        // Display results
        System.out.println("Units digit is " + number.charAt(5));
        System.out.println("Tens digit is " + number.charAt(4));
        System.out.println("Hundreds digit is " + number.charAt(3));
        System.out.println("Thousands digit is " + number.charAt(2));
        System.out.println("10 thousands digit is " + number.charAt(1));
        System.out.println("Lakhs digit is " + number.charAt(0));

        scanner.close();
    }
}