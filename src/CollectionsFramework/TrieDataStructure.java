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
        }
    }

    static NodeTDS root = new NodeTDS();

    public static void insert(String word) { //O(n)
        NodeTDS currentRoot = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (currentRoot.children[index] == null) {
                currentRoot.children[index] = new NodeTDS();
            }
            currentRoot = currentRoot.children[index];
        }
        currentRoot.endOfWord = true;
    }

    public static boolean search(String key) { //O(n)
        NodeTDS currentRoot = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (currentRoot.children[index] == null) {
                return false;
            }
            currentRoot = currentRoot.children[index];
        }
        return currentRoot.endOfWord;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};

        for (String wordList : words) {
            insert(wordList);
            System.out.println("inserted " + wordList);
        }

        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));
    }
}