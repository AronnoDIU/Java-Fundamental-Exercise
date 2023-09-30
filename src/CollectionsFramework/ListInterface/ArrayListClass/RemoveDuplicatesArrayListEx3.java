package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Using Java 8 Stream.distinct()
 * <p>
 * You can use the distinct() method from the Stream API. The distinct()
 * method returns a new Stream without duplicates elements based on the
 * result returned by equals() method, which can be used for further
 * processing. The actual processing of a Stream pipeline starts only
 * after calling terminal methods like forEach() or collect().
 * <p>
 * Approach:
 * <p>
 * Get the ArrayList with duplicate values.
 * Create a new List from this ArrayList.
 * Using Stream().distinct() method which returns distinct object stream.
 * Convert this object stream into List
 */
public class RemoveDuplicatesArrayListEx3 {
    public static void main(String[] args) {
        // input list with duplicates
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Construct a new list from the set constructed from elements
        // of the original list
        List<Integer> newList = list.stream().distinct().toList();

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }
}

/*Expected Output:

ArrayList with duplicates: [1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5]
ArrayList with duplicates removed: [1, 10, 2, 3, 4, 5]

* */