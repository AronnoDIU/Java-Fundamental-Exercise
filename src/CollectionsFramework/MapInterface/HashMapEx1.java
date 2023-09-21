package CollectionsFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

/*#Map Interface
    A map is a data structure that supports the key-value pair for mapping the data. This interface
    doesn’t support duplicate keys because the same key cannot have multiple mappings, however,
    it allows duplicate values in different keys. A map is useful if there is data, and we
    wish to perform operations on the basis of the key. This map interface is implemented
    by various classes like HashMap, TreeMap, etc. Since all the subclasses implement
    the map, we can instantiate a map object with any of these classes.

    For example:

    Map<T> hm = new HashMap<> ();
    Map<T> tm = new TreeMap<> ();

    Where T is the type of the object.

    The frequently used implementation of a Map interface is a HashMap.


#HashMap:
    provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value)
    pairs. To access a value in a HashMap, we must know its key. HashMap uses a technique called
    Hashing. Hashing is a technique of converting a large String to a small String that
    represents the same String so that the indexing and search operations are faster.
    HashSet also uses HashMap internally.*/
public class HashMapEx1 {
    public static void main(String[] args) {
        // Creating HashMap and adding elements
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(1, "Yeasir");
        integerStringHashMap.put(2, "Arafat");
        integerStringHashMap.put(3, "Aronno");

        // Finding the value for a key
        System.out.println("Value for 1 is " + integerStringHashMap.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> integerStringEntry : integerStringHashMap.entrySet())
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
    }
}

/*Expected Output:

Value for 1 is Yeasir
1 Yeasir
2 Arafat
3 Aronno

* */