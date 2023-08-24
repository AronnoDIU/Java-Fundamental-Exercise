package SortingProblems;

import java.util.Scanner;

// Java Program to sort an elements by bringing Arrays into playground.
public class SortingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the Array Size from the user.
        System.out.println("\nEnter the size of the Array::\n");

        // Initialize the ArraySize;
        int arraySize = 0;

        if (scanner.hasNextInt()) {
            arraySize = scanner.nextInt();
        }

        // Initialized the Array's Size using user input.
        int[] array = new int[arraySize];

        // Take user Elements for the given ArraySize
        System.out.println("\nEnter the Elements of the Array\n");
        for (int i = 0; i < arraySize; i++) {
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            }
        }

        // Printing the Array's that are given from user input
        System.out.println("\nThe Elements of the given Array are:: \n");
        for (int i = 0; i < arraySize; i++) {

            // The Print Statements of The Array
            System.out.print(array[i] + " ");
        }


        // Sorting the given Array of Elements from the user.

        System.out.println("\n\nArray's Before Sorting\n");
        for (int j : array) {
            System.out.print(j + " ");
        }

        // Outer loop for sorting the Array
        for (int i = 0; i < array.length; i++) {

            //Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking Array Elements
                if (array[j] < array[i]) {

                    // Swapping the Higher Elements to last
                    int temporaryValue = array[i];
                    array[i] = array[j];
                    array[j] = temporaryValue;
                }
            }
//            System.out.print(array[i]);
        }
        System.out.println("\n\nArray's After Sorting\n");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

/*Expected Output::

Enter the size of the Array::

5

Enter the Elements of the Array

8
9
4
6
1

The Elements of the given Array are::

8 9 4 6 1

Array's Before Sorting

8 9 4 6 1

Array's After Sorting

1 4 6 8 9

 * */
