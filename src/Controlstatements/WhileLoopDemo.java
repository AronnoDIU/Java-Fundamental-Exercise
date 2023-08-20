package ControlStatements;

public class WhileLoopDemo {

    public static void main(String[] args) {

        System.out.println("=========== while loop");
        int counter = 0;
        while (counter < 5) {
            System.out.println("counter: " + counter++);
        }

        // Infinite loop
//		while (true) {
//			
//		}

    }

}

/*Expected Output::

=========== while loop
counter: 0
counter: 1
counter: 2
counter: 3
counter: 4

* */