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
 */

// Find the shortest safe route in a field with sensors present
public class FindShortestSafeRoute {
    public static void main(String[] args) {

    }
}
