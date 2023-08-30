package NumberProblems;

import java.util.Scanner;

/*Twin Prime Program in Java
A twin prime is a prime number that is either 2 less or 2 more than
another prime number—for example, either member of the twin prime
pair (41, 43). In other words, a twin prime is a prime that has a prime gap of two.

*/

public class TwinPrime {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        if (prime(a) && prime(b) && (Math.abs(a - b) == 2)) {
            System.out.println("Twin Prime");
        } else {
            System.out.println("Not Twin Prime");
        }
    }

    static boolean prime(int n) {
        int i = 2;
        boolean flag = true;
        while (n > i) {
            if (n % 2 == 0) {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}

/*
Expected Output::

Enter a=765
Enter b=657
Not Twin Prime

* */