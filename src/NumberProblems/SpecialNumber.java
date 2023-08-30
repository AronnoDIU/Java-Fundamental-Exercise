package NumberProblems;

import java.util.Scanner;

/*Special Number Program in Java
A number is said to be special number when the sum of factorial of its digits
is equal to the number itself. Example- 145 is a Special Number as 1!+4!+5!=145.
A number is said to be Krishnamurti Number when the sum of factorial of its
digits is equal to the number itself. Example- 145 is a Krishnamurti Number as 1!+4!+5!=145.*/

public class SpecialNumber {
    public static void main(String[] args) {
        int n, num, r, sumOfFactorial = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            sumOfFactorial = sumOfFactorial + fact;
            num = num / 10;
        }
        if (n == sumOfFactorial) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not Special Number");
        }
    }
}

/*
Expected Output::

Enter number=765
Not Special Number

* */