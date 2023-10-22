package CollectionsFramework.MapInterface;

import java.util.HashMap;

// Sub-Arrays Summation equal to K(Constant);
public class SubArraysSum {
    public static void main(String[] args) {
        int[] array = {10, 2, -2, -20, 10};   //Ans = 3
        int k = -10;

        HashMap<Integer, Integer> hashMap = new HashMap<>(); //<Sum, Frequency>

        hashMap.put(0, 1);  // Empty Sub-Array
        int ans = 0;
        int sum = 0;
        for (int ArrayLength : array) {
            sum += ArrayLength;

            if (hashMap.containsKey(sum - k)) {
                ans += hashMap.get(sum - k);
            }

            if (hashMap.containsKey(sum)) {
                hashMap.put(sum, hashMap.get(sum) + 1);
            } else {
                hashMap.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}

/*Expected Output:

3

* */