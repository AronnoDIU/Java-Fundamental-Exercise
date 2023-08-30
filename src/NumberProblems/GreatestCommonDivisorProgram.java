package NumberProblems;

import java.util.Scanner;

/*Greatest Common Divisor Program in Java
the greatest common divisor (gcd) of two or more integers,
which are not all zero, is the largest positive integer that
divides each of the integers. For example, the gcd of 8 and 12 is 4.*/

public class GreatestCommonDivisorProgram {
    public static void main(String[] args) {
        int a, b, gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        int min, max;
        min = a;
        if (min > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        while (max > min) {
            int r = max % min;
            if (r == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = r;
            }
        }
        System.out.println("Greatest Common Divisor Program=" + gcd);
    }
}

/*
Expected Output::

Enter a=55
Enter b=40
Greatest Common Divisor Program=5

* */