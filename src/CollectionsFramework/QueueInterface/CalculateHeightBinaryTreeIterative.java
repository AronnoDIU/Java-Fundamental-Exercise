package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

// Calculate the height of a binary tree – Iterative
public class CalculateHeightBinaryTreeIterative {
    // Iterative function to calculate the height of a given binary tree
    // by doing level order traversal on the tree
    static int height(NodeCHBTI root) {
        // empty tree has a height of 0
        if (root == null) {
            return 0;
        }

        // create an empty queue and enqueue the root node
        Queue<NodeCHBTI> queue = new ArrayDeque<>();
        queue.add(root);

        Node front = null;
        int height = 0;

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // calculate the total number of nodes at the current level
            int size = queue.size();

            // process each node of the current level and enqueue their
            // non-empty left and right child
            while (size-- > 0) {
                front = queue.poll();

                if (front.left != null) {
                    queue.add(front.left);
                }

                if (front.right != null) {
                    queue.add(front.right);
                }
            }

            // increment height by 1 for each level
            height++;
        }

        return height;
    }

    public static void main(String[] args) {
        NodeCHBTI root = new NodeCHBTI(15);
        root.left = new NodeCHBTI(10);
        root.right = new NodeCHBTI(20);
        root.left.left = new NodeCHBTI(8);
        root.left.right = new NodeCHBTI(12);
        root.right.left = new NodeCHBTI(16);
        root.right.right = new NodeCHBTI(25);

        System.out.println("The height of the binary tree is " + height(root));
    }
}

// A class to store a binary tree node
class NodeCHBTI {
    int key;
    NodeCHBTI left = null, right = null;

    NodeCHBTI(int data) {
        this.key = data;
    }
}

/*Expected Output:

Inserting 1
Inserting 2
Inserting 3
Inserting 4
The front element is 1
Removing 1
Removing 2
Removing 3
Removing 4
The queue is empty

* */