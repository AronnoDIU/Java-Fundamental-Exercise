package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Using LinkedHashSet
 * <p>
 * A better way (both time complexity and ease of implementation wise) is to
 * remove duplicates from an ArrayList is to convert it into a Set that does
 * not allow duplicates. Hence, LinkedHashSet is the best option available as
 * this does not allow duplicates as well it preserves the insertion order.
 * <p>
 * Approach:
 * Get the ArrayList with duplicate values.
 * Create a LinkedHashSet from this ArrayList. This will remove the duplicates
 * Convert this LinkedHashSet back to Arraylist.
 * The second ArrayList contains the elements with duplicates removed.
 */
public class RemoveDuplicatesArrayListEx2 {
    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        // Create a new LinkedHashSet

        // Add the elements to set
        Set<T> set = new LinkedHashSet<>(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }

    public static void main(String[] args) {
        // Get the ArrayList with duplicate values
        ArrayList<Integer>
                list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}

/*Expected Output:

ArrayList with duplicates: [1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5]
ArrayList with duplicates removed: [1, 10, 2, 3, 4, 5]


* */