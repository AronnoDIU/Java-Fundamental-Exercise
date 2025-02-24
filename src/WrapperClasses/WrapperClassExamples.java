package WrapperClasses;

import java.util.ArrayList;

public class WrapperClassExamples {

    public static void main(String[] args) {
        // Autoboxing: primitive to Integer object conversion
        Integer intObject = 10;
        System.out.println("Autoboxing: " + intObject);

        // Unboxing: Integer object to primitive conversion
        int intPrimitive = intObject;
        System.out.println("Unboxing: " + intPrimitive);

        // Using wrapper class methods
        Integer intValue = Integer.valueOf("123");
        System.out.println("Integer valueOf: " + intValue);

        int parsedInt = Integer.parseInt("456");
        System.out.println("Integer parseInt: " + parsedInt);

        // Autoboxing with collections
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14); // Autoboxing
        doubleList.add(2.71);
        System.out.println("ArrayList with autoboxing: " + doubleList);

        // Unboxing from collections
        double firstValue = doubleList.get(0); // Unboxing
        System.out.println("Unboxed value from ArrayList: " + firstValue);

        // Using other wrapper classes
        Boolean boolObject = Boolean.valueOf("true");
        System.out.println("Boolean valueOf: " + boolObject);

        boolean boolPrimitive = boolObject;
        System.out.println("Unboxed boolean: " + boolPrimitive);

        Character charObject = 'A';
        System.out.println("Autoboxed Character: " + charObject);

        char charPrimitive = charObject;
        System.out.println("Unboxed Character: " + charPrimitive);
    }
}
