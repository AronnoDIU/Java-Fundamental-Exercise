package CollectionsFramework;

import java.util.HashMap;

public class HashMapEx3 {
    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();


        // Add keys and values (Name, Age)
        people.put("Person1", 32);
        people.put("Person2", 30);
        people.put("Person3", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}

/*Expected Output:

key: Person1 value: 32
key: Person2 value: 30
key: Person3 value: 33

* */