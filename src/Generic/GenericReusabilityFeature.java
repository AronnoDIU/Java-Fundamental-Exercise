package Generic;

import java.io.Serializable;
import java.util.Arrays;

// Generic Reusability Feature
public class GenericReusabilityFeature {
    // As we are comparing the Non-primitive data types, we need to use Comparable class
    public static <T extends Comparable<T>> void sortGenerics(T[] a) {

        //Bubble Sort logic
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j].compareTo(a[j + 1]) > 0) {

                    swapFunction(j, j + 1, a);
                }
            }
        }

        // Printing the elements after sorted
        for (T i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static <T> void swapFunction(int i, int j, T[] a) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T max(T... a) {
        T max = a[0]; // assume a[0] is initially the largest

        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(max) > 0) {
                max = a[i]; // a[i] is the largest so far
            }

            if (a[i].compareTo(max) == 0) {
                max = a[i];
            }

            if (a[i].compareTo(max) < 0) {
                max = a[i];
            }
        }
        return max; // returns the largest object
    }

    @SafeVarargs
    public static <T extends Comparable<T> & Serializable> void maxPrint(T... a) {

        T max = max(a); // pass arguments of type T

        System.out.println("Max of " + a[0] + " and " +
                a[1] + " and " + a[2] + " is " + max); // print max
    }

    @SafeVarargs
    public static <T> void genericDisplay(T... element) {
        System.out.println(Arrays.toString(element));
    }

    public static void main(String[] args) {
        Integer[] integers = {100, 22, 58, 41, 6, 50};
        String[] strings = {"Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat", "Kalam"};
        Character[] characters = {'v', 'g', 'a', 'c', 'x', 'd', 't'};
        Float[] floats = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Boolean[] booleans = {true, false, true, false, true, false, true};

        System.out.println();
        maxPrint(integers);
        maxPrint(strings);
        maxPrint(characters);
        maxPrint(floats);
        maxPrint(doubles);
        maxPrint(booleans);

        System.out.print("\nUnsorted Integer array : ");
        genericDisplay(integers);
        System.out.print("Sorted Integer array : ");
        sortGenerics(integers);

        System.out.print("Unsorted String array : ");
        genericDisplay(strings);
        System.out.print("Sorted String array : ");
        sortGenerics(strings);

        System.out.print("Unsorted Character array : ");
        genericDisplay(characters);
        System.out.print("Sorted Character array : ");
        sortGenerics(characters);

        System.out.print("Unsorted Float array : ");
        genericDisplay(floats);
        System.out.print("Sorted Float array : ");
        sortGenerics(floats);

        System.out.print("Unsorted Double array : ");
        genericDisplay(doubles);
        System.out.print("Sorted Double array : ");
        sortGenerics(doubles);

        System.out.print("Unsorted Boolean array : ");
        genericDisplay(booleans);
        System.out.print("Sorted Boolean array : ");
        sortGenerics(booleans);


        System.out.println("\nMax of " + integers[0] + " and " +
                integers[1] + " and " + integers[2] + " is " + max(integers));

        System.out.println("Max of " + strings[0] + " and " +
                strings[1] + " and " + strings[2] + " is " + max(strings));

        System.out.println("Max of " + characters[0] + " and " +
                characters[1] + " and " + characters[2] + " is " + max(characters));
    }
}

/*Expected Output:

Max of 100 and 22 and 58 is 50
Max of Virat and Rohit and Abhinay is Kalam
Max of v and g and a is t
Max of 1.1 and 2.2 and 3.3 is 7.7
Max of 1.1 and 2.2 and 3.3 is 7.7
Max of true and false and true is true

Unsorted Integer array : [100, 22, 58, 41, 6, 50]
Sorted Integer array : 6, 22, 41, 50, 58, 100,
Unsorted String array : [Virat, Rohit, Abhinay, Chandu, Sam, Bharat, Kalam]
Sorted String array : Abhinay, Bharat, Chandu, Kalam, Rohit, Sam, Virat,
Unsorted Character array : [v, g, a, c, x, d, t]
Sorted Character array : a, c, d, g, t, v, x,
Unsorted Float array : [1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7]
Sorted Float array : 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7,
Unsorted Double array : [1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7]
Sorted Double array : 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7,
Unsorted Boolean array : [true, false, true, false, true, false, true]
Sorted Boolean array : false, false, false, true, true, true, true,

Max of 6 and 22 and 41 is 100
Max of Abhinay and Bharat and Chandu is Virat
Max of a and c and d is x

* */