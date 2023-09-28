package CollectionsFramework.QueueInterface;

/**
 * Flood fill (also known as seed fill) is an algorithm that determines the area connected
 * to a given node in a multidimensional array.
 * <p>
 * It is used in the “bucket” fill tool of a paint program to fill connected,
 * similarly colored areas with a different color and in games such as Go and
 * Minesweeper for determining which pieces are cleared. When applied on an
 * image to fill a particular bounded area with color, it is also known as boundary fill.
 * <p>
 * <p>
 * The flood fill algorithm takes three parameters: a start node, a target color,
 * and a replacement color.
 * <p>
 * Consider the following matrix to the left – if the start node is (3, 9), target
 * color is “BLACK” and replacement color is “GREY”, the algorithm looks for all
 * nodes in the matrix that are connected to the start node by a path of the target
 * color and changes them to the replacement color.
 * <p>
 * // Stack-based recursive implementation (four-way)
 * /*Flood-fill (node):
 * 1. If node is not Inside return.
 * 2. Set the node
 * 3. Perform Flood-fill one step to the south of the node.
 * 4. Perform Flood-fill one step to the north of node
 * 5. Perform Flood-fill one step to the west of node
 * 6. Perform Flood-fill one step to the east of node
 * 7. Return.
 * <p>
 * Moving the recursion into a data structure
 * Flood-fill (node):
 * 1. Set Q to the empty queue or stack.
 * 2. Add node to the end of Q.
 * 3. While Q is not empty:
 * 4.   Set n equal to the first element of Q.
 * 5.   Remove a first element from Q.
 * 6.   If n is Inside:
 * Set the n
 * Add the node to the west of n to the end of Q.
 * Add the node to the east of n to the end of Q.
 * Add the node to the north of n to the end of Q.
 * Add the node to the south of n to the end of Q.
 * 7. Continue looping until Q is exhausted.
 * 8. Return.
 * <p>
 * Approach 1: (Using BFS)
 * <p>
 * A queue-based implementation using Breadth–first search (BFS) is shown below in pseudocode.
 * BFS (starting-pixel, replacement-color):
 * <p>
 * Create an empty queue.
 * Enqueue starting pixel and mark it as processed.
 * <p>
 * Loop till queue is emptily
 * Dequeue the front node and process it.
 * Replace the color of the current pixel (popped node) with that of the replacement.
 * Process all eight adjacent pixels of the current pixel and enqueue each valid pixel that has the same color as that of the current pixel.
 */
public class FloodFillAlgorithm {
    public static void main(String[] args) {

    }
}
