package NumberProblems;

import java.util.Scanner;

/*Multiply Of Digit Program in Java
If a number=1234, then 1*2*3*4 ,Multiply of digit=24 */

/*What isMultiply Of Digit?
If a number=1234, then 1*2*3*4 ,Multiply of digit=24

What is Multiply Of Digit in Java?
If a number=1234, then 1*2*3*4 ,Multiply of digit=24  */

public class MultiplyOfDigit {
    public static void main(String[] args) {
        int r, n, num, mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            mul = mul * r;
            num = num / 10;
        }
        System.out.println("Multiply of digit=" + mul);
    }
}

/*
Expected Output::

Enter number=44
Multiply of digit=16



* */