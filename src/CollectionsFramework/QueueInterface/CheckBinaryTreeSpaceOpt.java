package CollectionsFramework.QueueInterface;

/**
 * 3. Space-optimized previous Approach
 * <p>
 * The above approach takes extra space for storage of the boolean array.
 * As discussed for a complete binary tree,the left and right child’s index
 * for any node is less than the total number of nodes for every node.
 * We can avoid using extra space by passing the index as a recursion parameter
 * and checking for every node that their left and right child’s
 * index is within the correct range.
 */
// Space-optimized previous Approach
public class CheckBinaryTreeSpaceOpt {
    public static void main(String[] args) {

    }
}


// A class to store a binary tree node
class NodeCBTSO {
    int key;
    NodeCBTSO left = null, right = null;

    NodeCBTSO(int key) {
        this.key = key;
    }
}