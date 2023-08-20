package ControlStatements;

public class ForWithConditionLoopDemo {

    public static void main(String[] args) {

        System.out.println("=========== for loop");

        for (int i = 0; i < 5; i++) {
            System.out.println("counter: " + i);

        }

        // Infinite loop
//		for (;;) {
//
//		}

        System.out.println("=========== for loop | comma usage example");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("counters: i = " + i + ", j = " + j);
        }

    }

}

/*Expected Output::

=========== for loop
counter: 0
counter: 1
counter: 2
counter: 3
counter: 4
=========== for loop | comma usage example
counters: i = 0, j = 10
counters: i = 1, j = 9
counters: i = 2, j = 8
counters: i = 3, j = 7
counters: i = 4, j = 6

* */