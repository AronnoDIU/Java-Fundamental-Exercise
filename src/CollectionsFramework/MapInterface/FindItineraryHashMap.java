package CollectionsFramework.MapInterface;

import java.util.HashMap;

// Find Itinerary from Tickets using HashMap
// Itinerary -> Find All Paths/ Find Staring to Ending point.
public class FindItineraryHashMap {
    static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> reversedMap = new HashMap<>();

        for (String keyList : tickets.keySet()) {
            // Normal Process: Key -> keyList; Value -> tickets.get(keyList);
            // Reversed Process: Key -> tickets.get(keyList); Value -> keyList;

            reversedMap.put(tickets.get(keyList), keyList);
        }

        // Find Starting Point -> Comparing two keySet, which one does not exist;
        for (String keyList : tickets.keySet()) {
            if (!reversedMap.containsKey(keyList)) {
                return keyList;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");

            start = tickets.get(start);
        }
        System.out.println(start);
    }
}

/*Expected Output:

Mumbai -> Delhi -> Goa -> Chennai -> Bengaluru

* */