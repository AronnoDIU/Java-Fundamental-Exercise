package RecursionProblems;

// Factorial Using Recursion

/*    The classic example of recursion is the computation of the factorial of a number.
The factorial of a number N is the product of all the numbers between 1 and N.
The below-given code computes the factorial of the numbers: 3, 4,  and 5.

        3=  3 *2*1 (6)
        4=  4*3*2*1 (24)
        5=  5*3*2*1 (120)

Below is the implementation of the factorial: */
public class RecursionEx2 {
    public static void main(String[] args) {
        SubRecursionEx2 subRecursionEx2 = new SubRecursionEx2();

        System.out.println("Factorial of 3 is " + subRecursionEx2.fact(3));
        System.out.println("Factorial of 4 is " + subRecursionEx2.fact(4));
        System.out.println("Factorial of 5 is " + subRecursionEx2.fact(5));
    }
}

class SubRecursionEx2 {
    // recursive method
    int fact(int number) {
        int result;

        if (number == 1)
            return 1;
        result = fact(number - 1) * number;
        return result;
    }
}

/*
Expected Output::

Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 5 is 120

* */