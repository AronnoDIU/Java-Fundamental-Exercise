package NumberProblems;

import java.util.Scanner;

// Prime Number Up to N Terms Program in Java

public class PrimeNumberUptoN {
    public static void main(String[] args) {
        int size, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of prime=");
        size = sc.nextInt();
        int n = 2;
        while (c <= size) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Number is prime=" + n);
                c++;
            }
            n++;
        }
    }
}

/*
Expected Output::

Enter size of prime=9
Number is prime=2
Number is prime=3
Number is prime=5
Number is prime=7
Number is prime=11
Number is prime=13
Number is prime=17
Number is prime=19
Number is prime=23
Number is prime=29


* */
