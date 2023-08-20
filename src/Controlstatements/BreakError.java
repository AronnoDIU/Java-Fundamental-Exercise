package ControlStatements;

// This program contains an error.
public class BreakError {

    public static void main(String[] args) {

        One:
        for (var i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
        }
        for (var j = 0; j < 100; j++) {
//			if(j==10) break One; // WRONG
            System.out.print(j + " ");
        }

    }

}
