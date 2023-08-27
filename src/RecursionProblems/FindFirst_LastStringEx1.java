package RecursionProblems;

// Java program to find first and last character of a string
public class FindFirst_LastStringEx1 {
    // Using String.charAt() method

    // Function to print first and last
    // character of a string
    public static void firstAndLastCharacter(String string) {

        // Finding string length
        int stringLength = string.length();

        // First character of a string
        char firstString = string.charAt(0);

        // Last character of a string
        char lastString = string.charAt(stringLength - 1);

        // Printing firstString and lastString character of a string
        System.out.println("First String is : " + firstString);
        System.out.println("Last String is : " + lastString);
    }

    // Driver Code
    public static void main(String[] args) {
        // Given string string
        String string = "This is Aronno Here";

        // Function Call
        firstAndLastCharacter(string);
    }
}

/*
Expected Output::

First String is : T
Last String is : e

* */