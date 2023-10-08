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

        return (root.right == null || 2 * i + 2 < n) &&
                isComplete(root.right, 2 * i + 2, n);
    }

    public static void main(String[] args) {
        /* Construct the following tree
                  1
                /   \
               /     \
              2       3
             / \     / \
            4   5   6   7
        */

        NodeCBTSO root = new NodeCBTSO(1);
        root.left = new NodeCBTSO(2);
        root.right = new NodeCBTSO(3);
        root.left.left = new NodeCBTSO(4);
        root.left.right = new NodeCBTSO(5);
        root.right.left = new NodeCBTSO(6);
        root.right.right = new NodeCBTSO(7);

        if (isComplete(root, 0, size(root))) {
            System.out.println("Complete binary tree");
        } else {
            System.out.println("Not a complete binary tree");
        }
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

/*Expected Output:

Complete binary tree

* */