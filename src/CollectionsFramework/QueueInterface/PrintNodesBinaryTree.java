package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given a binary tree, efficiently print all nodes in it between two given levels.
 * The nodes for any level should be printed from the left and right.
 * <p>
 * For example, if the starting level is 2 and the ending level is 3,
 * the solution should print nodes in order [2, 3, 4, 5, 6, 7].
 * <p>
 * <p>
 * Binary Tree:
 * <p>
 * A simple solution would be to print all nodes of given levels one by one.
 * We can print all nodes present in a level by modifying the preorder traversal
 * of the tree. The time complexity of this solution is O(n2), where n is the total
 * number of nodes in the binary tree.
 * <p>
 * <p>
 * We can reduce the time complexity to O(n) by modifying the level order traversal.
 * Following is a pseudocode for a modified level order traversal,
 * which maintains the level of each node:
 * <p>
 * level order(root, start, end)
 * q —> empty queue
 * q.enqueue(root)
 * level —> 0
 * while (not q.isEmpty())
 * size —> q.size()
 * level = level + 1
 * while (size)
 * node —> q.dequeue()
 * if (level between start and end)
 * print(node)
 * if (node.left <> null)
 * q.enqueue(node.left)
 * if (node.right <> null)
 * q.enqueue(node.right)
 * size = size – 1
 */
public class PrintNodesBinaryTree {
    // Iterative function to print all nodes between two given
    // levels in a binary tree
    static void printNodes(Nodes root, int start, int end) {
        if (root == null) {
            return;
        }

        // create an empty queue and enqueue the root node
        Queue<Nodes> queue = new ArrayDeque<>();
        queue.add(root);

        // to store the current node
        Nodes curr = null;

        // maintains the level of the current node
        int level = 0;

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // increment level by 1
            level++;

            // calculate the total number of nodes at the current level
            int size = queue.size();

            // process every node of the current level and enqueue their
            // non-empty left and right child
            while (size-- > 0) {
                curr = queue.poll();

                // print the node if its level is between given levels
                if (level >= start && level <= end) {
                    assert curr != null;
                    System.out.print(curr.key + " ");
                }

                assert curr != null;
                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            if (level >= start && level <= end) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Nodes root = new Nodes(15);
        root.left = new Nodes(10);
        root.right = new Nodes(20);
        root.left.left = new Nodes(8);
        root.left.right = new Nodes(12);
        root.right.left = new Nodes(16);
        root.right.right = new Nodes(25);
        root.right.right.right = new Nodes(30);

        int start = 2, end = 3;
        printNodes(root, start, end);
    }
}

// A class to store a binary tree node
class Nodes {
    int key;
    Nodes left = null, right = null;

    Nodes(int key) {
        this.key = key;
    }
}