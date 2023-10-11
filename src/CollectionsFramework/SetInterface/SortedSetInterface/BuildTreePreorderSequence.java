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
//    Preorder => root -> left Subtree -> right Subtree
    static void preOrder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //    Inorder => left Subtree -> root -> right Subtree
    static void inOrder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //    Postorder => left Subtree -> right Subtree -> root
    static void postOrder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //     Level Order => 1st Level(Root) -> 2nd Level -> Nth Level(Leaf)
    // In Queue, when root will pop then child will be added.
    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(null);
        while (!nodeQueue.isEmpty()) {
            Node currentNode = nodeQueue.remove();
            if (currentNode == null) {
                System.out.println();
                if (nodeQueue.isEmpty()) { // When the Queue is empty
                    break;
                } else {
                    nodeQueue.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    nodeQueue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nodeQueue.add(currentNode.right);
                }
            }
        }
    }

    //    3. Height of Tree
    static int height(Node root) {
        if (root == null) {
            return 0;
        }


        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //    4. Count of Nodes of Tree
    static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        // Count Nodes => Left Subtree + Right Subtree + Root
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    //    5. Sum of Nodes of Tree
    static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }


        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    //    6. Diameter of Tree - Approach1 O(N^2)
    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }


        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);


        return Math.max(diam1, Math.max(diam2, diam3));
    }

//    7. Diameter of Tree - Approach2 O(N)
     /*static TreeInfo diameter(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }


        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);


        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;


        Int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;


        Int myDiam = Math.max(diam1, Math.max(diam2, diam3));


        return new TreeInfo(myHeight, myDiam);
    }*/

//    8. Subtree of another tree

    /*public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) &&
                    isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }*/

    public static void main(String[] args) {
        // Tree data given from Preorder Sequence
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//        BinaryTree tree = new BinaryTree();

        Node root = BinaryTree.buildTree(nodes);
        assert root != null;
        System.out.println(root.data);

//        Tree Traversals
        System.out.println("PreOrder Sequence");
        preOrder(root); // PreOrder Sequence
        System.out.println("\nInOrder Sequence");
        inOrder(root); // InOrder Sequence
        System.out.println("\nPostOrder Sequence");
        postOrder(root); // PostOrder Sequence
        System.out.println("\nLevelOrder Sequence");
        levelOrder(root); // LevelOrder Sequence
        System.out.print("Count Nodes: ");
        System.out.println(countOfNodes(root));
    }
}

/*Expected Output:

1
PreOrder Sequence
1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
InOrder Sequence
-1 4 -1 2 -1 5 -1 1 -1 3 -1 6 -1
PostOrder Sequence
-1 -1 4 -1 -1 5 2 -1 -1 -1 6 3 1
LevelOrder Sequence
1
2 3
4 5 6
Count Nodes: 6

* */