package CollectionsFramework.QueueInterface;

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
    public static void main(String[] args) {

    }
}
