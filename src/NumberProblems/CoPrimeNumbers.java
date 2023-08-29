package NumberProblems;

import java.util.Scanner;

/*Two integers a and b are said to be relatively prime, mutually prime,
or coprime if the only positive integer that divides both of them is 1.
Example: 13 and 15 are co prime.*/

public class CoPrimeNumbers {
    public static void main(String[] args) {
        int a, b, gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        int min, max;
        min = a;
        if (min > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        while (max > min) {
            int r = max % min;
            if (r == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = r;
            }
        }
        if (gcd == 1) {
            System.out.println("Co Prime Numbers");
        } else {
            System.out.println("Not Co Prime Numbers");
        }
    }
}

/*
Expected Output::

Enter a=66
Enter b=44
Not Co Prime Numbers

* */