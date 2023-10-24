package CollectionsFramework;

/*Given an input string and a dictionary of words, find out if the input string can be
 * broken into a space-seperated sequence of dictionary words
 *
 * Steps to solve
 * 1. Find all possible parts of String.
 * 2. Using loop,
 *      1st part, Trie Search;
 *      2nd part, call recursive;
 *          if, 1st & 2nd part return true, then it will return true;
 * 3. Otherwise, it will return false;
 * */
public class WordBreakTrieDS {
    static class NodeWBTDS {
        NodeWBTDS[] children = new NodeWBTDS[26];
        boolean endOfWord;

        public NodeWBTDS() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static NodeWBTDS root = new NodeWBTDS();

    public static void insert(String word) { //O(n)
        NodeWBTDS currentRoot = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (currentRoot.children[index] == null) {
                currentRoot.children[index] = new NodeWBTDS();
            }
            currentRoot = currentRoot.children[index];
        }
        currentRoot.endOfWord = true;
    }

    public static boolean search(String key) { //O(n)
        NodeWBTDS currentRoot = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (currentRoot.children[index] == null) {
                return false;
            }
            currentRoot = currentRoot.children[index];
        }
        return currentRoot.endOfWord;
    }

    public static boolean wordBreak(String key) {
        if (key.isEmpty()) { // Base Case
            return true;     // Because the root Node is empty;
        }

        for (int index = 1; index <= key.length(); index++) {
            if (search(key.substring(0, index)) &&  // First Part
                    wordBreak(key.substring(index))) { // Second Part
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for (String wordList : words) {
            insert(wordList);
            System.out.println("inserted " + wordList);
        }

        System.out.println(wordBreak(key));
    }
}
