package CollectionsFramework.QueueInterface;

/**1. Iterative Implementation

 In the iterative version, perform a level order traversal on the tree.
 We can modify level order traversal to maintain nodes at the current level.
 Then, if the current node is the first node of the current level, print it.*/
public class PrintLeftViewBinaryTree {
    public static void main(String[] args) {

    }
}

// A class to store a binary tree NodePLVBT
class NodePLVBT {
    int key;
    NodePLVBT left = null, right = null;

    NodePLVBT(int key) {
        this.key = key;
    }
}