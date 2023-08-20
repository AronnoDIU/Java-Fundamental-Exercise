package ControlStatements;

// Using break to exit from nested loops
public class BreakToExitLoop {

    public static void main(String[] args) {

        Outer:
        for (var i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (var j = 0; j < 100; j++) {
                if (j == 10)
                    break Outer; // Exit both loop;
                System.out.print(j + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loops complete.");

    }

}

/*Expected Output::

Pass 0: 0 1 2 3 4 5 6 7 8 9 Loops complete.


* */