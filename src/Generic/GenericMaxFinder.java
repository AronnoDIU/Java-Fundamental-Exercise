package Generic;

public class GenericMaxFinder {

    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"apple", "orange", "banana", "pear"};

        Integer maxInteger = findMax(integers);
        String maxString = findMax(strings);

        System.out.println("Max Integer: " + maxInteger);
        System.out.println("Max String: " + maxString);
    }
}

/* Expected Output:
Max Integer: 5
Max String: pear
*/