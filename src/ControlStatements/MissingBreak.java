package ControlStatements;

// in a switch,, break statements are  optional.

/*
 * execution falls through each case until a break statement (or the end of the
 * switch) is reached.
 */
public class MissingBreak {

    public static void main(String[] args) {

        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0, 1, 2, 3, 4 -> System.out.println("i is less than 5");
                case 5, 6, 7, 8, 9 -> System.out.println("i is less than 10");
                default -> System.out.println("i is 10 or more than 10");
            }
    }
}

/*Expected Output::

i is less than 5
i is less than 5
i is less than 5
i is less than 5
i is less than 5
i is less than 10
i is less than 10
i is less than 10
i is less than 10
i is less than 10
i is 10 or more than 10
i is 10 or more than 10

* */