package CollectionsFramework.QueueInterface;

/**First, modify the level order traversal on a given binary tree to maintain the
 * level of each node. Then while doing level order traversal,
 * if the current node happens to be the first or last
 * node at the current level, print it.*/
// Print corner nodes of every level in a binary tree
public class PrintCornerNodes {
    public static void main(String[] args) {

    }
}

// A class to store a binary tree node
class NodePCN {
    int data;
    NodePCN left = null, right = null;

    NodePCN(int data) {
        this.data = data;
    }
}