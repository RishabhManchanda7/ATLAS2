package Day12;

import java.util.Scanner;

public class Task8 {       // reverse string code

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Reverse the string
        String reversedName = reverseString(name);

        // Display the reversed name
        System.out.println("Reversed Name: " + reversedName);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse the string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

