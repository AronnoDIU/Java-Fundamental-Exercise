package BitManipulation;

public class ConvertCharacters2UppercaseOrLowercase {
    static int x = 32;

    // tTOGGLE cASE = swaps CAPS to lower
    // case and lower case to CAPS
    static String toggleCase(char[] a) {
        for (int i = 0; i < a.length; i++) {

            // Bitwise XOR with 32
            a[i] ^= 32;
        }
        return new String(a);
    }

    /* Driver program */
    public static void main(String[] args) {
        String string = "CheRrY";
        System.out.print("Toggle case: ");
        string = toggleCase(string.toCharArray());
        System.out.println(string);

        System.out.print("Original string: ");
        string = toggleCase(string.toCharArray());
        System.out.println(string);
    }
}

/*
Expected Output::

Toggle case: cHErRy
Original string: CheRrY

* */