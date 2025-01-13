package Generic;

import SortingProblems.ComplexNumberSort;

public class GenericSorter<T extends Comparable<T>> {

    public void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        GenericSorter<ComplexNumberSort> sorter = new GenericSorter<>();
        ComplexNumberSort[] numbers = {
                new ComplexNumberSort(4, 5),
                new ComplexNumberSort(2, 3),
                new ComplexNumberSort(1, 1),
                new ComplexNumberSort(3, 4)
        };

        sorter.bubbleSort(numbers);

        System.out.println("Sorted complex numbers in ascending order:");
        for (ComplexNumberSort number : numbers) {
            System.out.println(number);
        }
    }
}
