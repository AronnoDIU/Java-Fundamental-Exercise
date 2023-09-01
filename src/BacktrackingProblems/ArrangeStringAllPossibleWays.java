package BacktrackingProblems;

// Arrange them in a Single line
// Permutations using Backtracking
public class ArrangeStringAllPossibleWays {
    public static void
    printPermutations(String string, String permutations, int index) {

        if (string.isEmpty()) {
            System.out.println(permutations);
            return;
        }


        for (int i = 0; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            String newString = string.substring(0, i) + string.substring(i + 1);
            printPermutations(newString, permutations + currentCharacter, index + 1);
        }
    }

    public static void main(String[] args) {
        String string = "ABC";
        printPermutations(string, "", 0);
    }
}

/*
Expected Output::

ABC
ACB
BAC
BCA
CAB
CBA

* */