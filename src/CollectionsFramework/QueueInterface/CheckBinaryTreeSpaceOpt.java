package CollectionsFramework.QueueInterface;

/**
 * 3. Space-optimized previous Approach
 * <p>
 * The above approach takes extra space for storage of the boolean array.
 * As discussed for a complete binary tree,the left and right child’s index
 * for any node is less than the total number of nodes for every node.
 * We can avoid using extra space by passing the index as a recursion parameter
 * and checking for every node that their left and right child’s
 * index is within the correct range.
 */
// Space-optimized previous Approach
public class CheckBinaryTreeSpaceOpt {
    private static int size(NodeCBTSO root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    // Recursive function to check if a given binary tree is a complete tree or not
    static boolean isComplete(NodeCBTSO root, int i, int n) {
        // return if the tree is empty
        if (root == null) {
            return true;
        }

        if ((root.left != null && 2 * i + 1 >= n) ||
                !isComplete(root.left, 2 * i + 1, n)) {
            return false;
        }

        if ((root.right != null && 2 * i + 2 >= n) ||
                !isComplete(root.right, 2 * i + 2, n)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}


// A class to store a binary tree node
class NodeCBTSO {
    int key;
    NodeCBTSO left = null, right = null;

    NodeCBTSO(int key) {
        this.key = key;
    }
}