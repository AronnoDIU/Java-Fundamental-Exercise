package NumberProblems;

import java.util.Scanner;

/*In mathematics, a Niven number (or harshad number) in a given number base
is an integer that is divisible by the sum of its digits when written in that base.*/

public class NivenNumber {
    public static void main(String[] args) {
        int n, num, r, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        if (n % sum == 0) {
            System.out.println("Niven Number");
        } else {
            System.out.println("Not Niven Number");
        }
    }
}

/*
Expected Output::

Enter number=66
Not Niven Number


* */