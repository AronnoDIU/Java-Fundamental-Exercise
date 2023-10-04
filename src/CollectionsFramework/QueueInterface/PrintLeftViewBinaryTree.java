package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 1. Iterative Implementation
 * <p>
 * In the iterative version, perform a level order traversal on the tree.
 * We can modify level order traversal to maintain nodes at the current level.
 * Then, if the current node is the first node of the current level, print it.
 */
public class PrintLeftViewBinaryTree {
    // Iterative function to print the left view of a given binary tree
    public static void leftView(NodePLVBT root) {
        // return if the tree is empty
        if (root == null) {
            return;
        }

        // create an empty queue and enqueue the root node
        Queue<NodePLVBT> queue = new ArrayDeque<>();
        queue.add(root);

        // to store the current node
        NodePLVBT curr;

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // calculate the total number of nodes at the current level
            int size = queue.size();
            int i = 0;

            // process every node of the current level and enqueue their
            // non-empty left and right child
            while (i++ < size) {
                curr = queue.poll();

                // if this is the first node of the current level, print it
                if (i == 1) {
                    System.out.print(curr.key + " ");
                }

                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        NodePLVBT root = new NodePLVBT(1);
        root.left = new NodePLVBT(2);
        root.right = new NodePLVBT(3);
        root.left.right = new NodePLVBT(4);
        root.right.left = new NodePLVBT(5);
        root.right.right = new NodePLVBT(6);
        root.right.left.left = new NodePLVBT(7);
        root.right.left.right = new NodePLVBT(8);

        leftView(root);
    }
}

// A class to store a binary tree NodePLVBT
class NodePLVBT {
    int key;
    NodePLVBT left = null, right = null;

    NodePLVBT(int key) {
        this.key = key;
    }
}