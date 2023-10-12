package CollectionsFramework.SetInterface.SortedSetInterface;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1. Build Tree from given Preorder Sequence
 * 2. Tree Traversals,
 * Preorder => root -> left Subtree -> right Subtree
 * Inorder => left Subtree -> root -> right Subtree
 * Postorder => left Subtree -> right Subtree -> root
 * Level Order => 1st Level(Root) -> 2nd Level -> Nth Level(Leaf)
 * 3. Height of Tree
 * 4. Count of Nodes of Tree
 * 5. Sum of Nodes of Tree
 * 6. Diameter of Tree - Approach1 O(N^2)
 * 7. Diameter of Tree - Approach2 O(N)
 * 8. Subtree of another tree
 */
// Build Tree from given Preorder Sequence
public class BuildTreePreorderSequence {
    TreeNode subRoot;

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static TreeNode buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            TreeNode newTreeNode = new TreeNode(nodes[index]);
            newTreeNode.left = buildTree(nodes);
            newTreeNode.right = buildTree(nodes);
            return newTreeNode;
        }
    }

    /*Tree Traversals*/
//    Preorder => root -> left Subtree -> right Subtree
    static void preOrder(TreeNode root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //    Inorder => left Subtree -> root -> right Subtree
    static void inOrder(TreeNode root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //    Postorder => left Subtree -> right Subtree -> root
    static void postOrder(TreeNode root) {
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
    static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        treeNodeQueue.add(null);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode currentTreeNode = treeNodeQueue.remove();
            if (currentTreeNode == null) {
                System.out.println();
                if (treeNodeQueue.isEmpty()) { // When the Queue is empty
                    break;
                } else {
                    treeNodeQueue.add(null);
                }
            } else {
                System.out.print(currentTreeNode.data + " ");
                if (currentTreeNode.left != null) {
                    treeNodeQueue.add(currentTreeNode.left);
                }
                if (currentTreeNode.right != null) {
                    treeNodeQueue.add(currentTreeNode.right);
                }
            }
        }
    }

    //    3. Height of Tree
    static int heightOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Height of Tree => Distance of root to the deepest leaf
        int leftHeight = heightOfNodes(root.left);
        int rightHeight = heightOfNodes(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //    4. Count of Nodes of Tree
    static int countOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Count Nodes => Left Subtree + Right Subtree + Root
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    //    5. Sum of Nodes of Tree
    static int sumOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Summation Of Nodes => Total Left Subtrees + Total Right Subtrees + Roots
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    //    6. Diameter of Tree - Approach1 O(N^2)
    static int diameterOfNodes(TreeNode root) {
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

    static TreeInfo diameterApproach2(TreeNode root) {
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

//        TreeInfo treeInfo = new TreeInfo(currentHeight,currentDiameter);
        return new TreeInfo(currentHeight, currentDiameter);
    }


    //    8. Subtree of another tree
    static boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        /* Check if the data of both roots is same and data
           of left and right subtrees are also same */
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left)
                    && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        /* Check the tree with root as current node */
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        /* If the tree with root as current node doesn't match,
        then try left and right subtrees one by one */
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        // Tree data given from Preorder Sequence
        int[] NodesData1 = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//        int[] NodesData2 = {4, 1, 2}; // Subtree of another tree

//        BinaryTree tree = new BinaryTree();

        TreeNode root = BinaryTree.buildTree(NodesData1);
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
//        System.out.println(diameterApproach2(root).diameter);
        System.out.println(diameterApproach2(root)); // or, class toString

//        Subtree of another tree

        // TREE 2
        /* Construct the following tree
           10
         /    \
         4      6
          \
          30  */

        BuildTreePreorderSequence tree = new BuildTreePreorderSequence();

        tree.subRoot = new TreeNode(2);
        tree.subRoot.right = new TreeNode(4);
        tree.subRoot.left = new TreeNode(5);
        tree.subRoot.left.right = new TreeNode(30);

        if (isSubtree(root, tree.subRoot))
            System.out.println(
                    "Tree 2 is subtree of Tree 1 ");
        else
            System.out.println(
                    "Tree 2 is not a subtree of Tree 1");

//        TreeNode subRoot = BinaryTree.buildTree(NodesData2);
//        assert subRoot != null;
//        System.out.println(" is Subtree of another tree": + isSubtree(root, subRoot));

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
Tree 2 is not a subtree of Tree 1

* */