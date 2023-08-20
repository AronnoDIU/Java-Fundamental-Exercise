package ControlStatements;

// A simple example of the switch
public class SimpleSwitch {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0 -> System.out.println("i is zero");
                case 1 -> System.out.println("i is one");
                case 2 -> System.out.println("i is two");
                case 3 -> System.out.println("i is three");
                default -> System.out.println("i is greater than 3");
            }

    }

}

/*Expected Output::

i is zero
i is one
i is two
i is three
i is greater than 3
i is greater than 3


* */