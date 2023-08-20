package ControlStatements;

public class NestedLoopsDemo {

    public static void main(String[] args) {

        System.out.println("=========== nested loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("***** i = " + i + " *****\n");
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println("\n");
        }

    }

}

/*Expected Output::

=========== nested loop
***** i = 0 *****

0	1	2

***** i = 1 *****

0	1	2

***** i = 2 *****

0	1	2

***** i = 3 *****

0	1	2

***** i = 4 *****

0	1	2

* */