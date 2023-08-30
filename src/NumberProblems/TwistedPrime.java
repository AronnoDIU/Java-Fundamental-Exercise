package NumberProblems;

import java.util.Scanner;

/*Twisted Prime Program in Java
A number is called a twisted prime number if it is a prime number
and reverse of this number is also a prime number.*/

public class TwistedPrime {
    public static void main(String[] args) {
        int n, num, r,
                rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (prime(n) && prime(rev)) {
            System.out.println("Twisted Prime");
        } else {
            System.out.println("Not Twisted Prime");
        }
    }

    static boolean prime(int n) {
        int i = 2;
        boolean flag = true;
        while (n > i) {
            if (n % 2 == 0) {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}

/*
Expected Output::

Enter number=765
Twisted Prime

* */