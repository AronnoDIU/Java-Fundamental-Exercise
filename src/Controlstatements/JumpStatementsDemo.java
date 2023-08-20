package ControlStatements;

public class JumpStatementsDemo {

    public static void main(String[] args) {

        System.out.println("=========== continue");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("counter: " + i);
        }

        System.out.println("=========== break");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("counter: " + i);
        }

        System.out.println("=========== break nested loop");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.print(j + " ");
            }

            System.out.println("counter: " + i);
        }

    }

}

/*Expected Output::

=========== continue
counter: 1
counter: 3
=========== break
counter: 0
counter: 1
counter: 2
=========== break nested loop
0 1 2 counter: 0
0 1 2 counter: 1
0 1 2 counter: 2
0 1 2 counter: 3
0 1 2 counter: 4

* */