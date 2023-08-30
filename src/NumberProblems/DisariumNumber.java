package NumberProblems;

import java.util.Scanner;

/*Disarium Number Program in Java
A number is called Disarium number if the sum of its power of the
positions from left to right is equal to the number.

Example:

11 + 32 + 53 = 1 + 9 + 125 = 135*/

public class DisariumNumber {
    public static void main(String[] args) {
        int r, n, num, digits = 0,
                sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        num = n;
        while (num > 0) {
            r = num % 10;
            sum = sum + (int) Math.pow(r, digits);
            num = num / 10;
            digits--;
        }

        if (n == sum) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not Disarium Number");
        }
    }
}

/*
Expected Output::

Enter number=78645
Not Disarium Number

* */