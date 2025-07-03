package Day12;

public class Task7 {
    public static void main(String[] args) {
        // Create an array of numbers from 11.50 to 11.54
        double[] numbers = {11.50, 11.51, 11.52, 11.53, 11.54};

        // Reverse the array
        reverseArray(numbers);

        // Display the reversed array
        System.out.print("Reversed Array: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Method to reverse the array
    public static void reverseArray(double[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements
            double temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}
