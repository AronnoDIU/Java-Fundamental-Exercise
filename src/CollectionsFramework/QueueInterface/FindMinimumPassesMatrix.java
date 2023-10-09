package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given an M × N matrix of integers who's each cell can contain a negative, zero,
 * or a positive value, determine the minimum number of passes required to convert
 * all negative values in the matrix positive.
 * <p>
 * Only a non-zero positive value at cell (i, j) can convert negative values present
 * at its adjacent cells (i-1, j), (i+1, j), (i, j-1), and (i, j+1), i.e., up, down,
 * left and right.
 * <p>
 * The idea is to use Breadth–first Search as it is the shortest path problem.
 * The algorithm can be implemented as follows:
 * <p>
 * 1. Create a queue Q and enqueue cell coordinates of all positive numbers in the matrix.
 * Create another queue Q, to separate the positive numbers involved in the previous
 * pass from the positive numbers in the current pass.
 * 2. Do till first queue Q be empty,
 * 2a. Copy the contents of the original queue Q to
 * the second queue q and empty the original queue.
 * 2b. Do till second queue q is empty,
 * 2bi. Remove the front node from queue q and check all four
 * adjacent cells of the current cell.
 * 2bii. If any of the four adjacent cells are negative, make its value
 * positive and enqueue it into queue Q.
 * <p>
 * 2c. Increment number of passes by 1.
 * 3. If all the nodes in the queue are processed, return the total number of passes.
 * <p>
 * We can find all the adjacent cells of the given cell by storing the relative
 * position of movement from any cell in an array. For example, if the current
 * cell is (x, y), we can move to (x + row[k], y + col[k])
 * cell for 0 <= k < 4 using the following arrays:
 * row[] = { -1, 0, 0, 1 }
 * col[] = { 0, -1, 1, 0 }
 * <p>
 * So, from any position (x, y), we can move to:
 * <p>
 * (X – 1, y)
 * (x, y – 1)
 * (x, y + 1)
 * (x + 1, y)
 */
// Find minimum passes required to convert all negative values in a matrix
public class FindMinimumPassesMatrix {
    // Function to check whether given coordinates is a valid cell or not
    private static boolean isValid(int i, int j, int M, int N) {
        return (i >= 0 && i < M) && (j >= 0 && j < N);
    }

    // Below arrays detail all four possible movements from a cell
    // (top, right, bottom, and left)
    private static final int[] Rows = {-1, 0, 0, 1};
    private static final int[] Column = {0, -1, 1, 0};

    // Returns true if the matrix contains at least one negative value
    private static boolean hasNegative(int[][] matrix) {
        for (int[] EnhancedMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (EnhancedMatrix[j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // Find the minimum number of passes required to convert all negative values
    // in the given matrix to positive
    public static int findMinPasses(int[][] matrix) {
        // base case
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        // `M × N` matrix
        int M = matrix.length;
        int N = matrix[0].length;

        // create a queue to store cell coordinates of positive integers
        Queue<PointFMPM> pointFMPMArrayDeque = new ArrayDeque<>();

        // enqueue cell coordinates of all positive numbers in the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] > 0) {
                    pointFMPMArrayDeque.add(new PointFMPM(i, j));
                }
            }
        }

        // to keep track of the time taken to make all numbers positive
        int passes = 0;

        // loop till all reachable negative numbers in the matrix are processed
        while (!pointFMPMArrayDeque.isEmpty()) {
            // use two queues to separate positive numbers involved in the
            // previous pass with positive numbers involved in the current pass
            Queue<PointFMPM> pointFMPMQueue;

            // copy the contents of the original queue `pointFMPMArrayDeque` to
            // another queue `pointFMPMQueue` and empty the original queue
            pointFMPMQueue = new ArrayDeque<>(pointFMPMArrayDeque);
            pointFMPMArrayDeque.clear();

            /* Start of the current pass */

            // process all cells in the queue
            while (!pointFMPMQueue.isEmpty()) {
                // pop the front node and process it
                int x = pointFMPMQueue.peek().x;
                int y = pointFMPMQueue.peek().y;
                pointFMPMQueue.poll();

                // check all four adjacent cells of the current cell
                for (int k = 0; k < Rows.length; k++) {
                    // if the current adjacent cell is valid and has a negative value
                    if (isValid(x + Rows[k], y + Column[k], M, N) &&
                            matrix[x + Rows[k]][y + Column[k]] < 0) {
                        // make the value positive
                        matrix[x + Rows[k]][y + Column[k]] =
                                -matrix[x + Rows[k]][y + Column[k]];

                        // enqueue adjacent cell
                        pointFMPMArrayDeque.add(
                                new PointFMPM(x + Rows[k], y + Column[k]));
                    }
                }
            }
//             End of the current pass

            // increment number of passes by 1
            passes++;
        }

        // return number of passes or
        // -1 if the matrix has an unreachable cell which is negative
        return hasNegative(matrix) ? -1 : (passes - 1);
    }

    public static void main(String[] args) {

    }
}

// A class to store the cell coordinates of the matrix
class PointFMPM {
    int x, y;

    PointFMPM(int x, int y) {
        this.x = x;
        this.y = y;
    }
}