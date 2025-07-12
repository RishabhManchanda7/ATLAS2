package Day16;

public class Task12_Merge_Sort {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int mid = arr.length / 2;

        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Fill left subarray
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        // Fill right subarray
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursive calls
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare and merge elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right array if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Utility method to print array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task12_Merge_Sort sorter = new Task12_Merge_Sort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        sorter.printArray(arr);

        sorter.mergeSort(arr);

        System.out.println("Sorted array:");
        sorter.printArray(arr);
    }
}