package CollectionsFramework.SetInterface.SortedSetInterface;

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
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
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
    }
}

/*Expected Output:

1 3 4 5 6 8 10 11 14
Found

* */