package ExceptionHandling;

// Java Program to Demonstrate Exception is Thrown

// How the runTime System Searches Call-Stack to Find Appropriate Exception Handler
//Class ExceptionThrown
public class ExceptionThrown {
    // Method 1
    // It throws the Exception(ArithmeticException).
    // Appropriate Exception handler is not found within this method.
    static int divideByZero(int a, int b) {

        // this statement will cause ArithmeticException (/by zero)
        int input = a / b;

        return input;
    }

    // The runTime System searches the appropriate
    // Exception handler in method also but couldn't have
    // found. So looking forward on the call stack
    static int computeDivision(int a, int b) {

        int result = 0;

        // Try block to check for exceptions
        try {

            result = divideByZero(a, b);
        }

        // Catch block to handle NumberFormatException
        // exception Doesn't match with
        // ArithmeticException
        catch (NumberFormatException ex) {
            // Display message when exception occurs
            System.out.println("NumberFormatException is occurred");
        }
        return result;
    }

    // Method 2
    // Found appropriate Exception handler.
    // i.e. matching catch block.
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 0;

        // Try block to check for exceptions
        try {
            int input = computeDivision(value1, value2);
        }

        // Catch block to handle ArithmeticException exceptions.
        catch (ArithmeticException ex) {

            // getMessage() will print description of exception(here / by zero)
            System.out.println(ex.getMessage());
        }
    }
}

/*
Expected Output::

/ by zero

* */
