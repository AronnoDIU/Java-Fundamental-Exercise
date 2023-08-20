package ControlStatements;

public class DoWhileLoopDemo {

    public static void main(String[] args) {

        System.out.println("=========== do-while loop");
        int counter = 0;
        do {
            System.out.println("counter: " + counter++);
        } while (counter < 5);

        do {
            System.out.println("counter is five already: " + counter);
        } while (counter < 5);

    }

}

/*Expected Output::

=========== do-while loop
counter: 0
counter: 1
counter: 2
counter: 3
counter: 4
counter is five already: 5

* */