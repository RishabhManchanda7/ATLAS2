package Day16;

public class Task3_Insertion_Sort {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;  // Get the number of elements in the array

        // Iterate through each element starting from the second element
        for (int i = 1; i < n; i++) {
            int key = array[i];  // The element to be inserted
            int j = i - 1;  // Index of the last sorted element

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];  // Shift element to the right
                j--;  // Move to the next element
            }
            array[j + 1] = key;  // Insert the key at the correct position
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  // Example array

        System.out.print("Original array: ");
        printArray(arr);  // Print the original array

        insertionSort(arr);  // Call the insertion sort method

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
