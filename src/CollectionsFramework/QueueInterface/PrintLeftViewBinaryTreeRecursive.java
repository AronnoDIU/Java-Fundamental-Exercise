package CollectionsFramework.QueueInterface;

import java.util.HashMap;
import java.util.Map;

/**2. Recursive implementation using hashing

 We can also solve this problem by using hashing. The idea is to traverse the tree
 in a pre-order fashion and pass level information in function arguments. If the
 level is visited for the first time, insert the current node and level information
 into the map. Finally, when all nodes are processed,
 traverse the map and print the left view.*/
public class PrintLeftViewBinaryTreeRecursive {
    // Recursive function to traverse the nodes in a preorder fashion
    static void
    leftView(NodePLVBTR root, int level, Map<Integer, Integer> map) {
        // base case
        if (root == null) {
            return;
        }

        // if the level is visited for the first time, insert the current node
        // and level information into the map
        map.putIfAbsent(level, root.key);

        leftView(root.left, level + 1, map);
        leftView(root.right, level + 1, map);
    }

    // Function to print the left view of a given binary tree
    static void leftView(NodePLVBTR root) {
        // create an empty HashMap to store the first node for each level
        Map<Integer, Integer> map = new HashMap<>();

        // traverse the tree and fill the map
        leftView(root, 1, map);

        // iterate through the HashMap in sorted order of its keys
        // and print the left view
        for (int i = 1; i <= map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }
    public static void main(String[] args) {

    }
}

// A class to store a binary tree node
class NodePLVBTR {
    int key;
    NodePLVBTR left = null, right = null;

    NodePLVBTR(int key) {
        this.key = key;
    }
}