package CollectionsFramework;

/**
 * What is Trie?
 * <p>
 * Trie is a type of k-ary search tree used for storing and searching a
 * specific key from a set. Using Trie, search complexities can be brought
 * to optimal limit (key length).
 * <p>
 * Advantages of tries
 * <p>
 * 1. In tries the keys are searched using common prefixes. Hence, it is faster.
 * The lookup of keys depends upon the height in case of a binary search tree.
 * <p>
 * 2. Tries to take less space when they contain a large number of short strings.
 * As nodes are shared between the keys.
 * <p>
 * 3. Tries help with the longest prefix matching, when we want to find the key.
 */
public class TrieDataStructure {
    static class NodeTDS {
        NodeTDS[] children = new NodeTDS[26];
        boolean endOfWord;

        public NodeTDS() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
//            endOfWord=false;
        }
    }

    static NodeTDS root = new NodeTDS();


    public static void insert(String word) { //O(n)
        int level = 0;
        int len = word.length();
        int idx = 0;


        NodeTDS curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new NodeTDS();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static boolean search(String key) { //O(n)
        int level = 0;
        int len = key.length();
        int idx = 0;


        NodeTDS curr = root;
        for (; level < len; level++) {
            idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord == true;
    }


    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};

        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }


        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));


//        System.out.println(startsWith("the"));
//        System.out.println(startsWith("thi"));

    }
}