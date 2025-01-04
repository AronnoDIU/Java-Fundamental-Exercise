package RecursionProblems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = getPermutations(str);
        System.out.println("Permutations of " + str + ": " + permutations);
    }

    public static List<String> getPermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            result.add("");
            return result;
        }
        char firstChar = str.charAt(0);
        String remainingString = str.substring(1);
        List<String> words = getPermutations(remainingString);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                result.add(insertCharAt(word, firstChar, i));
            }
        }
        return result;
    }

    private static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }
}