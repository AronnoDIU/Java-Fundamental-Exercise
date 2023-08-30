package NumberProblems;

import java.util.Scanner;

/*Digit to Word Program in Java*/

public class DigitToWord {
    public static void main(String[] args) {
        int r, number, num;
        StringBuilder digitWords = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        number = sc.nextInt();
        num = number;
        while (num > 0) {
            r = num % 10;
            switch (r) {
                case 0 -> digitWords.insert(0, "Zero ");
                case 1 -> digitWords.insert(0, "One ");
                case 2 -> digitWords.insert(0, "Two ");
                case 3 -> digitWords.insert(0, "Three ");
                case 4 -> digitWords.insert(0, "Four ");
                case 5 -> digitWords.insert(0, "Five ");
                case 6 -> digitWords.insert(0, "Six ");
                case 7 -> digitWords.insert(0, "Seven ");
                case 8 -> digitWords.insert(0, "Eight ");
                case 9 -> digitWords.insert(0, "Nine ");
            }
            num = num / 10;
        }
        System.out.println("Digit=" + number);
        System.out.println("Words=" + digitWords);
    }
}

/*
Expected Output::

Enter number=9
Digit=9
Words=Nine

* */