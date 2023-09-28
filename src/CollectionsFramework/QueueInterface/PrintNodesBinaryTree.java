package CollectionsFramework.QueueInterface;

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
    public static void main(String[] args) {

    }
}

// A class to store a binary tree node
class Nodes {
    int key;
    Node left = null, right = null;

    Nodes(int key) {
        this.key = key;
    }
}