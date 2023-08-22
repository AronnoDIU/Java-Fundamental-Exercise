package WrapperClasses;

// Java program to demonstrate Wrapping and UnWrapping in Classes.
public class WrapperClassesEx1GFG {
    public static void main(String[] args) {
        // byte data type
        byte byteValue = 1;

        // wrapping around Byte object
        Byte byteObj = Byte.valueOf(byteValue);

        // int data type
        int intValue = 10;

        // wrapping around Integer object
        Integer intObj = Integer.valueOf(intValue);

        // float data type
        float floatValue = 18.6f;

        // wrapping around Float object
        Float floatObj = Float.valueOf(floatValue);

        // double data type
        double doubleValue = 250.5;

        // Wrapping around Double object
        Double doubleObj = Double.valueOf(doubleValue);

        // char data type
        char charValue = 'a';

        // wrapping around Character object
        Character charObj = charValue;

        // printing the values from objects
        System.out.println(
                "Values of Wrapper objects (printing as objects)");
        System.out.println("\nByte object byteObj: "
                + byteObj);
        System.out.println("\nInteger object intObj: "
                + intObj);
        System.out.println("\nFloat object floatObj: "
                + floatObj);
        System.out.println("\nDouble object doubleObj: "
                + doubleObj);
        System.out.println("\nCharacter object charObj: "
                + charObj);

        // objects to data types (retrieving data types from
        // objects) unwrapping objects to primitive data
        // types
        byte byteVariable = byteObj;
        int intVariable = intObj;
        float floatVariable = floatObj;
        double doubleVariable = doubleObj;
        char charVariable = charObj;

        // printing the values from data types
        System.out.println("\nUnwrapped values (printing as data types)");
        System.out.println("\nbyte value, byteVariable: " + byteVariable);
        System.out.println("\nint value, intVariable: " + intVariable);
        System.out.println("\nfloat value, floatVariable: " + floatVariable);
        System.out.println("\ndouble value, doubleVariable: " + doubleVariable);
        System.out.println("\nchar value, charVariable: " + charVariable);
    }
}

/*
Expected Output::

Values of Wrapper objects (printing as objects)

Byte object byteObj: 1

Integer object intObj: 10

Float object floatObj: 18.6

Double object doubleObj: 250.5

Character object charObj: a

Unwrapped values (printing as data types)

byte value, byteVariable: 1

int value, intVariable: 10

float value, floatVariable: 18.6

double value, doubleVariable: 250.5

char value, charVariable: a

* */