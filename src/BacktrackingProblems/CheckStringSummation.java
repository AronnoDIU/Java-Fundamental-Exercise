package BacktrackingProblems;

// Check if a given string is Summation-string

/*Given a string of digits, determine whether it is a ‘sum-string’. A string S is called
a sum-string if the rightmost substring can be written as the sum of two substrings
before it and the same is recursively true for substrings before it.

Examples:

“12243660” is a sum string.
Explanation : 24 + 36 = 60, 12 + 24 = 36

“1111112223” is a sum string.
Explanation: 111+112 = 223, 1+111 = 112

“2368” is not a sum string */
public class CheckStringSummation {
    // this is function for finding sum of two numbers as firstString
    public static String stringSummations(String firstString, String secondString) {
        if (firstString.length() < secondString.length()) {
            String temporaryString = firstString;
            firstString = secondString;
            secondString = temporaryString;
        }
        int m = firstString.length();
        int n = secondString.length();
        StringBuilder answer = new StringBuilder();

        // Summation of the secondString with firstString
        int carry = 0;
        for (int i = 0; i < n; i++) {

            // Summation of current digits
            int firstIndex = firstString.charAt(m - 1 - i) - '0';
            int secondIndex = secondString.charAt(n - 1 - i) - '0';
            int ds = (firstIndex + secondIndex + carry) % 10;

            carry = (firstIndex + secondIndex + carry) / 10;

            answer.insert(0, (char) (ds + '0'));
        }

        for (int i = n; i < m; i++) {
            int firstIndex = firstString.charAt(m - 1 - i) - '0';
            int ds = (firstIndex + carry) % 10;
            carry = (firstIndex + carry) / 10;
            answer.insert(0, (char) (ds + '0'));
        }

        if (carry != 0) {
            answer.insert(0, (char) (carry + '0'));
        }
        return answer.toString();
    }

    // Returns true if two substrings of given
    // lengths of string[beginner.] can cause a positive result.
    public static boolean checkSumStrUtil(String string, int beginner, int length1, int length2) {

        // Finding two substrings of given lengths and their summation
        String subStrings1 = string.substring(beginner, beginner + length1);
        String subStrings2 = string.substring(beginner + length1, beginner + length1 + length2);
        String subStrings3 = stringSummations(subStrings1, subStrings2);

        int s3_len = subStrings3.length();

        // if number of digits subStrings3 is greater than the available string size
        if (s3_len > string.length() - length1 - length2 - beginner)
            return false;

        // we got subStrings3 as next number in main string
        if (subStrings3.equals(string.substring(beginner + length1 + length2,
                beginner + length1 + length2 + s3_len))) {
            // if we reach at the end of the string
            if (beginner + length1 + length2 + s3_len == string.length()) {
                return true;
            }

            // otherwise call recursively for n2, subStrings3
            return checkSumStrUtil(string, beginner + length1, length2, s3_len);
        }
        // we do not get subStrings3 in main string
        return false;
    }

    // Returns true if the given string is summation string, else returns false.
    public static boolean isSumStr(String string) {
        int s_length = string.length();

        // Choosing first two numbers and checking whether it is sum-string or not.
        for (int i = 1; i < s_length; i++)
            for (int j = 1; i + j < s_length; j++)
                if (checkSumStrUtil(string, 0, i, j))
                    return true;

        return false;
    }

    // Driver Code
    public static void main(String[] args) {
        boolean finalResult;

        finalResult = isSumStr("1212243660");
        System.out.println(finalResult ? "True" : "False");

        finalResult = isSumStr("123456787");
        System.out.println(finalResult ? "True" : "False");
    }
}

/*Expected Output::

True
False

* */