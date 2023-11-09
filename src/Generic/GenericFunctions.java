package Generic;

// Generic functions: That can be called with different types of arguments
// based on the type of arguments passed to the generic method.
public class GenericFunctions {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d" +
                "\n\n", 1, 2, 3, GFunctions.max(1, 2, 3));
    }
}

class GFunctions {
    public static <T> T max(T x, T y, T z) {
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

Articulation Points : 0
Articulation Points : 3

* */