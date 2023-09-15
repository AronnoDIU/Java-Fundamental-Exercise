package SortingProblems;


/*Two terms
    1. Pivot
    2. Partition

How does QuickSort work?
    The key process in quickSort is a partition(). The target of partitions is to place
    the pivot (any element can be chosen to be a pivot) at its correct position
    in the sorted array and put all smaller elements to the left of the pivot,
    and all greater elements to the right of the pivot.

Partition is done recursively on each side of the pivot after the pivot is placed
in its correct position and this finally sorts the array.

Choice of Pivot:
    There are many different choices for picking pivots.

        a) Random Element (Pick a random element as a pivot.)
        b) Median Element (Pick the middle element as the pivot.)
        c) First Element (Always pick the first element as a pivot.)
        d) Last Element (Always pick the last element as a pivot (as implemented below))
* */
/*Partition Algorithm:

    The logic is simple, we start from the leftmost element and keep track of the index
    of smaller (or equal) elements as i. While traversing, if we find a smaller element,
    we swap the current element with arr[i]. Otherwise, we ignore the current element.*/
public class QuickSortEx1 {
    public static int partition(int[] array, int firstIndex, int lastIndex) {
        int pivotElement = array[lastIndex]; // Pick the last element as a Pivot

        // Find Empty space to store smaller Elements of Pivot Element.
        int findEmptySpace = firstIndex - 1;

        // Now Traverse the given Arrays
        for (int j = firstIndex; j < lastIndex; j++) {
            if (array[j] < pivotElement) {
                findEmptySpace++; //Find Empty space to store smaller Elements.

                // Swapping between Smaller Elements with Bigger Elements
                int temporaryElement = array[findEmptySpace];
                array[findEmptySpace] = array[j];
                array[j] = temporaryElement;
            }
        }
        findEmptySpace++;

        int temporaryValue = array[findEmptySpace];
        array[findEmptySpace] = pivotElement;
        array[lastIndex] = temporaryValue;

        return findEmptySpace;  // Pivot original Index
    }

    public static void quickSort(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int pivotIndex = partition(array, firstIndex, lastIndex);

            quickSort(array, firstIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, lastIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 3, 9, 5, 2, 8};
        int arraySize = array.length;

        quickSort(array, 0, arraySize - 1);

        // Print the desire sorted value
        System.out.println("Sorted Arrays:");
        for (int EnhancedArraysPrinted : array) {
            System.out.print(EnhancedArraysPrinted + " ");
        }
    }
}

/*Expected Output::

Sorted Arrays:
2 3 5 6 8 9

* */
