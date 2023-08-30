package NumberProblems;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        int r, n, num, sum = 0;
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
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}

/*
Expected Output::

Enter number=45
Hashed Number

* */