package NumberProblems;

import java.util.Scanner;

/*Neon Number Program in Java
A neon number is a number where the sum of digits of square of the
number is equal to the number. For example if the input number is 9,
its square is 9*9 = 81 and sum of the digits is 9. i.e. 9 is a neon number.*/

public class NeonNumber {
    public static void main(String[] args) {
        int n, sqr = 1, sum = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        sqr = n * n;
        while (sqr > 0) {
            r = sqr % 10;
            sum = sum + r;
            sqr = sqr / 10;
        }
        if (n == sum) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}

/*
Expected Output::

Enter number=5
Not Neon Number


* */