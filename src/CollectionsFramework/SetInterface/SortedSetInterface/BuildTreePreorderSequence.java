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
    static int heightOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        // Height of Tree => Distance of root to the deepest leaf
        int leftHeight = heightOfNodes(root.left);
        int rightHeight = heightOfNodes(root.right);
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
        // Summation Of Nodes => Total Left Subtrees + Total Right Subtrees + Roots
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    //    6. Diameter of Tree - Approach1 O(N^2)
    static int diameterOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        // Finds All paths between Left Height & Right Height through Root;
        // Finally, Root will add plus 1 => LH + RH +1;
        int diameter1 = heightOfNodes(root.left)
                + heightOfNodes(root.right) + 1;
        // Finds More paths in Left Subtrees without Root
        int diameter2 = diameterOfNodes(root.left);
        // Finds More paths in Right Subtrees without Root
        int diameter3 = diameterOfNodes(root.right);

        return Math.max(diameter1, Math.max(diameter2, diameter3));
    }

    //    7. Diameter of Tree - Approach2 O(N)
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }

        @Override
        public String toString() {
            return "TreeInfo{" + "Height of Nodes =" + height +
                    ", Diameter of Nodes =" + diameter + '}';
        }
    }

    static TreeInfo diameterApproach2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTreeInfo = diameterApproach2(root.left);
        TreeInfo rightTreeInfo = diameterApproach2(root.right);

        int currentHeight = Math.max(leftTreeInfo.height, rightTreeInfo.height) + 1;

        int diameter1 = leftTreeInfo.height + rightTreeInfo.height + 1;
        int diameter2 = leftTreeInfo.diameter;
        int diameter3 = rightTreeInfo.diameter;

        int currentDiameter = Math.max(diameter1, Math.max(diameter2, diameter3));

        return new TreeInfo(currentHeight, currentDiameter);
    }


//    8. Subtree of another tree

    /*public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
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
        System.out.print("Summation of Nodes: ");
        System.out.println(sumOfNodes(root));
        System.out.print("Height of Nodes: ");
        System.out.println(heightOfNodes(root));
        System.out.print("Diameter of Nodes (Approach 1): ");
        System.out.println(diameterOfNodes(root));
        System.out.print("Diameter of Nodes (Approach 2): ");
        System.out.println(diameterApproach2(root));
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
Summation of Nodes: 21
Height of Nodes: 3
Diameter of Nodes (Approach 1): 5
Diameter of Nodes (Approach 2): TreeInfo{Height of Nodes =3, Diameter of Nodes =5}

* */