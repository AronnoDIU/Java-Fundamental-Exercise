package NumberProblems;

import java.util.Scanner;

/*Spy Number Program in Java
A spy number is a number where the sum of its digits equals
the product of its digits. For example, 1124 is a spy number,
the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.*/

public class SpyNumber {
    public static void main(String[] args) {
        int r, n, num, mul = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            sum = sum + r;
            mul = mul * r;
            num = num / 10;
        }
        if (mul == sum) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}

/*
Expected Output::

Enter number=76
Not Spy Number

* */