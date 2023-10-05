package CollectionsFramework.QueueInterface;

/**
 * We have already discussed preorder, inorder and postorder traversals of the binary tree,
 * which are nothing but variations of Depth–first search of a Tree.
 * Trees can also be traversed in level order, where we visit every node
 * on a level before going to a lower level.
 * This search is referred to as level order traversal or Breadth - first search (BFS),
 * as the search tree is broadened as much as possible on each depth before going
 * to the next depth.
 * <p>
 * <p>
 * A simple solution is to print all nodes of level 1 first, followed by level 2,
 * until level h, where h is the tree’s height.
 * We can print all nodes present in a level by modifying the preorder traversal
 * on the tree.
 */
// Level order traversal of a binary tree
public class LevelOrderTraversalBinaryTree {
    // Function to print all nodes of a given level from left to right
    static boolean printLevel(NodeLOTB root, int level) {
        // base case
        if (root == null) {
            return false;
        }

        if (level == 1) {
            System.out.print(root.key + " ");

            // return true if at least one node is present at a given level
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
    }

    // Function to print level order traversal of a given binary tree
    static void levelOrderTraversal(NodeLOTB root) {
        // start from level 1 — till the height of the tree
        int level = 1;

        // run till printLevel() returns false
        while (printLevel(root, level)) {
            level++;
        }
    }

    public static void main(String[] args) {
        NodeLOTB root = new NodeLOTB(15);
        root.left = new NodeLOTB(10);
        root.right = new NodeLOTB(20);
        root.left.left = new NodeLOTB(8);
        root.left.right = new NodeLOTB(12);
        root.right.left = new NodeLOTB(16);
        root.right.right = new NodeLOTB(25);

        levelOrderTraversal(root);
    }
}

class NodeLOTB {
    int key;
    NodeLOTB left = null, right = null;

    NodeLOTB(int key) {
        this.key = key;
    }
}

/*Expected Output:

15 10 20 8 12 16 25

* */