package CollectionsFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx3Imp {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        //Insertion
        hashMap.put("India", 120);
        hashMap.put("US", 30);
        hashMap.put("China", 150);

        System.out.println(hashMap);

        hashMap.put("China", 180);
        System.out.println(hashMap);

        //Searching
        if (hashMap.containsKey("Indonesia")) {
            System.out.println("key is present in the hashMap");
        } else {
            System.out.println("key is not present in the hashMap");
        }

        System.out.println(hashMap.get("China")); //key exists
        System.out.println(hashMap.get("Indonesia")); //key doesn't exist

        //Iteration (1)
        for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration (2)
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            System.out.println(key + " " + hashMap.get(key));
        }

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
China
180
US
30
India
120
China 180
US 30
India 120
{US=30, India=120}

* */