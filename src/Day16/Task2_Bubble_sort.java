package Day16;

public class Task2_Bubble_sort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;  // Get the number of elements in the array

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;  // Flag to check if a swap occurred

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {  // Compare adjacent elements
                    // Swap if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;  // Set the flag to true
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  // Example array

        System.out.print("Original array: ");
        printArray(arr);  // Print the original array

        bubbleSort(arr);  // Call the bubble sort method

        System.out.print("Sorted array: ");
        printArray(arr);  // Print the sorted array
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
