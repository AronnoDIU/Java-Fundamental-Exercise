package ArraysProblems;

import java.util.Arrays;

// Java program to demonstrate working of
// sort() method of Arrays class

// Importing Arrays class from java.util package

public class ArraySorting {
    public static void main(String[] args) {
        // Custom input array
        int[] array = {13, 7, 6, 45, 21, 9, 101, 102};

        // Calling the sort() method present
        // inside Arrays class
        Arrays.sort(array);

//        Time Complexity: O(N log N)
//        Auxiliary Space: O(1)

        // Printing and display sorted array
        System.out.printf("Modified array[] : %s", Arrays.toString(array));
    }
}

/*
Expected Output::

Modified array[] : [6, 7, 9, 13, 21, 45, 101, 102]

* */
