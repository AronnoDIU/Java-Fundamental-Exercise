package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 1. Level Order Traversal (BFS)
 * <p>
 * We can modify level order traversal to check if a given
 * binary tree is a complete binary tree or not.
 * The idea is for every dequeued node, check if
 * it is a full node (have both left and right children).
 * If a node is found that is not a full node,
 * i.e., either it has no children or only one child,
 * then all the remaining nodes in the queue should not have any children.
 * If anyone has a child, then it’s not a complete binary tree; otherwise, it is.
 */
// Check if a binary tree is a complete binary tree or not
public class CheckBinaryTree {
    // Function to check if a given binary tree is complete or not
    static boolean isComplete(NodeCBT root) {
        // return if the tree is empty
        if (root == null) {
            return true;
        }

        // create an empty queue and enqueue the root node
        Queue<NodeCBT> queue = new ArrayDeque<>();
        queue.add(root);

        // to store the current node
        NodeCBT front;

        // flag to mark the end of full nodes
        boolean flag = false;

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // dequeue front node
            front = queue.poll();

            // if we have encountered a non-full node before and the current node
            // is not a leaf, a tree cannot be complete
            if (flag && (front.left != null || front.right != null)) {
                return false;
            }

            // if the left child is empty and the right child exists,
            // a tree cannot be complete
            if (front.left == null && front.right != null) {
                return false;
            }

            // if the left child exists, enqueue it
            if (front.left != null) {
                queue.add(front.left);
            }
            // if the current node is a non-full node, set the flag to true
            else {
                flag = true;
            }

            // if the right child exists, enqueue it
            if (front.right != null) {
                queue.add(front.right);
            }
            // if the current node is a non-full node, set the flag to true
            else {
                flag = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
         /* Construct the following tree
                  1
               /     \
              2       3
             / \     / \
            4   5   6   7
        */

        NodeCBT root = new NodeCBT(1);
        root.left = new NodeCBT(2);
        root.right = new NodeCBT(3);
        root.left.left = new NodeCBT(4);
        root.left.right = new NodeCBT(5);
        root.right.left = new NodeCBT(6);
        root.right.right = new NodeCBT(7);

        if (isComplete(root)) {
            System.out.println("Complete binary tree");
        } else {
            System.out.println("Not a complete binary tree");
        }
    }
}

// A class to store a binary tree node
class NodeCBT {
    int key;
    NodeCBT left = null, right = null;

    NodeCBT(int key) {
        this.key = key;
    }
}

/*Expected Output:

Complete binary tree

* */