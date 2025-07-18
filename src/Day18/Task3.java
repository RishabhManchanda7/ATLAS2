package Day18;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert to positive if negative
        number = Math.abs(number);

        // Count digits
        int digits = 1;
        while (number >= 10) {
            number /= 10;
            digits++;
        }

        System.out.println("It's a " + digits + " digit number");

        scanner.close();
    }
}