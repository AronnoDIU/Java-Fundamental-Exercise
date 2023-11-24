package CollectionsFramework.GreedyAlgorithm;

/* Given two arrays A and B of equal length N, pair each element of array A with to an
 element in array B, such that sum S of absolute differences of all the pairs is minimum.

 Example:
    A[] = {1, 2, 3} and B[] = {2, 1, 3}

    Case 1: Pairing {1, 2}, {2, 1}, {3, 3} and S = |1-2| + |2-1| + |3-3| = 0 + 1 + 0 = 1
    Case 2: Pairing {1, 1}, {2, 3}, {3, 2} and S = |1-1| + |2-3| + |3-2| = 0 + 1 + 1 = 2
    Case 3: Pairing {1, 2}, {2, 3}, {3, 1} and S = |1-2| + |2-3| + |3-1| = 1 + 1 + 1 = 3
    Case 4: Pairing {1, 3}, {2, 1}, {3, 2} and S = |1-3| + |2-1| + |3-2| = 2 + 1 + 1 = 4
    Case 5: Pairing {1, 1}, {2, 2}, {3, 3} and S = |1-1| + |2-2| + |3-3| = 0 + 0 + 0 = 0

    S = |1-2| + |2-3| + |3-1| = 2 + 1 + 2 = 5
    We can shuffle array B to {1, 2, 3} to get the minimum value of S.

 Formally, if element A[i] is paired with element B[j],
 then S = S + abs(A[i] – B[j]) where 0 <= i < N and 0 <= j < N
                                    and abs(x) is absolute value of x.

 Value of A[0] * B[0] + A[1] * B[1] + … + A[N-1] * B[N-1],
 where shuffling of elements of arrays A and B is allowed.
 Input: arr[] = {10, 12, 21, 15, 22, 33, 11}
 Output : 1
 Explanation: Difference between 10 and 11 is 1.
 Input: arr[] = {5, 4, 3, 2, 1}
 Output : 1
 Explanation: Difference between 2 and 1 is 1.
 Input: arr[] = {1, 2, 3, 4, 5}
 Output : 1
 Explanation: Difference between 2 and 1 is 1.*/
public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 19, 18, 25};
        int n = array.length;
//        System.out.println("Minimum absolute difference is: " + findMinDiff(array, n));
    }
}
