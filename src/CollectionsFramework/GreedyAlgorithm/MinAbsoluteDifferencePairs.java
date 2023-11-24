package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;

/* Given two arrays A and B of equal length N, pair each element of array A with to an
 element in array B, such that sum S of absolute differences of all the pairs is minimum.

 Example:
    A[] = {1, 2, 3} and B[] = {2, 1, 3}

    Case 1: Pairing {1, 2}, {2, 1}, {3, 3} and S = |1-2| + |2-1| + |3-3| = 0 + 1 + 0 = 1
    Case 2: Pairing {1, 1}, {2, 3}, {3, 2} and S = |1-1| + |2-3| + |3-2| = 0 + 1 + 1 = 2
    Case 3: Pairing {1, 2}, {2, 3}, {3, 1} and S = |1-2| + |2-3| + |3-1| = 1 + 1 + 1 = 3
    Case 4: Pairing {1, 3}, {2, 1}, {3, 2} and S = |1-3| + |2-1| + |3-2| = 2 + 1 + 1 = 4
    Case 5: Pairing {1, 1}, {2, 2}, {3, 3} and S = |1-1| + |2-2| + |3-3| = 0 + 0 + 0 = 0

Greedy Algorithm:
    1. Sort both arrays A and B in ascending order.
    2. Initialize S = 0
    3. Iterate over the array and for each index i, add abs(A[i] – B[i]) to S.
    4. Return S

Example:
    A[] = {1, 2, 3} and B[] = {2, 1, 3}
    After sorting, A[] = {1, 2, 3} and B[] = {1, 2, 3}
    S = |1-1| + |2-2| + |3-3| = 0 + 0 + 0 = 0
    Hence, the minimum absolute difference is 0.

Another Example:
    A[] = {4, 1, 8, 7} and B[] = {2, 3, 6, 5}
    After sorting, A[] = {1, 4, 7, 8} and B[] = {2, 3, 5, 6}
    S = |1-2| + |4-3| + |7-5| + |8-6| = 1 + 1 + 2 + 2 = 6
    Hence, the minimum absolute difference is 6.

*/
public class MinAbsoluteDifferencePairs {
    /*public static int minAbsoluteDifferencePairs(int[] A, int[] B) {
        int n = A.length;
        int S = 0;

        // Sort both arrays in ascending order
        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }

            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }

        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (B[j] < B[min]) {
                    min = j;
                }
            }

            int temp = B[i];
            B[i] = B[min];
            B[min] = temp;
        }

        // Calculate S
        for (int i = 0; i < n; i++) {
            S += Math.abs(A[i] - B[i]);
        }

        return S;
    }*/

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiffPairs = 0;

        for (int i = 0; i < A.length; i++) {
            minDiffPairs += Math.abs(A[i] - B[i]);
        }

        System.out.println(" Minimum Absolute Difference Pairs: " + minDiffPairs);

//        System.out.println(minAbsoluteDifferencePairs(A, B)); // Scratch code
    }
}

/*
 Expected Output:
    Minimum Absolute Difference Pairs: 0
*/