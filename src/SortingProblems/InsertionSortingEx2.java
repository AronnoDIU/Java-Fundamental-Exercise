package SortingProblems;

public class InsertionSortingEx2 {
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 3, 1, 2};

        // Insertion Sorting
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while (j >= 0 && currentElement < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            // Placement

            array[j+1] = currentElement;
        }
        System.out.println("Sorted Arrays");

        printArray(array);
    }
}

/*
Expected Output::

Sorted Arrays
1 2 3 7 8

* */
