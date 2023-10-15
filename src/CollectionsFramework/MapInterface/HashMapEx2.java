package CollectionsFramework.MapInterface;

import java.util.HashMap;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys = Country <String>, and values = City <String>
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Access an Item using Keys
        capitalCities.get("England");

        // Remove an Item
        capitalCities.remove("England");

        // HashMap Size
        System.out.println("Size of CapitalCities is:- " + capitalCities.size());

        // Loop Through a HashMap for Printing keys
        for (String EnhancedKeys : capitalCities.keySet()) {
            System.out.println(EnhancedKeys);
        }

        // Print values
        for (String EnhancedValues : capitalCities.values()) {
            System.out.println(EnhancedValues);
        }

        // Print keys and values
        for (String EnhancedKeysValues : capitalCities.keySet()) {
            System.out.println("key: " + EnhancedKeysValues
                    + " value: " + capitalCities.get(EnhancedKeysValues));
        }

        // To remove all items, use the clear() method:
        capitalCities.clear();
    }
}

/*Expected Output:

{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
Size of CapitalCities is:- 3
USA
Norway
Germany
Washington DC
Oslo
Berlin
key: USA value: Washington DC
key: Norway value: Oslo
key: Germany value: Berlin

* */