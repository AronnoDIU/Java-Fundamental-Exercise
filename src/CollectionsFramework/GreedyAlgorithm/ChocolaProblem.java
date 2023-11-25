package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;

/* We are given a bar of chocolate compared to others. Find the minimum difference */
public class ChocolaProblem {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int n = arr.length;
        int k = 3;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - k + 1; i++) {
            int diff = arr[i + k - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println(" Minimum Difference: " + minDiff);
    }
}
