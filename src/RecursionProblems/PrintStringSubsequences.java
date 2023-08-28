package RecursionProblems;

// Print all the Subsequences of a String

/* What is Subsequences?
 Given String ="abc";
           if 'a' wanted to come        if 'a' not wanted to come
                        a                       -
                    /      \                /        \
                  ab         a-           -b          --
                /    \      /   \       /   \       /     \
             abc    ab-   a-c   a--   -bc   -b-   --c     ---
         The last leaf of above sequences is called Subsequences
So, the final Subsequences are = abc, ab, ac, a, bc, b, c, -   ;
Then, the define order of Subsequences are = abc, ab, bc, ac, a, b, c   ;
* */
public class PrintStringSubsequences {
    public static void
    stringSubsequences(String string, int index, String newString) {

        if (index == string.length()) {
            System.out.println(newString);
            return;
        }

        char currentCharacter = string.charAt(index);

        // wanted to be
        stringSubsequences(string, index + 1, newString + currentCharacter);

        // not wanted to be
        stringSubsequences(string, index + 1, newString);
    }

    public static void main(String[] args) {
        String string = "abc";
        stringSubsequences(string, 0, "");
    }
}

/*
Expected Output::

abc
ab
ac
a
bc
b
c

* */