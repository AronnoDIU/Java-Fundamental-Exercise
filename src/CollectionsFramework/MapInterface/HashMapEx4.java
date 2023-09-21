package CollectionsFramework.MapInterface;

import java.util.HashMap;

public class HashMapEx4 {
    public static void main(String[] args) {
        // Create an empty hash stringIntegerHashMap by declaring an object of string and integer type
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

        // Adding elements to the Map
        // using standard put() method
        stringIntegerHashMap.put("Person1", 10);
        stringIntegerHashMap.put("Person2", 30);
        stringIntegerHashMap.put("Person3", 20);

        // Print size and content of the Map
        System.out.println("Size of stringIntegerHashMap is:- "
                + stringIntegerHashMap.size());

        // Printing elements in an object of Map
        System.out.println(stringIntegerHashMap);

        // Checking if a key is present and if present, print value by passing
        // a random element
        if (stringIntegerHashMap.containsKey("Person1")) {

            // Mapping
            Integer a = stringIntegerHashMap.get("Person1");

            // Printing value for the corresponding key
            System.out.println("value for key" + " \"Person1\" is:- " + a);
        }
    }
}

/*Expected Output:

Size of stringIntegerHashMap is:- 3
{Person1=10, Person2=30, Person3=20}
value for key "Person1" is:- 10

* */