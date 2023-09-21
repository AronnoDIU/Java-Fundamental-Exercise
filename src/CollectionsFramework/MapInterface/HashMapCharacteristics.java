package CollectionsFramework.MapInterface;

import java.util.HashMap;

/*Characteristics of HashMap:

A HashMap is a data structure that is used to store and retrieve values based on keys.
Some of the key characteristics of a hashmap include:

    Fast access time: HashMaps provide constant time access to elements, which means that
retrieval and insertion of elements are very fast, usually O(1) time complexity.
    Uses hashing function: HashMaps uses a hash function to map keys to indices in an array.
This allows for a quick lookup of values based on keys.
    Stores key-value pairs: Each element in a HashMap consists of a key-value pair.
The key is used to look up the associated value.
    Supports null keys and values: HashMaps allow for null values and keys.
This means that a null key can be used to store a value, and a null value can be associated with a key.
    Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the
map is not preserved. However, LinkedHashMap is a variation of HashMap that preserves the insertion order.
    Allows duplicates: HashMaps allow for duplicate values, but not duplicate keys.
If a duplicate key is added, the previous value associated with the key is overwritten.
    Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access
the same hashmap simultaneously, it can lead to data inconsistencies. If thread safety is required,
ConcurrentHashMap can be used.
    Capacity and load factor: HashMaps have a capacity, which is the number of elements that
it can hold, and a load factor, which is the measure of how full the hashmap can be before it is resized.*/
public class HashMapCharacteristics {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

        // Access elements in the HashMap
        System.out.println(hashMap.get("John")); // Output: 25

        // Remove an element from the HashMap
        hashMap.remove("Jim");

        // Check if an element is present in the HashMap
        System.out.println(hashMap.containsKey("Jim")); // Output: false

        // Get the size of the HashMap
        System.out.println(hashMap.size()); // Output: 2
    }
}

/*Expected Output:

25
false
2
* */