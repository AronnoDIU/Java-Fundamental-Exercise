package CollectionsFramework.GreedyAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanDecoding {
    private static final Map<Character, String> codes = new HashMap<>();
    private static final Map<Character, Integer> freq = new HashMap<>();
    private static final PriorityQueue<MinHeapNode> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String encodedString = "";
        String decodedString = "";
        calcFreq(str);
        HuffmanCodes(str.length());
        System.out.println("Character With their Frequencies:");
        for (Map.Entry<Character, String> entry : codes.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (char c : str.toCharArray()) {
            encodedString += codes.get(c);
        }
        System.out.println("\nEncoded Huffman data:");
        System.out.println(encodedString);
        decodedString = decodeFile(minHeap.peek(), encodedString);
        System.out.println("\nDecoded Huffman Data:");
        System.out.println(decodedString);
    }

    private static void HuffmanCodes(int size) {
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            minHeap.add(new MinHeapNode(entry.getKey(), entry.getValue()));
        }
        while (minHeap.size() != 1) {
            MinHeapNode left = minHeap.poll();
            MinHeapNode right = minHeap.poll();
            assert left != null;
            assert right != null;
            MinHeapNode top = new MinHeapNode('$', left.freq + right.freq);
            top.left = left;
            top.right = right;
            minHeap.add(top);
        }
        storeCodes(minHeap.peek(), "");
    }

    private static void calcFreq(String str) {
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
    }

    private static void storeCodes(MinHeapNode root, String str) {
        if (root == null) {
            return;
        }
        if (root.data != '$') {
            codes.put(root.data, str);
        }
        storeCodes(root.left, str + "0");
        storeCodes(root.right, str + "1");
    }

    private static String decodeFile(MinHeapNode root, String s) {
        StringBuilder ans = new StringBuilder();
        MinHeapNode curr = root;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
            assert curr != null;
            if (curr.left == null && curr.right == null) {
                ans.append(curr.data);
                curr = root;
            }
        }
        return ans.toString() + '\0';
    }

}

class MinHeapNode implements Comparable<MinHeapNode> {
    char data;
    int freq;
    MinHeapNode left, right;

    MinHeapNode(char data, int freq) {
        this.data = data;
        this.freq = freq;
    }

    public int compareTo(MinHeapNode other) {
        return this.freq - other.freq;
    }
}

/*
Expected Output:

Character With their Frequencies:
f 5
r 2
o 2
g 2
k 2
e 4
s 2
h 1
u 1
i 1

 */