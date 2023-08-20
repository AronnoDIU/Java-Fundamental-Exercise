package ControlStatements;

import java.util.Scanner;

public class PyramidInConsole {

    public static void main(String[] args) {

        System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

}

/*Expected Output::

Please, enter height of the pyramid: 5
*
**
***
****
*****
****
***
**
*

* */