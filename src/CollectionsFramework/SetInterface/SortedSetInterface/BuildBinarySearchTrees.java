package CollectionsFramework.SetInterface.SortedSetInterface;

/**
 * Cases for Deletion
 * 1. No Child (Leaf Node) => Delete Node & Return Null to parent.
 * 2. One Child => Delete Node & replace with child Node
 * 3. Two Children => Replace value with in-Order successor
 * & Delete the Node for in-Order successor.
 * <p>
 * N.B. => in-Order Successor always has 0 or 1 children.
 */
public class BuildBinarySearchTrees {
    static class NodeBST {
        int data;
        NodeBST left;
        NodeBST right;

        public NodeBST(int data) {
            this.data = data;
        }
    }

    static NodeBST insert(NodeBST root, int values) {
        if (root == null) {
            root = new NodeBST(values);
            return root;
        }

        if (root.data > values) {
            // left subtree
            root.left = insert(root.left, values);
        } else {
            root.right = insert(root.right, values);
        }
        return root;
    }

    //    Inorder => left Subtree -> root -> right Subtree
    static void inOrder(NodeBST root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " "); // Always Sorted in BST
        inOrder(root.right);
    }

    static boolean search(NodeBST root, int key) { // TimeComplexity:O(H)
        if (root == null) { // Base Case
            return false;
        }
        if (root.data > key) { // left subtree
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    static NodeBST delete(NodeBST root, int values) {
        if (root.data > values) {
            root.left = delete(root.left, values);
        } else if (root.data < values) {
            root.right = delete(root.right, values);
        } else {    // root.data == values
            // Case 1, No Child(Leaf Node) => Delete Node & Return Null to parent.
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2, One Child => Delete Node & replace with child Node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            /* In in-Order Successor in BST => Left most in Right Subtree.
             Case 3, Two Children => Replace value with in-Order successor
                          & Delete the Node for in-Order successor.
             N.B. => in-Order Successor always has 0 or 1 children.*/
            NodeBST IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // In in-Order Successor in BST => Left most in Right Subtree.
    static NodeBST inOrderSuccessor(NodeBST root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    /*Print in Range, X = 6 && Y = 10
     *   Case 1, X <= root <= Y ==> Left & Right
     *   Case 2, X > root ==> Right
     *   Case 3, Y < root ==> Left
     * */
    static void printInRange(NodeBST root, int X, int Y) {
        if (root == null) {    // Base Case
            return;
        }
        // case 1, X <= root <= Y ==> Left & Right
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.println(root.data + " ");
            printInRange(root.right, X, Y);
        }
        // Case 3, Y < root ==> Left
        else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        }
        // Case 2, X > root ==> Right
        else {
            printInRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
//        int[] values = {5, 1, 3, 4, 2, 7};
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        NodeBST root = null;

        for (int EnhancedValue : values) {
            root = insert(root, EnhancedValue);
        }
        inOrder(root);
        System.out.println();
        if (search(root, 1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        delete(root, 4);
        inOrder(root);
    }
}

/*Expected Output:

1 3 4 5 6 8 10 11 14
Found
1 3 5 6 8 10 11 14

* */