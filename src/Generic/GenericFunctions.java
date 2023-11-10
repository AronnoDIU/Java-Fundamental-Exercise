package Generic;

import java.io.Serializable;

// Generic functions: That can be called with different types of arguments
// based on the type of arguments passed to the generic method.
public class GenericFunctions {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n",
                1, 2, 3, GFunctions.max(1, 2, 3)); // pass arguments of type int

        // We can call this method with any type of object

        Integer maxInteger = GFunctions.max(7, 2, 5);
        System.out.printf("Max of %d, %d and %d is %d\n", 7, 2, 5, maxInteger);

        String maxString = GFunctions.max("ABCD", "BCD", "CAT");
        System.out.printf("Max of %s, %s and %s is %s\n", "ABCD", "BCD", "CAT", maxString);

        Float maxFloat = GFunctions.max(9.1f, 4.2f, 8.3f);
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n", 9.1f, 4.2f, 8.3f, maxFloat);

        Double maxDouble = GFunctions.max(5.1, 8.2, 2.3);
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n", 5.1, 8.2, 2.3, maxDouble);

        Character maxCharacter = GFunctions.max('G', 'B', 'C');
        System.out.printf("Max of %s, %s and %s is %s\n", 'G', 'B', 'C', maxCharacter);

        Boolean maxBoolean = GFunctions.max(true, false, false);
        System.out.printf("Max of %s, %s and %s is %s\n\n", true, false, false, maxBoolean);

        System.out.println("For -> static <T extends Comparable<T> " +
                "& Serializable> void exampleMethod(T object1, T object2, T object3)\n");

        GFunctions.exampleMethod(1, 5, 3);
        GFunctions.exampleMethod("Yeasir", "Arafat", "Aronno");
        GFunctions.exampleMethod(5.1f, 7.1f, 1.1f);
        GFunctions.exampleMethod(true, false, true);

        System.out.println("\nFor static <T> void genericDisplay(T element) \n");

        GFunctions.genericDisplay(1);
        GFunctions.genericDisplay("Yeasir Arafat Aronno");
        GFunctions.genericDisplay(1.1f);
        GFunctions.genericDisplay(true);
    }
}

class GFunctions {
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

    public static <T extends Comparable<T> & Serializable>
    void exampleMethod(T object1, T object2, T object3) {

        T max = GFunctions.max(object1, object2, object3); // pass arguments of type T

        System.out.println("Max of " + object1 + " and " +
                object2 + " and " + object3 + " is " + max); // print max
    }

    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}

/*Expected Output:

Max of 1, 2 and 3 is 3
Max of 7, 2 and 5 is 7
Max of ABCD, BCD and CAT is CAT
Max of 9.1,4.2 and 8.3 is 9.1
Max of 5.1,8.2 and 2.3 is 8.2
Max of G, B and C is G
Max of true, false and false is true

For -> static <T extends Comparable<T> & Serializable> void exampleMethod(T object1, T object2, T object3)

Max of 1 and 5 and 3 is 5
Max of Yeasir and Arafat and Aronno is Yeasir
Max of 5.1 and 7.1 and 1.1 is 7.1
Max of true and false and true is true

For static <T> void genericDisplay(T element)

java.lang.Integer = 1
java.lang.String = Yeasir Arafat Aronno
java.lang.Float = 1.1
java.lang.Boolean = true

* */