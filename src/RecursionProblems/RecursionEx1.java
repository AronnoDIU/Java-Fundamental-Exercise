package RecursionProblems;

public class RecursionEx1 {
    public static void printNumber(int number) {
        if (number == 0) {  // Base Case
            return;
        }
        System.out.println(number);

        printNumber(number - 1); // Recursion
    }

    public static void main(String[] args) {
        int number = 5;
        printNumber(number);
    }
}

/*
Expected Output::

5
4
3
2
1

* */