package NumberProblems;

import java.util.Scanner;

/*A number is said to be Buzz Number if it ends with 7 or is divisible by 7.

Example: 1007 is a Buzz Number.*/

public class BuzzNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n=");
        n = sc.nextInt();
        if (n % 10 == 7 || n % 7 == 0)
        {
            System.out.println("Buzz number");
        }
        else
        {
            System.out.println("Not Buzz number");
        }
    }
}

/*
Expected Output::

Enter n=66
Not Buzz number

* */