package Generic;

public class GenericArrays {
    private static <E> void printArray(E[] Arrays) {
        // Display array elements
        for (E element : Arrays) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Three"};
        printArray(strings);

        Integer[] integers = {1, 2, 3};
        printArray(integers);
    }
}

/*Expected Output:

One Two Three
1 2 3

* */