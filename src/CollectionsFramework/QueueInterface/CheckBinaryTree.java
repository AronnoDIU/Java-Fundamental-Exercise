package CollectionsFramework.QueueInterface;

/**
 * 1. Level Order Traversal (BFS)
 * <p>
 * We can modify level order traversal to check if a given
 * binary tree is a complete binary tree or not.
 * The idea is for every dequeued node, check if
 * it is a full node (have both left and right children).
 * If a node is found that is not a full node,
 * i.e., either it has no children or only one child,
 * then all the remaining nodes in the queue should not have any children.
 * If anyone has a child, then it’s not a complete binary tree; otherwise, it is.
 */
// Check if a binary tree is a complete binary tree or not
public class CheckBinaryTree {
    public static void main(String[] args) {

    }
}

// A class to store a binary tree node
class NodeCBT {
    int key;
    NodeCBT left = null, right = null;

    NodeCBT(int key) {
        this.key = key;
    }
}