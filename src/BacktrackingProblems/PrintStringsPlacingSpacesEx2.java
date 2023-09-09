package BacktrackingProblems;

/*Steps:
    Take the first character, and append space up the rest of the string;
    First character+” space”+Rest of the spaced-up string;
    First character+Rest of the spaced-up string;*/

import java.util.ArrayList;

public class PrintStringsPlacingSpacesEx2 {
    private static ArrayList<String> spaceString(String string) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        // Check if string.length() is 1
        if (string.length() == 1) {
            stringArrayList.add(string);
            return stringArrayList;
        }

        ArrayList<String> temporaryStringList = spaceString(string.substring(1));

        // Iterate over temporaryStringList
        for (String stringEnhanced : temporaryStringList) {

            stringArrayList.add(string.charAt(0) + stringEnhanced);
            stringArrayList.add(string.charAt(0) + " " + stringEnhanced);
        }

        // Return stringArrayList
        return stringArrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> patterns;

        // Function Call
        patterns = spaceString("ABCD");

        // Print patterns
        for (String printStringEnhanced : patterns) {
            System.out.println(printStringEnhanced);
        }
    }
}

/*Expected Output::

ABCD
A BCD
AB CD
A B CD
ABC D
A BC D
AB C D
A B C D

* */