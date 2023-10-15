package CollectionsFramework.MapInterface;

import java.util.Enumeration;
import java.util.Hashtable;

/*The Hashtable class: implements a hash table, which maps keys to values. Any non-null object can be
used as a key or as a value. To successfully store and retrieve objects from a hashtable, the
objects used as keys must implement the hashCode method and the equals method. The java.util.Hashtable
class is a class in Java that provides a key-value data structure, similar to the Map interface.

However, the Hashtable class has since been considered obsolete and its use is generally discouraged.
This is because it was designed prior to the introduction of the Collections framework and does not
implement the Map interface, which makes it difficult to use in conjunction with other parts of the framework. In addition, the Hashtable class is synchronized, which can result in slower performance compared to other implementations of the Map interface.

In general, it’s recommended to use the Map interface or one of its implementations (such as HashMap
or ConcurrentHashMap) instead of the Hashtable class.

Features of Hashtable

    It is similar to HashMap, but is synchronized.
    Hashtable stores key/value pair in hash table.
    In Hashtable, we specify an object used as a key, and the value we want to associate with
that key. The key is then hashed, and the resulting hash code is used as the index
at which the value is stored within the table.
    The initial default capacity of Hashtable class is 11, whereas loadFactor is 0.75.
    HashMap doesn’t provide any Enumeration, while Hashtable provides no fail-fast Enumeration.
*/
public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> stringIntegerHashtable = new Hashtable<>();

        // Adding elements to the stringIntegerHashtable
        stringIntegerHashtable.put("A", 1);
        stringIntegerHashtable.put("B", 2);
        stringIntegerHashtable.put("C", 3);
        stringIntegerHashtable.put("D", 4);

        // Getting values from the stringIntegerHashtable
        int gettingValues = stringIntegerHashtable.get("A");
        System.out.println("Value of A: " + gettingValues);

        // Removing elements from the stringIntegerHashtable
        stringIntegerHashtable.remove("B");

        // Enumerating the elements of the stringIntegerHashtable
        Enumeration<String> keys = stringIntegerHashtable.keys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + stringIntegerHashtable.get(key));
        }
    }
}

/*Expected Output:

Value of A: 1
Key: A, Value: 1
Key: D, Value: 4
Key: C, Value: 3

* */