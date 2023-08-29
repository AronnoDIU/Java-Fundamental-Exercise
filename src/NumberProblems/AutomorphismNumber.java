package NumberProblems;

import java.util.Scanner;

/* An Automorphism number is a number whose square “ends” in the same digits as the number itself.

Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625*/
public class AutomorphismNumber {
    public static void main(String[] args) {
        int n, sqrNum, temp, sqrNumRemainder, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            c++;
        }
        sqrNum = n * n;
        sqrNumRemainder = sqrNum % (int) Math.pow(10, c);
        if (sqrNumRemainder == n) {
            System.out.println("Automorphism Number");
        } else {
            System.out.println("Not Automorphism Number");
        }
    }
}

/*
Expected Output::

Enter number=55
Not Automorphism Number

* */