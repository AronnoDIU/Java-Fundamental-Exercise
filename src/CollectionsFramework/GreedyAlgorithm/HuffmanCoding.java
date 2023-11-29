package CollectionsFramework.GreedyAlgorithm;

public class HuffmanCoding {
    public static void main(String[] args) {
        int[] freq = {5, 9, 12, 13, 16, 45};
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};

        PriorityQueue<Node> pq = new PriorityQueue<>(freq.length, new MyComparator());

        for (int i = 0; i < freq.length; i++) {
            Node node = new Node();
            node.c = chars[i];
            node.data = freq[i];

            node.left = null;
            node.right = null;

            pq.add(node);
        }

        Node root = null;

        while (pq.size() > 1) {
            Node x = pq.peek();
            pq.poll();

            Node y = pq.peek();
            pq.poll();

            Node f = new Node();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            pq.add(f);
        }

        printCode(root, "");
    }
}
