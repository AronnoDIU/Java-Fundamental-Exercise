package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Examples:
 * <p>
 * Input: List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
 * Output: List = [1, 10, 2, 3, 4, 5]
 * <p>
 * Input: List = ["G", "e", "e", "k", "s"]
 * Output: List = ["G", "e", "k", "s"]
 * <p>
 * Using Iterator
 * <p>
 * Approach:
 * Get the ArrayList with duplicate values.
 * Create another ArrayList.
 * Traverse through the first arraylist and store the first appearance of each
 * element into the second arraylist using contains() method.
 * The second ArrayList contains the elements with duplicates removed.
 */
public class RemoveDuplicatesArrayList {
    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<>();

        // Traverse through the first list
        for (T EnhancedList : list) {

            // If this EnhancedList is not present in newList, then add it
            if (!newList.contains(EnhancedList)) {
                newList.add(EnhancedList);
            }
        }

        // return the new list
        return newList;
    }

    public static void main(String[] args) {
        // Get the ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}

/*Expected Output:

ArrayList with duplicates: [1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5]
ArrayList with duplicates removed: [1, 10, 2, 3, 4, 5]

* */