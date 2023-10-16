package CollectionsFramework.MapInterface;

// Sorting a HashMap according to keys in Java

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * We are given the details of marks scored by students in the form of a HashMap,
 * where the name of the student is the Key and the marks scored is the Value.
 * Our task is to sort the map according to the key values, i.e.,
 * the names of the students in the alphabetical(lexicographical) order.
 * Examples:
 * <p>
 * Input :
 * Key = Jayanti, Value = 80
 * Key = Anushka, Value = 80
 * Key = Amit, Value = 75
 * Key = Abhilasha, Value = 90
 * Key = Danish, Value = 40
 * Output : Sorted Map according to Names:
 * Key = Abhilasha, Value = 90
 * Key = Amit, Value = 75
 * Key = Anushka, Value = 80
 * Key = Danish, Value = 40
 * Key = Jayanti, Value = 80
 */
public class SortingHashMap {
    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort a map by Key
    public static void sortByKey() {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted
                = new TreeMap<>(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey()
                    + ", Value = " + entry.getValue());
    }

    public static void main(String[] args) {
        // putting values in the Map
        map.put("Jayanti", 80);
        map.put("Abhilasha", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);

        // Calling the function to sortByKey
        sortByKey();
    }
}
