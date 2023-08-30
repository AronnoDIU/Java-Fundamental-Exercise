package NumberProblems;

import java.util.Scanner;

/*Duck Number Program in Java
A Duck number is a number which has zeroes present in it,
but there should be no zero present in the beginning of the number.
For example 3210*/

public class DuckNumber {
    public static void main(String[] args) {
        int r, number, num;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        number = sc.nextInt();
        num = number;
        while (num > 0) {
            r = num % 10;
            if (r == 0) {
                flag = true;
            }
            num = num / 10;
        }
        if (flag) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not Duck Number");
        }
    }
}

/*
Expected Output::

Enter number=55
Not Duck Number

* */