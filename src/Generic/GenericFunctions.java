package Generic;

import java.io.Serializable;

// Generic functions: That can be called with different types of arguments
// based on the type of arguments passed to the generic method.
public class GenericFunctions {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d" +
                "\n\n", 1, 2, 3, GFunctions.max(1, 2, 3));

        // We can call this method with any type of object

        Integer max = GFunctions.max(1, 2, 3);

        System.out.printf("Max of %d, %d and %d is %d" +
                "\n\n", 1, 2, 3, max);

        GFunctions.exampleMethod(1);
        GFunctions.exampleMethod("Yeasir Arafat Aronno");
        GFunctions.exampleMethod(1.1f);
        GFunctions.exampleMethod(true);
    }
}

class GFunctions {
    public static <T extends Comparable<T> & Serializable> void exampleMethod(T obj) {

        System.out.println("Max of " + obj + " is " + GFunctions.max(obj, obj, obj));

        // We can call this method with any type of object
        T max = GFunctions.max(obj, obj, obj);

        System.out.println("Max of " + obj + " is " + max);
    }

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
}

/*Expected Output:

Max of 1, 2 and 3 is 3

Max of 1, 2 and 3 is 3

Max of 1 is 1
Max of 1 is 1
Max of Yeasir Arafat Aronno is Yeasir Arafat Aronno
Max of Yeasir Arafat Aronno is Yeasir Arafat Aronno
Max of 1.1 is 1.1
Max of 1.1 is 1.1
Max of true is true
Max of true is true

* */