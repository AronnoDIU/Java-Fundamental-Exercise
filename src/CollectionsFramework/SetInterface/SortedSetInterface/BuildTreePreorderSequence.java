package CollectionsFramework.SetInterface.SortedSetInterface;

import java.util.LinkedList;
import java.util.Queue;

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

    /*Tree Traversals*/
//    Preorder -> root -> left -> right
    static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //    Inorder
    static void inorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //    Postorder
    static void postorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //     Level Order
    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(null);
        while (!nodeQueue.isEmpty()) {
            Node curr = nodeQueue.remove();
            if (curr == null) {
                System.out.println();
                //queue empty
                if (nodeQueue.isEmpty()) {
                    break;
                } else {
                    nodeQueue.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    nodeQueue.add(curr.left);
                }
                if (curr.right != null) {
                    nodeQueue.add(curr.right);
                }
            }
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