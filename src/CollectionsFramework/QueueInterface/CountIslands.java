package CollectionsFramework.QueueInterface;

/**
 * The solution is inspired by finding the total number of connected components
 * in a graph problem. The idea is to start Breadth–first search (BFS) from
 * each unprocessed node and increment the island count. Each BFS traversal
 * will mark all cells that make one island as processed. So, the problem
 * reduces to finding the total number of BFS calls.
 * <p>
 * In each BFS traversal, start by creating an empty queue. Then enqueue the
 * starting cell and mark it as processed. Next dequeue the front node, process
 * all eight adjacent cells of the current cell, and enqueue each valid cell,
 * which is land. Repeat this process till the queue is not empty.
 * <p>
 * We can find all the possible locations we can move to from the given location
 * by using the array that stores the relative position of movement from any
 * location. For example, if the current location is (x, y), we can move
 * to (x + row[k], y + col[k]) for 0 <= k <= 7 using the following arrays:
 * int row[] = { -1, -1, -1, 0, 0, 1, 1, 1 }
 * int col[] = { -1, 0, 1, -1, 1, -1, 0, 1 }
 * <p>
 * So, from position (x, y), we can move to:
 * <p>
 * (x – 1, y – 1)
 * (x – 1, y)
 * (x – 1, y + 1)
 * (x, y – 1)
 * (x, y + 1)
 * (x + 1, y – 1)
 * (x + 1, y)
 * (x + 1, y + 1)
 */
public class CountIslands {
    public static void main(String[] args) {

    }
}

class Pairs {
    int x, y;

    public Pairs(int x, int y) {
        this.x = x;
        this.y = y;
    }
}