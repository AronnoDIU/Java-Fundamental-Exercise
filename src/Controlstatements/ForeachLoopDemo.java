package ControlStatements;

public class ForeachLoopDemo {

    public static void main(String[] args) {

        System.out.println("=========== foreach loop");
        int[] arr = {1, 2, 3};
        int sum = 0;
        for (int number : arr) {
            sum += number;
            System.out.println("Number: " + number);
        }
        System.out.println("Sum: " + sum);

//		for (int i : arr) {
//
//		}

    }

}

/*Expected Output::

=========== foreach loop
Number: 1
Number: 2
Number: 3
Sum: 6

* */