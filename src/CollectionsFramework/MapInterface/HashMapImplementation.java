package CollectionsFramework.MapInterface;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * HashMap implements in JAVA with the help of
 * Array of LinkedList.<p>
 * Array of LL ==> Creates/Stored LinkedList in every index of Arrays
 * Lambda (λ) = NodeNumber/ArraySize;<p>
 * (λ) =< K(Constant Value) or, Threshold Value.
 * <p>
 * Threshold Value = A value that sets a limit or boundary,
 * above or below which a different state or condition is observed.
 * <p>
 * if (λ) Lambda Value increases equal to Threshold Value or more,
 * then, Buckets will be increased by times.
 * So that, ArraySize will be increased.
 * That is called ReHashing technique.
 * <p>
 * Input<Key> ==> Hash Function ==> Output<Bucket, index number>.
 */
public class HashMapImplementation {
    static class HashMap<Keys, Values> { //generics
        private class Node {
            Keys key;
            Values value;

            public Node(Keys key, Values value) {
                this.key = key;
                this.value = value;
            }
        }

        private int NodeNumber; // Total Number of Nodes
        private final int ArraySize; // Size of an Array - buckets
        /*Buckets ==> Every Index of Arrays of LinkedList
         * So that, index[0-2] == Buckets0, Buckets1, Buckets2 */
        private LinkedList<Node>[] buckets; //ArraySize = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.ArraySize = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(Keys key) {
            int bucketIndex = key.hashCode();
            // If hashCode returns negative values, then
            // we will convert it as a positive one through Math.abs(Absolute value)
            return Math.abs(bucketIndex) % ArraySize;
            // BucketIndex should between 0 to ArraySize-1 as always,
            // That's why, positive values % ArraySize.
        }

        private int searchInLinkedList(Keys key, int bucketIndex) {
            LinkedList<Node> nodeLinkedList = buckets[bucketIndex];

            for (int dataIndex = 0; dataIndex < nodeLinkedList.size(); dataIndex++) {
                if (nodeLinkedList.get(dataIndex).key == key) {
                    return dataIndex; // dataIndex
                }
            }

            return -1; // If Key doesn't exist
        }

        @SuppressWarnings("unchecked")
        private void reHashing() {  // If Old Buckets getting full
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[ArraySize * 2];
            for (int i = 0; i < ArraySize * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (LinkedList<Node> traversOldBucketIndex : oldBucket) {
                for (Node NodeData : traversOldBucketIndex) {
                    put(NodeData.key, NodeData.value);
                }
            }
        }

        public void put(Keys key, Values value) {
            int bucketIndex = hashFunction(key);
            // dataIndex == Represents the LinkedList index in Array Index.
            int dataIndex = searchInLinkedList(key, bucketIndex); //dataIndex = -1
            if (dataIndex == -1) { //key doesn't exist
                buckets[bucketIndex].add(new Node(key, value));
                NodeNumber++;
            } else { //key exists
                Node dataNode = buckets[bucketIndex].get(dataIndex);
                dataNode.value = value;
            }
            double lambda = (double) NodeNumber / ArraySize;

            if (lambda > 2.0) { // K = 2.0 (Constant Value)
                reHashing();   // reHashing technique
            }
        }

        public Values remove(Keys key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi); //di = -1
            if (di == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = buckets[bi].remove(di);
                NodeNumber--;
                return node.value;
            }
        }

        public Values get(Keys key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex); //dataIndex = -1
            if (dataIndex == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
        }

        public boolean containsKey(Keys key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi); //di = -1
            //key doesn't exist
            //key exists
            return di != -1;
        }

        public ArrayList<Keys> keySet() {
            ArrayList<Keys> keys = new ArrayList<>();
            for (LinkedList<Node> ll : buckets) { // Bucket Index
                for (Node node : ll) { //di
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return NodeNumber == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("India", 190);
        stringIntegerHashMap.put("China", 200);
        stringIntegerHashMap.put("US", 50);
        ArrayList<String> keys = stringIntegerHashMap.keySet();
        for (String key : keys) {
            System.out.println(key + " " + stringIntegerHashMap.get(key));
        }

        System.out.println(stringIntegerHashMap.containsKey("India"));

        stringIntegerHashMap.remove("India");
        System.out.println(stringIntegerHashMap.get("India"));
    }
}

/*Expected Output:

US 50
India 190
China 200
true
null

* */