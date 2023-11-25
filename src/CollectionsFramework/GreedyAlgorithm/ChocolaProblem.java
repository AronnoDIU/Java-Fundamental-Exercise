package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;

/* We are given a bar of chocolate composed of mxn square pieces.One should break
the chocolate into single squares.Each break of a part of the chocolate is charged
 a cost expressed by a positive integer.This cost does not depend on the size of
 the part that is being broken but only depends on the line the break goes along.
 Let us denote the costs of breaking along consecutive vertical lines with
 x1, x2, ..., xn-1 and along horizontal lines with y1, y2, ..., yn-1.
 Compute the minimal cost of breaking the whole chocolate into single squares.

    Example:
        Input:  m = 2, n = 2, x = {1}, y = {1}
        Output: 2
        We are given a 2 x 2 chocolate.Breaking the chocolate horizontally or vertically
        costs 1. Therefore, the cheapest way to break the chocolate into single squares
        is to break it along the horizontal line in the middle.This gives the cost of 2.

        Input:  m = 2, n = 2, x = {1}, y = {2}
        Output: 4
        We are given a 2 x 2 chocolate.Breaking the chocolate horizontally costs 1 and
        breaking the chocolate vertically costs 2. Therefore, the cheapest way to break
        the chocolate into single squares is to break it along the vertical line in the
        middle.This gives the cost of 4.

Greedy Algorithm:
    1. Sort both arrays x and y in descending order.
    2. Initialize the result as 0.
    3. Iterate over both arrays and for each index i, add x[i] or y[i] to the result
    depending on which is greater.
    4. Return the result.
 */
public class ChocolaProblem {
    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[] x = {2, 1, 3, 1, 4};
        int[] y = {4, 1, 2};

        Arrays.sort(x);
        Arrays.sort(y);

        int result = 0;
        int horizontalPieces = 1;
        int verticalPieces = 1;
        int i = m - 2;
        int j = n - 2;

        while (i >= 0 && j >= 0) {
            if (x[i] > y[j]) {
                result += x[i] * verticalPieces;
                horizontalPieces++;
                i--;
            } else {
                result += y[j] * horizontalPieces;
                verticalPieces++;
                j--;
            }
        }

        while (i >= 0) {
            result += x[i] * verticalPieces;
            horizontalPieces++;
            i--;
        }

        while (j >= 0) {
            result += y[j] * horizontalPieces;
            verticalPieces++;
            j--;
        }

        System.out.println("Minimum Cost: " + result);
    }
}

/* Expected Output:

Minimum Cost: 42

 */