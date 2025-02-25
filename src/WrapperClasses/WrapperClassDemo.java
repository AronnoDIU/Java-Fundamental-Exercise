package WrapperClasses;

import java.util.ArrayList;

public class WrapperClassDemo {

    public static void main(String[] args) {
        // Autoboxing: primitive to Double object conversion
        Double doubleObject = 3.14;
        System.out.println("Autoboxing: " + doubleObject);

        // Unboxing: Double object to primitive conversion
        double doublePrimitive = doubleObject;
        System.out.println("Unboxing: " + doublePrimitive);

        // Using wrapper class methods
        Double doubleValue = Double.valueOf("2.718");
        System.out.println("Double valueOf: " + doubleValue);

        double parsedDouble = Double.parseDouble("1.618");
        System.out.println("Double parseDouble: " + parsedDouble);

        // Autoboxing with collections
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(42); // Autoboxing
        intList.add(7);
        System.out.println("ArrayList with autoboxing: " + intList);

        // Unboxing from collections
        int firstIntValue = intList.get(0); // Unboxing
        System.out.println("Unboxed value from ArrayList: " + firstIntValue);

        // Using other wrapper classes
        Long longObject = Long.valueOf("123456789");
        System.out.println("Long valueOf: " + longObject);

        long longPrimitive = longObject;
        System.out.println("Unboxed long: " + longPrimitive);

        Float floatObject = 9.81f;
        System.out.println("Autoboxed Float: " + floatObject);

        float floatPrimitive = floatObject;
        System.out.println("Unboxed Float: " + floatPrimitive);
    }
}
