package RecursionProblems;

// Print all the Unique Subsequences of a String

import java.util.HashSet;

/*if given String = "aaa";
 Then, Unique Subsequences count as 'a' to print
* */
public class PrintStringUniqueSubsequences {
    public static void
    stringSubsequences(String string, int index, String newString, HashSet<String> stringHashSet) {

        if (index == string.length()) {
            if (!stringHashSet.contains(newString)) {
                System.out.println(newString);
                stringHashSet.add(newString);
            }
            return;

            // OR

            /*if (stringHashSet.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                stringHashSet.add(newString);
                return;
            }*/
        }

        char currentCharacter = string.charAt(index);

        // wanted to be
        stringSubsequences(string, index + 1, newString + currentCharacter, stringHashSet);

        // not wanted to be
        stringSubsequences(string, index + 1, newString, stringHashSet);
    }

    public static void main(String[] args) {
        String string = "aaa";
        HashSet<String> stringHashSet = new HashSet<>();
        stringSubsequences(string, 0, "", stringHashSet);
    }
}

/*
Expected Output::

aaa
aa
a

* */