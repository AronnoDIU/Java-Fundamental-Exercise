package SortingProblems;

public class BubbleSortEx1 {
    static void bubbleSort(int[] arrays) {
        int number = arrays.length;
        int temporaryValue = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 1; j < (number - i); j++) {
                if (arrays[j - 1] > arrays[j]) {
                    //swap elements
                    temporaryValue = arrays[j - 1];
                    arrays[j - 1] = arrays[j];
                    arrays[j] = temporaryValue;
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] arrays = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int j : arrays) {
            System.out.print(j + " ");
        }
        System.out.println();

        bubbleSort(arrays);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int j : arrays) {
            System.out.print(j + " ");
        }
    }
}

/*
Expected Output::

Array Before Bubble Sort
3 60 35 2 45 320 5
Array After Bubble Sort
2 3 5 35 45 60 320

* */
