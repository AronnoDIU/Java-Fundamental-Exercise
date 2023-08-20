package ControlStatements;

// Demonstrate the do-while loop.
public class DoWhile {

    public static void main(String[] args) {

        int n = 10;

//		do {
//			System.out.println("tick " + n);
//			n--;
//		} while (n > 0);

        System.out.println();

//		The loop in the preceding program, while technically correct, can be written
//		more efficiently as follows:

        do {
            System.out.println("tick " + n);
        } while (--n > 0);
    }

}

/*Expected Output::

tick 10
tick 9
tick 8
tick 7
tick 6
tick 5
tick 4
tick 3
tick 2
tick 1

* */