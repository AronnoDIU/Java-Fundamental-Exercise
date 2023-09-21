package CollectionsFramework.MapInterface;

import java.util.HashMap;

public class HashMapEx2 {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Access an Item
        capitalCities.get("England");

        // Remove an Item
        capitalCities.remove("England");

        // HashMap Size
//        capitalCities.size();

        // Loop Through a HashMap
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // To remove all items, use the clear() method:
        capitalCities.clear();
    }
}

/*Expected Output:

{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
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