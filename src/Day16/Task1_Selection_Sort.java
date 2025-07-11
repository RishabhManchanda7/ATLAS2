package Day16;

public class Task1_Selection_Sort {

    public static void selectionSort(int[] array) {
        int n = array.length;  // Get the number of elements in the array

        for (int i = 0; i < n - 1; i++) {  // Iterate over each element in the array
            int minIndex = i;  // Assume the minimum is the first element in the unsorted part

            for (int j = i + 1; j < n; j++) {  // Iterate through the unsorted part
                if (array[j] < array[minIndex]) {  // Find the smallest element
                    minIndex = j;  // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);  // Call the selection sort method

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

