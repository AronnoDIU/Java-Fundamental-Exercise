package CollectionsFramework.TrieDataStructure;

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
 * 3. Tries help with the longest prefix matching when we want to find the key.
 */
/* ## Word Break Problem:
Given an input string and a dictionary of words, find out if the input string can be
 * broken into a space-seperated sequence of dictionary words
 *
 * Steps to solve
 * 1. Find all possible parts of String.
 * 2. Using loop,
 *      1st part, Trie Search;
 *      2nd part, call recursive;
 *          if, 1st & 2nd part return true, then it will return true;
 * 3. Otherwise, it will return false;

## StartsWith using Trie Data Structure:
Create a function boolean startsWith(String prefix) for a trie.
 * Returns true if there is a previously inserted string word that
 * has the prefix prefix, and false otherwise.

 ## Count Unique SubStrings:
 Given a string of length N of lowercase alphabet characters, we need
 to count the total number of distinct/unique substring of this string.
 Like, Given String = ababa;
 All possible Substrings = a, b, a, b, a,
                            ab, ba, ab, ba,
                            aba, bab, aba,
                            abab, baba,
                            ababa, "";

Only Unique Substrings = a, b, ab, ba, aba, bab, abab, baba, ababa, ""; 10 Ans;

Normally, Substring of a String is,
            Find all prefixes of all suffixes (Working with this because of Tries)
            or
            Find all suffixes of all prefixes.

  Steps for Solving Unique SubString.
    1. Find all Suffixes.
    2. Create a Trie from Suffixes.
    3. Count Nodes of Trie (Find Unique Prefixes).
        Total Number of Trie = Count of unique Prefixes.

  ## Longest Word with all Prefixes:
  Find the longest string in words such that every prefix of it is in words.
 */
public class TrieDS {
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

    // Word Break Method Implementation
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

    // 2nd Problem of Trie Data Structure.
    public static boolean startsWith(String prefix) {
        NodeTDS currentRoot = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (currentRoot.children[index] == null) {
                return false;
            }
            currentRoot = currentRoot.children[index];
        }
        return true;
    }

    // Question 3, Longest Word with all-Prefixes
    /*Case 1, Found the Longest Prefix then print.
     * Case 2, Found two equal length Prefix, then printed by the Lexicographically
     * smallest prefix.
     * Case 3, No Answer does not exist, then print empty string."". */
    public static String Answer = "";

    static void longestWord(NodeTDS root, StringBuilder tempAnswer) {
        if (root == null) {
            return; // Base Case
        }

        // Find LongestWord, which has endOfWord in every Node.
        for (int i = 0; i < 26; i++) {
            // Nodes are not Null && End of the Word is true;
            if (root.children[i] != null && root.children[i].endOfWord) {
                tempAnswer.append((char) (i + 'a'));
                // Check & Update from temporary to Final Answer;
                if (tempAnswer.length() > Answer.length()) {
                    Answer = tempAnswer.toString();
                }
                longestWord(root.children[i], tempAnswer);
                // Delete last index char for Backtracking purpose;
                tempAnswer.deleteCharAt(tempAnswer.length() - 1);
            }
        }
    }

    // Build Trie using String;
    public static void buildTrie(String string) {
        //insert all suffixes to Trie
        root = new NodeTDS();
        for (int i = 0; i < string.length(); i++) {
            insert(string.substring(i));
            System.out.println("inserted " + string.substring(i));
        }
    }

    /*Count Unique SubStrings using prefix, suffix concept;
    FoA, Find all Suffixes of given String, then find all unique prefixes.
   Steps for Solving Unique SubString.
   1. Find all Suffixes.
   2. Create a Trie from Suffixes.
   3. Count Nodes of Trie (Find Unique Prefixes).
   Total Number of Trie = Count of unique Prefixes.*/
    static int countNodes(NodeTDS root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1; //extra one for the self-node
    }

    public static void main(String[] args) {
        String[] wordsIS = {"the", "a", "there", "their", "any", "thee"};

        for (String wordList : wordsIS) {   // Insert & Search
            insert(wordList);
            System.out.println("inserted " + wordList);
        }

        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));

        // Word Break Problem
        System.out.println("Word Break Problem");

        String[] wordsWBP = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for (String wordList : wordsWBP) {  // Word Break Problem
            insert(wordList);
            System.out.println("inserted " + wordList);
        }

        System.out.println(wordBreak(key));

        // 3rd Problem of Trie Data Structure
        System.out.println("3rd Problem of Trie Data Structure.");

        String[] wordsSWTDS = {"apple", "app", "mango", "man", "woman"};

        for (String wordList : wordsSWTDS) {
            insert(wordList);
            System.out.println("inserted " + wordList);
        }

        System.out.println(startsWith("the"));
        System.out.println(startsWith("app"));
        System.out.println(startsWith("thi"));

        // 4th problem, Count Unique SubStrings
        String stringCount = "ababa";

        for (int i = 0; i < stringCount.length(); i++) {
            String Suffix = stringCount.substring(i);
            System.out.println(Suffix); // Print all Suffixes
            insert(Suffix); // Insert all Suffixes
            buildTrie(Suffix);
        }
        // For this particular problem, the answer will be 10;
        System.out.println("The total Node: " + countNodes(root));

        // 4th Problem, Longest Word with all Prefixes.
        String[] wordsLWP = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (String wordList : wordsLWP) {
            insert(wordList);
            System.out.println("inserted " + wordList);
        }

        longestWord(root, new StringBuilder());
        System.out.println(Answer);
    }
}

/*Expected Output:

Inserted the
inserted a
inserted there
inserted their
inserted any
inserted thee
thee -> true
thor -> false
Word Break Problem
inserted i
inserted like
inserted sam
inserted samsung
inserted mobile
true
3rd Problem of Trie Data Structure.
inserted apple
inserted app
inserted mango
inserted man
inserted woman
true
true
false
ababa
inserted ababa
inserted baba
inserted aba
inserted ba
inserted a
baba
inserted baba
inserted aba
inserted ba
inserted a
aba
inserted aba
inserted ba
inserted a
ba
inserted ba
inserted a
a
inserted a
The total Node: 2
inserted a
inserted banana
inserted app
inserted appl
inserted ap
inserted apply
inserted apple
apple

* */