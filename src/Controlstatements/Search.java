package ControlStatements;

// Search an Array using for-each Style for.
public class Search {

    public static void main(String[] args) {

        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int value = 5;
        boolean found = false;

        // use for-each style for to search an array

        for (int x : nums) {
            if (x == value) {
                found = true;
                break;
            }
//			System.out.println(found);
        }
//		if (found)
//			System.out.println("Value found!");
        System.out.println(found);
    }
}

/*Expected Output::

true

* */