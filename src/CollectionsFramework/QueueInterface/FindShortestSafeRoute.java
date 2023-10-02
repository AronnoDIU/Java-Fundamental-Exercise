package CollectionsFramework.QueueInterface;

/**
 * Given a rectangular field with few sensors present,
 * cross it by taking the shortest safe route without activating the sensors.
 * <p>
 * The rectangular field is in the form of an M × N matrix,
 * and we need to find the shortest path from any cell in the first
 * column to any cell in the last column of the matrix.
 * The sensors are marked by value 0 in the matrix, and all its eight
 * adjacent cells can also activate the sensors.
 * The path can only be constructed out of cells having value 1,
 * and at any given moment, we can only move one step in one of the four directions.
 * The valid moves are:
 * Go Up: (x, y) ——> (x – 1, y)
 * Go Left: (x, y) ——> (x, y – 1)
 * Go Down: (x, y) ——> (x + 1, y)
 * Go Right: (x, y) ——> (x, y + 1)
 * <p>
 * The idea is to use Breadth–first search (BFS) since it is the shortest path problem.
 * Following is the complete algorithm:
 * <p>
 *     1. Create a queue and enqueue every safe cell of the first column and set
 *     their distance as 0 from the source (itself).
 *     Also, mark them as visited as we enqueue them.
 *     2. Loop till queue is empty
 *         A) Dequeue the front node.
 *         B) If the popped node is the destination node (last column), return its distance.
 *         C) Otherwise, for each of the four adjacent cells of the current cell,
 *         enqueue each valid cell with +1 distance and mark them as visited.
 *     If all the queue nodes are processed, and the destination is not reached, then return false.
 */

// Find the shortest safe route in a field with sensors present
public class FindShortestSafeRoute {
    public static void main(String[] args) {

    }
}
