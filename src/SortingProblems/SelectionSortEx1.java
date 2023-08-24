package SortingProblems;

public class SelectionSortEx1 {
    public void selectionSort(int[] array) {
        int number = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < number - 1; i++) {
            // Find the minimum element in unsorted array
            int minimumIndex = i;
            for (int j = i + 1; j < number; j++)
                if (array[j] < array[minimumIndex])
                    minimumIndex = j;

            // Swap the found minimum element with the first element.
            int temporaryValue = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temporaryValue;
        }
    }

    // Prints the array
    void printArray(int[] array) {
//        int number = array.length;
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String[] args) {
        SelectionSortEx1 selectionSortEx1 = new SelectionSortEx1();
        int[] array = {64, 25, 12, 22, 11};
        selectionSortEx1.selectionSort(array);
        System.out.println("Sorted Array");
        selectionSortEx1.printArray(array);
    }
}

/*
Expected Output::

Sorted Array
11 12 22 25 64

* */
