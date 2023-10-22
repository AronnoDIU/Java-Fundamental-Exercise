package CollectionsFramework.MapInterface;

import java.util.HashMap;

// Sub-Arrays Summation equal to K(Constant);
public class SubArraysSum {
    public static void main(String[] args) {
        int[] array = {10, 2, -2, -20, 10};   //Ans = 3
        int k = -10;

        HashMap<Integer, Integer> hashMap = new HashMap<>(); //<Sum, Frequency>

        hashMap.put(0, 1);  // Empty Sub-Array
        int Answer = 0;
        int Summation = 0;
        for (int ArrayLength : array) {
            Summation += ArrayLength;

            if (hashMap.containsKey(Summation - k)) {
                Answer += hashMap.get(Summation - k);
            }

            if (hashMap.containsKey(Summation)) {
                hashMap.put(Summation, hashMap.get(Summation) + 1);
            } else {
                hashMap.put(Summation, 1);
            }
        }
        System.out.println(Answer);
    }
}

/*Expected Output:

3

* */