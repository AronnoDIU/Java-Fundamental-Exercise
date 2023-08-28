package RecursionProblems;

// Print all permutations of a String

/*Permutation ==> All Possible combination of letters
                  abc
--------------------------------------------------
|         |        |        |        |          |
abc      acb      bac      bca      cab         cba
* */
public class PrintStringPermutations {
    public static void
    printPermutations(String string, String permutation) {

        if (string.isEmpty()) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            // "abc" ===> "ab"
            String newString = string.substring(0, i) + string.substring(i + 1);

            printPermutations(newString, permutation + currentCharacter);
        }
    }

    public static void main(String[] args) {
        String string = "abc";
        printPermutations(string, "");
    }
}

/*
Expected Output::

abc
acb
bac
bca
cab
cba

* */