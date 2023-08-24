package SortingProblems;

// Java Program to sort an elements
// by bringing Arrays into play
public class SortingEx {
    public static void main(String[] args) {
        // Custom input array
        int[] array = {4, 3, 2, 1};

        // Outer loop
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                int temporaryValue = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temporaryValue = array[i];
                    array[i] = array[j];
                    array[j] = temporaryValue;
                }
            }

            // Printing sorted array elements
            System.out.print(array[i] + " ");
//            System.out.println("\nSorted Array Elements");
        }
    }
}

/*Expected Output::

1 2 3 4

 * */
