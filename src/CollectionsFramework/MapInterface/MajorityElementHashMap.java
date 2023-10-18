package CollectionsFramework.MapInterface;

import java.util.HashMap;

/**
 * Given an Integer Array of size N, find all elements that appear more than[N/3]times.
 * 3-step processes,
 * 1. Create HashMap Object.
 * 2. Find frequency of all numbers & store in Map.
 * 3. Travers the HashMap Object & find which elements more than N/3.
 */
public class MajorityElementHashMap {
    public static void majorityElements(int[] Numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // Find frequency of all numbers & store in Map
        int N = Numbers.length;
        for (int numberIndex : Numbers) {
            if (hashMap.containsKey(numberIndex)) {
                hashMap.put(numberIndex, hashMap.get(numberIndex) + 1);
            } else {
                hashMap.put(numberIndex, 1);
            }
        }

        for (int KeyIndex : hashMap.keySet()) {
            System.out.println(KeyIndex + " " + hashMap.get(KeyIndex));
            if (hashMap.get(KeyIndex) > (N / 3)) {
                System.out.println(KeyIndex + " Required Answer");
            }
        }
    }

    public static void main(String[] args) {
        int[] Numbers = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElements(Numbers);
    }
}

/*Expected Output:

1 4
1 Required Answer
2 1
3 2
5 2

* */