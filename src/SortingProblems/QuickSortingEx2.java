package SortingProblems;

public class QuickSortingEx2 {
    // A utility function to swap two elements
    public static void swap(int[] Arrays, int i, int j) {
        int temp = Arrays[i];
        Arrays[i] = Arrays[j];
        Arrays[j] = temp;
    }

    // places the pivot element at its correct position in sorted array,
    // and places all smaller to left of pivot and all greater elements to right of pivot
    static int partition(int[] Arrays, int firstIndex, int lastIndex) {
        // Choosing the pivotElement
        int pivotElement = Arrays[lastIndex];  // Takes last Elements of Pivot.

        // Index of smaller element and indicates
        // the right position of pivotElement found so far
        int findEmptySpace = (firstIndex - 1);

        for (int j = firstIndex; j <= lastIndex - 1; j++) {

            // If current element is smaller than the pivotElement
            if (Arrays[j] < pivotElement) {

                // Increment index of smaller element
                findEmptySpace++;
                swap(Arrays, findEmptySpace, j);
            }
        }
        swap(Arrays, findEmptySpace + 1, lastIndex);
        return (findEmptySpace + 1);
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
        for (int EnhancedArrays : Arrays) {
            System.out.print(EnhancedArrays + " ");
        }
    }
    public static void main(String[] args) {
        int[] Arrays = { 10, 7, 8, 9, 1, 5 };
        int ArraySize = Arrays.length;

        // Function call
        quickSort(Arrays, 0, ArraySize - 1);
        System.out.println("Sorted Arrays:");
        printSortedArray(Arrays);
    }
}

/*Expected Output::

Sorted Arrays:
1 5 7 8 9 10

* */
