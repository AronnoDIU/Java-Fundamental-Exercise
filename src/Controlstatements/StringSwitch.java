package ControlStatements;

// Use a string to control a switch statements.
public class StringSwitch {

    public static void main(String[] args) {

        int target = 1;
        String str = "four";

        switch (str) {
            case "one" -> System.out.println("one");
            case "two" -> System.out.println("Two");
            case "three" -> System.out.println("Three");
            case "four" -> {
                switch (target) { // Nested Switch ex
                    case 0 -> System.out.println("target is zero");
                    case 1 -> // No conflicts with outer switch
                            System.out.println("target is one");
                }
            }
            default -> System.out.println("No Match");
        }

    }

}

/*Expected Output::

target is one

* */