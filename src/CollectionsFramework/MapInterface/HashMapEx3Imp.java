package CollectionsFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * If the given Key exists, then the value will be updated.
 * Otherwise, a new pair will be inserted in HashMap
 */
public class HashMapEx3Imp {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Key = Country <String>, Values = Population <Integer>
        hashMap.put("India", 120);
        hashMap.put("US", 30);
        hashMap.put("China", 150);

        System.out.println(hashMap);

        /*If the given Key exists, then the value will be updated.
         * Otherwise, a new pair will be inserted in HashMap */
        hashMap.put("China", 180);
        System.out.println(hashMap);

        //Searching
        if (hashMap.containsKey("Indonesia")) {
            System.out.println("key is present in the hashMap");
        } else {
            System.out.println("key is not present in the hashMap");
        }

        // print Values using Keys through get() function
        System.out.println(hashMap.get("China")); //key exists
        System.out.println(hashMap.get("Indonesia")); //key doesn't exist

        //Iteration (1) ==> The Most Preferable Iteration
        for (Map.Entry<String, Integer> entryMap : hashMap.entrySet()) {
            // map.entrySet ==> KeysSet + ValuesSet
            System.out.print(entryMap.getKey() + " = ");
            System.out.print(entryMap.getValue() + ", ");
        }
        System.out.println("\nSecond Approach of an Iteration");

        //Iteration (2) 2nd Approach
        Set<String> keys = hashMap.keySet(); // Only KeysSet
        for (String Key : keys) {
            System.out.print(Key + " " + hashMap.get(Key) + ", ");
        }
        System.out.println();

        //Removing
        hashMap.remove("China");
        System.out.println(hashMap);
    }
}

/*Expected Output:

{China=150, US=30, India=120}
{China=180, US=30, India=120}
key is not present in the hashMap
180
null
China = 180, US = 30, India = 120,
Second Approach of an Iteration
China 180, US 30, India 120,
{US=30, India=120}

* */