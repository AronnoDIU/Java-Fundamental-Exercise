package ControlStatements;

public class ForLoopBlockTest {

    public static void main(String[] args) {

        int x, y = 20;
        // the target of this loop is a block

        for (x = 0; x < 10; x++) {
            System.out.println("This is X: " + x);
            System.out.println("This is Y: " + y);

            y = y - 2;
        }

    }

}

/*Expected Output::

This is X: 0
This is Y: 20
This is X: 1
This is Y: 18
This is X: 2
This is Y: 16
This is X: 3
This is Y: 14
This is X: 4
This is Y: 12
This is X: 5
This is Y: 10
This is X: 6
This is Y: 8
This is X: 7
This is Y: 6
This is X: 8
This is Y: 4
This is X: 9
This is Y: 2

* */