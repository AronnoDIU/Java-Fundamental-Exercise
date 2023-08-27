package String;

// Java program to find first and last character of a string
public class FindFirst_LastStringEx2 {
    //  Using String.toCharArray() method

    // Function to print first and last character of a string
    public static void firstAndLastCharacter(String string) {
        // Converting a string into a character array
        char[] charArray = string.toCharArray();

        // Finding the length of character array
        int characterLength = charArray.length;

        // First character of a string
        char firstCharacter = charArray[0];

        // Last character of a string
        char lastCharacter = charArray[characterLength - 1];

        // Printing firstCharacter and lastCharacter
        // character of a string
        System.out.println("First Character is : " + firstCharacter);
        System.out.println("Last Character is : " + lastCharacter);
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