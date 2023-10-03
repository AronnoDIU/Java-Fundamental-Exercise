package CollectionsFramework.QueueInterface;

// Calculate the height of a binary tree-Recursive Solution
public class CalculateHeightBinaryTree {
    // Recursive function to calculate the height of a given binary tree
    static int height(NodeCHBTIR root) {
        // base case: an empty tree has a height of 0
        if (root == null) {
            return 0;
        }

        // recur for the left and right subtree and consider maximum depth
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        NodeCHBTIR root = new NodeCHBTIR(15);
        root.left = new NodeCHBTIR(10);
        root.right = new NodeCHBTIR(20);
        root.left.left = new NodeCHBTIR(8);
        root.left.right = new NodeCHBTIR(12);
        root.right.left = new NodeCHBTIR(16);
        root.right.right = new NodeCHBTIR(25);

        System.out.println("The height of the binary tree is " + height(root));
    }
}

class NodeCHBTIR {
    int key;
    NodeCHBTIR left = null, right = null;

    NodeCHBTIR(int key) {
        this.key = key;
    }
}

/*Expected Output:

The height of the binary tree is 3

* */