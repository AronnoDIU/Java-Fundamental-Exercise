package RecursionProblems;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        return wordBreak(s, wordDict, 0);
    }

    private boolean wordBreak(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreak(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<String> wordDict = new HashSet<>();
        wordDict.add("leet");
        wordDict.add("code");

        WordBreak wordBreak = new WordBreak();
        String s = "leetcode";
        if (wordBreak.wordBreak(s, wordDict)) {
            System.out.println("The string can be segmented into a space-separated sequence of one or more dictionary words.");
        } else {
            System.out.println("The string cannot be segmented into a space-separated sequence of one or more dictionary words.");
        }
    }
}
