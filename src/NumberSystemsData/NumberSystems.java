package NumberSystemsData;

public class NumberSystems {

    public static void main(String[] args) {

        int decimal = 152;            //  no prefix   --> decimal literal
        int binary = 0b10001111;     // '0b' prefix --> binary literal
        int octal = 0217;           // '0' prefix  --> octal literal
        int hexadecimal = 0x8F;           // '0x' prefix --> hexadecimal literal

        System.out.println("Decimal value representations like " + decimal + " with no prefix");
        System.out.println("Binary value representations like " + binary + " with '0b' prefix");
        System.out.println("Octal value representations like " + octal + " with '0' prefix");
        System.out.println("Hexadecimal value representations like " + hexadecimal + " with '0x' prefix");

    }
}
/*
Expected Output::

Decimal value representations like 152 with no prefix
Binary value representations like 143 with '0b' prefix
Octal value representations like 143 with '0' prefix
Hexadecimal value representations like 143 with '0x' prefix

* */