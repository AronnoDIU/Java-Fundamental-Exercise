package SortingProblems;

public class BubbleSortingEx2 {
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 3, 1, 2};

        System.out.println("Array Before Bubble Sort");
        for (int j : array) {
            System.out.print(j + " ");
        }

        // Bubble Sorting
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temporaryValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaryValue;
                }
            }
        }
        System.out.println("\n\nArray After Bubble Sort");
        printArray(array);
    }
}

/*
Expected Output

Array Before Bubble Sort
7 8 3 1 2

Array After Bubble Sort
1 2 3 7 8

* */
