package NumberProblems;

import java.util.Scanner;

/*Ugly Number Program in Java
A number is said to be an Ugly number if positive numbers whose prime factors only include 2, 3, 5.

For example, 6(2×3), 8(2x2x2), 15(3×5) are ugly numbers while 14(2×7) is not ugly since
it includes another prime factor 7. Note that 1 is typically treated as an ugly number.*/

public class UglyNumber {
    public static void main(String[] args) {
        int number;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        number = sc.nextInt();
        while (number != 1) {
            if (number % 5 == 0) {
                number /= 5;
            } else if (number % 3 == 0) {
                number /= 3;
            } else if (number % 2 == 0) {
                number /= 2;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Ugly number.");
        } else {
            System.out.println("Not Ugly number.");
        }
    }
}

/*
Expected Output::

Enter number=6754
Not Ugly number.

* */
