package CollectionsFramework;

/*Create a function boolean startsWith(String prefix) for a trie.
 * Returns true if there is a previously inserted string word that
 * has the prefix prefix, and false otherwise. */
public class StartsWithTrieDS {
    static class NodeSWTDS {
        NodeSWTDS[] children = new NodeSWTDS[26];
        boolean endOfWord;

        public NodeSWTDS() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static NodeSWTDS root = new NodeSWTDS();

    public static void insert(String word) { //O(n)
        NodeSWTDS currentRoot = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (currentRoot.children[index] == null) {
                currentRoot.children[index] = new NodeSWTDS();
            }
            currentRoot = currentRoot.children[index];
        }
        currentRoot.endOfWord = true;
    }

    public static boolean search(String key) { //O(n)
        NodeSWTDS currentRoot = root;
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
        String[] words = {"apple", "app", "mango", "man", "woman"};

        for (String wordList : words) {
            insert(wordList);
            System.out.println("inserted " + wordList);
        }
    }
}
