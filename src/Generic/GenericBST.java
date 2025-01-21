package Generic;

public class GenericBST<T extends Comparable<T>> {

    private class Node {
        T data;
        Node left, right;

        Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    public GenericBST() {
        root = null;
    }

    public void insert(T data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, T data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public boolean contains(T data) {
        return containsRec(root, data);
    }

    private boolean containsRec(Node root, T data) {
        if (root == null) {
            return false;
        }
        if (data.compareTo(root.data) == 0) {
            return true;
        }
        return data.compareTo(root.data) < 0 ? containsRec(root.left, data) : containsRec(root.right, data);
    }

    public void delete(T data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, T data) {
        if (root == null) {
            return null;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = deleteRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private T minValue(Node root) {
        T minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        GenericBST<Integer> bst = new GenericBST<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal:");
        bst.inorder();

        System.out.println("\n\nBST contains 40: " + bst.contains(40));
        System.out.println("BST contains 90: " + bst.contains(90));

        bst.delete(20);
        System.out.println("\nInorder traversal after deleting 20:");
        bst.inorder();

        bst.delete(30);
        System.out.println("\nInorder traversal after deleting 30:");
        bst.inorder();

        bst.delete(50);
        System.out.println("\nInorder traversal after deleting 50:");
        bst.inorder();
    }
}
