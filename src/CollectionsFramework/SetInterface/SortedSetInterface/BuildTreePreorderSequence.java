package CollectionsFramework.SetInterface.SortedSetInterface;

// Build Tree from given Preorder Sequence
public class BuildTreePreorderSequence {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        // Tree data given from Preorder Sequence
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//        BinaryTree tree = new BinaryTree();

        Node root = BinaryTree.buildTree(nodes);
        assert root != null;
        System.out.println(root.data);

    }
}

/*Expected Output:

1

* */