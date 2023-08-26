package RecursionProblems;

// This JAVA program is Print summation of first given natural numbers.
public class RecursionEx4 {
    public static void printSummation(int startNumber, int reachNumber, int totalSummation) {
        if (startNumber == reachNumber) {
            totalSummation += startNumber;
            System.out.println(totalSummation);

            return;
        }
        totalSummation += startNumber;

        printSummation(startNumber + 1, reachNumber, totalSummation);

        System.out.println(startNumber);
    }

    public static void main(String[] args) {
        printSummation(1, 10, 0);
    }
}

/*
Expected Output::

55
9
8
7
6
5
4
3
2
1
* */