package RecursionProblems;

// Java program to reverse an integer recursively
public class ReverseRecursivelyEx1 {
    // Recursive function to print
    // the number in reversed form
    public static void Reverse(int number) {

        // base condition to end recursive calls
        if (number < 10) {
            System.out.println(number);
        } else {

            // print the unit digit of the given number
            System.out.print(number % 10);

            // calling function for remaining number other
            // than unit digit
            Reverse(number / 10);
        }
    }

    // driver code
    public static void main(String[] args) {
        // number to be reversed
        int number = 98765;

        System.out.print("Reversed Number: ");

        // calling recursive function
        // to print the number in
        // reversed form
        Reverse(number);
    }
}

/*
Expected Output::

Reversed Number: 56789

* */