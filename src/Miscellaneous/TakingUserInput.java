package Miscellaneous;

import java.util.Scanner;

// Java Program to show how to take input from user using Scanner Class.

public class TakingUserInput {
    public static void main(String[] args) {
        // Scanner definition
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the (One Word) String input::\n");

        // Input is a string ( One Word )
        // Read by next() function
        String stringOneWord = scanner.next();

        // Print String
        System.out.println("Entered (One Word) String stringOneWord :: " + stringOneWord);

        System.out.println("\nEnter the (Complete Sentence) String input::\n");

        // Input is a String ( complete Sentence )
        // Read by nextLine()function
        String str = scanner.nextLine();

        // Print string
        System.out.println("Entered (Complete Sentence) String stringCompleteSentence :: " + str);

        System.out.println("\nEnter the Integer input::\n");

        // Input is an Integer
        // Read by nextInt() function
        int intValue = scanner.nextInt();

        // Print intValue
        System.out.println("Entered Integer :: " + intValue);

        System.out.println("Enter the Floating Value input::\n");

        // input is a floatingValue
        // read by nextFloat() function
        float floatingValue = scanner.nextFloat();

        // print floating value
        System.out.println("Entered FloatValue : " + floatingValue);
    }
}

/*
Expected Output::

Enter the (One Word) String input:: Aronno

Entered (One Word) String stringOneWord :: Aronno

Enter the (Complete Sentence) String input:: This is Aronno here!

Entered (Complete Sentence) String stringCompleteSentence :: This is Aronno here!

Enter the Integer input:: 45

Entered Integer : 45

Enter the Floating Value input:: 34.54

Entered FloatValue : 34.54

* */