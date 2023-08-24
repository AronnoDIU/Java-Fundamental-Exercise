package SortingProblems;

public class SelectionSortingEx2 {
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 3, 1, 2};

        // Selection Sorting
        for (int i = 0; i < array.length-1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallestIndex] > array[j]) {
                    smallestIndex = j;
                }
            }
            int temporaryValue = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temporaryValue;
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
