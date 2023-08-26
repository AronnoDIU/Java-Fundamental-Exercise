package RecursionProblems;

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
    int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

/*
Expected Output::

Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 5 is 120

* */