package NumberProblems;

import java.util.Scanner;

/*Magic Number Program in Java
Magic number is the if the sum of its digits recursively are calculated till
a single digit If the single digit is 1 then the number is a magic number.
Magic number is very similar with Happy Number.

Example- 226 is said to be a magic number

2+2+6=10 sum of digits is 10 then again 1+0=1 now we get a single digit number is 1.
if we single digit number will now 1 them it would not a magic number.*/

public class MagicNumber {
    public static void main(String[] args) {
        int n, r = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9) {
            while (num > 0) {
                r = num % 10;
                sum = sum + r;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not Magic Number");
        }
    }
}

/*
Expected Output::

Enter number=45
Not Magic Number

* */
