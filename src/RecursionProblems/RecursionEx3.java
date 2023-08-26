package RecursionProblems;

// Java Program to implement Fibonacci Series

/*Fibonacci Series

    Fibonacci Numbers are the numbers is the integer sequence where
    Fib(N) = Fib(N-2) + Fib(N-1). Below is the example to find 3,4,5.

        Fib(3) = Fib(2) + Fib(1) = Fib(1) + 0 + 1 = 1+1 = 2
        Fib(4) = Fib(3) + Fib(2) = 2+1 = 3
        Fib(5) = Fib(4) + Fib(3) = 3 + 2 = 5    */
public class RecursionEx3 {
    // Function to return Fibonacci value
    static int Fibonacci(int Number) {
        if (Number == 0 || Number == 1)
            return Number;

        return Fibonacci(Number - 1) + Fibonacci(Number - 2);
    }

    // Main function
    public static void main(String[] args) {
        // Factorial of 3
        System.out.println("Factorial of " + 3 + " "
                + Fibonacci(3));

        // Factorial of 4
        System.out.println("Factorial of " + 4 + " "
                + Fibonacci(4));

        // Factorial of 3
        System.out.println("Factorial of " + 5 + " "
                + Fibonacci(5));
    }
}

/*
Expected Output::

Factorial of 3 2
Factorial of 4 3
Factorial of 5 5

* */
