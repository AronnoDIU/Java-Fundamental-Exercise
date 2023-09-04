package BacktrackingProblems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*An expression will be given which can contain open and close parentheses
and optionally some characters, No other operator will be there in string.
We need to remove the minimum number of parentheses to make the input string valid.
If more than one valid output is possible, remove the same number of parentheses,
then print all such output. */
public class RemoveInvalidParentheses {
    // method checks if character is parenthesis(open or closed)
    static boolean isParenthesis(char c) {
        return ((c == '(') || (c == ')'));
    }

    // method returns true if string contains valid parenthesis
    static boolean isValidString(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                cnt++;
            else if (str.charAt(i) == ')')
                cnt--;
            if (cnt < 0)
                return false;
        }
        return (cnt == 0);
    }

    // method to remove invalid parenthesis
    static void removeInvalidParenthesis(String string) {
        if (string.isEmpty())
            return;

        // visit set to ignore already visited string
        HashSet<String> visit = new HashSet<>();

        // queue to maintain BFS
        Queue<String> q = new LinkedList<>();
        String temp;
        boolean level = false;

        // pushing given string as
        // starting node into queue
        q.add(string);
        visit.add(string);
        while (!q.isEmpty()) {
            string = q.peek();
            q.remove();
            if (isValidString(string)) {
                System.out.println(string);

                // If an answer is found, make the level true
                // so that valid string of only that level is processed.
                level = true;
            }
            if (level)
                continue;
            for (int i = 0; i < string.length(); i++) {
                if (!isParenthesis(string.charAt(i)))
                    continue;

                // Removing parenthesis from string and
                // pushing into queue,if not visited already
                temp = string.substring(0, i) + string.substring(i + 1);
                if (!visit.contains(temp)) {
                    q.add(temp);
                    visit.add(temp);
                }
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        String expression = "()())()";
        removeInvalidParenthesis(expression);

        expression = "()v)";
        removeInvalidParenthesis(expression);
    }
}

/*Expected Output::

(())()
()()()
(v)
()v

* */
