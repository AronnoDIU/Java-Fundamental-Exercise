package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;

/* We are given a bar of chocolate composed of mxn square pieces.One should break
the chocolate into single squares.Each break of a part of the chocolate is charged
 a cost expressed by a positive integer.This cost does not depend on the size of
 the part that is being broken but only depends on the line the break goes along.
 Let us denote the costs of breaking along consecutive vertical lines with
 x1, x2, ..., xm-1 and along horizontal lines with y1, y2, ..., yn-1.
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
        int rowsM = 6; // Number of rows
        int columnsN = 4; // Number of columns

        // Cost of breaking chocolate along horizontal lines
        int[] horizontalX = {2, 1, 3, 1, 4};
        int[] verticalY = {4, 1, 2}; // Cost of breaking chocolate along vertical lines

        Arrays.sort(horizontalX); // Sort in ascending order
        Arrays.sort(verticalY); // Sort in ascending order

        int result = 0; // Initialize the result as 0.
        // This variable will store the minimum cost.

        int horizontalPieces = 1; // Initially, Chocolate's horizontal pieces are 1.
        int verticalPieces = 1; // Initially, Chocolate's vertical pieces are 1.

        // Number of rows - 2 because we have to start from second last row.
        int i = rowsM - 2;
        int j = columnsN - 2;
        // Number of columns - 2 because we have to start from second last column.

        // Iterate over both arrays and for each index i, add x[i] or y[i] to the result
        while (i >= 0 && j >= 0) {
            /* If the cost of breaking chocolate along horizontal lines is greater
             than the cost of breaking chocolate along vertical lines,
             then add horizontalX[i] to the result.*/
            if (horizontalX[i] > verticalY[j]) {

                // Add horizontalX[i] to the result.
                result += horizontalX[i] * verticalPieces;
                horizontalPieces++;
                i--;
            } else {
                /* If the cost of breaking chocolate along vertical lines is greater
                than the cost of breaking chocolate along horizontal lines,
                then add verticalY[j] to the result.*/
                result += verticalY[j] * horizontalPieces;
                verticalPieces++;
                j--;
            }
        }

        // Add the remaining horizontalX[i] to the result.
        while (i >= 0) {
            // Add horizontalX[i] to the result.
            result += horizontalX[i] * verticalPieces;
            horizontalPieces++;
            i--;
        }

        // Add the remaining verticalY[j] to the result.
        while (j >= 0) {
            // Add verticalY[j] to the result.
            result += verticalY[j] * horizontalPieces;
            verticalPieces++;
            j--;
        }

        System.out.println("Minimum Cost: " + result);
    }
}

/* Expected Output:

Minimum Cost: 42

 */