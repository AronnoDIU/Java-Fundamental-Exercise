package CollectionsFramework.QueueInterface;

/**
 * We can solve this problem by using the properties of a complete binary tree.
 * We know that in the array representation of a binary tree,
 * the left child for a node at index i is present at index 2i+1, and the right
 * child is present at index 2i+2. If we construct an array with all the tree
 * elements at the corresponding positions, then the elements will hold
 * consecutive positions for a complete binary tree. If any vacant position
 * is found, then the tree cannot be complete.
 */
// 2. Array representation of a complete tree
public class CheckBinaryTreeArrayRep {
    // Utility function to calculate the total number of nodes in a binary tree
    private static int size(NodeCBTAR root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    // Perform inorder traversal on the binary tree and fill array `A[]`
    static void inorder(NodeCBTAR root, boolean[] A, int i) {
        if (root == null || i >= A.length) {
            return;
        }

        // recur with index `2i+1` for left node
        inorder(root.left, A, 2 * i + 1);

        // mark index `i` as visited
        A[i] = true;

        // recur with index `2i+2` for the right node
        inorder(root.right, A, 2 * i + 2);
    }

    // Function to check if a given binary tree is a complete binary tree or not
    static boolean isComplete(NodeCBTAR root, int n) {
        // return if the tree is empty
        if (root == null) {
            return true;
        }

        // construct an auxiliary boolean array of size `n`
        boolean[] A = new boolean[n];

        // fill array `A[]`
        inorder(root, A, 0);

        // check if all positions in the array are filled or not
        for (boolean e : A) {
            if (!e) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}

// A class to store a binary tree node
class NodeCBTAR {
    int key;
    NodeCBTAR left = null, right = null;

    NodeCBTAR(int key) {
        this.key = key;
    }
}