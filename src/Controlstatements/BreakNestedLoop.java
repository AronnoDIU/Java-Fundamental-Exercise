package ControlStatements;

// Using break with nested loops.
public class BreakNestedLoop {

    public static void main(String[] args) {

        for (var i = 0; i < 3; i++) {
            System.out.print("Pass : " + i + " : ");
            for (var j = 0; j < 100; j++) {
                if (j == 10)
                    break; // terminate loop if j is 10;
                System.out.print(j + " ");
            }
            System.out.println();

        }
        System.out.println("Loop complete.");

    }

}

/*Expected Output::

Pass : 0 : 0 1 2 3 4 5 6 7 8 9
Pass : 1 : 0 1 2 3 4 5 6 7 8 9
Pass : 2 : 0 1 2 3 4 5 6 7 8 9
Loop complete.

* */