package NumberProblems;

import java.util.Scanner;

/*Reverse Number Program in Java
If a number=1234, then reverse of number is 4321.*/

public class ReverseNumber {
    public static void main(String[] args) {
        int n, num, r, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        System.out.println("Reverse of Number=" + rev);
    }
}

/*
Expected Output::

Enter number=0948567
Reverse of Number=765849



* */