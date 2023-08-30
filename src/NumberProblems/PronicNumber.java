package NumberProblems;

import java.util.Scanner;

/*Pronic Number Program in Java
A number is said to be a pronic number if product of two consecutive integers is equal to the number, is called a pronic number.

Example- 42 is said to be a pronic number

42=6×7, here 6 and 7 are consecutive integers*/

public class PronicNumber {
    public static void main(String[] args) {
        int n;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i * (i + 1) == n) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Pronic Number");
        } else {
            System.out.println("Not Pronic Number");
        }
    }
}
/*
Expected Output::

Enter number=675
Not Pronic Number

* */

