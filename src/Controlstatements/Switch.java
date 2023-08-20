package ControlStatements;

// An improvement version of the season program.
public class Switch {

    public static void main(String[] args) {

        int month = 4; // April

        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Bogus Month";
        };

        System.out.println("April is in the  " + season + ".");

    }

}

/*Expected Output::

April is in the  Spring.

* */