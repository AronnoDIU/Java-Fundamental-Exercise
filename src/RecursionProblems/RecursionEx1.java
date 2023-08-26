package RecursionProblems;

public class RecursionEx1 {
    public static void printNumber5_1(int number1) {
        if (number1 == 0) {  // Base Case
            return;
        }
        System.out.print(number1 + " ");

        printNumber5_1(number1 - 1); // Recursion
    }

    public static void printNumber1_5(int number2) {
        if (number2 == 6) {  // Base Case
            return;
        }
        System.out.print(number2 + " ");

        printNumber1_5(number2 + 1); // Recursion
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 1;
        printNumber5_1(number1);  // Print Number 5 to 1
        System.out.println("\n");
        printNumber1_5(number2);  // // Print Number 1 to 5
    }
}

/*
Expected Output::

5 4 3 2 1

1 2 3 4 5

* */