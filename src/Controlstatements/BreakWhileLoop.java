package ControlStatements;

// Using break to exit a while loop.
public class BreakWhileLoop {

    public static void main(String[] args) {

        int i = 0;
        while (i < 100) {
            if (i == 10)
                break; // terminate loop if i is 10;
            System.out.println("i : " + i);
            i++;
        }
        System.out.println("Loop complete");

    }

}

/*Expected Output::

i : 0
i : 1
i : 2
i : 3
i : 4
i : 5
i : 6
i : 7
i : 8
i : 9
Loop complete

* */