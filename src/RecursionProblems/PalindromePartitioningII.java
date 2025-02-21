package RecursionProblems;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningII {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s);
        return result;
    }

    private void backtrack(List<List<String>> result, List<String> tempList, String s) {
        if (s.isEmpty()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (isPalindrome(s, i)) {
                    tempList.add(s.substring(0, i + 1));
                    tempList.removeLast(); // backtrack
                }
            }
        }
    }

    private boolean isPalindrome(String s, int high) {
        while (0 < high) {
            if (s.charAt(high) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitioningII pp = new PalindromePartitioningII();
        String s = "aab";
        List<List<String>> result = pp.partition(s);
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}
