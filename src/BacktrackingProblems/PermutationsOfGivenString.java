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

    1. Create a function permute() with parameters as input string,
    starting index of the string, ending index of string
    2. Call this function with values input string, 0, size of string – 1
         a). In this function, if the value of L and R is the same, then print the same string
         b). Else run a for loop from L to R and swap the current element in the for
         loop with the inputString[L]
         c). Then again, call this same function by increasing the value of L by 1
         d). After that again swap the previously swapped values to initiate backtracking */
public class PermutationsOfGivenString {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        PermutationsOfGivenString permutation = new PermutationsOfGivenString();
        permutation.permute(str, 0, n - 1);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
