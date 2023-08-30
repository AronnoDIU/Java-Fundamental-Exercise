package NumberProblems;

import java.util.Scanner;

/*Perfect Number Program in Java
A perfect number is a positive integer that is equal to the sum of
its positive divisors, excluding the number itself. For instance,
6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.*/
public class PerfectNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}

/*
Expected Output::

Enter number=34
Not Perfect Number


* */