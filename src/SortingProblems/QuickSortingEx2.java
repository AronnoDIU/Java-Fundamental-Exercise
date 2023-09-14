package SortingProblems;

public class QuickSortingEx2 {
    // A utility function to swap two elements
    static void swap(int[] Arrays, int i, int j) {
        int temp = Arrays[i];
        Arrays[i] = Arrays[j];
        Arrays[j] = temp;
    }

    // This function
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] Arrays, int low, int high) {
        // Choosing the pivot
        int pivot = Arrays[high];  // Takes last Elements of Pivot.

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (Arrays[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(Arrays, i, j);
            }
        }
        swap(Arrays, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // Arrays[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] Arrays, int low, int high) {
        if (low < high) {

            // pi is partitioning index, Arrays[p]
            // is now at right place
            int pi = partition(Arrays, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(Arrays, low, pi - 1);
            quickSort(Arrays, pi + 1, high);
        }
    }
    // To print sorted array
    public static void printSortedArray(int[] Arrays) {
        for (int j : Arrays) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] Arrays = { 10, 7, 8, 9, 1, 5 };
        int ArraySize = Arrays.length;

        // Function call
        quickSort(Arrays, 0, ArraySize - 1);
        System.out.println("Sorted array:");
        printSortedArray(Arrays);
    }
}
