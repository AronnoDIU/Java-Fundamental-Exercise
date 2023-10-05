package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**First, modify the level order traversal on a given binary tree to maintain the
 * level of each node. Then while doing level order traversal,
 * if the current node happens to be the first or last
 * node at the current level, print it.*/
// Print corner nodes of every level in a binary tree
public class PrintCornerNodes {
    // Iterative function to print corner nodes of every level in the binary tree
    static void print(NodePCN root) {
        // return if the tree is empty
        if (root == null) {
            return;
        }

        // create an empty queue to store tree nodes
        Queue<NodePCN> nodePCNArrayDeque = new ArrayDeque<>();

        // enqueue root node
        nodePCNArrayDeque.add(root);

        // loop till queue is empty
        while (!nodePCNArrayDeque.isEmpty()) {
            // get the size of the current level
            int size = nodePCNArrayDeque.size();
            int n = size;

            // process all nodes present in the current level
            while (n-- > 0) {
                NodePCN node = nodePCNArrayDeque.poll();

                // if the corner node is found, print it
                if (n == size - 1 || n == 0) {
                    assert node != null;
                    System.out.print(node.data + " ");
                }

                // enqueue left and right child of the current node
                assert node != null;
                if (node.left != null) {
                    nodePCNArrayDeque.add(node.left);
                }

                if (node.right != null) {
                    nodePCNArrayDeque.add(node.right);
                }
            }

            // terminate level by printing an empty line
            System.out.println();
        }
    }
    public static void main(String[] args) {

    }
}

// A class to store a binary tree node
class NodePCN {
    int data;
    NodePCN left = null, right = null;

    NodePCN(int data) {
        this.data = data;
    }
}