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

    static NodeBST insert(NodeBST root, int key) {
        if (root == null) {
            root = new NodeBST(key);
            return root;
        }

        if (root.data > key) {
            // left subtree
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        NodeBST root = null;
    }
}
