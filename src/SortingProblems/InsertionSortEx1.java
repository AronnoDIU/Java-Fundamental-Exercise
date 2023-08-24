package SortingProblems;

// Java program for implementation of Insertion Sort

public class InsertionSortEx1 {
    /*Function to sort array using insertion sort*/
    void sort(int[] array) {
        int number = array.length;
        for (int i = 1; i < number; ++i) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of array[0..i-1], that are greater than key, to one position ahead
        of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int[] array) {
//        int number = array.length;
        for (int j : array) System.out.print(j + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        InsertionSortEx1 insertionSortEx1 = new InsertionSortEx1();
        insertionSortEx1.sort(array);

        System.out.println("Sorted Arrays");

        printArray(array);
    }
}

/*
Expected Output::

Sorted Arrays
5 6 11 12 13

* */
