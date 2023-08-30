package NumberProblems;

import java.util.Scanner;

/*Prime Number Program in Java
A prime number is a natural number greater than 1 that cannot be
formed by multiplying two smaller natural numbers. A natural number
greater than 1 that is not prime is called a composite number.
For example, 5 is prime because the only ways of writing it as a
product, 1 × 5 or 5 × 1, involve 5 itself.*/

public class PrimeNumber {
    public static void main(String[] args) {
        int n, i = 2;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        while (n > i) {
            if (n % 2 == 0) {
                flag = false;
                break;
            }
            i++;
        }
        if (flag) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }
    }
}

/*
Expected Output::

Enter number=25
Number is prime.


* */
