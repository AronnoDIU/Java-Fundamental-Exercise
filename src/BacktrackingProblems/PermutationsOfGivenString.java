package BacktrackingProblems;

/*Given a string S, the task is to write a program to print all permutations of a given string.

    A permutation also called an “arrangement number” or “order,” is a rearrangement of the
    elements of an ordered list S into a one-to-one correspondence with S itself.

    A string of length N has N! Permutations.

Examples:

    Input: S = “ABC”
    Output: “ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”

    Input: S = “XY”
    Output: “XY”, “YX”*/

/*Follow the given steps to solve the problem:

    1. Create a function makePermutation() with parameters as input string,
    starting index of the string, ending index of string
    2. Call this function with values input string, 0, size of string – 1
         a). In this function, if the value of L and R is the same, then print the same string
         b). Else run a for loop from L to R and swap the current element in the for
         loop with the inputString[L]
         c). Then again, call this same function by increasing the value of L by 1
         d). After that again swap the previously swapped values to initiate backtracking */
public class PermutationsOfGivenString {
    /**
     * makePermutation method
     * @param string string to calculate permutation for
     * @param indexL starting index
     * @param indexR end index
     */
    private void makePermutation(String string, int indexL, int indexR) {
        if (indexL == indexR)
            System.out.println(string);
        else {
            for (int i = indexL; i <= indexR; i++) {
                string = swap(string, indexL, i);
                makePermutation(string, indexL + 1, indexR);
                string = swap(string, indexL, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param stringValue string value
     * @param positionI   position 1
     * @param positionJ   position 2
     * @return swapped string
     */
    public String swap(String stringValue, int positionI, int positionJ) {
        char temporaryValue;
        char[] charArray = stringValue.toCharArray();
        temporaryValue = charArray[positionI];
        charArray[positionI] = charArray[positionJ];
        charArray[positionJ] = temporaryValue;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String string = "ABC";
        int stringLength = string.length();
        PermutationsOfGivenString permutation = new PermutationsOfGivenString();
        permutation.makePermutation(string, 0, stringLength - 1);
    }
}

/*Expected Output::

ABC
ACB
BAC
BCA
CBA
CAB

* */
