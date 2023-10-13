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

    static boolean search(NodeBST root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) { // left subtree
            return search(root.left, key);
        }
        else if (root.data == key) {
            return true;
        }
        else if (root.data < key) {
            return search(root.right, key);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        NodeBST root = null;

        for (int EnhancedValue : values) {
            root = insert(root, EnhancedValue);
        }
        inOrder(root);
    }
}

/*Expected Output:

1 2 3 4 5 7

* */