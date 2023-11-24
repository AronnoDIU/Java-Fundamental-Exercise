package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

/* You are given N pairs of numbers. In every pair, the first number is always smaller
than the second number. A pair (c, d) can follow another pair (a, b) if b < c.

Chain of pairs can be formed in this fashion.

Example:
    Input:  (5, 24), (39, 60), (15, 28), (27, 40), (50, 90)
    Output: 3
    The longest chain that can be formed is of length 3, and the chain is
    (5, 24), (27, 40), (50, 90)

You are also given an array of numbers. Your task is to choose
the largest pair and pair them together.

Algorithm:
    1. Sort the pairs in ascending order based on the second element.
    2. Always select the first pair.
    3. Calculate dp array.
    4. Return the maximum element in dp array.
 */
public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(a -> a[1]));

        int chainLength = 1; // Always select the first pair
        int chainEnd = pairs[0][1]; // The second element in the first pair

        for (int i = 1; i < pairs.length; i++) {

            /* If the first element in the current pair is greater than the
             second element in the previous pair, then increment the
             chain length and update the chain end to the second
             element in the current pair.*/
            if (pairs[i][0] > chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Chain Length: " + chainLength);
    }
}

/*
Expected Output:

Chain Length: 3

*/