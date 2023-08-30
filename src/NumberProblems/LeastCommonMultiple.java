package NumberProblems;

import java.util.Scanner;

/*Least Common Multiple Program in Java
The least common multiple, lowest common multiple, or smallest common
multiple of two integers a and b, usually denoted by LCM(a, b),
is the smallest positive integer that is divisible by both a and b.*/

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int a, b, gcd = 1, lcm = 1;
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
        lcm = (a * b) / gcd;
        System.out.println("Least Common Multiple Program:" + lcm);
    }
}

/*
Expected Output::

Enter a=45
Enter b=78
Least Common Multiple Program:1170

* */