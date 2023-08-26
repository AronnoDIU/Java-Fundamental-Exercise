package RecursionProblems;

public class RecursionFibonacci {
    public static void printFibonacci(int initialFirstValue, int initialSecondValue, int findNumber) {
        if (findNumber == 0) {
            return;
        }
        int initialThirdValue = initialFirstValue + initialSecondValue;
        System.out.println(initialThirdValue);
        printFibonacci(initialSecondValue, initialThirdValue, findNumber - 1);
    }

    public static void main(String[] args) {
        int initialFirstValue = 0, initialSecondValue = 1;
        System.out.println(initialFirstValue);
        System.out.println(initialSecondValue);
        int findNumber = 9;
        printFibonacci(initialFirstValue, initialSecondValue, findNumber - 2);
    }
}

/*
Expected Output::

0
1
1
2
3
5
8
13
21

* */
