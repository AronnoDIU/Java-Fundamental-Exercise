package NumberProblems;

import java.util.Scanner;

/*A series of numbers in which each number ( Fibonacci number ) is the sum
of the two preceding numbers. The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.*/

public class FibonacciSeries {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of series=");
        number = sc.nextInt();
        int a = 0,
                b = 1, c;
        for (int i = 1; i <= number; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

/*
Expected Output::

Enter number of series=5
0
1
1
2
3

* */