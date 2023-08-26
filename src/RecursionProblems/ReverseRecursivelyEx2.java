package RecursionProblems;

// Java program to reverse an integer recursively
public class ReverseRecursivelyEx2 {
    // Variable to store reversed number after every recursive call.
    static int answer = 0;

    static int Reverse(int variable) {

        // base condition to end the recursive calling of function.
        if (variable == 0) {

            // Reversed the complete number and stored in answer variable
            return answer;
        }

        if (variable > 0) {

            // temporaryVariable variable to store the digit at unit place in the number.
            int temporaryVariable = variable % 10;

            // Add this temporaryVariable variable in the ans variable
            // which stores the number reversed till now
            answer = answer * 10 + temporaryVariable;

            // recursive calling of function to reverse the remaining number.
            Reverse(variable / 10);
        }

        // returning final answer when the number is reversed completely.
        return answer;
    }

    public static void main(String[] args) {
        // Number to be reversed
        int variable = 98765;

        // Variable to store reversed number returned by reverse function
        int reverse;

        // Calling reverse function and storing the return value in reverse variable
        reverse = Reverse(variable);

        // Printing the Reversed Number
        System.out.println("Reversed number: " + reverse);
    }
}

/*
Expected Output::

Reversed Number: 56789

* */
