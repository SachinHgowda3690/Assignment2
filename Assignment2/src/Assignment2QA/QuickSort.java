package Assignment2QA;

public class QuickSort {

    // This method sorts an array using the Quick Sort algorithm
    public static void quickSort(int[] arr, int low, int high) {
        // If there's more than one element in the array
        if (low < high) {
            // Find where to split the array into two parts
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the left and right parts of the array
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // This method helps find the correct position for a chosen pivot in the array
    public static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high];
        
        // Index of the smaller element
        int i = low - 1;

        // Iterate through the array
        // Move elements smaller than the pivot to the left
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot (arr[high]) with the element at arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the position where the pivot is now placed
        return i + 1;
    }

    // This method prints the elements of an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // The main method where the program starts
    public static void main(String[] args) {
        // An example array to be sorted
        int[] myArray = {10, 7, 8, 9, 1, 5};
        int n = myArray.length;

        // Print the original array
        System.out.println("Original array:");
        printArray(myArray);

        // Sort the array using Quick Sort
        quickSort(myArray, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted array using Quick Sort:");
        printArray(myArray);
    }
}
