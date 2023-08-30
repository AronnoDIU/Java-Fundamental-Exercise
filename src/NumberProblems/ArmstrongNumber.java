package NumberProblems;

import java.util.Scanner;

/*Armstrong Number is a positive number if it is equal to the sum of cubes of its
 digits is called Armstrong number and if its sum is not equal to the number then
  it's not an Armstrong number.

Armstrong Number Program is very popular in java, c language, python etc.

Examples: 153 is Armstrong

(1*1*1)+(5*5*5)+(3*3*3) = 153*/

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n, cubeSum = 0, num, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            cubeSum = cubeSum + (r * r * r);
            num = num / 10;
        }
        if (n == cubeSum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}

/*
Expected Output::

Enter number=45
Not Armstrong Number

* */