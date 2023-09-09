package BacktrackingProblems;

// Print all possible strings that can be made by placing spaces

/*Given a string, you need to print all possible strings that can be made by
placing spaces (zero or one) in between them.

Input:  str[] = "ABC"
Output: ABC
        AB C
        A BC
        A B C

The idea is to use recursion and create a buffer that one by one contains all output strings
having spaces. We keep updating the buffer in every recursive call. If the length of the
given string is ‘n’ our updated string can have a maximum length of n + (n-1) i.e., 2n-1.
So we create a buffer size of 2n (one extra character for string termination).
We leave the 1st character as it is, starting from the 2nd character,
we can either fill a space or a character. */
public class PrintStringsPlacingSpaces {
    // Function recursively prints the strings having a space
    static void printPatternUtil(String string, char[] buffer, int index, int j, int n) {
        if (index == n) {
            buffer[j] = '\0';
            System.out.println(buffer);
            return;
        }

        // Either put the character
        buffer[j] = string.charAt(index);
        printPatternUtil(string, buffer, index + 1, j + 1, n);

        // OR, put a space followed by the next character
        buffer[j] = ' ';
        buffer[j + 1] = string.charAt(index);

        printPatternUtil(string, buffer, index + 1, j + 2, n);
    }

    // Function creates buffer[] to store individual output
    // string and uses printPatternUtil() to print all permutations
    static void printPattern(String string) {
        int stringLength = string.length();

        // Buffer to hold the string containing spaces
        // 2n-1 characters and 1 string terminator
        char[] buffer = new char[2 * stringLength];

        // Copy the first character as it is, since it will
        // always be at first position
        buffer[0] = string.charAt(0);
        printPatternUtil(string, buffer, 1, 1, stringLength);
    }

    public static void main(String[] args) {
        String string = "ABCD";
        printPattern(string);
    }
}

/*Expected Output::

ABCD
ABC D
AB CD
AB C D
A BCD
A BC D
A B CD
A B C D

* */